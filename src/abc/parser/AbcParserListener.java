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
	 * Enter a parse tree produced by {@link AbcParser#abcTune}.
	 * @param ctx the parse tree
	 */
	void enterAbcTune(AbcParser.AbcTuneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#abcTune}.
	 * @param ctx the parse tree
	 */
	void exitAbcTune(AbcParser.AbcTuneContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#abcHeader}.
	 * @param ctx the parse tree
	 */
	void enterAbcHeader(AbcParser.AbcHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#abcHeader}.
	 * @param ctx the parse tree
	 */
	void exitAbcHeader(AbcParser.AbcHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#fieldNumber}.
	 * @param ctx the parse tree
	 */
	void enterFieldNumber(AbcParser.FieldNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#fieldNumber}.
	 * @param ctx the parse tree
	 */
	void exitFieldNumber(AbcParser.FieldNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#fieldTitle}.
	 * @param ctx the parse tree
	 */
	void enterFieldTitle(AbcParser.FieldTitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#fieldTitle}.
	 * @param ctx the parse tree
	 */
	void exitFieldTitle(AbcParser.FieldTitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#otherFields}.
	 * @param ctx the parse tree
	 */
	void enterOtherFields(AbcParser.OtherFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#otherFields}.
	 * @param ctx the parse tree
	 */
	void exitOtherFields(AbcParser.OtherFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#fieldComposer}.
	 * @param ctx the parse tree
	 */
	void enterFieldComposer(AbcParser.FieldComposerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#fieldComposer}.
	 * @param ctx the parse tree
	 */
	void exitFieldComposer(AbcParser.FieldComposerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#fieldDefaultLength}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefaultLength(AbcParser.FieldDefaultLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#fieldDefaultLength}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefaultLength(AbcParser.FieldDefaultLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#fieldMeter}.
	 * @param ctx the parse tree
	 */
	void enterFieldMeter(AbcParser.FieldMeterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#fieldMeter}.
	 * @param ctx the parse tree
	 */
	void exitFieldMeter(AbcParser.FieldMeterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#fieldTempo}.
	 * @param ctx the parse tree
	 */
	void enterFieldTempo(AbcParser.FieldTempoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#fieldTempo}.
	 * @param ctx the parse tree
	 */
	void exitFieldTempo(AbcParser.FieldTempoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#fieldVoice}.
	 * @param ctx the parse tree
	 */
	void enterFieldVoice(AbcParser.FieldVoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#fieldVoice}.
	 * @param ctx the parse tree
	 */
	void exitFieldVoice(AbcParser.FieldVoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#fieldKey}.
	 * @param ctx the parse tree
	 */
	void enterFieldKey(AbcParser.FieldKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#fieldKey}.
	 * @param ctx the parse tree
	 */
	void exitFieldKey(AbcParser.FieldKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#headerBeat}.
	 * @param ctx the parse tree
	 */
	void enterHeaderBeat(AbcParser.HeaderBeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#headerBeat}.
	 * @param ctx the parse tree
	 */
	void exitHeaderBeat(AbcParser.HeaderBeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#abcMusic}.
	 * @param ctx the parse tree
	 */
	void enterAbcMusic(AbcParser.AbcMusicContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#abcMusic}.
	 * @param ctx the parse tree
	 */
	void exitAbcMusic(AbcParser.AbcMusicContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#abcLine}.
	 * @param ctx the parse tree
	 */
	void enterAbcLine(AbcParser.AbcLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#abcLine}.
	 * @param ctx the parse tree
	 */
	void exitAbcLine(AbcParser.AbcLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#voiceChange}.
	 * @param ctx the parse tree
	 */
	void enterVoiceChange(AbcParser.VoiceChangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#voiceChange}.
	 * @param ctx the parse tree
	 */
	void exitVoiceChange(AbcParser.VoiceChangeContext ctx);
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
	 * Enter a parse tree produced by {@link AbcParser#noteElement}.
	 * @param ctx the parse tree
	 */
	void enterNoteElement(AbcParser.NoteElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#noteElement}.
	 * @param ctx the parse tree
	 */
	void exitNoteElement(AbcParser.NoteElementContext ctx);
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
	 * Enter a parse tree produced by {@link AbcParser#noteLength}.
	 * @param ctx the parse tree
	 */
	void enterNoteLength(AbcParser.NoteLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#noteLength}.
	 * @param ctx the parse tree
	 */
	void exitNoteLength(AbcParser.NoteLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#noteOrRest}.
	 * @param ctx the parse tree
	 */
	void enterNoteOrRest(AbcParser.NoteOrRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#noteOrRest}.
	 * @param ctx the parse tree
	 */
	void exitNoteOrRest(AbcParser.NoteOrRestContext ctx);
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
	 * Enter a parse tree produced by {@link AbcParser#tupletElement}.
	 * @param ctx the parse tree
	 */
	void enterTupletElement(AbcParser.TupletElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#tupletElement}.
	 * @param ctx the parse tree
	 */
	void exitTupletElement(AbcParser.TupletElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbcParser#tupletSpec}.
	 * @param ctx the parse tree
	 */
	void enterTupletSpec(AbcParser.TupletSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#tupletSpec}.
	 * @param ctx the parse tree
	 */
	void exitTupletSpec(AbcParser.TupletSpecContext ctx);
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
	 * Enter a parse tree produced by {@link AbcParser#nthRepeat}.
	 * @param ctx the parse tree
	 */
	void enterNthRepeat(AbcParser.NthRepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#nthRepeat}.
	 * @param ctx the parse tree
	 */
	void exitNthRepeat(AbcParser.NthRepeatContext ctx);
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