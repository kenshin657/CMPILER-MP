// Generated from D:/Programs/Java/CMPILER MP/src\pogC.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pogCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, STRING=3, BOOL=4, VOID=5, MAIN=6, IF=7, ELSE=8, THEN=9, 
		RETURN=10, WHILE=11, FUNC=12, PRINT=13, SCAN=14, DO=15, FOR=16, F=17, 
		CREATE=18, ADD=19, MULT=20, DIV=21, SUBT=22, MOD=23, ASSIGN=24, ADD_ASSIGN=25, 
		SUB_ASSIGN=26, MULT_ASSIGN=27, DIV_ASSIGN=28, INCR=29, DECR=30, EQUAL_EQUAL=31, 
		GT=32, LT=33, NOTEQUAL=34, AND=35, OR=36, LESSEQ=37, GREATEQ=38, TRUE=39, 
		FALSE=40, LPAREN=41, RPAREN=42, LBRAK=43, RBRAK=44, LBRACE=45, RBRACE=46, 
		SEMICOLON=47, PERIOD=48, QUOTMARK=49, SINGLEQUOTE=50, COMMA=51, DIGIT=52, 
		ID=53, TEXT=54, UP=55, DOWN=56, TO=57, SLCOMMENT=58, WS=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SPACE", "INT", "FLOAT", "STRING", "BOOL", "VOID", "MAIN", "IF", "ELSE", 
			"THEN", "RETURN", "WHILE", "FUNC", "PRINT", "SCAN", "DO", "FOR", "F", 
			"CREATE", "ADD", "MULT", "DIV", "SUBT", "MOD", "ASSIGN", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "INCR", "DECR", "EQUAL_EQUAL", 
			"GT", "LT", "NOTEQUAL", "AND", "OR", "LESSEQ", "GREATEQ", "TRUE", "FALSE", 
			"LPAREN", "RPAREN", "LBRAK", "RBRAK", "LBRACE", "RBRACE", "SEMICOLON", 
			"PERIOD", "QUOTMARK", "SINGLEQUOTE", "COMMA", "DIGIT", "ID", "TEXT", 
			"UP", "DOWN", "TO", "SLCOMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'String'", "'bool'", "'void'", "'main'", "'if'", 
			"'else'", "'then'", "'return'", "'while'", "'func'", "'print'", "'scan'", 
			"'do'", "'for'", "'f'", "'create'", "'+'", "'*'", "'/'", "'-'", "'%'", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'=='", "'>'", 
			"'<'", "'!='", "'&&'", "'||'", "'<='", "'>='", "'T'", "'F'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "';'", "'.'", "'\"'", "'`'", "','", null, 
			null, null, "'up'", "'down'", "'to'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "STRING", "BOOL", "VOID", "MAIN", "IF", "ELSE", 
			"THEN", "RETURN", "WHILE", "FUNC", "PRINT", "SCAN", "DO", "FOR", "F", 
			"CREATE", "ADD", "MULT", "DIV", "SUBT", "MOD", "ASSIGN", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "INCR", "DECR", "EQUAL_EQUAL", 
			"GT", "LT", "NOTEQUAL", "AND", "OR", "LESSEQ", "GREATEQ", "TRUE", "FALSE", 
			"LPAREN", "RPAREN", "LBRAK", "RBRAK", "LBRACE", "RBRACE", "SEMICOLON", 
			"PERIOD", "QUOTMARK", "SINGLEQUOTE", "COMMA", "DIGIT", "ID", "TEXT", 
			"UP", "DOWN", "TO", "SLCOMMENT", "WS"
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


	public pogCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pogC.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u0162\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*"+
		"\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\5\66\u0128\n\66\3\66\3\66\7\66\u012c"+
		"\n\66\f\66\16\66\u012f\13\66\5\66\u0131\n\66\3\67\5\67\u0134\n\67\3\67"+
		"\3\67\7\67\u0138\n\67\f\67\16\67\u013b\13\67\38\38\78\u013f\n8\f8\168"+
		"\u0142\138\38\38\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\7<\u0155"+
		"\n<\f<\16<\u0158\13<\3<\3<\3=\6=\u015d\n=\r=\16=\u015e\3=\3=\2\2>\3\2"+
		"\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20"+
		"!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37"+
		"? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q"+
		"9s:u;w<y=\3\2\t\3\2\"\"\3\2\63;\3\2\62;\3\2c|\5\2\62;C\\c|\3\2$$\4\2\13"+
		"\f\17\17\2\u0168\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2"+
		"\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2"+
		"\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m"+
		"\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2"+
		"\2\2\3{\3\2\2\2\5}\3\2\2\2\7\u0081\3\2\2\2\t\u0087\3\2\2\2\13\u008e\3"+
		"\2\2\2\r\u0093\3\2\2\2\17\u0098\3\2\2\2\21\u009d\3\2\2\2\23\u00a0\3\2"+
		"\2\2\25\u00a5\3\2\2\2\27\u00aa\3\2\2\2\31\u00b1\3\2\2\2\33\u00b7\3\2\2"+
		"\2\35\u00bc\3\2\2\2\37\u00c2\3\2\2\2!\u00c7\3\2\2\2#\u00ca\3\2\2\2%\u00ce"+
		"\3\2\2\2\'\u00d0\3\2\2\2)\u00d7\3\2\2\2+\u00d9\3\2\2\2-\u00db\3\2\2\2"+
		"/\u00dd\3\2\2\2\61\u00df\3\2\2\2\63\u00e1\3\2\2\2\65\u00e3\3\2\2\2\67"+
		"\u00e6\3\2\2\29\u00e9\3\2\2\2;\u00ec\3\2\2\2=\u00ef\3\2\2\2?\u00f2\3\2"+
		"\2\2A\u00f5\3\2\2\2C\u00f8\3\2\2\2E\u00fa\3\2\2\2G\u00fc\3\2\2\2I\u00ff"+
		"\3\2\2\2K\u0102\3\2\2\2M\u0105\3\2\2\2O\u0108\3\2\2\2Q\u010b\3\2\2\2S"+
		"\u010d\3\2\2\2U\u010f\3\2\2\2W\u0111\3\2\2\2Y\u0113\3\2\2\2[\u0115\3\2"+
		"\2\2]\u0117\3\2\2\2_\u0119\3\2\2\2a\u011b\3\2\2\2c\u011d\3\2\2\2e\u011f"+
		"\3\2\2\2g\u0121\3\2\2\2i\u0123\3\2\2\2k\u0130\3\2\2\2m\u0133\3\2\2\2o"+
		"\u013c\3\2\2\2q\u0145\3\2\2\2s\u0148\3\2\2\2u\u014d\3\2\2\2w\u0150\3\2"+
		"\2\2y\u015c\3\2\2\2{|\t\2\2\2|\4\3\2\2\2}~\7k\2\2~\177\7p\2\2\177\u0080"+
		"\7v\2\2\u0080\6\3\2\2\2\u0081\u0082\7h\2\2\u0082\u0083\7n\2\2\u0083\u0084"+
		"\7q\2\2\u0084\u0085\7c\2\2\u0085\u0086\7v\2\2\u0086\b\3\2\2\2\u0087\u0088"+
		"\7U\2\2\u0088\u0089\7v\2\2\u0089\u008a\7t\2\2\u008a\u008b\7k\2\2\u008b"+
		"\u008c\7p\2\2\u008c\u008d\7i\2\2\u008d\n\3\2\2\2\u008e\u008f\7d\2\2\u008f"+
		"\u0090\7q\2\2\u0090\u0091\7q\2\2\u0091\u0092\7n\2\2\u0092\f\3\2\2\2\u0093"+
		"\u0094\7x\2\2\u0094\u0095\7q\2\2\u0095\u0096\7k\2\2\u0096\u0097\7f\2\2"+
		"\u0097\16\3\2\2\2\u0098\u0099\7o\2\2\u0099\u009a\7c\2\2\u009a\u009b\7"+
		"k\2\2\u009b\u009c\7p\2\2\u009c\20\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f"+
		"\7h\2\2\u009f\22\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3"+
		"\7u\2\2\u00a3\u00a4\7g\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7"+
		"\7j\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7p\2\2\u00a9\26\3\2\2\2\u00aa\u00ab"+
		"\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7w\2\2\u00ae"+
		"\u00af\7t\2\2\u00af\u00b0\7p\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7y\2\2\u00b2"+
		"\u00b3\7j\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2"+
		"\u00b6\32\3\2\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7"+
		"p\2\2\u00ba\u00bb\7e\2\2\u00bb\34\3\2\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be"+
		"\7t\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7v\2\2\u00c1"+
		"\36\3\2\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7c\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6 \3\2\2\2\u00c7\u00c8\7f\2\2\u00c8\u00c9\7q\2\2\u00c9"+
		"\"\3\2\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7t\2\2\u00cd"+
		"$\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf&\3\2\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2"+
		"\7t\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7v\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6(\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8*\3\2\2\2\u00d9\u00da"+
		"\7,\2\2\u00da,\3\2\2\2\u00db\u00dc\7\61\2\2\u00dc.\3\2\2\2\u00dd\u00de"+
		"\7/\2\2\u00de\60\3\2\2\2\u00df\u00e0\7\'\2\2\u00e0\62\3\2\2\2\u00e1\u00e2"+
		"\7?\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7-\2\2\u00e4\u00e5\7?\2\2\u00e5\66"+
		"\3\2\2\2\u00e6\u00e7\7/\2\2\u00e7\u00e8\7?\2\2\u00e88\3\2\2\2\u00e9\u00ea"+
		"\7,\2\2\u00ea\u00eb\7?\2\2\u00eb:\3\2\2\2\u00ec\u00ed\7\61\2\2\u00ed\u00ee"+
		"\7?\2\2\u00ee<\3\2\2\2\u00ef\u00f0\7-\2\2\u00f0\u00f1\7-\2\2\u00f1>\3"+
		"\2\2\2\u00f2\u00f3\7/\2\2\u00f3\u00f4\7/\2\2\u00f4@\3\2\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6\u00f7\7?\2\2\u00f7B\3\2\2\2\u00f8\u00f9\7@\2\2\u00f9D\3"+
		"\2\2\2\u00fa\u00fb\7>\2\2\u00fbF\3\2\2\2\u00fc\u00fd\7#\2\2\u00fd\u00fe"+
		"\7?\2\2\u00feH\3\2\2\2\u00ff\u0100\7(\2\2\u0100\u0101\7(\2\2\u0101J\3"+
		"\2\2\2\u0102\u0103\7~\2\2\u0103\u0104\7~\2\2\u0104L\3\2\2\2\u0105\u0106"+
		"\7>\2\2\u0106\u0107\7?\2\2\u0107N\3\2\2\2\u0108\u0109\7@\2\2\u0109\u010a"+
		"\7?\2\2\u010aP\3\2\2\2\u010b\u010c\7V\2\2\u010cR\3\2\2\2\u010d\u010e\7"+
		"H\2\2\u010eT\3\2\2\2\u010f\u0110\7*\2\2\u0110V\3\2\2\2\u0111\u0112\7+"+
		"\2\2\u0112X\3\2\2\2\u0113\u0114\7]\2\2\u0114Z\3\2\2\2\u0115\u0116\7_\2"+
		"\2\u0116\\\3\2\2\2\u0117\u0118\7}\2\2\u0118^\3\2\2\2\u0119\u011a\7\177"+
		"\2\2\u011a`\3\2\2\2\u011b\u011c\7=\2\2\u011cb\3\2\2\2\u011d\u011e\7\60"+
		"\2\2\u011ed\3\2\2\2\u011f\u0120\7$\2\2\u0120f\3\2\2\2\u0121\u0122\7b\2"+
		"\2\u0122h\3\2\2\2\u0123\u0124\7.\2\2\u0124j\3\2\2\2\u0125\u0131\7\62\2"+
		"\2\u0126\u0128\7/\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u012d\t\3\2\2\u012a\u012c\t\4\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0131\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u0130\u0125\3\2\2\2\u0130\u0127\3\2\2\2\u0131"+
		"l\3\2\2\2\u0132\u0134\7a\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0139\t\5\2\2\u0136\u0138\t\6\2\2\u0137\u0136\3\2"+
		"\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"n\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0140\7$\2\2\u013d\u013f\n\7\2\2\u013e"+
		"\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7$\2\2\u0144"+
		"p\3\2\2\2\u0145\u0146\7w\2\2\u0146\u0147\7r\2\2\u0147r\3\2\2\2\u0148\u0149"+
		"\7f\2\2\u0149\u014a\7q\2\2\u014a\u014b\7y\2\2\u014b\u014c\7p\2\2\u014c"+
		"t\3\2\2\2\u014d\u014e\7v\2\2\u014e\u014f\7q\2\2\u014fv\3\2\2\2\u0150\u0151"+
		"\7\61\2\2\u0151\u0152\7\61\2\2\u0152\u0156\3\2\2\2\u0153\u0155\n\b\2\2"+
		"\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\b<\2\2\u015a"+
		"x\3\2\2\2\u015b\u015d\t\b\2\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2"+
		"\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161"+
		"\b=\2\2\u0161z\3\2\2\2\13\2\u0127\u012d\u0130\u0133\u0139\u0140\u0156"+
		"\u015e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}