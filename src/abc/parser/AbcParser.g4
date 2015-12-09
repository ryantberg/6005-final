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
abc_tune : eol? abc_header abc_music;

/**
 * The header.
 */
abc_header : field_number field_title other_fields* field_key;

field_number : NUMBER_LABEL number eol;
field_title : TITLE_LABEL TEXT eol;
other_fields : field_composer
			 | field_default_length
			 | field_meter
			 | field_tempo
			 | field_voice;
field_composer : COMPOSER_LABEL TEXT eol;
field_default_length : LENGTH_LABEL header_beat eol;
field_meter : METER_LABEL (METER_SHORTHAND | header_beat) eol;
field_tempo : TEMPO_LABEL header_beat EQUALS number eol;
field_voice : VOICE_LABEL TEXT eol;
field_key : KEY_LABEL KEY eol;

header_beat: number slash number;

/**
 * The music.
 */
abc_music : (abc_line | voice_change)+;
abc_line : element+ eol;

// A voice field might reappear in the middle of a piece
// to indicate the change of a voice
voice_change : VOICE_LABEL TEXT eol;

element : note_element | tuplet_element | barline | nth_repeat | WHITESPACE ;

note_element : note | chord;


// note is either a pitch or a rest
note : note_or_rest note_length?;
note_length: number | (number? slash number?);
note_or_rest : pitch | REST;
pitch : ACCIDENTAL? LETTER_NOTE OCTAVE?;

// tuplets
tuplet_element : tuplet_spec note_element+;
tuplet_spec : TUPLET_START number ;

// chords
chord : CHORD_START note+ CHORD_END;

// bars and repetitions
barline : BARLINE;
nth_repeat: NTH_REPEAT;

// Compensate for lexer deficiencies.
// end of line; after a HEADER_NEWLINE is lexed, the lexer will be in DEFAULT mode,
// and lex NEWLINEs.
eol: (HEADER_NEWLINE | NEWLINE) NEWLINE*;
number: HEADER_NUMBER | NUMBER;
slash: HEADER_SLASH | SLASH;