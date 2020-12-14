// Generated from D:/Programs/Java/CMPILER MP/src\pogC.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pogCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, STRING=3, BOOL=4, VOID=5, MAIN=6, IF=7, ELSE=8, THEN=9, 
		RETURN=10, WHILE=11, FUNC=12, PRINT=13, SCAN=14, DO=15, FOR=16, ADD=17, 
		MULT=18, DIV=19, SUBT=20, MOD=21, ASSIGN=22, ADD_ASSIGN=23, SUB_ASSIGN=24, 
		MULT_ASSIGN=25, DIV_ASSIGN=26, INCR=27, DECR=28, EQUAL_EQUAL=29, GT=30, 
		LT=31, NOTEQUAL=32, AND=33, OR=34, LESSEQ=35, GREATEQ=36, TRUE=37, FALSE=38, 
		LPAREN=39, RPAREN=40, LBRAK=41, RBRAK=42, LBRACE=43, RBRACE=44, SEMICOLON=45, 
		PERIOD=46, QUOTMARK=47, SINGLEQUOTE=48, DIGIT=49, ID=50, UP=51, DOWN=52, 
		TO=53, SLCOMMENT=54, WS=55;
	public static final int
		RULE_prog = 0, RULE_mainProg = 1, RULE_main = 2, RULE_codeBlock = 3, RULE_declaration = 4, 
		RULE_intDeclaration = 5, RULE_floatDeclaration = 6, RULE_stringDeclaration = 7, 
		RULE_booleanDeclaration = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "mainProg", "main", "codeBlock", "declaration", "intDeclaration", 
			"floatDeclaration", "stringDeclaration", "booleanDeclaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'String'", "'boolean'", "'void'", "'main'", 
			"'if'", "'else'", "'then'", "'return'", "'while'", "'func'", "'print'", 
			"'scan'", "'do'", "'for'", "'+'", "'*'", "'/'", "'-'", "'%'", "'='", 
			"'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'=='", "'>'", "'<'", 
			"'!='", "'&&'", "'||'", "'<='", "'>='", "'T'", "'F'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "';'", "','", "'\"'", "'`'", null, null, "'up'", 
			"'down'", "'to'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "STRING", "BOOL", "VOID", "MAIN", "IF", "ELSE", 
			"THEN", "RETURN", "WHILE", "FUNC", "PRINT", "SCAN", "DO", "FOR", "ADD", 
			"MULT", "DIV", "SUBT", "MOD", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", 
			"DIV_ASSIGN", "INCR", "DECR", "EQUAL_EQUAL", "GT", "LT", "NOTEQUAL", 
			"AND", "OR", "LESSEQ", "GREATEQ", "TRUE", "FALSE", "LPAREN", "RPAREN", 
			"LBRAK", "RBRAK", "LBRACE", "RBRACE", "SEMICOLON", "PERIOD", "QUOTMARK", 
			"SINGLEQUOTE", "DIGIT", "ID", "UP", "DOWN", "TO", "SLCOMMENT", "WS"
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

	@Override
	public String getGrammarFileName() { return "pogC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pogCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public MainProgContext mainProg() {
			return getRuleContext(MainProgContext.class,0);
		}
		public TerminalNode EOF() { return getToken(pogCParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pogCVisitor ) return ((pogCVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			mainProg();
			setState(19);
			match(EOF);
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

	public static class MainProgContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pogCParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pogCParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(pogCParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(pogCParser.RBRACE, 0); }
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public MainProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainProg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).enterMainProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).exitMainProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pogCVisitor ) return ((pogCVisitor<? extends T>)visitor).visitMainProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainProgContext mainProg() throws RecognitionException {
		MainProgContext _localctx = new MainProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainProg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			main();
			setState(22);
			match(LPAREN);
			setState(23);
			match(RPAREN);
			setState(24);
			match(LBRACE);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL))) != 0)) {
				{
				{
				setState(25);
				codeBlock();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(RBRACE);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(pogCParser.MAIN, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pogCVisitor ) return ((pogCVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(MAIN);
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

	public static class CodeBlockContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).exitCodeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pogCVisitor ) return ((pogCVisitor<? extends T>)visitor).visitCodeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_codeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(35);
			declaration();
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

	public static class DeclarationContext extends ParserRuleContext {
		public IntDeclarationContext intDeclaration() {
			return getRuleContext(IntDeclarationContext.class,0);
		}
		public FloatDeclarationContext floatDeclaration() {
			return getRuleContext(FloatDeclarationContext.class,0);
		}
		public StringDeclarationContext stringDeclaration() {
			return getRuleContext(StringDeclarationContext.class,0);
		}
		public BooleanDeclarationContext booleanDeclaration() {
			return getRuleContext(BooleanDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pogCVisitor ) return ((pogCVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				intDeclaration();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				floatDeclaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				stringDeclaration();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				booleanDeclaration();
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

	public static class IntDeclarationContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(pogCParser.INT, 0); }
		public TerminalNode ID() { return getToken(pogCParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(pogCParser.ASSIGN, 0); }
		public TerminalNode DIGIT() { return getToken(pogCParser.DIGIT, 0); }
		public TerminalNode SEMICOLON() { return getToken(pogCParser.SEMICOLON, 0); }
		public IntDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).enterIntDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).exitIntDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pogCVisitor ) return ((pogCVisitor<? extends T>)visitor).visitIntDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntDeclarationContext intDeclaration() throws RecognitionException {
		IntDeclarationContext _localctx = new IntDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_intDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(INT);
			setState(44);
			match(ID);
			setState(45);
			match(ASSIGN);
			setState(46);
			match(DIGIT);
			setState(47);
			match(SEMICOLON);
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

	public static class FloatDeclarationContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(pogCParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(pogCParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(pogCParser.ASSIGN, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(pogCParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(pogCParser.DIGIT, i);
		}
		public TerminalNode PERIOD() { return getToken(pogCParser.PERIOD, 0); }
		public TerminalNode SEMICOLON() { return getToken(pogCParser.SEMICOLON, 0); }
		public FloatDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).enterFloatDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).exitFloatDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pogCVisitor ) return ((pogCVisitor<? extends T>)visitor).visitFloatDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatDeclarationContext floatDeclaration() throws RecognitionException {
		FloatDeclarationContext _localctx = new FloatDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_floatDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(FLOAT);
			setState(50);
			match(ID);
			setState(51);
			match(ASSIGN);
			setState(52);
			match(DIGIT);
			setState(53);
			match(PERIOD);
			setState(54);
			match(DIGIT);
			setState(55);
			match(SEMICOLON);
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

	public static class StringDeclarationContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(pogCParser.STRING, 0); }
		public List<TerminalNode> ID() { return getTokens(pogCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pogCParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(pogCParser.ASSIGN, 0); }
		public List<TerminalNode> QUOTMARK() { return getTokens(pogCParser.QUOTMARK); }
		public TerminalNode QUOTMARK(int i) {
			return getToken(pogCParser.QUOTMARK, i);
		}
		public TerminalNode SEMICOLON() { return getToken(pogCParser.SEMICOLON, 0); }
		public List<TerminalNode> SINGLEQUOTE() { return getTokens(pogCParser.SINGLEQUOTE); }
		public TerminalNode SINGLEQUOTE(int i) {
			return getToken(pogCParser.SINGLEQUOTE, i);
		}
		public StringDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).enterStringDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).exitStringDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pogCVisitor ) return ((pogCVisitor<? extends T>)visitor).visitStringDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringDeclarationContext stringDeclaration() throws RecognitionException {
		StringDeclarationContext _localctx = new StringDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stringDeclaration);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(STRING);
				setState(58);
				match(ID);
				setState(59);
				match(ASSIGN);
				setState(60);
				match(QUOTMARK);
				setState(61);
				match(ID);
				setState(62);
				match(QUOTMARK);
				setState(63);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(STRING);
				setState(65);
				match(ID);
				setState(66);
				match(ASSIGN);
				setState(67);
				match(SINGLEQUOTE);
				setState(68);
				match(ID);
				setState(69);
				match(SINGLEQUOTE);
				setState(70);
				match(SEMICOLON);
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

	public static class BooleanDeclarationContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(pogCParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(pogCParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(pogCParser.ASSIGN, 0); }
		public TerminalNode TRUE() { return getToken(pogCParser.TRUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(pogCParser.SEMICOLON, 0); }
		public TerminalNode FALSE() { return getToken(pogCParser.FALSE, 0); }
		public BooleanDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).enterBooleanDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).exitBooleanDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pogCVisitor ) return ((pogCVisitor<? extends T>)visitor).visitBooleanDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanDeclarationContext booleanDeclaration() throws RecognitionException {
		BooleanDeclarationContext _localctx = new BooleanDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_booleanDeclaration);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(BOOL);
				setState(74);
				match(ID);
				setState(75);
				match(ASSIGN);
				setState(76);
				match(TRUE);
				setState(77);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(BOOL);
				setState(79);
				match(ID);
				setState(80);
				match(ASSIGN);
				setState(81);
				match(FALSE);
				setState(82);
				match(SEMICOLON);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39X\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\5\6,\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"J\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nV\n\n\3\n\2\2\13\2\4"+
		"\6\b\n\f\16\20\22\2\2\2T\2\24\3\2\2\2\4\27\3\2\2\2\6#\3\2\2\2\b%\3\2\2"+
		"\2\n+\3\2\2\2\f-\3\2\2\2\16\63\3\2\2\2\20I\3\2\2\2\22U\3\2\2\2\24\25\5"+
		"\4\3\2\25\26\7\2\2\3\26\3\3\2\2\2\27\30\5\6\4\2\30\31\7)\2\2\31\32\7*"+
		"\2\2\32\36\7-\2\2\33\35\5\b\5\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2"+
		"\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7.\2\2\"\5\3\2\2\2#$\7\b\2"+
		"\2$\7\3\2\2\2%&\5\n\6\2&\t\3\2\2\2\',\5\f\7\2(,\5\16\b\2),\5\20\t\2*,"+
		"\5\22\n\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\13\3\2\2\2-.\7\3\2"+
		"\2./\7\64\2\2/\60\7\30\2\2\60\61\7\63\2\2\61\62\7/\2\2\62\r\3\2\2\2\63"+
		"\64\7\4\2\2\64\65\7\64\2\2\65\66\7\30\2\2\66\67\7\63\2\2\678\7\60\2\2"+
		"89\7\63\2\29:\7/\2\2:\17\3\2\2\2;<\7\5\2\2<=\7\64\2\2=>\7\30\2\2>?\7\61"+
		"\2\2?@\7\64\2\2@A\7\61\2\2AJ\7/\2\2BC\7\5\2\2CD\7\64\2\2DE\7\30\2\2EF"+
		"\7\62\2\2FG\7\64\2\2GH\7\62\2\2HJ\7/\2\2I;\3\2\2\2IB\3\2\2\2J\21\3\2\2"+
		"\2KL\7\6\2\2LM\7\64\2\2MN\7\30\2\2NO\7\'\2\2OV\7/\2\2PQ\7\6\2\2QR\7\64"+
		"\2\2RS\7\30\2\2ST\7(\2\2TV\7/\2\2UK\3\2\2\2UP\3\2\2\2V\23\3\2\2\2\6\36"+
		"+IU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}