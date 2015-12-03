lexer grammar AbcLexer;

@header {
package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.
}

@members {
    public void reportErrorsAsExceptions() {
        addErrorListener(new BaseErrorListener() {
            public void syntaxError(Recognizer<?, ?> recognizer,
                                    Object offendingSymbol, 
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                throw new ParseCancellationException(msg, e);
            }
        });
    }
}

// Note: this lexer uses an ANTLR feature called "modes", which are a way
// to force a lexer to be slightly context-sensitive. This is necessary
// because the Abc grammar is hella ambiguous.
//
// This lexer uses modes like a state machine, starting in DEFAULT mode:
// In the DEFAULT mode, it lexes music bits.
// In the HEADER, TEXT, and KEY modes, it lexes parts of the header.
// Seeing a header field tag changes it from DEFAULT to HEADER, KEY, or TEXT,
// depending on the contents of that type of header tag.
// Lexing a KEY or a TEXT changes it to HEADER mode.
// Seeing a HEADER_NEWLINE changes it to DEFAULT mode.
//
// This allows us to unambiguously parse Abc files, but also requires us to duplicate
// some tokens (e.g. NUMBER and HEADER_NUMBER), since ANTLR only allows a particular
// token to be output by a single mode.

COMMENT : '%' ~('\r' | '\n')* -> skip;
NEWLINE : ('\r' | '\n' | '\r\n');
WHITESPACE : (' ' | '\t')+;

/*
 * The header.
 */
NUMBER_LABEL   : 'X:' -> mode(HEADER_MODE);
LENGTH_LABEL   : 'L:' -> mode(HEADER_MODE);
METER_LABEL	   : 'M:' -> mode(HEADER_MODE);
TEMPO_LABEL	   : 'Q:' -> mode(HEADER_MODE);
TITLE_LABEL    : 'T:' -> mode(TEXT_MODE);
COMPOSER_LABEL : 'C:' -> mode(TEXT_MODE);
VOICE_LABEL	   : 'V:' -> mode(TEXT_MODE);
KEY_LABEL      : 'K:' -> mode(KEY_MODE);

/*
 * The music.
 */
LETTER_NOTE : 'a'..'g' | 'A'..'G';
ACCIDENTAL : '^' | '^^' | '_' | '__' | '=';
OCTAVE : '\''+ | ','+;

REST: 'z';

CHORD_START : '[';
CHORD_END : ']';
TUPLET_START : '(';

BARLINE : '|' | '||' | '[|' | '|]' | ':|' | '|:';

NTH_REPEAT : '[1' | '[2';

NUMBER: '0'..'9'+;
SLASH: '/';

/*
 * Helper modes.
 */
mode HEADER_MODE;
// Mode for parsing generic header stuff.
// ignores whitespace, returns to default mode on newline.
HEADER_NEWLINE: NEWLINE -> mode(DEFAULT_MODE);
HEADER_COMMENT: COMMENT -> skip;
HEADER_WHITESPACE: WHITESPACE -> skip;
HEADER_NUMBER: NUMBER;
HEADER_SLASH: SLASH;
METER_SHORTHAND : 'C' | 'C|';
EQUALS: '=';

mode KEY_MODE;
// We need a special KEY mode because otherwise the key 'Ab' is
// ambiguous with the note sequence 'Ab', and the key
// 'C' is ambiguous with the meter shorthand 'C'
KEY: ('a'..'g' | 'A'..'G') ('#' | 'b')? 'm'? -> mode(HEADER_MODE);
	
mode TEXT_MODE;
// We need a special TEXT mode because otherwise...
// everything is ambiguous.
TEXT : ~('\r' | '\n')+ -> mode(HEADER_MODE);