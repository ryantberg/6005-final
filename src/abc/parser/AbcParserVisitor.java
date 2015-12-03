// Generated from AbcParser.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AbcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AbcParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AbcParser#abc_tune}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbc_tune(AbcParser.Abc_tuneContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#abc_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbc_header(AbcParser.Abc_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#field_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_number(AbcParser.Field_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#field_title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_title(AbcParser.Field_titleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#other_fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_fields(AbcParser.Other_fieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#field_composer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_composer(AbcParser.Field_composerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#field_default_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_default_length(AbcParser.Field_default_lengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#field_meter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_meter(AbcParser.Field_meterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#field_tempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_tempo(AbcParser.Field_tempoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#field_voice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_voice(AbcParser.Field_voiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#field_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_key(AbcParser.Field_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#meter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeter(AbcParser.MeterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#tempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempo(AbcParser.TempoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#header_beat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader_beat(AbcParser.Header_beatContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#abc_music}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbc_music(AbcParser.Abc_musicContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#abc_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbc_line(AbcParser.Abc_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#voice_change}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoice_change(AbcParser.Voice_changeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(AbcParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#note_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote_element(AbcParser.Note_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote(AbcParser.NoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#note_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote_length(AbcParser.Note_lengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#note_or_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote_or_rest(AbcParser.Note_or_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#pitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPitch(AbcParser.PitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#tuplet_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuplet_element(AbcParser.Tuplet_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#tuplet_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuplet_spec(AbcParser.Tuplet_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#chord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChord(AbcParser.ChordContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#barline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBarline(AbcParser.BarlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#nth_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNth_repeat(AbcParser.Nth_repeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#eol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEol(AbcParser.EolContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AbcParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AbcParser#slash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlash(AbcParser.SlashContext ctx);
}