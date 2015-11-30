// Generated from Abc.g4 by ANTLR 4.5.1

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
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, 
    T__16=17, T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, 
    T__23=24, T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, 
    T__30=31, T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, 
    T__37=38, T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, 
    T__44=45, T__45=46, DIGIT=47, NEWLINE=48, WHITESPACE=49;
  public static final int
    RULE_abc_tune = 0, RULE_abc_header = 1, RULE_field_number = 2, RULE_field_title = 3, 
    RULE_other_fields = 4, RULE_field_composer = 5, RULE_field_default_length = 6, 
    RULE_field_meter = 7, RULE_field_tempo = 8, RULE_field_voice = 9, RULE_field_key = 10, 
    RULE_text = 11, RULE_key = 12, RULE_keynote = 13, RULE_key_accidental = 14, 
    RULE_mode_minor = 15, RULE_meter = 16, RULE_meter_fraction = 17, RULE_tempo = 18, 
    RULE_abc_music = 19, RULE_abc_line = 20, RULE_element = 21, RULE_note_element = 22, 
    RULE_note = 23, RULE_note_or_rest = 24, RULE_pitch = 25, RULE_octave = 26, 
    RULE_note_length = 27, RULE_note_length_strict = 28, RULE_accidental = 29, 
    RULE_basenote = 30, RULE_rest = 31, RULE_tuplet_element = 32, RULE_tuplet_spec = 33, 
    RULE_multi_note = 34, RULE_barline = 35, RULE_nth_repeat = 36, RULE_mid_tune_field = 37, 
    RULE_comment = 38, RULE_end_of_line = 39;
  public static final String[] ruleNames = {
    "abc_tune", "abc_header", "field_number", "field_title", "other_fields", 
    "field_composer", "field_default_length", "field_meter", "field_tempo", 
    "field_voice", "field_key", "text", "key", "keynote", "key_accidental", 
    "mode_minor", "meter", "meter_fraction", "tempo", "abc_music", "abc_line", 
    "element", "note_element", "note", "note_or_rest", "pitch", "octave", 
    "note_length", "note_length_strict", "accidental", "basenote", "rest", 
    "tuplet_element", "tuplet_spec", "multi_note", "barline", "nth_repeat", 
    "mid_tune_field", "comment", "end_of_line"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", 
    "'#'", "'b'", "'m'", "'C'", "'C|'", "'/'", "'='", "'''", "','", "'^'", 
    "'^^'", "'_'", "'__'", "'D'", "'E'", "'F'", "'G'", "'A'", "'B'", "'c'", 
    "'d'", "'e'", "'f'", "'g'", "'a'", "'z'", "'('", "'['", "']'", "'|'", 
    "'||'", "'[|'", "'|]'", "':|'", "'|:'", "'[1'", "'[2'", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, null, null, "DIGIT", 
    "NEWLINE", "WHITESPACE"
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
  public String getGrammarFileName() { return "Abc.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }


      // This method makes the parser stop running if it encounters
      // invalid input and throw a RuntimeException.
      public void reportErrorsAsExceptions() {
          // To prevent any reports to standard error, add this line:
          //removeErrorListeners();
          
          addErrorListener(new BaseErrorListener() {
              public void syntaxError(Recognizer<?, ?> recognizer,
                                      Object offendingSymbol, 
                                      int line, int charPositionInLine,
                                      String msg, RecognitionException e) {
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
    public Abc_tuneContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_abc_tune; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterAbc_tune(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitAbc_tune(this);
    }
  }

  public final Abc_tuneContext abc_tune() throws RecognitionException {
    Abc_tuneContext _localctx = new Abc_tuneContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_abc_tune);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(80);
      abc_header();
      setState(81);
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
    public List<CommentContext> comment() {
      return getRuleContexts(CommentContext.class);
    }
    public CommentContext comment(int i) {
      return getRuleContext(CommentContext.class,i);
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
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterAbc_header(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitAbc_header(this);
    }
  }

  public final Abc_headerContext abc_header() throws RecognitionException {
    Abc_headerContext _localctx = new Abc_headerContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_abc_header);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(83);
      field_number();
      setState(87);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__45) {
        {
        {
        setState(84);
        comment();
        }
        }
        setState(89);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(90);
      field_title();
      setState(94);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__45))) != 0)) {
        {
        {
        setState(91);
        other_fields();
        }
        }
        setState(96);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(97);
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
    public End_of_lineContext end_of_line() {
      return getRuleContext(End_of_lineContext.class,0);
    }
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
    }
    public Field_numberContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_number; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_number(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_number(this);
    }
  }

  public final Field_numberContext field_number() throws RecognitionException {
    Field_numberContext _localctx = new Field_numberContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_field_number);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(99);
      match(T__0);
      setState(101); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(100);
        match(DIGIT);
        }
        }
        setState(103); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(105);
      end_of_line();
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
    public TextContext text() {
      return getRuleContext(TextContext.class,0);
    }
    public End_of_lineContext end_of_line() {
      return getRuleContext(End_of_lineContext.class,0);
    }
    public Field_titleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_title; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_title(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_title(this);
    }
  }

  public final Field_titleContext field_title() throws RecognitionException {
    Field_titleContext _localctx = new Field_titleContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_field_title);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(107);
      match(T__1);
      setState(108);
      text();
      setState(109);
      end_of_line();
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
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public Other_fieldsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_other_fields; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterOther_fields(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitOther_fields(this);
    }
  }

  public final Other_fieldsContext other_fields() throws RecognitionException {
    Other_fieldsContext _localctx = new Other_fieldsContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_other_fields);
    try {
      setState(117);
      switch (_input.LA(1)) {
      case T__2:
        enterOuterAlt(_localctx, 1);
        {
        setState(111);
        field_composer();
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(112);
        field_default_length();
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 3);
        {
        setState(113);
        field_meter();
        }
        break;
      case T__5:
        enterOuterAlt(_localctx, 4);
        {
        setState(114);
        field_tempo();
        }
        break;
      case T__6:
        enterOuterAlt(_localctx, 5);
        {
        setState(115);
        field_voice();
        }
        break;
      case T__45:
        enterOuterAlt(_localctx, 6);
        {
        setState(116);
        comment();
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
    public TextContext text() {
      return getRuleContext(TextContext.class,0);
    }
    public End_of_lineContext end_of_line() {
      return getRuleContext(End_of_lineContext.class,0);
    }
    public Field_composerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_composer; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_composer(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_composer(this);
    }
  }

  public final Field_composerContext field_composer() throws RecognitionException {
    Field_composerContext _localctx = new Field_composerContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_field_composer);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(119);
      match(T__2);
      setState(120);
      text();
      setState(121);
      end_of_line();
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
    public Note_length_strictContext note_length_strict() {
      return getRuleContext(Note_length_strictContext.class,0);
    }
    public End_of_lineContext end_of_line() {
      return getRuleContext(End_of_lineContext.class,0);
    }
    public Field_default_lengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_default_length; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_default_length(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_default_length(this);
    }
  }

  public final Field_default_lengthContext field_default_length() throws RecognitionException {
    Field_default_lengthContext _localctx = new Field_default_lengthContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_field_default_length);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(123);
      match(T__3);
      setState(124);
      note_length_strict();
      setState(125);
      end_of_line();
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
    public MeterContext meter() {
      return getRuleContext(MeterContext.class,0);
    }
    public End_of_lineContext end_of_line() {
      return getRuleContext(End_of_lineContext.class,0);
    }
    public Field_meterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_meter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_meter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_meter(this);
    }
  }

  public final Field_meterContext field_meter() throws RecognitionException {
    Field_meterContext _localctx = new Field_meterContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_field_meter);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(127);
      match(T__4);
      setState(128);
      meter();
      setState(129);
      end_of_line();
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
    public TempoContext tempo() {
      return getRuleContext(TempoContext.class,0);
    }
    public End_of_lineContext end_of_line() {
      return getRuleContext(End_of_lineContext.class,0);
    }
    public Field_tempoContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_tempo; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_tempo(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_tempo(this);
    }
  }

  public final Field_tempoContext field_tempo() throws RecognitionException {
    Field_tempoContext _localctx = new Field_tempoContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_field_tempo);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(131);
      match(T__5);
      setState(132);
      tempo();
      setState(133);
      end_of_line();
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
    public TextContext text() {
      return getRuleContext(TextContext.class,0);
    }
    public End_of_lineContext end_of_line() {
      return getRuleContext(End_of_lineContext.class,0);
    }
    public Field_voiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_voice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_voice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_voice(this);
    }
  }

  public final Field_voiceContext field_voice() throws RecognitionException {
    Field_voiceContext _localctx = new Field_voiceContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_field_voice);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(135);
      match(T__6);
      setState(136);
      text();
      setState(137);
      end_of_line();
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
    public KeyContext key() {
      return getRuleContext(KeyContext.class,0);
    }
    public End_of_lineContext end_of_line() {
      return getRuleContext(End_of_lineContext.class,0);
    }
    public Field_keyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_field_key; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_key(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_key(this);
    }
  }

  public final Field_keyContext field_key() throws RecognitionException {
    Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_field_key);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(139);
      match(T__7);
      setState(140);
      key();
      setState(141);
      end_of_line();
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

  public static class TextContext extends ParserRuleContext {
    public TextContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_text; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterText(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitText(this);
    }
  }

  public final TextContext text() throws RecognitionException {
    TextContext _localctx = new TextContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_text);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(146);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
      while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1+1 ) {
          {
          {
          setState(143);
          matchWildcard();
          }
          } 
        }
        setState(148);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

  public static class KeyContext extends ParserRuleContext {
    public KeynoteContext keynote() {
      return getRuleContext(KeynoteContext.class,0);
    }
    public Mode_minorContext mode_minor() {
      return getRuleContext(Mode_minorContext.class,0);
    }
    public KeyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_key; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterKey(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitKey(this);
    }
  }

  public final KeyContext key() throws RecognitionException {
    KeyContext _localctx = new KeyContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_key);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(149);
      keynote();
      setState(151);
      _la = _input.LA(1);
      if (_la==T__10) {
        {
        setState(150);
        mode_minor();
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

  public static class KeynoteContext extends ParserRuleContext {
    public BasenoteContext basenote() {
      return getRuleContext(BasenoteContext.class,0);
    }
    public Key_accidentalContext key_accidental() {
      return getRuleContext(Key_accidentalContext.class,0);
    }
    public KeynoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_keynote; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterKeynote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitKeynote(this);
    }
  }

  public final KeynoteContext keynote() throws RecognitionException {
    KeynoteContext _localctx = new KeynoteContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_keynote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(153);
      basenote();
      setState(155);
      _la = _input.LA(1);
      if (_la==T__8 || _la==T__9) {
        {
        setState(154);
        key_accidental();
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

  public static class Key_accidentalContext extends ParserRuleContext {
    public Key_accidentalContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_key_accidental; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterKey_accidental(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitKey_accidental(this);
    }
  }

  public final Key_accidentalContext key_accidental() throws RecognitionException {
    Key_accidentalContext _localctx = new Key_accidentalContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_key_accidental);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(157);
      _la = _input.LA(1);
      if ( !(_la==T__8 || _la==T__9) ) {
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

  public static class Mode_minorContext extends ParserRuleContext {
    public Mode_minorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_mode_minor; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMode_minor(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMode_minor(this);
    }
  }

  public final Mode_minorContext mode_minor() throws RecognitionException {
    Mode_minorContext _localctx = new Mode_minorContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_mode_minor);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(159);
      match(T__10);
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

  public static class MeterContext extends ParserRuleContext {
    public Meter_fractionContext meter_fraction() {
      return getRuleContext(Meter_fractionContext.class,0);
    }
    public MeterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_meter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMeter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMeter(this);
    }
  }

  public final MeterContext meter() throws RecognitionException {
    MeterContext _localctx = new MeterContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_meter);
    try {
      setState(164);
      switch (_input.LA(1)) {
      case T__11:
        enterOuterAlt(_localctx, 1);
        {
        setState(161);
        match(T__11);
        }
        break;
      case T__12:
        enterOuterAlt(_localctx, 2);
        {
        setState(162);
        match(T__12);
        }
        break;
      case DIGIT:
        enterOuterAlt(_localctx, 3);
        {
        setState(163);
        meter_fraction();
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

  public static class Meter_fractionContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
    }
    public Meter_fractionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_meter_fraction; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMeter_fraction(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMeter_fraction(this);
    }
  }

  public final Meter_fractionContext meter_fraction() throws RecognitionException {
    Meter_fractionContext _localctx = new Meter_fractionContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_meter_fraction);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(167); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(166);
        match(DIGIT);
        }
        }
        setState(169); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(171);
      match(T__13);
      setState(173); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(172);
        match(DIGIT);
        }
        }
        setState(175); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
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

  public static class TempoContext extends ParserRuleContext {
    public Meter_fractionContext meter_fraction() {
      return getRuleContext(Meter_fractionContext.class,0);
    }
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
    }
    public TempoContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tempo; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTempo(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTempo(this);
    }
  }

  public final TempoContext tempo() throws RecognitionException {
    TempoContext _localctx = new TempoContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_tempo);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(177);
      meter_fraction();
      setState(178);
      match(T__14);
      setState(180); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(179);
        match(DIGIT);
        }
        }
        setState(182); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
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
    public Abc_musicContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_abc_music; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterAbc_music(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitAbc_music(this);
    }
  }

  public final Abc_musicContext abc_music() throws RecognitionException {
    Abc_musicContext _localctx = new Abc_musicContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_abc_music);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(185); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(184);
        abc_line();
        }
        }
        setState(187); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << WHITESPACE))) != 0) );
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
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public List<ElementContext> element() {
      return getRuleContexts(ElementContext.class);
    }
    public ElementContext element(int i) {
      return getRuleContext(ElementContext.class,i);
    }
    public Mid_tune_fieldContext mid_tune_field() {
      return getRuleContext(Mid_tune_fieldContext.class,0);
    }
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public Abc_lineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_abc_line; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterAbc_line(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitAbc_line(this);
    }
  }

  public final Abc_lineContext abc_line() throws RecognitionException {
    Abc_lineContext _localctx = new Abc_lineContext(_ctx, getState());
    enterRule(_localctx, 40, RULE_abc_line);
    int _la;
    try {
      setState(198);
      switch (_input.LA(1)) {
      case T__9:
      case T__11:
      case T__14:
      case T__17:
      case T__18:
      case T__19:
      case T__20:
      case T__21:
      case T__22:
      case T__23:
      case T__24:
      case T__25:
      case T__26:
      case T__27:
      case T__28:
      case T__29:
      case T__30:
      case T__31:
      case T__32:
      case T__33:
      case T__34:
      case T__35:
      case T__37:
      case T__38:
      case T__39:
      case T__40:
      case T__41:
      case T__42:
      case T__43:
      case T__44:
      case WHITESPACE:
        enterOuterAlt(_localctx, 1);
        {
        setState(190); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(189);
          element();
          }
          }
          setState(192); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << WHITESPACE))) != 0) );
        setState(194);
        match(NEWLINE);
        }
        break;
      case T__6:
        enterOuterAlt(_localctx, 2);
        {
        setState(196);
        mid_tune_field();
        }
        break;
      case T__45:
        enterOuterAlt(_localctx, 3);
        {
        setState(197);
        comment();
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
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterElement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitElement(this);
    }
  }

  public final ElementContext element() throws RecognitionException {
    ElementContext _localctx = new ElementContext(_ctx, getState());
    enterRule(_localctx, 42, RULE_element);
    try {
      setState(205);
      switch (_input.LA(1)) {
      case T__9:
      case T__11:
      case T__14:
      case T__17:
      case T__18:
      case T__19:
      case T__20:
      case T__21:
      case T__22:
      case T__23:
      case T__24:
      case T__25:
      case T__26:
      case T__27:
      case T__28:
      case T__29:
      case T__30:
      case T__31:
      case T__32:
      case T__33:
      case T__35:
        enterOuterAlt(_localctx, 1);
        {
        setState(200);
        note_element();
        }
        break;
      case T__34:
        enterOuterAlt(_localctx, 2);
        {
        setState(201);
        tuplet_element();
        }
        break;
      case T__37:
      case T__38:
      case T__39:
      case T__40:
      case T__41:
      case T__42:
        enterOuterAlt(_localctx, 3);
        {
        setState(202);
        barline();
        }
        break;
      case T__43:
      case T__44:
        enterOuterAlt(_localctx, 4);
        {
        setState(203);
        nth_repeat();
        }
        break;
      case WHITESPACE:
        enterOuterAlt(_localctx, 5);
        {
        setState(204);
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
    public Multi_noteContext multi_note() {
      return getRuleContext(Multi_noteContext.class,0);
    }
    public Note_elementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note_element; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote_element(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote_element(this);
    }
  }

  public final Note_elementContext note_element() throws RecognitionException {
    Note_elementContext _localctx = new Note_elementContext(_ctx, getState());
    enterRule(_localctx, 44, RULE_note_element);
    try {
      setState(209);
      switch (_input.LA(1)) {
      case T__9:
      case T__11:
      case T__14:
      case T__17:
      case T__18:
      case T__19:
      case T__20:
      case T__21:
      case T__22:
      case T__23:
      case T__24:
      case T__25:
      case T__26:
      case T__27:
      case T__28:
      case T__29:
      case T__30:
      case T__31:
      case T__32:
      case T__33:
        enterOuterAlt(_localctx, 1);
        {
        setState(207);
        note();
        }
        break;
      case T__35:
        enterOuterAlt(_localctx, 2);
        {
        setState(208);
        multi_note();
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
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote(this);
    }
  }

  public final NoteContext note() throws RecognitionException {
    NoteContext _localctx = new NoteContext(_ctx, getState());
    enterRule(_localctx, 46, RULE_note);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(211);
      note_or_rest();
      setState(212);
      note_length();
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
    public RestContext rest() {
      return getRuleContext(RestContext.class,0);
    }
    public Note_or_restContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note_or_rest; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote_or_rest(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote_or_rest(this);
    }
  }

  public final Note_or_restContext note_or_rest() throws RecognitionException {
    Note_or_restContext _localctx = new Note_or_restContext(_ctx, getState());
    enterRule(_localctx, 48, RULE_note_or_rest);
    try {
      setState(216);
      switch (_input.LA(1)) {
      case T__9:
      case T__11:
      case T__14:
      case T__17:
      case T__18:
      case T__19:
      case T__20:
      case T__21:
      case T__22:
      case T__23:
      case T__24:
      case T__25:
      case T__26:
      case T__27:
      case T__28:
      case T__29:
      case T__30:
      case T__31:
      case T__32:
        enterOuterAlt(_localctx, 1);
        {
        setState(214);
        pitch();
        }
        break;
      case T__33:
        enterOuterAlt(_localctx, 2);
        {
        setState(215);
        rest();
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
    public BasenoteContext basenote() {
      return getRuleContext(BasenoteContext.class,0);
    }
    public AccidentalContext accidental() {
      return getRuleContext(AccidentalContext.class,0);
    }
    public OctaveContext octave() {
      return getRuleContext(OctaveContext.class,0);
    }
    public PitchContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_pitch; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterPitch(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitPitch(this);
    }
  }

  public final PitchContext pitch() throws RecognitionException {
    PitchContext _localctx = new PitchContext(_ctx, getState());
    enterRule(_localctx, 50, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(219);
      _la = _input.LA(1);
      if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
        {
        setState(218);
        accidental();
        }
      }

      setState(221);
      basenote();
      setState(223);
      _la = _input.LA(1);
      if (_la==T__15 || _la==T__16) {
        {
        setState(222);
        octave();
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

  public static class OctaveContext extends ParserRuleContext {
    public OctaveContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_octave; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterOctave(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitOctave(this);
    }
  }

  public final OctaveContext octave() throws RecognitionException {
    OctaveContext _localctx = new OctaveContext(_ctx, getState());
    enterRule(_localctx, 52, RULE_octave);
    int _la;
    try {
      setState(235);
      switch (_input.LA(1)) {
      case T__15:
        enterOuterAlt(_localctx, 1);
        {
        setState(226); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(225);
          match(T__15);
          }
          }
          setState(228); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__15 );
        }
        break;
      case T__16:
        enterOuterAlt(_localctx, 2);
        {
        setState(231); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(230);
          match(T__16);
          }
          }
          setState(233); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__16 );
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

  public static class Note_lengthContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
    }
    public Note_lengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note_length; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote_length(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote_length(this);
    }
  }

  public final Note_lengthContext note_length() throws RecognitionException {
    Note_lengthContext _localctx = new Note_lengthContext(_ctx, getState());
    enterRule(_localctx, 54, RULE_note_length);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(242);
      _la = _input.LA(1);
      if (_la==DIGIT) {
        {
        setState(238); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(237);
          match(DIGIT);
          }
          }
          setState(240); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==DIGIT );
        }
      }

      setState(252);
      _la = _input.LA(1);
      if (_la==T__13) {
        {
        setState(244);
        match(T__13);
        setState(250);
        _la = _input.LA(1);
        if (_la==DIGIT) {
          {
          setState(246); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(245);
            match(DIGIT);
            }
            }
            setState(248); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==DIGIT );
          }
        }

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

  public static class Note_length_strictContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
    }
    public Note_length_strictContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note_length_strict; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote_length_strict(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote_length_strict(this);
    }
  }

  public final Note_length_strictContext note_length_strict() throws RecognitionException {
    Note_length_strictContext _localctx = new Note_length_strictContext(_ctx, getState());
    enterRule(_localctx, 56, RULE_note_length_strict);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(255); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(254);
        match(DIGIT);
        }
        }
        setState(257); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(259);
      match(T__13);
      setState(261); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(260);
        match(DIGIT);
        }
        }
        setState(263); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
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

  public static class AccidentalContext extends ParserRuleContext {
    public AccidentalContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_accidental; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterAccidental(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitAccidental(this);
    }
  }

  public final AccidentalContext accidental() throws RecognitionException {
    AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
    enterRule(_localctx, 58, RULE_accidental);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(265);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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

  public static class BasenoteContext extends ParserRuleContext {
    public BasenoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_basenote; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterBasenote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitBasenote(this);
    }
  }

  public final BasenoteContext basenote() throws RecognitionException {
    BasenoteContext _localctx = new BasenoteContext(_ctx, getState());
    enterRule(_localctx, 60, RULE_basenote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(267);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
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

  public static class RestContext extends ParserRuleContext {
    public RestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_rest; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterRest(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitRest(this);
    }
  }

  public final RestContext rest() throws RecognitionException {
    RestContext _localctx = new RestContext(_ctx, getState());
    enterRule(_localctx, 62, RULE_rest);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(269);
      match(T__33);
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
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTuplet_element(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTuplet_element(this);
    }
  }

  public final Tuplet_elementContext tuplet_element() throws RecognitionException {
    Tuplet_elementContext _localctx = new Tuplet_elementContext(_ctx, getState());
    enterRule(_localctx, 64, RULE_tuplet_element);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(271);
      tuplet_spec();
      setState(273); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(272);
          note_element();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(275); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
    public TerminalNode DIGIT() { return getToken(AbcParser.DIGIT, 0); }
    public Tuplet_specContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tuplet_spec; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTuplet_spec(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTuplet_spec(this);
    }
  }

  public final Tuplet_specContext tuplet_spec() throws RecognitionException {
    Tuplet_specContext _localctx = new Tuplet_specContext(_ctx, getState());
    enterRule(_localctx, 66, RULE_tuplet_spec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(277);
      match(T__34);
      setState(278);
      match(DIGIT);
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

  public static class Multi_noteContext extends ParserRuleContext {
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public Multi_noteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_multi_note; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMulti_note(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMulti_note(this);
    }
  }

  public final Multi_noteContext multi_note() throws RecognitionException {
    Multi_noteContext _localctx = new Multi_noteContext(_ctx, getState());
    enterRule(_localctx, 68, RULE_multi_note);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(280);
      match(T__35);
      setState(282); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(281);
        note();
        }
        }
        setState(284); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0) );
      setState(286);
      match(T__36);
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
    public BarlineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_barline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterBarline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitBarline(this);
    }
  }

  public final BarlineContext barline() throws RecognitionException {
    BarlineContext _localctx = new BarlineContext(_ctx, getState());
    enterRule(_localctx, 70, RULE_barline);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(288);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
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

  public static class Nth_repeatContext extends ParserRuleContext {
    public Nth_repeatContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_nth_repeat; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNth_repeat(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNth_repeat(this);
    }
  }

  public final Nth_repeatContext nth_repeat() throws RecognitionException {
    Nth_repeatContext _localctx = new Nth_repeatContext(_ctx, getState());
    enterRule(_localctx, 72, RULE_nth_repeat);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(290);
      _la = _input.LA(1);
      if ( !(_la==T__43 || _la==T__44) ) {
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

  public static class Mid_tune_fieldContext extends ParserRuleContext {
    public Field_voiceContext field_voice() {
      return getRuleContext(Field_voiceContext.class,0);
    }
    public Mid_tune_fieldContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_mid_tune_field; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMid_tune_field(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMid_tune_field(this);
    }
  }

  public final Mid_tune_fieldContext mid_tune_field() throws RecognitionException {
    Mid_tune_fieldContext _localctx = new Mid_tune_fieldContext(_ctx, getState());
    enterRule(_localctx, 74, RULE_mid_tune_field);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(292);
      field_voice();
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

  public static class CommentContext extends ParserRuleContext {
    public TextContext text() {
      return getRuleContext(TextContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 76, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(294);
      match(T__45);
      setState(295);
      text();
      setState(296);
      match(NEWLINE);
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

  public static class End_of_lineContext extends ParserRuleContext {
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(AbcParser.NEWLINE, 0); }
    public End_of_lineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_end_of_line; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).enterEnd_of_line(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof AbcListener ) ((AbcListener)listener).exitEnd_of_line(this);
    }
  }

  public final End_of_lineContext end_of_line() throws RecognitionException {
    End_of_lineContext _localctx = new End_of_lineContext(_ctx, getState());
    enterRule(_localctx, 78, RULE_end_of_line);
    try {
      setState(300);
      switch (_input.LA(1)) {
      case T__45:
        enterOuterAlt(_localctx, 1);
        {
        setState(298);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(299);
        match(NEWLINE);
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

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u0131\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
      "\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
      "\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4("+
      "\t(\4)\t)\3\2\3\2\3\2\3\3\3\3\7\3X\n\3\f\3\16\3[\13\3\3\3\3\3\7\3"+
      "_\n\3\f\3\16\3b\13\3\3\3\3\3\3\4\3\4\6\4h\n\4\r\4\16\4i\3\4\3\4\3"+
      "\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6x\n\6\3\7\3\7\3\7\3\7\3"+
      "\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
      "\3\f\3\f\3\f\3\f\3\r\7\r\u0093\n\r\f\r\16\r\u0096\13\r\3\16\3\16\5"+
      "\16\u009a\n\16\3\17\3\17\5\17\u009e\n\17\3\20\3\20\3\21\3\21\3\22"+
      "\3\22\3\22\5\22\u00a7\n\22\3\23\6\23\u00aa\n\23\r\23\16\23\u00ab\3"+
      "\23\3\23\6\23\u00b0\n\23\r\23\16\23\u00b1\3\24\3\24\3\24\6\24\u00b7"+
      "\n\24\r\24\16\24\u00b8\3\25\6\25\u00bc\n\25\r\25\16\25\u00bd\3\26"+
      "\6\26\u00c1\n\26\r\26\16\26\u00c2\3\26\3\26\3\26\3\26\5\26\u00c9\n"+
      "\26\3\27\3\27\3\27\3\27\3\27\5\27\u00d0\n\27\3\30\3\30\5\30\u00d4"+
      "\n\30\3\31\3\31\3\31\3\32\3\32\5\32\u00db\n\32\3\33\5\33\u00de\n\33"+
      "\3\33\3\33\5\33\u00e2\n\33\3\34\6\34\u00e5\n\34\r\34\16\34\u00e6\3"+
      "\34\6\34\u00ea\n\34\r\34\16\34\u00eb\5\34\u00ee\n\34\3\35\6\35\u00f1"+
      "\n\35\r\35\16\35\u00f2\5\35\u00f5\n\35\3\35\3\35\6\35\u00f9\n\35\r"+
      "\35\16\35\u00fa\5\35\u00fd\n\35\5\35\u00ff\n\35\3\36\6\36\u0102\n"+
      "\36\r\36\16\36\u0103\3\36\3\36\6\36\u0108\n\36\r\36\16\36\u0109\3"+
      "\37\3\37\3 \3 \3!\3!\3\"\3\"\6\"\u0114\n\"\r\"\16\"\u0115\3#\3#\3"+
      "#\3$\3$\6$\u011d\n$\r$\16$\u011e\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
      "(\3(\3)\3)\5)\u012f\n)\3)\3\u0094\2*\2\4\6\b\n\f\16\20\22\24\26\30"+
      "\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\7\3\2\13\f\4\2\21\21"+
      "\24\27\5\2\f\f\16\16\30#\3\2(-\3\2./\u0131\2R\3\2\2\2\4U\3\2\2\2\6"+
      "e\3\2\2\2\bm\3\2\2\2\nw\3\2\2\2\fy\3\2\2\2\16}\3\2\2\2\20\u0081\3"+
      "\2\2\2\22\u0085\3\2\2\2\24\u0089\3\2\2\2\26\u008d\3\2\2\2\30\u0094"+
      "\3\2\2\2\32\u0097\3\2\2\2\34\u009b\3\2\2\2\36\u009f\3\2\2\2 \u00a1"+
      "\3\2\2\2\"\u00a6\3\2\2\2$\u00a9\3\2\2\2&\u00b3\3\2\2\2(\u00bb\3\2"+
      "\2\2*\u00c8\3\2\2\2,\u00cf\3\2\2\2.\u00d3\3\2\2\2\60\u00d5\3\2\2\2"+
      "\62\u00da\3\2\2\2\64\u00dd\3\2\2\2\66\u00ed\3\2\2\28\u00f4\3\2\2\2"+
      ":\u0101\3\2\2\2<\u010b\3\2\2\2>\u010d\3\2\2\2@\u010f\3\2\2\2B\u0111"+
      "\3\2\2\2D\u0117\3\2\2\2F\u011a\3\2\2\2H\u0122\3\2\2\2J\u0124\3\2\2"+
      "\2L\u0126\3\2\2\2N\u0128\3\2\2\2P\u012e\3\2\2\2RS\5\4\3\2ST\5(\25"+
      "\2T\3\3\2\2\2UY\5\6\4\2VX\5N(\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3"+
      "\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\`\5\b\5\2]_\5\n\6\2^]\3\2\2\2_b\3\2\2"+
      "\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\5\26\f\2d\5\3\2\2\2e"+
      "g\7\3\2\2fh\7\61\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2"+
      "\2\2kl\5P)\2l\7\3\2\2\2mn\7\4\2\2no\5\30\r\2op\5P)\2p\t\3\2\2\2qx"+
      "\5\f\7\2rx\5\16\b\2sx\5\20\t\2tx\5\22\n\2ux\5\24\13\2vx\5N(\2wq\3"+
      "\2\2\2wr\3\2\2\2ws\3\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\13\3\2\2"+
      "\2yz\7\5\2\2z{\5\30\r\2{|\5P)\2|\r\3\2\2\2}~\7\6\2\2~\177\5:\36\2"+
      "\177\u0080\5P)\2\u0080\17\3\2\2\2\u0081\u0082\7\7\2\2\u0082\u0083"+
      "\5\"\22\2\u0083\u0084\5P)\2\u0084\21\3\2\2\2\u0085\u0086\7\b\2\2\u0086"+
      "\u0087\5&\24\2\u0087\u0088\5P)\2\u0088\23\3\2\2\2\u0089\u008a\7\t"+
      "\2\2\u008a\u008b\5\30\r\2\u008b\u008c\5P)\2\u008c\25\3\2\2\2\u008d"+
      "\u008e\7\n\2\2\u008e\u008f\5\32\16\2\u008f\u0090\5P)\2\u0090\27\3"+
      "\2\2\2\u0091\u0093\13\2\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2"+
      "\2\u0094\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\31\3\2\2\2\u0096"+
      "\u0094\3\2\2\2\u0097\u0099\5\34\17\2\u0098\u009a\5 \21\2\u0099\u0098"+
      "\3\2\2\2\u0099\u009a\3\2\2\2\u009a\33\3\2\2\2\u009b\u009d\5> \2\u009c"+
      "\u009e\5\36\20\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\35"+
      "\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0\37\3\2\2\2\u00a1\u00a2\7\r\2\2"+
      "\u00a2!\3\2\2\2\u00a3\u00a7\7\16\2\2\u00a4\u00a7\7\17\2\2\u00a5\u00a7"+
      "\5$\23\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2"+
      "\2\u00a7#\3\2\2\2\u00a8\u00aa\7\61\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab"+
      "\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2"+
      "\2\u00ad\u00af\7\20\2\2\u00ae\u00b0\7\61\2\2\u00af\u00ae\3\2\2\2\u00b0"+
      "\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2%\3\2"+
      "\2\2\u00b3\u00b4\5$\23\2\u00b4\u00b6\7\21\2\2\u00b5\u00b7\7\61\2\2"+
      "\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
      "\u00b9\3\2\2\2\u00b9\'\3\2\2\2\u00ba\u00bc\5*\26\2\u00bb\u00ba\3\2"+
      "\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
      ")\3\2\2\2\u00bf\u00c1\5,\27\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
      "\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
      "\u00c5\7\62\2\2\u00c5\u00c9\3\2\2\2\u00c6\u00c9\5L\'\2\u00c7\u00c9"+
      "\5N(\2\u00c8\u00c0\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2"+
      "\u00c9+\3\2\2\2\u00ca\u00d0\5.\30\2\u00cb\u00d0\5B\"\2\u00cc\u00d0"+
      "\5H%\2\u00cd\u00d0\5J&\2\u00ce\u00d0\7\63\2\2\u00cf\u00ca\3\2\2\2"+
      "\u00cf\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
      "\u00ce\3\2\2\2\u00d0-\3\2\2\2\u00d1\u00d4\5\60\31\2\u00d2\u00d4\5"+
      "F$\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4/\3\2\2\2\u00d5"+
      "\u00d6\5\62\32\2\u00d6\u00d7\58\35\2\u00d7\61\3\2\2\2\u00d8\u00db"+
      "\5\64\33\2\u00d9\u00db\5@!\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2"+
      "\2\u00db\63\3\2\2\2\u00dc\u00de\5<\37\2\u00dd\u00dc\3\2\2\2\u00dd"+
      "\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\5> \2\u00e0\u00e2\5"+
      "\66\34\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\65\3\2\2\2"+
      "\u00e3\u00e5\7\22\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
      "\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ee\3\2\2\2\u00e8\u00ea"+
      "\7\23\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2"+
      "\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e4\3\2\2\2\u00ed"+
      "\u00e9\3\2\2\2\u00ee\67\3\2\2\2\u00ef\u00f1\7\61\2\2\u00f0\u00ef\3"+
      "\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2"+
      "\u00f3\u00f5\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
      "\u00fe\3\2\2\2\u00f6\u00fc\7\20\2\2\u00f7\u00f9\7\61\2\2\u00f8\u00f7"+
      "\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2"+
      "\2\u00fb\u00fd\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
      "\u00ff\3\2\2\2\u00fe\u00f6\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff9\3\2"+
      "\2\2\u0100\u0102\7\61\2\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2"+
      "\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
      "\u0107\7\20\2\2\u0106\u0108\7\61\2\2\u0107\u0106\3\2\2\2\u0108\u0109"+
      "\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a;\3\2\2\2\u010b"+
      "\u010c\t\3\2\2\u010c=\3\2\2\2\u010d\u010e\t\4\2\2\u010e?\3\2\2\2\u010f"+
      "\u0110\7$\2\2\u0110A\3\2\2\2\u0111\u0113\5D#\2\u0112\u0114\5.\30\2"+
      "\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
      "\u0116\3\2\2\2\u0116C\3\2\2\2\u0117\u0118\7%\2\2\u0118\u0119\7\61"+
      "\2\2\u0119E\3\2\2\2\u011a\u011c\7&\2\2\u011b\u011d\5\60\31\2\u011c"+
      "\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f"+
      "\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\'\2\2\u0121G\3\2\2\2\u0122"+
      "\u0123\t\5\2\2\u0123I\3\2\2\2\u0124\u0125\t\6\2\2\u0125K\3\2\2\2\u0126"+
      "\u0127\5\24\13\2\u0127M\3\2\2\2\u0128\u0129\7\60\2\2\u0129\u012a\5"+
      "\30\r\2\u012a\u012b\7\62\2\2\u012bO\3\2\2\2\u012c\u012f\5N(\2\u012d"+
      "\u012f\7\62\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012fQ\3\2"+
      "\2\2\"Y`iw\u0094\u0099\u009d\u00a6\u00ab\u00b1\u00b8\u00bd\u00c2\u00c8"+
      "\u00cf\u00d3\u00da\u00dd\u00e1\u00e6\u00eb\u00ed\u00f2\u00f4\u00fa"+
      "\u00fc\u00fe\u0103\u0109\u0115\u011e\u012e";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}