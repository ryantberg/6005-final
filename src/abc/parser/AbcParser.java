// Generated from AbcParser.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, NEWLINE=2, WHITESPACE=3, NUMBER_LABEL=4, LENGTH_LABEL=5, METER_LABEL=6, 
		TEMPO_LABEL=7, TITLE_LABEL=8, COMPOSER_LABEL=9, VOICE_LABEL=10, KEY_LABEL=11, 
		LETTER_NOTE=12, ACCIDENTAL=13, OCTAVE=14, REST=15, CHORD_START=16, CHORD_END=17, 
		TUPLET_START=18, BARLINE=19, NTH_REPEAT=20, NUMBER=21, SLASH=22, HEADER_NEWLINE=23, 
		HEADER_COMMENT=24, HEADER_WHITESPACE=25, HEADER_NUMBER=26, HEADER_SLASH=27, 
		METER_SHORTHAND=28, EQUALS=29, KEY=30, TEXT=31;
	public static final int
		RULE_abc_tune = 0, RULE_abc_header = 1, RULE_field_number = 2, RULE_field_title = 3, 
		RULE_other_fields = 4, RULE_field_composer = 5, RULE_field_default_length = 6, 
		RULE_field_meter = 7, RULE_field_tempo = 8, RULE_field_voice = 9, RULE_field_key = 10, 
		RULE_header_beat = 11, RULE_abc_music = 12, RULE_abc_line = 13, RULE_voice_change = 14, 
		RULE_element = 15, RULE_note_element = 16, RULE_note = 17, RULE_note_length = 18, 
		RULE_note_or_rest = 19, RULE_pitch = 20, RULE_tuplet_element = 21, RULE_tuplet_spec = 22, 
		RULE_chord = 23, RULE_barline = 24, RULE_nth_repeat = 25, RULE_eol = 26, 
		RULE_number = 27, RULE_slash = 28;
	public static final String[] ruleNames = {
		"abc_tune", "abc_header", "field_number", "field_title", "other_fields", 
		"field_composer", "field_default_length", "field_meter", "field_tempo", 
		"field_voice", "field_key", "header_beat", "abc_music", "abc_line", "voice_change", 
		"element", "note_element", "note", "note_length", "note_or_rest", "pitch", 
		"tuplet_element", "tuplet_spec", "chord", "barline", "nth_repeat", "eol", 
		"number", "slash"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'X:'", "'L:'", "'M:'", "'Q:'", "'T:'", "'C:'", 
		"'V:'", "'K:'", null, null, null, "'z'", "'['", "']'", "'('", null, null, 
		null, "'/'", null, null, null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "NEWLINE", "WHITESPACE", "NUMBER_LABEL", "LENGTH_LABEL", 
		"METER_LABEL", "TEMPO_LABEL", "TITLE_LABEL", "COMPOSER_LABEL", "VOICE_LABEL", 
		"KEY_LABEL", "LETTER_NOTE", "ACCIDENTAL", "OCTAVE", "REST", "CHORD_START", 
		"CHORD_END", "TUPLET_START", "BARLINE", "NTH_REPEAT", "NUMBER", "SLASH", 
		"HEADER_NEWLINE", "HEADER_COMMENT", "HEADER_WHITESPACE", "HEADER_NUMBER", 
		"HEADER_SLASH", "METER_SHORTHAND", "EQUALS", "KEY", "TEXT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AbcParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public AbcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Abc_tuneContext extends ParserRuleContext {
		public Abc_headerContext abc_header() {
			return getRuleContext(Abc_headerContext.class,0);
		}
		public Abc_musicContext abc_music() {
			return getRuleContext(Abc_musicContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Abc_tuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_tune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterAbc_tune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitAbc_tune(this);
		}
	}

	public final Abc_tuneContext abc_tune() throws RecognitionException {
		Abc_tuneContext _localctx = new Abc_tuneContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abc_tune);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if (_la==NEWLINE || _la==HEADER_NEWLINE) {
				{
				setState(58);
				eol();
				}
			}

			setState(61);
			abc_header();
			setState(62);
			abc_music();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_headerContext extends ParserRuleContext {
		public Field_numberContext field_number() {
			return getRuleContext(Field_numberContext.class,0);
		}
		public Field_titleContext field_title() {
			return getRuleContext(Field_titleContext.class,0);
		}
		public Field_keyContext field_key() {
			return getRuleContext(Field_keyContext.class,0);
		}
		public List<Other_fieldsContext> other_fields() {
			return getRuleContexts(Other_fieldsContext.class);
		}
		public Other_fieldsContext other_fields(int i) {
			return getRuleContext(Other_fieldsContext.class,i);
		}
		public Abc_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterAbc_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitAbc_header(this);
		}
	}

	public final Abc_headerContext abc_header() throws RecognitionException {
		Abc_headerContext _localctx = new Abc_headerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abc_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			field_number();
			setState(65);
			field_title();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LENGTH_LABEL) | (1L << METER_LABEL) | (1L << TEMPO_LABEL) | (1L << COMPOSER_LABEL) | (1L << VOICE_LABEL))) != 0)) {
				{
				{
				setState(66);
				other_fields();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			field_key();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_numberContext extends ParserRuleContext {
		public TerminalNode NUMBER_LABEL() { return getToken(AbcParser.NUMBER_LABEL, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Field_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterField_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitField_number(this);
		}
	}

	public final Field_numberContext field_number() throws RecognitionException {
		Field_numberContext _localctx = new Field_numberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(NUMBER_LABEL);
			setState(75);
			number();
			setState(76);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_titleContext extends ParserRuleContext {
		public TerminalNode TITLE_LABEL() { return getToken(AbcParser.TITLE_LABEL, 0); }
		public TerminalNode TEXT() { return getToken(AbcParser.TEXT, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Field_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterField_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitField_title(this);
		}
	}

	public final Field_titleContext field_title() throws RecognitionException {
		Field_titleContext _localctx = new Field_titleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(TITLE_LABEL);
			setState(79);
			match(TEXT);
			setState(80);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Other_fieldsContext extends ParserRuleContext {
		public Field_composerContext field_composer() {
			return getRuleContext(Field_composerContext.class,0);
		}
		public Field_default_lengthContext field_default_length() {
			return getRuleContext(Field_default_lengthContext.class,0);
		}
		public Field_meterContext field_meter() {
			return getRuleContext(Field_meterContext.class,0);
		}
		public Field_tempoContext field_tempo() {
			return getRuleContext(Field_tempoContext.class,0);
		}
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public Other_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterOther_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitOther_fields(this);
		}
	}

	public final Other_fieldsContext other_fields() throws RecognitionException {
		Other_fieldsContext _localctx = new Other_fieldsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_other_fields);
		try {
			setState(87);
			switch (_input.LA(1)) {
			case COMPOSER_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				field_composer();
				}
				break;
			case LENGTH_LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				field_default_length();
				}
				break;
			case METER_LABEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				field_meter();
				}
				break;
			case TEMPO_LABEL:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				field_tempo();
				}
				break;
			case VOICE_LABEL:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				field_voice();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_composerContext extends ParserRuleContext {
		public TerminalNode COMPOSER_LABEL() { return getToken(AbcParser.COMPOSER_LABEL, 0); }
		public TerminalNode TEXT() { return getToken(AbcParser.TEXT, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Field_composerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_composer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterField_composer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitField_composer(this);
		}
	}

	public final Field_composerContext field_composer() throws RecognitionException {
		Field_composerContext _localctx = new Field_composerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field_composer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(COMPOSER_LABEL);
			setState(90);
			match(TEXT);
			setState(91);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_default_lengthContext extends ParserRuleContext {
		public TerminalNode LENGTH_LABEL() { return getToken(AbcParser.LENGTH_LABEL, 0); }
		public Header_beatContext header_beat() {
			return getRuleContext(Header_beatContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Field_default_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_default_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterField_default_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitField_default_length(this);
		}
	}

	public final Field_default_lengthContext field_default_length() throws RecognitionException {
		Field_default_lengthContext _localctx = new Field_default_lengthContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_default_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LENGTH_LABEL);
			setState(94);
			header_beat();
			setState(95);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_meterContext extends ParserRuleContext {
		public TerminalNode METER_LABEL() { return getToken(AbcParser.METER_LABEL, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode METER_SHORTHAND() { return getToken(AbcParser.METER_SHORTHAND, 0); }
		public Header_beatContext header_beat() {
			return getRuleContext(Header_beatContext.class,0);
		}
		public Field_meterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterField_meter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitField_meter(this);
		}
	}

	public final Field_meterContext field_meter() throws RecognitionException {
		Field_meterContext _localctx = new Field_meterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field_meter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(METER_LABEL);
			setState(100);
			switch (_input.LA(1)) {
			case METER_SHORTHAND:
				{
				setState(98);
				match(METER_SHORTHAND);
				}
				break;
			case NUMBER:
			case HEADER_NUMBER:
				{
				setState(99);
				header_beat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(102);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_tempoContext extends ParserRuleContext {
		public TerminalNode TEMPO_LABEL() { return getToken(AbcParser.TEMPO_LABEL, 0); }
		public Header_beatContext header_beat() {
			return getRuleContext(Header_beatContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(AbcParser.EQUALS, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Field_tempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterField_tempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitField_tempo(this);
		}
	}

	public final Field_tempoContext field_tempo() throws RecognitionException {
		Field_tempoContext _localctx = new Field_tempoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(TEMPO_LABEL);
			setState(105);
			header_beat();
			setState(106);
			match(EQUALS);
			setState(107);
			number();
			setState(108);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_voiceContext extends ParserRuleContext {
		public TerminalNode VOICE_LABEL() { return getToken(AbcParser.VOICE_LABEL, 0); }
		public TerminalNode TEXT() { return getToken(AbcParser.TEXT, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Field_voiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterField_voice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitField_voice(this);
		}
	}

	public final Field_voiceContext field_voice() throws RecognitionException {
		Field_voiceContext _localctx = new Field_voiceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field_voice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(VOICE_LABEL);
			setState(111);
			match(TEXT);
			setState(112);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_keyContext extends ParserRuleContext {
		public TerminalNode KEY_LABEL() { return getToken(AbcParser.KEY_LABEL, 0); }
		public TerminalNode KEY() { return getToken(AbcParser.KEY, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Field_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterField_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitField_key(this);
		}
	}

	public final Field_keyContext field_key() throws RecognitionException {
		Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(KEY_LABEL);
			setState(115);
			match(KEY);
			setState(116);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Header_beatContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public SlashContext slash() {
			return getRuleContext(SlashContext.class,0);
		}
		public Header_beatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_beat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterHeader_beat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitHeader_beat(this);
		}
	}

	public final Header_beatContext header_beat() throws RecognitionException {
		Header_beatContext _localctx = new Header_beatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_header_beat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			number();
			setState(119);
			slash();
			setState(120);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_musicContext extends ParserRuleContext {
		public List<Abc_lineContext> abc_line() {
			return getRuleContexts(Abc_lineContext.class);
		}
		public Abc_lineContext abc_line(int i) {
			return getRuleContext(Abc_lineContext.class,i);
		}
		public List<Voice_changeContext> voice_change() {
			return getRuleContexts(Voice_changeContext.class);
		}
		public Voice_changeContext voice_change(int i) {
			return getRuleContext(Voice_changeContext.class,i);
		}
		public Abc_musicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_music; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterAbc_music(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitAbc_music(this);
		}
	}

	public final Abc_musicContext abc_music() throws RecognitionException {
		Abc_musicContext _localctx = new Abc_musicContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_abc_music);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(124);
				switch (_input.LA(1)) {
				case WHITESPACE:
				case LETTER_NOTE:
				case ACCIDENTAL:
				case REST:
				case CHORD_START:
				case TUPLET_START:
				case BARLINE:
				case NTH_REPEAT:
					{
					setState(122);
					abc_line();
					}
					break;
				case VOICE_LABEL:
					{
					setState(123);
					voice_change();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << VOICE_LABEL) | (1L << LETTER_NOTE) | (1L << ACCIDENTAL) | (1L << REST) | (1L << CHORD_START) | (1L << TUPLET_START) | (1L << BARLINE) | (1L << NTH_REPEAT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_lineContext extends ParserRuleContext {
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Abc_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterAbc_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitAbc_line(this);
		}
	}

	public final Abc_lineContext abc_line() throws RecognitionException {
		Abc_lineContext _localctx = new Abc_lineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_abc_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				element();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << LETTER_NOTE) | (1L << ACCIDENTAL) | (1L << REST) | (1L << CHORD_START) | (1L << TUPLET_START) | (1L << BARLINE) | (1L << NTH_REPEAT))) != 0) );
			setState(133);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Voice_changeContext extends ParserRuleContext {
		public TerminalNode VOICE_LABEL() { return getToken(AbcParser.VOICE_LABEL, 0); }
		public TerminalNode TEXT() { return getToken(AbcParser.TEXT, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Voice_changeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voice_change; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterVoice_change(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitVoice_change(this);
		}
	}

	public final Voice_changeContext voice_change() throws RecognitionException {
		Voice_changeContext _localctx = new Voice_changeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_voice_change);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(VOICE_LABEL);
			setState(136);
			match(TEXT);
			setState(137);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public Note_elementContext note_element() {
			return getRuleContext(Note_elementContext.class,0);
		}
		public Tuplet_elementContext tuplet_element() {
			return getRuleContext(Tuplet_elementContext.class,0);
		}
		public BarlineContext barline() {
			return getRuleContext(BarlineContext.class,0);
		}
		public Nth_repeatContext nth_repeat() {
			return getRuleContext(Nth_repeatContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(AbcParser.WHITESPACE, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_element);
		try {
			setState(144);
			switch (_input.LA(1)) {
			case LETTER_NOTE:
			case ACCIDENTAL:
			case REST:
			case CHORD_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				note_element();
				}
				break;
			case TUPLET_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				tuplet_element();
				}
				break;
			case BARLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				barline();
				}
				break;
			case NTH_REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				nth_repeat();
				}
				break;
			case WHITESPACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(WHITESPACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Note_elementContext extends ParserRuleContext {
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public Note_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterNote_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitNote_element(this);
		}
	}

	public final Note_elementContext note_element() throws RecognitionException {
		Note_elementContext _localctx = new Note_elementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_note_element);
		try {
			setState(148);
			switch (_input.LA(1)) {
			case LETTER_NOTE:
			case ACCIDENTAL:
			case REST:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				note();
				}
				break;
			case CHORD_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				chord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteContext extends ParserRuleContext {
		public Note_or_restContext note_or_rest() {
			return getRuleContext(Note_or_restContext.class,0);
		}
		public Note_lengthContext note_length() {
			return getRuleContext(Note_lengthContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			note_or_rest();
			setState(152);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << SLASH) | (1L << HEADER_NUMBER) | (1L << HEADER_SLASH))) != 0)) {
				{
				setState(151);
				note_length();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Note_lengthContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public SlashContext slash() {
			return getRuleContext(SlashContext.class,0);
		}
		public Note_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterNote_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitNote_length(this);
		}
	}

	public final Note_lengthContext note_length() throws RecognitionException {
		Note_lengthContext _localctx = new Note_lengthContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_note_length);
		int _la;
		try {
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(156);
				_la = _input.LA(1);
				if (_la==NUMBER || _la==HEADER_NUMBER) {
					{
					setState(155);
					number();
					}
				}

				setState(158);
				slash();
				setState(160);
				_la = _input.LA(1);
				if (_la==NUMBER || _la==HEADER_NUMBER) {
					{
					setState(159);
					number();
					}
				}

				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Note_or_restContext extends ParserRuleContext {
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public TerminalNode REST() { return getToken(AbcParser.REST, 0); }
		public Note_or_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_or_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterNote_or_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitNote_or_rest(this);
		}
	}

	public final Note_or_restContext note_or_rest() throws RecognitionException {
		Note_or_restContext _localctx = new Note_or_restContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_note_or_rest);
		try {
			setState(166);
			switch (_input.LA(1)) {
			case LETTER_NOTE:
			case ACCIDENTAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				pitch();
				}
				break;
			case REST:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(REST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PitchContext extends ParserRuleContext {
		public TerminalNode LETTER_NOTE() { return getToken(AbcParser.LETTER_NOTE, 0); }
		public TerminalNode ACCIDENTAL() { return getToken(AbcParser.ACCIDENTAL, 0); }
		public TerminalNode OCTAVE() { return getToken(AbcParser.OCTAVE, 0); }
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitPitch(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL) {
				{
				setState(168);
				match(ACCIDENTAL);
				}
			}

			setState(171);
			match(LETTER_NOTE);
			setState(173);
			_la = _input.LA(1);
			if (_la==OCTAVE) {
				{
				setState(172);
				match(OCTAVE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuplet_elementContext extends ParserRuleContext {
		public Tuplet_specContext tuplet_spec() {
			return getRuleContext(Tuplet_specContext.class,0);
		}
		public List<Note_elementContext> note_element() {
			return getRuleContexts(Note_elementContext.class);
		}
		public Note_elementContext note_element(int i) {
			return getRuleContext(Note_elementContext.class,i);
		}
		public Tuplet_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterTuplet_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitTuplet_element(this);
		}
	}

	public final Tuplet_elementContext tuplet_element() throws RecognitionException {
		Tuplet_elementContext _localctx = new Tuplet_elementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tuplet_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			tuplet_spec();
			setState(177); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(176);
					note_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(179); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuplet_specContext extends ParserRuleContext {
		public TerminalNode TUPLET_START() { return getToken(AbcParser.TUPLET_START, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Tuplet_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterTuplet_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitTuplet_spec(this);
		}
	}

	public final Tuplet_specContext tuplet_spec() throws RecognitionException {
		Tuplet_specContext _localctx = new Tuplet_specContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tuplet_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(TUPLET_START);
			setState(182);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChordContext extends ParserRuleContext {
		public TerminalNode CHORD_START() { return getToken(AbcParser.CHORD_START, 0); }
		public TerminalNode CHORD_END() { return getToken(AbcParser.CHORD_END, 0); }
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public ChordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterChord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitChord(this);
		}
	}

	public final ChordContext chord() throws RecognitionException {
		ChordContext _localctx = new ChordContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_chord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(CHORD_START);
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				note();
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_NOTE) | (1L << ACCIDENTAL) | (1L << REST))) != 0) );
			setState(190);
			match(CHORD_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BarlineContext extends ParserRuleContext {
		public TerminalNode BARLINE() { return getToken(AbcParser.BARLINE, 0); }
		public BarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitBarline(this);
		}
	}

	public final BarlineContext barline() throws RecognitionException {
		BarlineContext _localctx = new BarlineContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_barline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(BARLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nth_repeatContext extends ParserRuleContext {
		public TerminalNode NTH_REPEAT() { return getToken(AbcParser.NTH_REPEAT, 0); }
		public Nth_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nth_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterNth_repeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitNth_repeat(this);
		}
	}

	public final Nth_repeatContext nth_repeat() throws RecognitionException {
		Nth_repeatContext _localctx = new Nth_repeatContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nth_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(NTH_REPEAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EolContext extends ParserRuleContext {
		public TerminalNode HEADER_NEWLINE() { return getToken(AbcParser.HEADER_NEWLINE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(AbcParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AbcParser.NEWLINE, i);
		}
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitEol(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_eol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==HEADER_NEWLINE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(197);
				match(NEWLINE);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode HEADER_NUMBER() { return getToken(AbcParser.HEADER_NUMBER, 0); }
		public TerminalNode NUMBER() { return getToken(AbcParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==HEADER_NUMBER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SlashContext extends ParserRuleContext {
		public TerminalNode HEADER_SLASH() { return getToken(AbcParser.HEADER_SLASH, 0); }
		public TerminalNode SLASH() { return getToken(AbcParser.SLASH, 0); }
		public SlashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).enterSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcParserListener ) ((AbcParserListener)listener).exitSlash(this);
		}
	}

	public final SlashContext slash() throws RecognitionException {
		SlashContext _localctx = new SlashContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_slash);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !(_la==SLASH || _la==HEADER_SLASH) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u00d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\5\2>\n\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6Z\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\5\tg\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\6\16\177\n\16\r\16"+
		"\16\16\u0080\3\17\6\17\u0084\n\17\r\17\16\17\u0085\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u0093\n\21\3\22\3\22\5\22\u0097"+
		"\n\22\3\23\3\23\5\23\u009b\n\23\3\24\3\24\5\24\u009f\n\24\3\24\3\24\5"+
		"\24\u00a3\n\24\5\24\u00a5\n\24\3\25\3\25\5\25\u00a9\n\25\3\26\5\26\u00ac"+
		"\n\26\3\26\3\26\5\26\u00b0\n\26\3\27\3\27\6\27\u00b4\n\27\r\27\16\27\u00b5"+
		"\3\30\3\30\3\30\3\31\3\31\6\31\u00bd\n\31\r\31\16\31\u00be\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\7\34\u00c9\n\34\f\34\16\34\u00cc\13\34\3"+
		"\35\3\35\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:\2\5\4\2\4\4\31\31\4\2\27\27\34\34\4\2\30\30\35"+
		"\35\u00cd\2=\3\2\2\2\4B\3\2\2\2\6L\3\2\2\2\bP\3\2\2\2\nY\3\2\2\2\f[\3"+
		"\2\2\2\16_\3\2\2\2\20c\3\2\2\2\22j\3\2\2\2\24p\3\2\2\2\26t\3\2\2\2\30"+
		"x\3\2\2\2\32~\3\2\2\2\34\u0083\3\2\2\2\36\u0089\3\2\2\2 \u0092\3\2\2\2"+
		"\"\u0096\3\2\2\2$\u0098\3\2\2\2&\u00a4\3\2\2\2(\u00a8\3\2\2\2*\u00ab\3"+
		"\2\2\2,\u00b1\3\2\2\2.\u00b7\3\2\2\2\60\u00ba\3\2\2\2\62\u00c2\3\2\2\2"+
		"\64\u00c4\3\2\2\2\66\u00c6\3\2\2\28\u00cd\3\2\2\2:\u00cf\3\2\2\2<>\5\66"+
		"\34\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\5\4\3\2@A\5\32\16\2A\3\3\2\2\2B"+
		"C\5\6\4\2CG\5\b\5\2DF\5\n\6\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2"+
		"HJ\3\2\2\2IG\3\2\2\2JK\5\26\f\2K\5\3\2\2\2LM\7\6\2\2MN\58\35\2NO\5\66"+
		"\34\2O\7\3\2\2\2PQ\7\n\2\2QR\7!\2\2RS\5\66\34\2S\t\3\2\2\2TZ\5\f\7\2U"+
		"Z\5\16\b\2VZ\5\20\t\2WZ\5\22\n\2XZ\5\24\13\2YT\3\2\2\2YU\3\2\2\2YV\3\2"+
		"\2\2YW\3\2\2\2YX\3\2\2\2Z\13\3\2\2\2[\\\7\13\2\2\\]\7!\2\2]^\5\66\34\2"+
		"^\r\3\2\2\2_`\7\7\2\2`a\5\30\r\2ab\5\66\34\2b\17\3\2\2\2cf\7\b\2\2dg\7"+
		"\36\2\2eg\5\30\r\2fd\3\2\2\2fe\3\2\2\2gh\3\2\2\2hi\5\66\34\2i\21\3\2\2"+
		"\2jk\7\t\2\2kl\5\30\r\2lm\7\37\2\2mn\58\35\2no\5\66\34\2o\23\3\2\2\2p"+
		"q\7\f\2\2qr\7!\2\2rs\5\66\34\2s\25\3\2\2\2tu\7\r\2\2uv\7 \2\2vw\5\66\34"+
		"\2w\27\3\2\2\2xy\58\35\2yz\5:\36\2z{\58\35\2{\31\3\2\2\2|\177\5\34\17"+
		"\2}\177\5\36\20\2~|\3\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\33\3\2\2\2\u0082\u0084\5 \21\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\5\66\34\2\u0088\35\3\2\2\2\u0089\u008a\7\f"+
		"\2\2\u008a\u008b\7!\2\2\u008b\u008c\5\66\34\2\u008c\37\3\2\2\2\u008d\u0093"+
		"\5\"\22\2\u008e\u0093\5,\27\2\u008f\u0093\5\62\32\2\u0090\u0093\5\64\33"+
		"\2\u0091\u0093\7\5\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u008f"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093!\3\2\2\2\u0094"+
		"\u0097\5$\23\2\u0095\u0097\5\60\31\2\u0096\u0094\3\2\2\2\u0096\u0095\3"+
		"\2\2\2\u0097#\3\2\2\2\u0098\u009a\5(\25\2\u0099\u009b\5&\24\2\u009a\u0099"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b%\3\2\2\2\u009c\u00a5\58\35\2\u009d"+
		"\u009f\58\35\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a2\5:\36\2\u00a1\u00a3\58\35\2\u00a2\u00a1\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u009c\3\2\2\2\u00a4\u009e\3\2"+
		"\2\2\u00a5\'\3\2\2\2\u00a6\u00a9\5*\26\2\u00a7\u00a9\7\21\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9)\3\2\2\2\u00aa\u00ac\7\17\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\7\16"+
		"\2\2\u00ae\u00b0\7\20\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"+\3\2\2\2\u00b1\u00b3\5.\30\2\u00b2\u00b4\5\"\22\2\u00b3\u00b2\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6-\3"+
		"\2\2\2\u00b7\u00b8\7\24\2\2\u00b8\u00b9\58\35\2\u00b9/\3\2\2\2\u00ba\u00bc"+
		"\7\22\2\2\u00bb\u00bd\5$\23\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2"+
		"\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\7\23\2\2\u00c1\61\3\2\2\2\u00c2\u00c3\7\25\2\2\u00c3\63\3\2\2\2\u00c4"+
		"\u00c5\7\26\2\2\u00c5\65\3\2\2\2\u00c6\u00ca\t\2\2\2\u00c7\u00c9\7\4\2"+
		"\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\67\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\t\3\2\2\u00ce"+
		"9\3\2\2\2\u00cf\u00d0\t\4\2\2\u00d0;\3\2\2\2\25=GYf~\u0080\u0085\u0092"+
		"\u0096\u009a\u009e\u00a2\u00a4\u00a8\u00ab\u00af\u00b5\u00be\u00ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}