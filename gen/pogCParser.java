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
		RETURN=10, WHILE=11, FUNC=12, PRINT=13, SCAN=14, DO=15, FOR=16, F=17, 
		CREATE=18, ADD=19, MULT=20, DIV=21, SUBT=22, MOD=23, ASSIGN=24, ADD_ASSIGN=25, 
		SUB_ASSIGN=26, MULT_ASSIGN=27, DIV_ASSIGN=28, INCR=29, DECR=30, EQUAL_EQUAL=31, 
		GT=32, LT=33, NOTEQUAL=34, AND=35, OR=36, LESSEQ=37, GREATEQ=38, TRUE=39, 
		FALSE=40, LPAREN=41, RPAREN=42, LBRAK=43, RBRAK=44, LBRACE=45, RBRACE=46, 
		SEMICOLON=47, PERIOD=48, QUOTMARK=49, SINGLEQUOTE=50, COMMA=51, DIGIT=52, 
		ID=53, TEXT=54, UP=55, DOWN=56, TO=57, SLCOMMENT=58, WS=59;
	public static final int
		RULE_prog = 0, RULE_mainProg = 1, RULE_main = 2, RULE_codeBlock = 3, RULE_declaration = 4, 
		RULE_intDeclaration = 5, RULE_floatDeclaration = 6, RULE_floatFormatDeclaration = 7, 
		RULE_floatF = 8, RULE_stringDeclaration = 9, RULE_booleanDeclaration = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "mainProg", "main", "codeBlock", "declaration", "intDeclaration", 
			"floatDeclaration", "floatFormatDeclaration", "floatF", "stringDeclaration", 
			"booleanDeclaration"
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
			setState(22);
			mainProg();
			setState(23);
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
			setState(25);
			main();
			setState(26);
			match(LPAREN);
			setState(27);
			match(RPAREN);
			setState(28);
			match(LBRACE);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << BOOL))) != 0)) {
				{
				{
				setState(29);
				codeBlock();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
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
			setState(37);
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
			setState(39);
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
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				intDeclaration();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				floatDeclaration();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				stringDeclaration();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
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
			setState(47);
			match(INT);
			setState(48);
			match(ID);
			setState(49);
			match(ASSIGN);
			setState(50);
			match(DIGIT);
			setState(51);
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
		public FloatFormatDeclarationContext floatFormatDeclaration() {
			return getRuleContext(FloatFormatDeclarationContext.class,0);
		}
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
			setState(53);
			match(FLOAT);
			setState(54);
			match(ID);
			setState(55);
			match(ASSIGN);
			setState(56);
			floatFormatDeclaration();
			setState(57);
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

	public static class FloatFormatDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(pogCParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(pogCParser.DIGIT, i);
		}
		public TerminalNode PERIOD() { return getToken(pogCParser.PERIOD, 0); }
		public FloatFContext floatF() {
			return getRuleContext(FloatFContext.class,0);
		}
		public FloatFormatDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatFormatDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).enterFloatFormatDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).exitFloatFormatDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pogCVisitor ) return ((pogCVisitor<? extends T>)visitor).visitFloatFormatDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatFormatDeclarationContext floatFormatDeclaration() throws RecognitionException {
		FloatFormatDeclarationContext _localctx = new FloatFormatDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floatFormatDeclaration);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(DIGIT);
				setState(60);
				match(PERIOD);
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					match(DIGIT);
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(PERIOD);
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67);
					match(DIGIT);
					}
					}
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(PERIOD);
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73);
					match(DIGIT);
					}
					}
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(78);
				floatF();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(DIGIT);
				setState(80);
				match(PERIOD);
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(81);
					match(DIGIT);
					}
					}
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(86);
				floatF();
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

	public static class FloatFContext extends ParserRuleContext {
		public TerminalNode F() { return getToken(pogCParser.F, 0); }
		public FloatFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).enterFloatF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pogCListener ) ((pogCListener)listener).exitFloatF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pogCVisitor ) return ((pogCVisitor<? extends T>)visitor).visitFloatF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatFContext floatF() throws RecognitionException {
		FloatFContext _localctx = new FloatFContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_floatF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(F);
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
		public TerminalNode ID() { return getToken(pogCParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(pogCParser.ASSIGN, 0); }
		public TerminalNode TEXT() { return getToken(pogCParser.TEXT, 0); }
		public TerminalNode SEMICOLON() { return getToken(pogCParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 18, RULE_stringDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(STRING);
			setState(92);
			match(ID);
			setState(93);
			match(ASSIGN);
			setState(94);
			match(TEXT);
			setState(95);
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
		enterRule(_localctx, 20, RULE_booleanDeclaration);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(BOOL);
				setState(98);
				match(ID);
				setState(99);
				match(ASSIGN);
				setState(100);
				match(TRUE);
				setState(101);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(BOOL);
				setState(103);
				match(ID);
				setState(104);
				match(ASSIGN);
				setState(105);
				match(FALSE);
				setState(106);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=p\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6\60\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\6\tA\n\t\r\t\16\tB\3\t\3\t\6\tG\n\t\r"+
		"\t\16\tH\3\t\3\t\6\tM\n\t\r\t\16\tN\3\t\3\t\3\t\3\t\6\tU\n\t\r\t\16\t"+
		"V\3\t\5\tZ\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\fn\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2"+
		"\2\2p\2\30\3\2\2\2\4\33\3\2\2\2\6\'\3\2\2\2\b)\3\2\2\2\n/\3\2\2\2\f\61"+
		"\3\2\2\2\16\67\3\2\2\2\20Y\3\2\2\2\22[\3\2\2\2\24]\3\2\2\2\26m\3\2\2\2"+
		"\30\31\5\4\3\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34\5\6\4\2\34\35\7+\2\2\35"+
		"\36\7,\2\2\36\"\7/\2\2\37!\5\b\5\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\""+
		"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\60\2\2&\5\3\2\2\2\'(\7\b\2\2(\7\3\2"+
		"\2\2)*\5\n\6\2*\t\3\2\2\2+\60\5\f\7\2,\60\5\16\b\2-\60\5\24\13\2.\60\5"+
		"\26\f\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\13\3\2\2\2\61\62\7"+
		"\3\2\2\62\63\7\67\2\2\63\64\7\32\2\2\64\65\7\66\2\2\65\66\7\61\2\2\66"+
		"\r\3\2\2\2\678\7\4\2\289\7\67\2\29:\7\32\2\2:;\5\20\t\2;<\7\61\2\2<\17"+
		"\3\2\2\2=>\7\66\2\2>@\7\62\2\2?A\7\66\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2"+
		"\2BC\3\2\2\2CZ\3\2\2\2DF\7\62\2\2EG\7\66\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2"+
		"\2\2HI\3\2\2\2IZ\3\2\2\2JL\7\62\2\2KM\7\66\2\2LK\3\2\2\2MN\3\2\2\2NL\3"+
		"\2\2\2NO\3\2\2\2OP\3\2\2\2PZ\5\22\n\2QR\7\66\2\2RT\7\62\2\2SU\7\66\2\2"+
		"TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XZ\5\22\n\2Y=\3\2\2"+
		"\2YD\3\2\2\2YJ\3\2\2\2YQ\3\2\2\2Z\21\3\2\2\2[\\\7\23\2\2\\\23\3\2\2\2"+
		"]^\7\5\2\2^_\7\67\2\2_`\7\32\2\2`a\78\2\2ab\7\61\2\2b\25\3\2\2\2cd\7\6"+
		"\2\2de\7\67\2\2ef\7\32\2\2fg\7)\2\2gn\7\61\2\2hi\7\6\2\2ij\7\67\2\2jk"+
		"\7\32\2\2kl\7*\2\2ln\7\61\2\2mc\3\2\2\2mh\3\2\2\2n\27\3\2\2\2\n\"/BHN"+
		"VYm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}