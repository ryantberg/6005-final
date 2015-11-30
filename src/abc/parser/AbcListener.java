// Generated from Abc.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbcParser}.
 */
public interface AbcListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link AbcParser#abc_tune}.
   * @param ctx the parse tree
   */
  void enterAbc_tune(AbcParser.Abc_tuneContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#abc_tune}.
   * @param ctx the parse tree
   */
  void exitAbc_tune(AbcParser.Abc_tuneContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#abc_header}.
   * @param ctx the parse tree
   */
  void enterAbc_header(AbcParser.Abc_headerContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#abc_header}.
   * @param ctx the parse tree
   */
  void exitAbc_header(AbcParser.Abc_headerContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_number}.
   * @param ctx the parse tree
   */
  void enterField_number(AbcParser.Field_numberContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_number}.
   * @param ctx the parse tree
   */
  void exitField_number(AbcParser.Field_numberContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_title}.
   * @param ctx the parse tree
   */
  void enterField_title(AbcParser.Field_titleContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_title}.
   * @param ctx the parse tree
   */
  void exitField_title(AbcParser.Field_titleContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#other_fields}.
   * @param ctx the parse tree
   */
  void enterOther_fields(AbcParser.Other_fieldsContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#other_fields}.
   * @param ctx the parse tree
   */
  void exitOther_fields(AbcParser.Other_fieldsContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_composer}.
   * @param ctx the parse tree
   */
  void enterField_composer(AbcParser.Field_composerContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_composer}.
   * @param ctx the parse tree
   */
  void exitField_composer(AbcParser.Field_composerContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_default_length}.
   * @param ctx the parse tree
   */
  void enterField_default_length(AbcParser.Field_default_lengthContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_default_length}.
   * @param ctx the parse tree
   */
  void exitField_default_length(AbcParser.Field_default_lengthContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_meter}.
   * @param ctx the parse tree
   */
  void enterField_meter(AbcParser.Field_meterContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_meter}.
   * @param ctx the parse tree
   */
  void exitField_meter(AbcParser.Field_meterContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_tempo}.
   * @param ctx the parse tree
   */
  void enterField_tempo(AbcParser.Field_tempoContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_tempo}.
   * @param ctx the parse tree
   */
  void exitField_tempo(AbcParser.Field_tempoContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_voice}.
   * @param ctx the parse tree
   */
  void enterField_voice(AbcParser.Field_voiceContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_voice}.
   * @param ctx the parse tree
   */
  void exitField_voice(AbcParser.Field_voiceContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#field_key}.
   * @param ctx the parse tree
   */
  void enterField_key(AbcParser.Field_keyContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#field_key}.
   * @param ctx the parse tree
   */
  void exitField_key(AbcParser.Field_keyContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#text}.
   * @param ctx the parse tree
   */
  void enterText(AbcParser.TextContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#text}.
   * @param ctx the parse tree
   */
  void exitText(AbcParser.TextContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#key}.
   * @param ctx the parse tree
   */
  void enterKey(AbcParser.KeyContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#key}.
   * @param ctx the parse tree
   */
  void exitKey(AbcParser.KeyContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#keynote}.
   * @param ctx the parse tree
   */
  void enterKeynote(AbcParser.KeynoteContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#keynote}.
   * @param ctx the parse tree
   */
  void exitKeynote(AbcParser.KeynoteContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#key_accidental}.
   * @param ctx the parse tree
   */
  void enterKey_accidental(AbcParser.Key_accidentalContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#key_accidental}.
   * @param ctx the parse tree
   */
  void exitKey_accidental(AbcParser.Key_accidentalContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#mode_minor}.
   * @param ctx the parse tree
   */
  void enterMode_minor(AbcParser.Mode_minorContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#mode_minor}.
   * @param ctx the parse tree
   */
  void exitMode_minor(AbcParser.Mode_minorContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#meter}.
   * @param ctx the parse tree
   */
  void enterMeter(AbcParser.MeterContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#meter}.
   * @param ctx the parse tree
   */
  void exitMeter(AbcParser.MeterContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#meter_fraction}.
   * @param ctx the parse tree
   */
  void enterMeter_fraction(AbcParser.Meter_fractionContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#meter_fraction}.
   * @param ctx the parse tree
   */
  void exitMeter_fraction(AbcParser.Meter_fractionContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#tempo}.
   * @param ctx the parse tree
   */
  void enterTempo(AbcParser.TempoContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#tempo}.
   * @param ctx the parse tree
   */
  void exitTempo(AbcParser.TempoContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#abc_music}.
   * @param ctx the parse tree
   */
  void enterAbc_music(AbcParser.Abc_musicContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#abc_music}.
   * @param ctx the parse tree
   */
  void exitAbc_music(AbcParser.Abc_musicContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#abc_line}.
   * @param ctx the parse tree
   */
  void enterAbc_line(AbcParser.Abc_lineContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#abc_line}.
   * @param ctx the parse tree
   */
  void exitAbc_line(AbcParser.Abc_lineContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#element}.
   * @param ctx the parse tree
   */
  void enterElement(AbcParser.ElementContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#element}.
   * @param ctx the parse tree
   */
  void exitElement(AbcParser.ElementContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#note_element}.
   * @param ctx the parse tree
   */
  void enterNote_element(AbcParser.Note_elementContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#note_element}.
   * @param ctx the parse tree
   */
  void exitNote_element(AbcParser.Note_elementContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#note}.
   * @param ctx the parse tree
   */
  void enterNote(AbcParser.NoteContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#note}.
   * @param ctx the parse tree
   */
  void exitNote(AbcParser.NoteContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#note_or_rest}.
   * @param ctx the parse tree
   */
  void enterNote_or_rest(AbcParser.Note_or_restContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#note_or_rest}.
   * @param ctx the parse tree
   */
  void exitNote_or_rest(AbcParser.Note_or_restContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#pitch}.
   * @param ctx the parse tree
   */
  void enterPitch(AbcParser.PitchContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#pitch}.
   * @param ctx the parse tree
   */
  void exitPitch(AbcParser.PitchContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#octave}.
   * @param ctx the parse tree
   */
  void enterOctave(AbcParser.OctaveContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#octave}.
   * @param ctx the parse tree
   */
  void exitOctave(AbcParser.OctaveContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#note_length}.
   * @param ctx the parse tree
   */
  void enterNote_length(AbcParser.Note_lengthContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#note_length}.
   * @param ctx the parse tree
   */
  void exitNote_length(AbcParser.Note_lengthContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#note_length_strict}.
   * @param ctx the parse tree
   */
  void enterNote_length_strict(AbcParser.Note_length_strictContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#note_length_strict}.
   * @param ctx the parse tree
   */
  void exitNote_length_strict(AbcParser.Note_length_strictContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#accidental}.
   * @param ctx the parse tree
   */
  void enterAccidental(AbcParser.AccidentalContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#accidental}.
   * @param ctx the parse tree
   */
  void exitAccidental(AbcParser.AccidentalContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#basenote}.
   * @param ctx the parse tree
   */
  void enterBasenote(AbcParser.BasenoteContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#basenote}.
   * @param ctx the parse tree
   */
  void exitBasenote(AbcParser.BasenoteContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#rest}.
   * @param ctx the parse tree
   */
  void enterRest(AbcParser.RestContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#rest}.
   * @param ctx the parse tree
   */
  void exitRest(AbcParser.RestContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#tuplet_element}.
   * @param ctx the parse tree
   */
  void enterTuplet_element(AbcParser.Tuplet_elementContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#tuplet_element}.
   * @param ctx the parse tree
   */
  void exitTuplet_element(AbcParser.Tuplet_elementContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#tuplet_spec}.
   * @param ctx the parse tree
   */
  void enterTuplet_spec(AbcParser.Tuplet_specContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#tuplet_spec}.
   * @param ctx the parse tree
   */
  void exitTuplet_spec(AbcParser.Tuplet_specContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#multi_note}.
   * @param ctx the parse tree
   */
  void enterMulti_note(AbcParser.Multi_noteContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#multi_note}.
   * @param ctx the parse tree
   */
  void exitMulti_note(AbcParser.Multi_noteContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#barline}.
   * @param ctx the parse tree
   */
  void enterBarline(AbcParser.BarlineContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#barline}.
   * @param ctx the parse tree
   */
  void exitBarline(AbcParser.BarlineContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#nth_repeat}.
   * @param ctx the parse tree
   */
  void enterNth_repeat(AbcParser.Nth_repeatContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#nth_repeat}.
   * @param ctx the parse tree
   */
  void exitNth_repeat(AbcParser.Nth_repeatContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#mid_tune_field}.
   * @param ctx the parse tree
   */
  void enterMid_tune_field(AbcParser.Mid_tune_fieldContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#mid_tune_field}.
   * @param ctx the parse tree
   */
  void exitMid_tune_field(AbcParser.Mid_tune_fieldContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#comment}.
   * @param ctx the parse tree
   */
  void enterComment(AbcParser.CommentContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#comment}.
   * @param ctx the parse tree
   */
  void exitComment(AbcParser.CommentContext ctx);
  /**
   * Enter a parse tree produced by {@link AbcParser#end_of_line}.
   * @param ctx the parse tree
   */
  void enterEnd_of_line(AbcParser.End_of_lineContext ctx);
  /**
   * Exit a parse tree produced by {@link AbcParser#end_of_line}.
   * @param ctx the parse tree
   */
  void exitEnd_of_line(AbcParser.End_of_lineContext ctx);
}