// Generated from AbcLexer.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcLexer extends Lexer {
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
	public static final int HEADER_MODE = 1;
	public static final int KEY_MODE = 2;
	public static final int TEXT_MODE = 3;
	public static String[] modeNames = {
		"DEFAULT_MODE", "HEADER_MODE", "KEY_MODE", "TEXT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMENT", "NEWLINE", "WHITESPACE", "NUMBER_LABEL", "LENGTH_LABEL", "METER_LABEL", 
		"TEMPO_LABEL", "TITLE_LABEL", "COMPOSER_LABEL", "VOICE_LABEL", "KEY_LABEL", 
		"LETTER_NOTE", "ACCIDENTAL", "OCTAVE", "REST", "CHORD_START", "CHORD_END", 
		"TUPLET_START", "BARLINE", "NTH_REPEAT", "NUMBER", "SLASH", "HEADER_NEWLINE", 
		"HEADER_COMMENT", "HEADER_WHITESPACE", "HEADER_NUMBER", "HEADER_SLASH", 
		"METER_SHORTHAND", "EQUALS", "KEY", "TEXT"
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


	public AbcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AbcLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00df\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \3\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\3\2\3\3\3\3\3\3\5\3Q\n"+
		"\3\3\4\6\4T\n\4\r\4\16\4U\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0089\n\16\3\17\6\17\u008c\n\17\r\17\16"+
		"\17\u008d\3\17\6\17\u0091\n\17\r\17\16\17\u0092\5\17\u0095\n\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u00aa\n\24\3\25\3\25\3\25\3\25\5\25\u00b0\n\25"+
		"\3\26\6\26\u00b3\n\26\r\26\16\26\u00b4\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\35\5\35\u00cc\n\35\3\36\3\36\3\37\3\37\5\37\u00d2\n\37\3\37\5\37\u00d5"+
		"\n\37\3\37\3\37\3 \6 \u00da\n \r \16 \u00db\3 \3 \2\2!\6\3\b\4\n\5\f\6"+
		"\16\7\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17 \20\"\21$\22&\23(\24"+
		"*\25,\26.\27\60\30\62\31\64\32\66\338\34:\35<\36>\37@ B!\6\2\3\4\5\6\4"+
		"\2\f\f\17\17\4\2\13\13\"\"\4\2CIci\4\2%%dd\u00f0\2\6\3\2\2\2\2\b\3\2\2"+
		"\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24"+
		"\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2"+
		"\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2"+
		"\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3"+
		"\2\2\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3>\3\2\2\2\4@\3\2\2\2\5B\3\2\2"+
		"\2\6D\3\2\2\2\bP\3\2\2\2\nS\3\2\2\2\fW\3\2\2\2\16\\\3\2\2\2\20a\3\2\2"+
		"\2\22f\3\2\2\2\24k\3\2\2\2\26p\3\2\2\2\30u\3\2\2\2\32z\3\2\2\2\34\177"+
		"\3\2\2\2\36\u0088\3\2\2\2 \u0094\3\2\2\2\"\u0096\3\2\2\2$\u0098\3\2\2"+
		"\2&\u009a\3\2\2\2(\u009c\3\2\2\2*\u00a9\3\2\2\2,\u00af\3\2\2\2.\u00b2"+
		"\3\2\2\2\60\u00b6\3\2\2\2\62\u00b8\3\2\2\2\64\u00bc\3\2\2\2\66\u00c0\3"+
		"\2\2\28\u00c4\3\2\2\2:\u00c6\3\2\2\2<\u00cb\3\2\2\2>\u00cd\3\2\2\2@\u00cf"+
		"\3\2\2\2B\u00d9\3\2\2\2DH\7\'\2\2EG\n\2\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2"+
		"\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\b\2\2\2L\7\3\2\2\2MQ\t\2\2\2NO\7"+
		"\17\2\2OQ\7\f\2\2PM\3\2\2\2PN\3\2\2\2Q\t\3\2\2\2RT\t\3\2\2SR\3\2\2\2T"+
		"U\3\2\2\2US\3\2\2\2UV\3\2\2\2V\13\3\2\2\2WX\7Z\2\2XY\7<\2\2YZ\3\2\2\2"+
		"Z[\b\5\3\2[\r\3\2\2\2\\]\7N\2\2]^\7<\2\2^_\3\2\2\2_`\b\6\3\2`\17\3\2\2"+
		"\2ab\7O\2\2bc\7<\2\2cd\3\2\2\2de\b\7\3\2e\21\3\2\2\2fg\7S\2\2gh\7<\2\2"+
		"hi\3\2\2\2ij\b\b\3\2j\23\3\2\2\2kl\7V\2\2lm\7<\2\2mn\3\2\2\2no\b\t\4\2"+
		"o\25\3\2\2\2pq\7E\2\2qr\7<\2\2rs\3\2\2\2st\b\n\4\2t\27\3\2\2\2uv\7X\2"+
		"\2vw\7<\2\2wx\3\2\2\2xy\b\13\4\2y\31\3\2\2\2z{\7M\2\2{|\7<\2\2|}\3\2\2"+
		"\2}~\b\f\5\2~\33\3\2\2\2\177\u0080\t\4\2\2\u0080\35\3\2\2\2\u0081\u0089"+
		"\7`\2\2\u0082\u0083\7`\2\2\u0083\u0089\7`\2\2\u0084\u0089\7a\2\2\u0085"+
		"\u0086\7a\2\2\u0086\u0089\7a\2\2\u0087\u0089\7?\2\2\u0088\u0081\3\2\2"+
		"\2\u0088\u0082\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\37\3\2\2\2\u008a\u008c\7)\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0095\3\2"+
		"\2\2\u008f\u0091\7.\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u008b\3\2"+
		"\2\2\u0094\u0090\3\2\2\2\u0095!\3\2\2\2\u0096\u0097\7|\2\2\u0097#\3\2"+
		"\2\2\u0098\u0099\7]\2\2\u0099%\3\2\2\2\u009a\u009b\7_\2\2\u009b\'\3\2"+
		"\2\2\u009c\u009d\7*\2\2\u009d)\3\2\2\2\u009e\u00aa\7~\2\2\u009f\u00a0"+
		"\7~\2\2\u00a0\u00aa\7~\2\2\u00a1\u00a2\7]\2\2\u00a2\u00aa\7~\2\2\u00a3"+
		"\u00a4\7~\2\2\u00a4\u00aa\7_\2\2\u00a5\u00a6\7<\2\2\u00a6\u00aa\7~\2\2"+
		"\u00a7\u00a8\7~\2\2\u00a8\u00aa\7<\2\2\u00a9\u009e\3\2\2\2\u00a9\u009f"+
		"\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa+\3\2\2\2\u00ab\u00ac\7]\2\2\u00ac\u00b0\7\63\2\2"+
		"\u00ad\u00ae\7]\2\2\u00ae\u00b0\7\64\2\2\u00af\u00ab\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00b0-\3\2\2\2\u00b1\u00b3\4\62;\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5/\3\2\2\2"+
		"\u00b6\u00b7\7\61\2\2\u00b7\61\3\2\2\2\u00b8\u00b9\5\b\3\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\b\30\6\2\u00bb\63\3\2\2\2\u00bc\u00bd\5\6\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\b\31\2\2\u00bf\65\3\2\2\2\u00c0\u00c1\5\n\4"+
		"\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\32\2\2\u00c3\67\3\2\2\2\u00c4\u00c5"+
		"\5.\26\2\u00c59\3\2\2\2\u00c6\u00c7\5\60\27\2\u00c7;\3\2\2\2\u00c8\u00cc"+
		"\7E\2\2\u00c9\u00ca\7E\2\2\u00ca\u00cc\7~\2\2\u00cb\u00c8\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc=\3\2\2\2\u00cd\u00ce\7?\2\2\u00ce?\3\2\2\2\u00cf"+
		"\u00d1\t\4\2\2\u00d0\u00d2\t\5\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d5\7o\2\2\u00d4\u00d3\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\37\3\2\u00d7A\3\2\2\2"+
		"\u00d8\u00da\n\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b \3\2\u00de"+
		"C\3\2\2\2\24\2\3\4\5HPU\u0088\u008d\u0092\u0094\u00a9\u00af\u00b4\u00cb"+
		"\u00d1\u00d4\u00db\7\b\2\2\4\3\2\4\5\2\4\4\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}