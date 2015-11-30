/*
 * Compile all your grammars using
 *       java _jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
 
grammar Abc;
import Configuration;

//A subset of ABC 2.1 in BNF format

abc_tune : abc_header abc_music;

/**
 ** Header
 */

// ignore WHITESPACE between terminals in the header

abc_header : field_number comment* field_title other_fields* field_key;

field_number : 'X:' DIGIT+ end_of_line;
field_title : 'T:' text end_of_line;
other_fields : field_composer | field_default_length | field_meter | field_tempo | field_voice | comment;
field_composer : 'C:' text end_of_line;
field_default_length : 'L:' note_length_strict end_of_line;
field_meter : 'M:' meter end_of_line;
field_tempo : 'Q:' tempo end_of_line;
field_voice : 'V:' text end_of_line;
field_key : 'K:' key end_of_line;
text : .*?;

key : keynote mode_minor?;
keynote : basenote key_accidental?;
key_accidental : '#' | 'b';
mode_minor : 'm';

meter : 'C' | 'C|' | meter_fraction;
meter_fraction : DIGIT+ '/' DIGIT+;

tempo : meter_fraction '=' DIGIT+;

/**
 ** Music
 */

// WHITESPACE is explicit in the body, don't automatically ignore it

abc_music : abc_line+;
abc_line : element+ NEWLINE | mid_tune_field | comment;
element : note_element | tuplet_element | barline | nth_repeat | WHITESPACE ;

note_element : note | multi_note;

// note is either a pitch or a rest
note : note_or_rest note_length;
note_or_rest : pitch | rest;
pitch : accidental? basenote octave?;
octave : '\''+ | ','+;
note_length : (DIGIT+)? ('/' (DIGIT+)?)?;
note_length_strict : DIGIT+ '/' DIGIT+;

// '^' is sharp, '_' is flat, and '=' is neutral
accidental : '^' | '^^' | '_' | '__' | '=';

basenote : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B'
        | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b';

rest : 'z';

// tuplets
tuplet_element : tuplet_spec note_element+;
tuplet_spec : '(' DIGIT ;

// chords
multi_note : '[' note+ ']';

barline : '|' | '||' | '[|' | '|]' | ':|' | '|:';
nth_repeat : '[1' | '[2';

// A voice field might reappear in the middle of a piece
// to indicate the change of a voice
mid_tune_field : field_voice;

/**
 ** General
 */

comment : '%' text NEWLINE;
end_of_line : comment | NEWLINE;

DIGIT : [0-9];
NEWLINE : '\n' | '\r' '\n'?;
WHITESPACE : ' ' | '\t';