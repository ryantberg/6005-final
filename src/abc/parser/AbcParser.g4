/*
 * Compile all your grammars using
 *       java _jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
 
parser grammar AbcParser;

/**
 * Configuration stuff.
 */

options {
	// "Import" our lexer
	tokenVocab = AbcLexer;
}

// This puts a package statement at the top of the output Java files.
@header {
package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.
}

// This adds code to the generated parser.
@members {
    public void reportErrorsAsExceptions() {
        addErrorListener(new BaseErrorListener() {
            public void syntaxError(Recognizer<?, ?> recognizer,
                                    Object offendingSymbol, 
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                                    	System.out.println(offendingSymbol);
                throw new ParseCancellationException(msg, e);
            }
        });
    }
}

/**
 * The actual parser!
 */

// A tune is a header and music.
abcTune : eol? abcHeader abcMusic;

/**
 * The header.
 */
abcHeader : fieldNumber fieldTitle otherFields* fieldKey;

fieldNumber : NUMBER_LABEL number eol;
fieldTitle : TITLE_LABEL TEXT eol;
otherFields : fieldComposer
			 | fieldDefaultLength
			 | fieldMeter
			 | fieldTempo
			 | fieldVoice;
fieldComposer : COMPOSER_LABEL TEXT eol;
fieldDefaultLength : LENGTH_LABEL headerBeat eol;
fieldMeter : METER_LABEL (METER_SHORTHAND | headerBeat) eol;
fieldTempo : TEMPO_LABEL headerBeat EQUALS number eol;
fieldVoice : VOICE_LABEL TEXT eol;
fieldKey : KEY_LABEL KEY eol;

headerBeat: number slash number;

/**
 * The music.
 */
abcMusic : (abcLine | voiceChange)+;
abcLine : element+ eol;

// A voice field might reappear in the middle of a piece
// to indicate the change of a voice
voiceChange : VOICE_LABEL TEXT eol;

element : noteElement | tupletElement | barline | nthRepeat | WHITESPACE ;

noteElement : note | chord;


// note is either a pitch or a rest
note : noteOrRest noteLength?;
noteLength: number | (number? slash number?);
noteOrRest : pitch | REST;
pitch : ACCIDENTAL? LETTER_NOTE OCTAVE?;

// tuplets
tupletElement : tupletSpec noteElement+;
tupletSpec : TUPLET_START number ;

// chords
chord : CHORD_START note+ CHORD_END;

// bars and repetitions
barline : BARLINE;
nthRepeat: NTH_REPEAT;

// Compensate for lexer deficiencies.
// end of line; after a HEADER_NEWLINE is lexed, the lexer will be in DEFAULT mode,
// and lex NEWLINEs.
eol: (HEADER_NEWLINE | NEWLINE) NEWLINE*;
number: HEADER_NUMBER | NUMBER;
slash: HEADER_SLASH | SLASH;