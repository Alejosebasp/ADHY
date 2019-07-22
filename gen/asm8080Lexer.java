// Generated from C:/Users/Cristian Martinez/Desktop/UN - Ig. Sistemas/UN 2019 - 1/ADHY/grammar\asm8080.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class asm8080Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ASSEMBLER_DIRECTIVE=10, REGISTER=11, OPCODE=12, NAME=13, NUMBER=14, COMMENT=15, 
		STRING=16, EOL=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"ASSEMBLER_DIRECTIVE", "REGISTER", "OPCODE", "A", "B", "C", "D", "E", 
			"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", 
			"T", "U", "V", "W", "X", "Y", "Z", "NAME", "NUMBER", "COMMENT", "STRING", 
			"EOL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ASSEMBLER_DIRECTIVE", 
			"REGISTER", "OPCODE", "NAME", "NUMBER", "COMMENT", "STRING", "EOL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public asm8080Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "asm8080.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u022e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0090\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0097\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01cc"+
		"\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\7(\u0204\n(\f(\16(\u0207\13(\3)\5)\u020a"+
		"\n)\3)\6)\u020d\n)\r)\16)\u020e\3)\5)\u0212\n)\3*\3*\7*\u0216\n*\f*\16"+
		"*\u0219\13*\3*\3*\3+\3+\7+\u021f\n+\f+\16+\u0222\13+\3+\3+\3,\6,\u0227"+
		"\n,\r,\16,\u0228\3-\3-\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2"+
		"\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\17Q\20S\21U\22W\23Y\24\3"+
		"\2#\5\2CGJJNN\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii"+
		"\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2R"+
		"Rrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4"+
		"\2[[{{\4\2\\\\||\4\2C\\c|\7\2$$\60\60\62;C\\c|\5\2\62;CHch\4\2\f\f\17"+
		"\17\3\2))\4\2\13\13\"\"\2\u0271\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3\2\2"+
		"\2\ta\3\2\2\2\13c\3\2\2\2\re\3\2\2\2\17g\3\2\2\2\21i\3\2\2\2\23k\3\2\2"+
		"\2\25\u008f\3\2\2\2\27\u0096\3\2\2\2\31\u01cb\3\2\2\2\33\u01cd\3\2\2\2"+
		"\35\u01cf\3\2\2\2\37\u01d1\3\2\2\2!\u01d3\3\2\2\2#\u01d5\3\2\2\2%\u01d7"+
		"\3\2\2\2\'\u01d9\3\2\2\2)\u01db\3\2\2\2+\u01dd\3\2\2\2-\u01df\3\2\2\2"+
		"/\u01e1\3\2\2\2\61\u01e3\3\2\2\2\63\u01e5\3\2\2\2\65\u01e7\3\2\2\2\67"+
		"\u01e9\3\2\2\29\u01eb\3\2\2\2;\u01ed\3\2\2\2=\u01ef\3\2\2\2?\u01f1\3\2"+
		"\2\2A\u01f3\3\2\2\2C\u01f5\3\2\2\2E\u01f7\3\2\2\2G\u01f9\3\2\2\2I\u01fb"+
		"\3\2\2\2K\u01fd\3\2\2\2M\u01ff\3\2\2\2O\u0201\3\2\2\2Q\u0209\3\2\2\2S"+
		"\u0213\3\2\2\2U\u021c\3\2\2\2W\u0226\3\2\2\2Y\u022a\3\2\2\2[\\\7<\2\2"+
		"\\\4\3\2\2\2]^\7.\2\2^\6\3\2\2\2_`\7-\2\2`\b\3\2\2\2ab\7/\2\2b\n\3\2\2"+
		"\2cd\7,\2\2d\f\3\2\2\2ef\7\61\2\2f\16\3\2\2\2gh\7*\2\2h\20\3\2\2\2ij\7"+
		"+\2\2j\22\3\2\2\2kl\7&\2\2l\24\3\2\2\2mn\5\67\34\2no\5=\37\2op\5\'\24"+
		"\2p\u0090\3\2\2\2qr\5#\22\2rs\5\65\33\2st\5!\21\2t\u0090\3\2\2\2uv\5#"+
		"\22\2vw\5;\36\2wx\5C\"\2x\u0090\3\2\2\2yz\5!\21\2z{\5\35\17\2{\u0090\3"+
		"\2\2\2|}\5!\21\2}~\5G$\2~\u0090\3\2\2\2\177\u0080\5!\21\2\u0080\u0081"+
		"\5? \2\u0081\u0090\3\2\2\2\u0082\u0083\5+\26\2\u0083\u0084\5%\23\2\u0084"+
		"\u0090\3\2\2\2\u0085\u0086\5#\22\2\u0086\u0087\5\65\33\2\u0087\u0088\5"+
		"!\21\2\u0088\u0089\5+\26\2\u0089\u008a\5%\23\2\u008a\u0090\3\2\2\2\u008b"+
		"\u008c\5? \2\u008c\u008d\5#\22\2\u008d\u008e\5A!\2\u008e\u0090\3\2\2\2"+
		"\u008fm\3\2\2\2\u008fq\3\2\2\2\u008fu\3\2\2\2\u008fy\3\2\2\2\u008f|\3"+
		"\2\2\2\u008f\177\3\2\2\2\u008f\u0082\3\2\2\2\u008f\u0085\3\2\2\2\u008f"+
		"\u008b\3\2\2\2\u0090\26\3\2\2\2\u0091\u0097\t\2\2\2\u0092\u0093\7R\2\2"+
		"\u0093\u0097\7E\2\2\u0094\u0095\7U\2\2\u0095\u0097\7R\2\2\u0096\u0091"+
		"\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0094\3\2\2\2\u0097\30\3\2\2\2\u0098"+
		"\u0099\5\63\32\2\u0099\u009a\5\67\34\2\u009a\u009b\5E#\2\u009b\u01cc\3"+
		"\2\2\2\u009c\u009d\5\63\32\2\u009d\u009e\5E#\2\u009e\u009f\5+\26\2\u009f"+
		"\u01cc\3\2\2\2\u00a0\u00a1\5\61\31\2\u00a1\u00a2\5!\21\2\u00a2\u00a3\5"+
		"\33\16\2\u00a3\u01cc\3\2\2\2\u00a4\u00a5\5? \2\u00a5\u00a6\5A!\2\u00a6"+
		"\u00a7\5\33\16\2\u00a7\u01cc\3\2\2\2\u00a8\u00a9\5\61\31\2\u00a9\u00aa"+
		"\5!\21\2\u00aa\u00ab\5\33\16\2\u00ab\u00ac\5I%\2\u00ac\u01cc\3\2\2\2\u00ad"+
		"\u00ae\5? \2\u00ae\u00af\5A!\2\u00af\u00b0\5\33\16\2\u00b0\u00b1\5I%\2"+
		"\u00b1\u01cc\3\2\2\2\u00b2\u00b3\5\61\31\2\u00b3\u00b4\5)\25\2\u00b4\u00b5"+
		"\5\61\31\2\u00b5\u00b6\5!\21\2\u00b6\u01cc\3\2\2\2\u00b7\u00b8\5? \2\u00b8"+
		"\u00b9\5)\25\2\u00b9\u00ba\5\61\31\2\u00ba\u00bb\5!\21\2\u00bb\u01cc\3"+
		"\2\2\2\u00bc\u00bd\5\61\31\2\u00bd\u00be\5I%\2\u00be\u00bf\5+\26\2\u00bf"+
		"\u01cc\3\2\2\2\u00c0\u00c1\59\35\2\u00c1\u00c2\5C\"\2\u00c2\u00c3\5? "+
		"\2\u00c3\u00c4\5)\25\2\u00c4\u01cc\3\2\2\2\u00c5\u00c6\59\35\2\u00c6\u00c7"+
		"\5\67\34\2\u00c7\u00c8\59\35\2\u00c8\u01cc\3\2\2\2\u00c9\u00ca\5I%\2\u00ca"+
		"\u00cb\5A!\2\u00cb\u00cc\5)\25\2\u00cc\u00cd\5\61\31\2\u00cd\u01cc\3\2"+
		"\2\2\u00ce\u00cf\5? \2\u00cf\u00d0\59\35\2\u00d0\u00d1\5)\25\2\u00d1\u00d2"+
		"\5\61\31\2\u00d2\u01cc\3\2\2\2\u00d3\u00d4\59\35\2\u00d4\u00d5\5\37\20"+
		"\2\u00d5\u00d6\5)\25\2\u00d6\u00d7\5\61\31\2\u00d7\u01cc\3\2\2\2\u00d8"+
		"\u00d9\5I%\2\u00d9\u00da\5\37\20\2\u00da\u00db\5)\25\2\u00db\u00dc\5\'"+
		"\24\2\u00dc\u01cc\3\2\2\2\u00dd\u00de\5\33\16\2\u00de\u00df\5!\21\2\u00df"+
		"\u00e0\5!\21\2\u00e0\u01cc\3\2\2\2\u00e1\u00e2\5? \2\u00e2\u00e3\5C\""+
		"\2\u00e3\u00e4\5\35\17\2\u00e4\u01cc\3\2\2\2\u00e5\u00e6\5+\26\2\u00e6"+
		"\u00e7\5\65\33\2\u00e7\u00e8\5=\37\2\u00e8\u01cc\3\2\2\2\u00e9\u00ea\5"+
		"!\21\2\u00ea\u00eb\5\37\20\2\u00eb\u00ec\5=\37\2\u00ec\u01cc\3\2\2\2\u00ed"+
		"\u00ee\5\37\20\2\u00ee\u00ef\5\63\32\2\u00ef\u00f0\59\35\2\u00f0\u01cc"+
		"\3\2\2\2\u00f1\u00f2\5\33\16\2\u00f2\u00f3\5\65\33\2\u00f3\u00f4\5\33"+
		"\16\2\u00f4\u01cc\3\2\2\2\u00f5\u00f6\5\67\34\2\u00f6\u00f7\5=\37\2\u00f7"+
		"\u00f8\5\33\16\2\u00f8\u01cc\3\2\2\2\u00f9\u00fa\5I%\2\u00fa\u00fb\5="+
		"\37\2\u00fb\u00fc\5\33\16\2\u00fc\u01cc\3\2\2\2\u00fd\u00fe\5\33\16\2"+
		"\u00fe\u00ff\5!\21\2\u00ff\u0100\5+\26\2\u0100\u01cc\3\2\2\2\u0101\u0102"+
		"\5? \2\u0102\u0103\5C\"\2\u0103\u0104\5+\26\2\u0104\u01cc\3\2\2\2\u0105"+
		"\u0106\5\37\20\2\u0106\u0107\59\35\2\u0107\u0108\5+\26\2\u0108\u01cc\3"+
		"\2\2\2\u0109\u010a\5\33\16\2\u010a\u010b\5\65\33\2\u010b\u010c\5+\26\2"+
		"\u010c\u01cc\3\2\2\2\u010d\u010e\5\67\34\2\u010e\u010f\5=\37\2\u010f\u0110"+
		"\5+\26\2\u0110\u01cc\3\2\2\2\u0111\u0112\5I%\2\u0112\u0113\5=\37\2\u0113"+
		"\u0114\5+\26\2\u0114\u01cc\3\2\2\2\u0115\u0116\5!\21\2\u0116\u0117\5\33"+
		"\16\2\u0117\u0118\5\33\16\2\u0118\u01cc\3\2\2\2\u0119\u011a\5\33\16\2"+
		"\u011a\u011b\5!\21\2\u011b\u011c\5\37\20\2\u011c\u01cc\3\2\2\2\u011d\u011e"+
		"\5\33\16\2\u011e\u011f\5\37\20\2\u011f\u0120\5+\26\2\u0120\u01cc\3\2\2"+
		"\2\u0121\u0122\5? \2\u0122\u0123\5\35\17\2\u0123\u0124\5\35\17\2\u0124"+
		"\u01cc\3\2\2\2\u0125\u0126\5? \2\u0126\u0127\5\35\17\2\u0127\u0128\5+"+
		"\26\2\u0128\u01cc\3\2\2\2\u0129\u012a\5!\21\2\u012a\u012b\5\33\16\2\u012b"+
		"\u012c\5!\21\2\u012c\u01cc\3\2\2\2\u012d\u012e\5+\26\2\u012e\u012f\5\65"+
		"\33\2\u012f\u0130\5I%\2\u0130\u01cc\3\2\2\2\u0131\u0132\5!\21\2\u0132"+
		"\u0133\5\37\20\2\u0133\u0134\5I%\2\u0134\u01cc\3\2\2\2\u0135\u0136\5-"+
		"\27\2\u0136\u0137\5\63\32\2\u0137\u0138\59\35\2\u0138\u01cc\3\2\2\2\u0139"+
		"\u013a\5\37\20\2\u013a\u013b\5\33\16\2\u013b\u013c\5\61\31\2\u013c\u013d"+
		"\5\61\31\2\u013d\u01cc\3\2\2\2\u013e\u013f\5=\37\2\u013f\u0140\5#\22\2"+
		"\u0140\u0141\5A!\2\u0141\u01cc\3\2\2\2\u0142\u0143\5=\37\2\u0143\u0144"+
		"\5\33\16\2\u0144\u0145\5\61\31\2\u0145\u01cc\3\2\2\2\u0146\u0147\5=\37"+
		"\2\u0147\u0148\5\33\16\2\u0148\u0149\5=\37\2\u0149\u01cc\3\2\2\2\u014a"+
		"\u014b\5=\37\2\u014b\u014c\5\61\31\2\u014c\u014d\5\37\20\2\u014d\u01cc"+
		"\3\2\2\2\u014e\u014f\5=\37\2\u014f\u0150\5=\37\2\u0150\u0151\5\37\20\2"+
		"\u0151\u01cc\3\2\2\2\u0152\u0153\5+\26\2\u0153\u0154\5\65\33\2\u0154\u01cc"+
		"\3\2\2\2\u0155\u0156\5\67\34\2\u0156\u0157\5C\"\2\u0157\u0158\5A!\2\u0158"+
		"\u01cc\3\2\2\2\u0159\u015a\5\37\20\2\u015a\u015b\5\63\32\2\u015b\u015c"+
		"\5\37\20\2\u015c\u01cc\3\2\2\2\u015d\u015e\5? \2\u015e\u015f\5A!\2\u015f"+
		"\u0160\5\37\20\2\u0160\u01cc\3\2\2\2\u0161\u0162\5\37\20\2\u0162\u0163"+
		"\5\63\32\2\u0163\u0164\5\33\16\2\u0164\u01cc\3\2\2\2\u0165\u0166\5)\25"+
		"\2\u0166\u0167\5\61\31\2\u0167\u0168\5A!\2\u0168\u01cc\3\2\2\2\u0169\u016a"+
		"\5\65\33\2\u016a\u016b\5\67\34\2\u016b\u016c\59\35\2\u016c\u01cc\3\2\2"+
		"\2\u016d\u016e\5!\21\2\u016e\u016f\5+\26\2\u016f\u01cc\3\2\2\2\u0170\u0171"+
		"\5#\22\2\u0171\u0172\5+\26\2\u0172\u01cc\3\2\2\2\u0173\u0174\5=\37\2\u0174"+
		"\u0175\5? \2\u0175\u0176\5A!\2\u0176\u01cc\3\2\2\2\u0177\u0178\5-\27\2"+
		"\u0178\u0179\5\65\33\2\u0179\u017a\5M\'\2\u017a\u01cc\3\2\2\2\u017b\u017c"+
		"\5-\27\2\u017c\u017d\5M\'\2\u017d\u01cc\3\2\2\2\u017e\u017f\5-\27\2\u017f"+
		"\u0180\5\65\33\2\u0180\u0181\5\37\20\2\u0181\u01cc\3\2\2\2\u0182\u0183"+
		"\5-\27\2\u0183\u0184\5\37\20\2\u0184\u01cc\3\2\2\2\u0185\u0186\5-\27\2"+
		"\u0186\u0187\59\35\2\u0187\u0188\5\67\34\2\u0188\u01cc\3\2\2\2\u0189\u018a"+
		"\5-\27\2\u018a\u018b\59\35\2\u018b\u018c\5#\22\2\u018c\u01cc\3\2\2\2\u018d"+
		"\u018e\5-\27\2\u018e\u018f\59\35\2\u018f\u01cc\3\2\2\2\u0190\u0191\5-"+
		"\27\2\u0191\u0192\5\63\32\2\u0192\u01cc\3\2\2\2\u0193\u0194\5\37\20\2"+
		"\u0194\u0195\5\65\33\2\u0195\u0196\5M\'\2\u0196\u01cc\3\2\2\2\u0197\u0198"+
		"\5\37\20\2\u0198\u0199\5M\'\2\u0199\u01cc\3\2\2\2\u019a\u019b\5\37\20"+
		"\2\u019b\u019c\5\65\33\2\u019c\u019d\5\37\20\2\u019d\u01cc\3\2\2\2\u019e"+
		"\u019f\5\37\20\2\u019f\u01a0\5\37\20\2\u01a0\u01cc\3\2\2\2\u01a1\u01a2"+
		"\5\37\20\2\u01a2\u01a3\59\35\2\u01a3\u01a4\5\67\34\2\u01a4\u01cc\3\2\2"+
		"\2\u01a5\u01a6\5\37\20\2\u01a6\u01a7\59\35\2\u01a7\u01a8\5#\22\2\u01a8"+
		"\u01cc\3\2\2\2\u01a9\u01aa\5\37\20\2\u01aa\u01ab\59\35\2\u01ab\u01cc\3"+
		"\2\2\2\u01ac\u01ad\5\37\20\2\u01ad\u01ae\5\63\32\2\u01ae\u01cc\3\2\2\2"+
		"\u01af\u01b0\5=\37\2\u01b0\u01b1\5\65\33\2\u01b1\u01b2\5M\'\2\u01b2\u01cc"+
		"\3\2\2\2\u01b3\u01b4\5=\37\2\u01b4\u01b5\5M\'\2\u01b5\u01cc\3\2\2\2\u01b6"+
		"\u01b7\5=\37\2\u01b7\u01b8\5\65\33\2\u01b8\u01b9\5\37\20\2\u01b9\u01cc"+
		"\3\2\2\2\u01ba\u01bb\5=\37\2\u01bb\u01bc\5\37\20\2\u01bc\u01cc\3\2\2\2"+
		"\u01bd\u01be\5=\37\2\u01be\u01bf\59\35\2\u01bf\u01c0\5\67\34\2\u01c0\u01cc"+
		"\3\2\2\2\u01c1\u01c2\5=\37\2\u01c2\u01c3\59\35\2\u01c3\u01c4\5#\22\2\u01c4"+
		"\u01cc\3\2\2\2\u01c5\u01c6\5=\37\2\u01c6\u01c7\59\35\2\u01c7\u01cc\3\2"+
		"\2\2\u01c8\u01c9\5=\37\2\u01c9\u01ca\5\63\32\2\u01ca\u01cc\3\2\2\2\u01cb"+
		"\u0098\3\2\2\2\u01cb\u009c\3\2\2\2\u01cb\u00a0\3\2\2\2\u01cb\u00a4\3\2"+
		"\2\2\u01cb\u00a8\3\2\2\2\u01cb\u00ad\3\2\2\2\u01cb\u00b2\3\2\2\2\u01cb"+
		"\u00b7\3\2\2\2\u01cb\u00bc\3\2\2\2\u01cb\u00c0\3\2\2\2\u01cb\u00c5\3\2"+
		"\2\2\u01cb\u00c9\3\2\2\2\u01cb\u00ce\3\2\2\2\u01cb\u00d3\3\2\2\2\u01cb"+
		"\u00d8\3\2\2\2\u01cb\u00dd\3\2\2\2\u01cb\u00e1\3\2\2\2\u01cb\u00e5\3\2"+
		"\2\2\u01cb\u00e9\3\2\2\2\u01cb\u00ed\3\2\2\2\u01cb\u00f1\3\2\2\2\u01cb"+
		"\u00f5\3\2\2\2\u01cb\u00f9\3\2\2\2\u01cb\u00fd\3\2\2\2\u01cb\u0101\3\2"+
		"\2\2\u01cb\u0105\3\2\2\2\u01cb\u0109\3\2\2\2\u01cb\u010d\3\2\2\2\u01cb"+
		"\u0111\3\2\2\2\u01cb\u0115\3\2\2\2\u01cb\u0119\3\2\2\2\u01cb\u011d\3\2"+
		"\2\2\u01cb\u0121\3\2\2\2\u01cb\u0125\3\2\2\2\u01cb\u0129\3\2\2\2\u01cb"+
		"\u012d\3\2\2\2\u01cb\u0131\3\2\2\2\u01cb\u0135\3\2\2\2\u01cb\u0139\3\2"+
		"\2\2\u01cb\u013e\3\2\2\2\u01cb\u0142\3\2\2\2\u01cb\u0146\3\2\2\2\u01cb"+
		"\u014a\3\2\2\2\u01cb\u014e\3\2\2\2\u01cb\u0152\3\2\2\2\u01cb\u0155\3\2"+
		"\2\2\u01cb\u0159\3\2\2\2\u01cb\u015d\3\2\2\2\u01cb\u0161\3\2\2\2\u01cb"+
		"\u0165\3\2\2\2\u01cb\u0169\3\2\2\2\u01cb\u016d\3\2\2\2\u01cb\u0170\3\2"+
		"\2\2\u01cb\u0173\3\2\2\2\u01cb\u0177\3\2\2\2\u01cb\u017b\3\2\2\2\u01cb"+
		"\u017e\3\2\2\2\u01cb\u0182\3\2\2\2\u01cb\u0185\3\2\2\2\u01cb\u0189\3\2"+
		"\2\2\u01cb\u018d\3\2\2\2\u01cb\u0190\3\2\2\2\u01cb\u0193\3\2\2\2\u01cb"+
		"\u0197\3\2\2\2\u01cb\u019a\3\2\2\2\u01cb\u019e\3\2\2\2\u01cb\u01a1\3\2"+
		"\2\2\u01cb\u01a5\3\2\2\2\u01cb\u01a9\3\2\2\2\u01cb\u01ac\3\2\2\2\u01cb"+
		"\u01af\3\2\2\2\u01cb\u01b3\3\2\2\2\u01cb\u01b6\3\2\2\2\u01cb\u01ba\3\2"+
		"\2\2\u01cb\u01bd\3\2\2\2\u01cb\u01c1\3\2\2\2\u01cb\u01c5\3\2\2\2\u01cb"+
		"\u01c8\3\2\2\2\u01cc\32\3\2\2\2\u01cd\u01ce\t\3\2\2\u01ce\34\3\2\2\2\u01cf"+
		"\u01d0\t\4\2\2\u01d0\36\3\2\2\2\u01d1\u01d2\t\5\2\2\u01d2 \3\2\2\2\u01d3"+
		"\u01d4\t\6\2\2\u01d4\"\3\2\2\2\u01d5\u01d6\t\7\2\2\u01d6$\3\2\2\2\u01d7"+
		"\u01d8\t\b\2\2\u01d8&\3\2\2\2\u01d9\u01da\t\t\2\2\u01da(\3\2\2\2\u01db"+
		"\u01dc\t\n\2\2\u01dc*\3\2\2\2\u01dd\u01de\t\13\2\2\u01de,\3\2\2\2\u01df"+
		"\u01e0\t\f\2\2\u01e0.\3\2\2\2\u01e1\u01e2\t\r\2\2\u01e2\60\3\2\2\2\u01e3"+
		"\u01e4\t\16\2\2\u01e4\62\3\2\2\2\u01e5\u01e6\t\17\2\2\u01e6\64\3\2\2\2"+
		"\u01e7\u01e8\t\20\2\2\u01e8\66\3\2\2\2\u01e9\u01ea\t\21\2\2\u01ea8\3\2"+
		"\2\2\u01eb\u01ec\t\22\2\2\u01ec:\3\2\2\2\u01ed\u01ee\t\23\2\2\u01ee<\3"+
		"\2\2\2\u01ef\u01f0\t\24\2\2\u01f0>\3\2\2\2\u01f1\u01f2\t\25\2\2\u01f2"+
		"@\3\2\2\2\u01f3\u01f4\t\26\2\2\u01f4B\3\2\2\2\u01f5\u01f6\t\27\2\2\u01f6"+
		"D\3\2\2\2\u01f7\u01f8\t\30\2\2\u01f8F\3\2\2\2\u01f9\u01fa\t\31\2\2\u01fa"+
		"H\3\2\2\2\u01fb\u01fc\t\32\2\2\u01fcJ\3\2\2\2\u01fd\u01fe\t\33\2\2\u01fe"+
		"L\3\2\2\2\u01ff\u0200\t\34\2\2\u0200N\3\2\2\2\u0201\u0205\t\35\2\2\u0202"+
		"\u0204\t\36\2\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3"+
		"\2\2\2\u0205\u0206\3\2\2\2\u0206P\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020a"+
		"\7&\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b"+
		"\u020d\t\37\2\2\u020c\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020c\3"+
		"\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u0212\t\n\2\2\u0211"+
		"\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212R\3\2\2\2\u0213\u0217\7=\2\2\u0214"+
		"\u0216\n \2\2\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a"+
		"\u021b\b*\2\2\u021bT\3\2\2\2\u021c\u0220\7)\2\2\u021d\u021f\n!\2\2\u021e"+
		"\u021d\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\7)\2\2\u0224"+
		"V\3\2\2\2\u0225\u0227\t \2\2\u0226\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229X\3\2\2\2\u022a\u022b\t\"\2\2"+
		"\u022b\u022c\3\2\2\2\u022c\u022d\b-\2\2\u022dZ\3\2\2\2\r\2\u008f\u0096"+
		"\u01cb\u0205\u0209\u020e\u0211\u0217\u0220\u0228\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}