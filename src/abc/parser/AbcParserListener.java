// Generated from AbcParser.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbcParser}.
 */
public interface AbcParserListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link AbcParser#header_beat}.
	 * @param ctx the parse tree
	 */
	void enterHeader_beat(AbcParser.Header_beatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#header_beat}.
	 * @param ctx the parse tree
	 */
	void exitHeader_beat(AbcParser.Header_beatContext ctx);
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
	 * Enter a parse tree produced by {@link AbcParser#voice_change}.
	 * @param ctx the parse tree
	 */
	void enterVoice_change(AbcParser.Voice_changeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#voice_change}.
	 * @param ctx the parse tree
	 */
	void exitVoice_change(AbcParser.Voice_changeContext ctx);
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
	 * Enter a parse tree produced by {@link AbcParser#chord}.
	 * @param ctx the parse tree
	 */
	void enterChord(AbcParser.ChordContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#chord}.
	 * @param ctx the parse tree
	 */
	void exitChord(AbcParser.ChordContext ctx);
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
	 * Enter a parse tree produced by {@link AbcParser#eol}.
	 * @param ctx the parse tree
	 */
	void enterEol(AbcParser.EolContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#eol}.
	 * @param ctx the parse tree
	 */
	void exitEol(AbcParser.EolContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AbcParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AbcParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#slash}.
	 * @param ctx the parse tree
	 */
	void enterSlash(AbcParser.SlashContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#slash}.
	 * @param ctx the parse tree
	 */
	void exitSlash(AbcParser.SlashContext ctx);
}