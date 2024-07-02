// Generated from /Users/nicolasschmidt/repositories/shakelang/idea-shake-plugin/src/main/kotlin/com/shakelang/ideashakeplugin/ShakeParser.g4 by ANTLR 4.13.1
package com.shakelang.ideashakeplugin.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ShakeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LINE_SEPARATOR=2, SEMICOLON=3, COMMA=4, COLON=5, DOT=6, FLOAT=7, 
		HEX_NUMBER=8, OCT_NUMBER=9, BIN_NUMBER=10, INTEGER=11, KEYWORD_ABSTRACT=12, 
		KEYWORD_AS=13, KEYWORD_CLASS=14, KEYWORD_CONST=15, KEYWORD_CONSTRUCTOR=16, 
		KEYWORD_DO=17, KEYWORD_ELSE=18, KEYWORD_ENUM=19, KEYWORD_FALSE=20, KEYWORD_FINAL=21, 
		KEYWORD_FOR=22, KEYWORD_FUN=23, KEYWORD_IF=24, KEYWORD_IMPORT=25, KEYWORD_IN=26, 
		KEYWORD_INLINE=27, KEYWORD_INSTANCEOF=28, KEYWORD_INTERFACE=29, KEYWORD_NATIVE=30, 
		KEYWORD_NULL=31, KEYWORD_OBJECT=32, KEYWORD_OPERATOR=33, KEYWORD_OVERRIDE=34, 
		KEYWORD_PACKAGE=35, KEYWORD_PRIVATE=36, KEYWORD_PROTECTED=37, KEYWORD_PUBLIC=38, 
		KEYWORD_RETURN=39, KEYWORD_STATIC=40, KEYWORD_SUPER=41, KEYWORD_SYNCHRONIZED=42, 
		KEYWORD_THIS=43, KEYWORD_TRUE=44, KEYWORD_VAL=45, KEYWORD_VAR=46, KEYWORD_WHILE=47, 
		IDENTIFIER=48, IDENTIFIER2=49, STRING=50, CHAR=51, SINGLE_LINE_COMMENT=52, 
		MULTILINE_COMMENT=53, POW_ASSIGN=54, MOD_ASSIGN=55, DIV_ASSIGN=56, MUL_ASSIGN=57, 
		SUB_ASSIGN=58, ADD_ASSIGN=59, INCR=60, DECR=61, POW=62, MOD=63, DIV=64, 
		MUL=65, SUB=66, ADD=67, LOGIC_OR=68, LOGIC_AND=69, LOGIC_XOR=70, EQUALS=71, 
		GTE=72, LTE=73, NEQ=74, GT=75, LT=76, LOGIC_NOT=77, BIT_NAND=78, BIT_NOR=79, 
		BIT_XNOR=80, BIT_NOT=81, BIT_AND=82, BIT_OR=83, BIT_XOR=84, ASSIGN=85, 
		LPAREN=86, RPAREN=87, LCURLY=88, RCURLY=89, LBRACK=90, RBRACK=91;
	public static final int
		RULE_shakeIdentifier = 0, RULE_shakeModifier = 1, RULE_shakeModifierList = 2, 
		RULE_shakeNamespace = 3, RULE_shakeType = 4, RULE_genericDeclaration = 5, 
		RULE_genericsDeclaration = 6, RULE_funArgs = 7, RULE_funArgDeclaration = 8, 
		RULE_shakeBlock = 9, RULE_shakeBlockChild = 10, RULE_shakeArgument = 11, 
		RULE_shakeArguments = 12, RULE_shakeTypeArgument = 13, RULE_shakeTypeArguments = 14, 
		RULE_shakeFile = 15, RULE_shakeFileChild = 16, RULE_shakePackageDeclaration = 17, 
		RULE_shakeImportDeclaration = 18, RULE_shakeFunDeclaration = 19, RULE_shakeFieldDeclaration = 20, 
		RULE_shakeConstructorDeclaration = 21, RULE_shakeClassChild = 22, RULE_shakeClassContents = 23, 
		RULE_superClassList = 24, RULE_shakeClassDeclaration = 25, RULE_shakeStatement = 26, 
		RULE_shakeVarDeclaration = 27, RULE_shakeWhile = 28, RULE_shakeDoWhile = 29, 
		RULE_shakeFor = 30, RULE_shakeIf = 31, RULE_shakeValue = 32, RULE_shakeAssignment = 33, 
		RULE_shakeLogicalOr = 34, RULE_shakeLogicalXor = 35, RULE_shakeLogicalAnd = 36, 
		RULE_shakeBitwiseOr = 37, RULE_shakeBitwiseXor = 38, RULE_shakeBitwiseAnd = 39, 
		RULE_shakeEquality = 40, RULE_shakeRelation = 41, RULE_shakeShift = 42, 
		RULE_shakeAddition = 43, RULE_shakeMultiplication = 44, RULE_shakePower = 45, 
		RULE_shakeCast = 46, RULE_shakeAccess = 47, RULE_shakeMandory = 48, RULE_shakeSign = 49, 
		RULE_shakePriority = 50, RULE_shakeLiteral = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"shakeIdentifier", "shakeModifier", "shakeModifierList", "shakeNamespace", 
			"shakeType", "genericDeclaration", "genericsDeclaration", "funArgs", 
			"funArgDeclaration", "shakeBlock", "shakeBlockChild", "shakeArgument", 
			"shakeArguments", "shakeTypeArgument", "shakeTypeArguments", "shakeFile", 
			"shakeFileChild", "shakePackageDeclaration", "shakeImportDeclaration", 
			"shakeFunDeclaration", "shakeFieldDeclaration", "shakeConstructorDeclaration", 
			"shakeClassChild", "shakeClassContents", "superClassList", "shakeClassDeclaration", 
			"shakeStatement", "shakeVarDeclaration", "shakeWhile", "shakeDoWhile", 
			"shakeFor", "shakeIf", "shakeValue", "shakeAssignment", "shakeLogicalOr", 
			"shakeLogicalXor", "shakeLogicalAnd", "shakeBitwiseOr", "shakeBitwiseXor", 
			"shakeBitwiseAnd", "shakeEquality", "shakeRelation", "shakeShift", "shakeAddition", 
			"shakeMultiplication", "shakePower", "shakeCast", "shakeAccess", "shakeMandory", 
			"shakeSign", "shakePriority", "shakeLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\\n'", "';'", "','", "':'", "'.'", null, null, null, null, 
			null, "'abstract'", "'as'", "'class'", "'const'", "'constructor'", "'do'", 
			"'else'", "'enum'", "'false'", "'final'", "'for'", "'fun'", "'if'", "'import'", 
			"'in'", "'inline'", "'instanceof'", "'interface'", "'native'", "'null'", 
			"'object'", "'operator'", "'override'", "'package'", "'private'", "'protected'", 
			"'public'", "'return'", "'static'", "'super'", "'synchronized'", "'this'", 
			"'true'", "'val'", "'var'", "'while'", null, null, null, null, null, 
			null, "'**='", "'%='", "'/='", "'*='", "'-='", "'+='", "'++'", "'--'", 
			"'**'", "'%'", "'/'", "'*'", "'-'", "'+'", "'||'", "'&&'", "'^^'", "'=='", 
			"'>='", "'<='", "'!='", "'>'", "'<'", "'!'", "'~&'", "'~|'", "'~^'", 
			"'~'", "'&'", "'|'", "'^'", "'='", "'('", "')'", "'{'", "'}'", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LINE_SEPARATOR", "SEMICOLON", "COMMA", "COLON", "DOT", "FLOAT", 
			"HEX_NUMBER", "OCT_NUMBER", "BIN_NUMBER", "INTEGER", "KEYWORD_ABSTRACT", 
			"KEYWORD_AS", "KEYWORD_CLASS", "KEYWORD_CONST", "KEYWORD_CONSTRUCTOR", 
			"KEYWORD_DO", "KEYWORD_ELSE", "KEYWORD_ENUM", "KEYWORD_FALSE", "KEYWORD_FINAL", 
			"KEYWORD_FOR", "KEYWORD_FUN", "KEYWORD_IF", "KEYWORD_IMPORT", "KEYWORD_IN", 
			"KEYWORD_INLINE", "KEYWORD_INSTANCEOF", "KEYWORD_INTERFACE", "KEYWORD_NATIVE", 
			"KEYWORD_NULL", "KEYWORD_OBJECT", "KEYWORD_OPERATOR", "KEYWORD_OVERRIDE", 
			"KEYWORD_PACKAGE", "KEYWORD_PRIVATE", "KEYWORD_PROTECTED", "KEYWORD_PUBLIC", 
			"KEYWORD_RETURN", "KEYWORD_STATIC", "KEYWORD_SUPER", "KEYWORD_SYNCHRONIZED", 
			"KEYWORD_THIS", "KEYWORD_TRUE", "KEYWORD_VAL", "KEYWORD_VAR", "KEYWORD_WHILE", 
			"IDENTIFIER", "IDENTIFIER2", "STRING", "CHAR", "SINGLE_LINE_COMMENT", 
			"MULTILINE_COMMENT", "POW_ASSIGN", "MOD_ASSIGN", "DIV_ASSIGN", "MUL_ASSIGN", 
			"SUB_ASSIGN", "ADD_ASSIGN", "INCR", "DECR", "POW", "MOD", "DIV", "MUL", 
			"SUB", "ADD", "LOGIC_OR", "LOGIC_AND", "LOGIC_XOR", "EQUALS", "GTE", 
			"LTE", "NEQ", "GT", "LT", "LOGIC_NOT", "BIT_NAND", "BIT_NOR", "BIT_XNOR", 
			"BIT_NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "ASSIGN", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "LBRACK", "RBRACK"
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
	public String getGrammarFileName() { return "ShakeParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShakeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeIdentifierContext extends ParserRuleContext {
		public Token identifier;
		public TerminalNode IDENTIFIER() { return getToken(ShakeParser.IDENTIFIER, 0); }
		public TerminalNode IDENTIFIER2() { return getToken(ShakeParser.IDENTIFIER2, 0); }
		public ShakeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeIdentifierContext shakeIdentifier() throws RecognitionException {
		ShakeIdentifierContext _localctx = new ShakeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_shakeIdentifier);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(104);
				((ShakeIdentifierContext)_localctx).identifier = match(IDENTIFIER);
				}
				}
				break;
			case IDENTIFIER2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(105);
				((ShakeIdentifierContext)_localctx).identifier = match(IDENTIFIER2);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeModifierContext extends ParserRuleContext {
		public TerminalNode KEYWORD_PUBLIC() { return getToken(ShakeParser.KEYWORD_PUBLIC, 0); }
		public TerminalNode KEYWORD_PRIVATE() { return getToken(ShakeParser.KEYWORD_PRIVATE, 0); }
		public TerminalNode KEYWORD_PROTECTED() { return getToken(ShakeParser.KEYWORD_PROTECTED, 0); }
		public TerminalNode KEYWORD_STATIC() { return getToken(ShakeParser.KEYWORD_STATIC, 0); }
		public TerminalNode KEYWORD_FINAL() { return getToken(ShakeParser.KEYWORD_FINAL, 0); }
		public TerminalNode KEYWORD_ABSTRACT() { return getToken(ShakeParser.KEYWORD_ABSTRACT, 0); }
		public TerminalNode KEYWORD_NATIVE() { return getToken(ShakeParser.KEYWORD_NATIVE, 0); }
		public TerminalNode KEYWORD_SYNCHRONIZED() { return getToken(ShakeParser.KEYWORD_SYNCHRONIZED, 0); }
		public TerminalNode KEYWORD_INLINE() { return getToken(ShakeParser.KEYWORD_INLINE, 0); }
		public TerminalNode KEYWORD_OVERRIDE() { return getToken(ShakeParser.KEYWORD_OVERRIDE, 0); }
		public TerminalNode KEYWORD_OPERATOR() { return getToken(ShakeParser.KEYWORD_OPERATOR, 0); }
		public ShakeModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeModifierContext shakeModifier() throws RecognitionException {
		ShakeModifierContext _localctx = new ShakeModifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_shakeModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6005574340608L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeModifierListContext extends ParserRuleContext {
		public List<ShakeModifierContext> shakeModifier() {
			return getRuleContexts(ShakeModifierContext.class);
		}
		public ShakeModifierContext shakeModifier(int i) {
			return getRuleContext(ShakeModifierContext.class,i);
		}
		public ShakeModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeModifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeModifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeModifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeModifierListContext shakeModifierList() throws RecognitionException {
		ShakeModifierListContext _localctx = new ShakeModifierListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_shakeModifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6005574340608L) != 0)) {
				{
				{
				setState(110);
				shakeModifier();
				}
				}
				setState(115);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeNamespaceContext extends ParserRuleContext {
		public ShakeIdentifierContext identifier;
		public Token dot;
		public ShakeNamespaceContext child;
		public ShakeIdentifierContext shakeIdentifier() {
			return getRuleContext(ShakeIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ShakeParser.DOT, 0); }
		public ShakeNamespaceContext shakeNamespace() {
			return getRuleContext(ShakeNamespaceContext.class,0);
		}
		public ShakeNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeNamespaceContext shakeNamespace() throws RecognitionException {
		ShakeNamespaceContext _localctx = new ShakeNamespaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_shakeNamespace);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(116);
				((ShakeNamespaceContext)_localctx).identifier = shakeIdentifier();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(117);
				((ShakeNamespaceContext)_localctx).identifier = shakeIdentifier();
				}
				{
				setState(118);
				((ShakeNamespaceContext)_localctx).dot = match(DOT);
				}
				{
				setState(119);
				((ShakeNamespaceContext)_localctx).child = shakeNamespace();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeTypeContext extends ParserRuleContext {
		public ShakeNamespaceContext namespace;
		public ShakeNamespaceContext shakeNamespace() {
			return getRuleContext(ShakeNamespaceContext.class,0);
		}
		public ShakeTypeArgumentsContext shakeTypeArguments() {
			return getRuleContext(ShakeTypeArgumentsContext.class,0);
		}
		public ShakeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeTypeContext shakeType() throws RecognitionException {
		ShakeTypeContext _localctx = new ShakeTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_shakeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(123);
			((ShakeTypeContext)_localctx).namespace = shakeNamespace();
			}
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(124);
				shakeTypeArguments();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericDeclarationContext extends ParserRuleContext {
		public ShakeIdentifierContext name;
		public Token colon;
		public ShakeTypeContext type;
		public ShakeIdentifierContext shakeIdentifier() {
			return getRuleContext(ShakeIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ShakeParser.COLON, 0); }
		public ShakeTypeContext shakeType() {
			return getRuleContext(ShakeTypeContext.class,0);
		}
		public GenericDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterGenericDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitGenericDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitGenericDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericDeclarationContext genericDeclaration() throws RecognitionException {
		GenericDeclarationContext _localctx = new GenericDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_genericDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(127);
			((GenericDeclarationContext)_localctx).name = shakeIdentifier();
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				{
				setState(128);
				((GenericDeclarationContext)_localctx).colon = match(COLON);
				}
				{
				setState(129);
				((GenericDeclarationContext)_localctx).type = shakeType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericsDeclarationContext extends ParserRuleContext {
		public Token lt;
		public Token gt;
		public List<GenericDeclarationContext> genericDeclaration() {
			return getRuleContexts(GenericDeclarationContext.class);
		}
		public GenericDeclarationContext genericDeclaration(int i) {
			return getRuleContext(GenericDeclarationContext.class,i);
		}
		public TerminalNode LT() { return getToken(ShakeParser.LT, 0); }
		public TerminalNode GT() { return getToken(ShakeParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ShakeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ShakeParser.COMMA, i);
		}
		public GenericsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterGenericsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitGenericsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitGenericsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericsDeclarationContext genericsDeclaration() throws RecognitionException {
		GenericsDeclarationContext _localctx = new GenericsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_genericsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(132);
			((GenericsDeclarationContext)_localctx).lt = match(LT);
			}
			{
			setState(133);
			genericDeclaration();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(134);
				match(COMMA);
				setState(135);
				genericDeclaration();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			{
			setState(141);
			((GenericsDeclarationContext)_localctx).gt = match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunArgsContext extends ParserRuleContext {
		public Token lt;
		public FunArgDeclarationContext args;
		public Token gt;
		public TerminalNode LPAREN() { return getToken(ShakeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ShakeParser.RPAREN, 0); }
		public List<FunArgDeclarationContext> funArgDeclaration() {
			return getRuleContexts(FunArgDeclarationContext.class);
		}
		public FunArgDeclarationContext funArgDeclaration(int i) {
			return getRuleContext(FunArgDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ShakeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ShakeParser.COMMA, i);
		}
		public FunArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterFunArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitFunArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitFunArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunArgsContext funArgs() throws RecognitionException {
		FunArgsContext _localctx = new FunArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(143);
			((FunArgsContext)_localctx).lt = match(LPAREN);
			}
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==IDENTIFIER2) {
				{
				setState(144);
				((FunArgsContext)_localctx).args = funArgDeclaration();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(145);
					match(COMMA);
					setState(146);
					funArgDeclaration();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
			{
			setState(154);
			((FunArgsContext)_localctx).gt = match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunArgDeclarationContext extends ParserRuleContext {
		public ShakeIdentifierContext name;
		public Token colon;
		public ShakeTypeContext type;
		public ShakeIdentifierContext shakeIdentifier() {
			return getRuleContext(ShakeIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ShakeParser.COLON, 0); }
		public ShakeTypeContext shakeType() {
			return getRuleContext(ShakeTypeContext.class,0);
		}
		public FunArgDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funArgDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterFunArgDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitFunArgDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitFunArgDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunArgDeclarationContext funArgDeclaration() throws RecognitionException {
		FunArgDeclarationContext _localctx = new FunArgDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funArgDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(156);
			((FunArgDeclarationContext)_localctx).name = shakeIdentifier();
			}
			{
			setState(157);
			((FunArgDeclarationContext)_localctx).colon = match(COLON);
			}
			{
			setState(158);
			((FunArgDeclarationContext)_localctx).type = shakeType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeBlockContext extends ParserRuleContext {
		public Token lt;
		public Token gt;
		public TerminalNode LCURLY() { return getToken(ShakeParser.LCURLY, 0); }
		public List<ShakeBlockChildContext> shakeBlockChild() {
			return getRuleContexts(ShakeBlockChildContext.class);
		}
		public ShakeBlockChildContext shakeBlockChild(int i) {
			return getRuleContext(ShakeBlockChildContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(ShakeParser.RCURLY, 0); }
		public ShakeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeBlockContext shakeBlock() throws RecognitionException {
		ShakeBlockContext _localctx = new ShakeBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_shakeBlock);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLY:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(160);
				((ShakeBlockContext)_localctx).lt = match(LCURLY);
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 111558690607104L) != 0)) {
					{
					{
					setState(161);
					shakeBlockChild();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(167);
				((ShakeBlockContext)_localctx).gt = match(RCURLY);
				}
				}
				break;
			case KEYWORD_ABSTRACT:
			case KEYWORD_FINAL:
			case KEYWORD_INLINE:
			case KEYWORD_NATIVE:
			case KEYWORD_OPERATOR:
			case KEYWORD_OVERRIDE:
			case KEYWORD_PRIVATE:
			case KEYWORD_PROTECTED:
			case KEYWORD_PUBLIC:
			case KEYWORD_STATIC:
			case KEYWORD_SYNCHRONIZED:
			case KEYWORD_VAL:
			case KEYWORD_VAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(168);
				shakeBlockChild();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeBlockChildContext extends ParserRuleContext {
		public ShakeStatementContext shakeStatement() {
			return getRuleContext(ShakeStatementContext.class,0);
		}
		public ShakeBlockChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeBlockChild; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeBlockChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeBlockChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeBlockChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeBlockChildContext shakeBlockChild() throws RecognitionException {
		ShakeBlockChildContext _localctx = new ShakeBlockChildContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_shakeBlockChild);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			shakeStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeArgumentContext extends ParserRuleContext {
		public ShakeValueContext shakeValue() {
			return getRuleContext(ShakeValueContext.class,0);
		}
		public ShakeIdentifierContext shakeIdentifier() {
			return getRuleContext(ShakeIdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ShakeParser.ASSIGN, 0); }
		public ShakeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeArgumentContext shakeArgument() throws RecognitionException {
		ShakeArgumentContext _localctx = new ShakeArgumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_shakeArgument);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				shakeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				shakeIdentifier();
				setState(175);
				match(ASSIGN);
				setState(176);
				shakeValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ShakeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ShakeParser.RPAREN, 0); }
		public List<ShakeArgumentContext> shakeArgument() {
			return getRuleContexts(ShakeArgumentContext.class);
		}
		public ShakeArgumentContext shakeArgument(int i) {
			return getRuleContext(ShakeArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ShakeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ShakeParser.COMMA, i);
		}
		public ShakeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeArgumentsContext shakeArguments() throws RecognitionException {
		ShakeArgumentsContext _localctx = new ShakeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_shakeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(LPAREN);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3463015225774575488L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1083395L) != 0)) {
				{
				{
				{
				setState(181);
				shakeArgument();
				}
				{
				setState(182);
				match(COMMA);
				setState(183);
				shakeArgument();
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(185);
					match(COMMA);
					}
				}

				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeTypeArgumentContext extends ParserRuleContext {
		public ShakeTypeContext shakeType() {
			return getRuleContext(ShakeTypeContext.class,0);
		}
		public ShakeTypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeTypeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeTypeArgumentContext shakeTypeArgument() throws RecognitionException {
		ShakeTypeArgumentContext _localctx = new ShakeTypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_shakeTypeArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			shakeType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ShakeParser.LT, 0); }
		public TerminalNode GT() { return getToken(ShakeParser.GT, 0); }
		public List<ShakeTypeArgumentContext> shakeTypeArgument() {
			return getRuleContexts(ShakeTypeArgumentContext.class);
		}
		public ShakeTypeArgumentContext shakeTypeArgument(int i) {
			return getRuleContext(ShakeTypeArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ShakeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ShakeParser.COMMA, i);
		}
		public ShakeTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeTypeArgumentsContext shakeTypeArguments() throws RecognitionException {
		ShakeTypeArgumentsContext _localctx = new ShakeTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_shakeTypeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LT);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==IDENTIFIER2) {
				{
				{
				setState(198);
				shakeTypeArgument();
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					{
					setState(199);
					match(COMMA);
					setState(200);
					shakeTypeArgument();
					}
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(202);
						match(COMMA);
						}
						break;
					}
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(212);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeFileContext extends ParserRuleContext {
		public List<ShakeFileChildContext> shakeFileChild() {
			return getRuleContexts(ShakeFileChildContext.class);
		}
		public ShakeFileChildContext shakeFileChild(int i) {
			return getRuleContext(ShakeFileChildContext.class,i);
		}
		public ShakeFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeFileContext shakeFile() throws RecognitionException {
		ShakeFileContext _localctx = new ShakeFileContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_shakeFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 111593092304896L) != 0)) {
				{
				{
				setState(214);
				shakeFileChild();
				}
				}
				setState(219);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeFileChildContext extends ParserRuleContext {
		public ShakePackageDeclarationContext shakePackageDeclaration() {
			return getRuleContext(ShakePackageDeclarationContext.class,0);
		}
		public ShakeImportDeclarationContext shakeImportDeclaration() {
			return getRuleContext(ShakeImportDeclarationContext.class,0);
		}
		public ShakeFunDeclarationContext shakeFunDeclaration() {
			return getRuleContext(ShakeFunDeclarationContext.class,0);
		}
		public ShakeFieldDeclarationContext shakeFieldDeclaration() {
			return getRuleContext(ShakeFieldDeclarationContext.class,0);
		}
		public ShakeClassDeclarationContext shakeClassDeclaration() {
			return getRuleContext(ShakeClassDeclarationContext.class,0);
		}
		public ShakeFileChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeFileChild; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeFileChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeFileChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeFileChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeFileChildContext shakeFileChild() throws RecognitionException {
		ShakeFileChildContext _localctx = new ShakeFileChildContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_shakeFileChild);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				shakePackageDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				shakeImportDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				shakeFunDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				shakeFieldDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				shakeClassDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakePackageDeclarationContext extends ParserRuleContext {
		public ShakeNamespaceContext namespace;
		public TerminalNode KEYWORD_PACKAGE() { return getToken(ShakeParser.KEYWORD_PACKAGE, 0); }
		public ShakeNamespaceContext shakeNamespace() {
			return getRuleContext(ShakeNamespaceContext.class,0);
		}
		public ShakePackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakePackageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakePackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakePackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakePackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakePackageDeclarationContext shakePackageDeclaration() throws RecognitionException {
		ShakePackageDeclarationContext _localctx = new ShakePackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_shakePackageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(KEYWORD_PACKAGE);
			{
			setState(228);
			((ShakePackageDeclarationContext)_localctx).namespace = shakeNamespace();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeImportDeclarationContext extends ParserRuleContext {
		public ShakeNamespaceContext namespace;
		public TerminalNode KEYWORD_IMPORT() { return getToken(ShakeParser.KEYWORD_IMPORT, 0); }
		public ShakeNamespaceContext shakeNamespace() {
			return getRuleContext(ShakeNamespaceContext.class,0);
		}
		public ShakeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeImportDeclarationContext shakeImportDeclaration() throws RecognitionException {
		ShakeImportDeclarationContext _localctx = new ShakeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_shakeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(KEYWORD_IMPORT);
			{
			setState(231);
			((ShakeImportDeclarationContext)_localctx).namespace = shakeNamespace();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeFunDeclarationContext extends ParserRuleContext {
		public Token fun;
		public GenericsDeclarationContext generics;
		public ShakeNamespaceContext expanding;
		public ShakeIdentifierContext name;
		public FunArgsContext args;
		public Token colon;
		public ShakeTypeContext returnType;
		public ShakeBlockContext block;
		public ShakeModifierListContext shakeModifierList() {
			return getRuleContext(ShakeModifierListContext.class,0);
		}
		public TerminalNode KEYWORD_FUN() { return getToken(ShakeParser.KEYWORD_FUN, 0); }
		public TerminalNode DOT() { return getToken(ShakeParser.DOT, 0); }
		public ShakeIdentifierContext shakeIdentifier() {
			return getRuleContext(ShakeIdentifierContext.class,0);
		}
		public FunArgsContext funArgs() {
			return getRuleContext(FunArgsContext.class,0);
		}
		public GenericsDeclarationContext genericsDeclaration() {
			return getRuleContext(GenericsDeclarationContext.class,0);
		}
		public ShakeBlockContext shakeBlock() {
			return getRuleContext(ShakeBlockContext.class,0);
		}
		public ShakeNamespaceContext shakeNamespace() {
			return getRuleContext(ShakeNamespaceContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ShakeParser.COLON, 0); }
		public ShakeTypeContext shakeType() {
			return getRuleContext(ShakeTypeContext.class,0);
		}
		public ShakeFunDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeFunDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeFunDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeFunDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeFunDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeFunDeclarationContext shakeFunDeclaration() throws RecognitionException {
		ShakeFunDeclarationContext _localctx = new ShakeFunDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_shakeFunDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			shakeModifierList();
			{
			setState(234);
			((ShakeFunDeclarationContext)_localctx).fun = match(KEYWORD_FUN);
			}
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(235);
				((ShakeFunDeclarationContext)_localctx).generics = genericsDeclaration();
				}
			}

			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				{
				setState(238);
				((ShakeFunDeclarationContext)_localctx).expanding = shakeNamespace();
				}
				setState(239);
				match(DOT);
				}
				break;
			}
			{
			setState(243);
			((ShakeFunDeclarationContext)_localctx).name = shakeIdentifier();
			}
			{
			setState(244);
			((ShakeFunDeclarationContext)_localctx).args = funArgs();
			}
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				{
				setState(245);
				((ShakeFunDeclarationContext)_localctx).colon = match(COLON);
				}
				{
				setState(246);
				((ShakeFunDeclarationContext)_localctx).returnType = shakeType();
				}
				}
			}

			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(249);
				((ShakeFunDeclarationContext)_localctx).block = shakeBlock();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeFieldDeclarationContext extends ParserRuleContext {
		public Token var;
		public ShakeNamespaceContext expanding;
		public ShakeIdentifierContext name;
		public Token colon;
		public ShakeTypeContext variableType;
		public Token assign;
		public ShakeValueContext value;
		public ShakeModifierListContext shakeModifierList() {
			return getRuleContext(ShakeModifierListContext.class,0);
		}
		public TerminalNode KEYWORD_VAR() { return getToken(ShakeParser.KEYWORD_VAR, 0); }
		public TerminalNode KEYWORD_VAL() { return getToken(ShakeParser.KEYWORD_VAL, 0); }
		public TerminalNode DOT() { return getToken(ShakeParser.DOT, 0); }
		public ShakeIdentifierContext shakeIdentifier() {
			return getRuleContext(ShakeIdentifierContext.class,0);
		}
		public ShakeNamespaceContext shakeNamespace() {
			return getRuleContext(ShakeNamespaceContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ShakeParser.COLON, 0); }
		public ShakeTypeContext shakeType() {
			return getRuleContext(ShakeTypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ShakeParser.ASSIGN, 0); }
		public ShakeValueContext shakeValue() {
			return getRuleContext(ShakeValueContext.class,0);
		}
		public ShakeFieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeFieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeFieldDeclarationContext shakeFieldDeclaration() throws RecognitionException {
		ShakeFieldDeclarationContext _localctx = new ShakeFieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_shakeFieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			shakeModifierList();
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_VAR:
				{
				setState(253);
				((ShakeFieldDeclarationContext)_localctx).var = match(KEYWORD_VAR);
				}
				break;
			case KEYWORD_VAL:
				{
				setState(254);
				((ShakeFieldDeclarationContext)_localctx).var = match(KEYWORD_VAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				{
				setState(257);
				((ShakeFieldDeclarationContext)_localctx).expanding = shakeNamespace();
				}
				setState(258);
				match(DOT);
				}
				break;
			}
			{
			setState(262);
			((ShakeFieldDeclarationContext)_localctx).name = shakeIdentifier();
			}
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				{
				setState(263);
				((ShakeFieldDeclarationContext)_localctx).colon = match(COLON);
				}
				{
				setState(264);
				((ShakeFieldDeclarationContext)_localctx).variableType = shakeType();
				}
				}
			}

			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				{
				setState(267);
				((ShakeFieldDeclarationContext)_localctx).assign = match(ASSIGN);
				}
				{
				setState(268);
				((ShakeFieldDeclarationContext)_localctx).value = shakeValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeConstructorDeclarationContext extends ParserRuleContext {
		public Token fun;
		public ShakeIdentifierContext identifier;
		public FunArgsContext args;
		public ShakeBlockContext block;
		public ShakeModifierListContext shakeModifierList() {
			return getRuleContext(ShakeModifierListContext.class,0);
		}
		public TerminalNode KEYWORD_CONSTRUCTOR() { return getToken(ShakeParser.KEYWORD_CONSTRUCTOR, 0); }
		public FunArgsContext funArgs() {
			return getRuleContext(FunArgsContext.class,0);
		}
		public ShakeIdentifierContext shakeIdentifier() {
			return getRuleContext(ShakeIdentifierContext.class,0);
		}
		public ShakeBlockContext shakeBlock() {
			return getRuleContext(ShakeBlockContext.class,0);
		}
		public ShakeConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeConstructorDeclarationContext shakeConstructorDeclaration() throws RecognitionException {
		ShakeConstructorDeclarationContext _localctx = new ShakeConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_shakeConstructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			shakeModifierList();
			{
			setState(272);
			((ShakeConstructorDeclarationContext)_localctx).fun = match(KEYWORD_CONSTRUCTOR);
			}
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==IDENTIFIER2) {
				{
				setState(273);
				((ShakeConstructorDeclarationContext)_localctx).identifier = shakeIdentifier();
				}
			}

			{
			setState(276);
			((ShakeConstructorDeclarationContext)_localctx).args = funArgs();
			}
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(277);
				((ShakeConstructorDeclarationContext)_localctx).block = shakeBlock();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeClassChildContext extends ParserRuleContext {
		public ShakeFieldDeclarationContext shakeFieldDeclaration() {
			return getRuleContext(ShakeFieldDeclarationContext.class,0);
		}
		public ShakeFunDeclarationContext shakeFunDeclaration() {
			return getRuleContext(ShakeFunDeclarationContext.class,0);
		}
		public ShakeConstructorDeclarationContext shakeConstructorDeclaration() {
			return getRuleContext(ShakeConstructorDeclarationContext.class,0);
		}
		public ShakeClassDeclarationContext shakeClassDeclaration() {
			return getRuleContext(ShakeClassDeclarationContext.class,0);
		}
		public ShakeClassChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeClassChild; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeClassChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeClassChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeClassChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeClassChildContext shakeClassChild() throws RecognitionException {
		ShakeClassChildContext _localctx = new ShakeClassChildContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_shakeClassChild);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				shakeFieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				shakeFunDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				shakeConstructorDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				shakeClassDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeClassContentsContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(ShakeParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ShakeParser.RCURLY, 0); }
		public List<ShakeClassChildContext> shakeClassChild() {
			return getRuleContexts(ShakeClassChildContext.class);
		}
		public ShakeClassChildContext shakeClassChild(int i) {
			return getRuleContext(ShakeClassChildContext.class,i);
		}
		public ShakeClassContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeClassContents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeClassContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeClassContents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeClassContents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeClassContentsContext shakeClassContents() throws RecognitionException {
		ShakeClassContentsContext _localctx = new ShakeClassContentsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_shakeClassContents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(LCURLY);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 111558699077632L) != 0)) {
				{
				{
				setState(287);
				shakeClassChild();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(RCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SuperClassListContext extends ParserRuleContext {
		public List<ShakeTypeContext> shakeType() {
			return getRuleContexts(ShakeTypeContext.class);
		}
		public ShakeTypeContext shakeType(int i) {
			return getRuleContext(ShakeTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ShakeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ShakeParser.COMMA, i);
		}
		public SuperClassListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superClassList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterSuperClassList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitSuperClassList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitSuperClassList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperClassListContext superClassList() throws RecognitionException {
		SuperClassListContext _localctx = new SuperClassListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_superClassList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			shakeType();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(296);
				match(COMMA);
				setState(297);
				shakeType();
				}
				}
				setState(302);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeClassDeclarationContext extends ParserRuleContext {
		public Token class_;
		public ShakeIdentifierContext name;
		public GenericsDeclarationContext generics;
		public SuperClassListContext superClasses;
		public ShakeClassContentsContext contents;
		public ShakeModifierListContext shakeModifierList() {
			return getRuleContext(ShakeModifierListContext.class,0);
		}
		public TerminalNode KEYWORD_CLASS() { return getToken(ShakeParser.KEYWORD_CLASS, 0); }
		public ShakeIdentifierContext shakeIdentifier() {
			return getRuleContext(ShakeIdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ShakeParser.COLON, 0); }
		public GenericsDeclarationContext genericsDeclaration() {
			return getRuleContext(GenericsDeclarationContext.class,0);
		}
		public ShakeClassContentsContext shakeClassContents() {
			return getRuleContext(ShakeClassContentsContext.class,0);
		}
		public SuperClassListContext superClassList() {
			return getRuleContext(SuperClassListContext.class,0);
		}
		public ShakeClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeClassDeclarationContext shakeClassDeclaration() throws RecognitionException {
		ShakeClassDeclarationContext _localctx = new ShakeClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_shakeClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			shakeModifierList();
			{
			setState(304);
			((ShakeClassDeclarationContext)_localctx).class_ = match(KEYWORD_CLASS);
			}
			{
			setState(305);
			((ShakeClassDeclarationContext)_localctx).name = shakeIdentifier();
			}
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(306);
				((ShakeClassDeclarationContext)_localctx).generics = genericsDeclaration();
				}
			}

			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(309);
				match(COLON);
				{
				setState(310);
				((ShakeClassDeclarationContext)_localctx).superClasses = superClassList();
				}
				}
			}

			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURLY) {
				{
				setState(313);
				((ShakeClassDeclarationContext)_localctx).contents = shakeClassContents();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeStatementContext extends ParserRuleContext {
		public ShakeVarDeclarationContext shakeVarDeclaration() {
			return getRuleContext(ShakeVarDeclarationContext.class,0);
		}
		public ShakeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeStatementContext shakeStatement() throws RecognitionException {
		ShakeStatementContext _localctx = new ShakeStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_shakeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			shakeVarDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeVarDeclarationContext extends ParserRuleContext {
		public Token var;
		public ShakeNamespaceContext expanding;
		public ShakeIdentifierContext name;
		public Token colon;
		public ShakeTypeContext variableType;
		public Token assign;
		public ShakeValueContext value;
		public ShakeModifierListContext shakeModifierList() {
			return getRuleContext(ShakeModifierListContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ShakeParser.DOT, 0); }
		public ShakeIdentifierContext shakeIdentifier() {
			return getRuleContext(ShakeIdentifierContext.class,0);
		}
		public TerminalNode KEYWORD_VAR() { return getToken(ShakeParser.KEYWORD_VAR, 0); }
		public TerminalNode KEYWORD_VAL() { return getToken(ShakeParser.KEYWORD_VAL, 0); }
		public ShakeNamespaceContext shakeNamespace() {
			return getRuleContext(ShakeNamespaceContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ShakeParser.COLON, 0); }
		public ShakeTypeContext shakeType() {
			return getRuleContext(ShakeTypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ShakeParser.ASSIGN, 0); }
		public ShakeValueContext shakeValue() {
			return getRuleContext(ShakeValueContext.class,0);
		}
		public ShakeVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeVarDeclarationContext shakeVarDeclaration() throws RecognitionException {
		ShakeVarDeclarationContext _localctx = new ShakeVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_shakeVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			shakeModifierList();
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_VAR:
				{
				{
				setState(319);
				((ShakeVarDeclarationContext)_localctx).var = match(KEYWORD_VAR);
				}
				}
				break;
			case KEYWORD_VAL:
				{
				{
				setState(320);
				((ShakeVarDeclarationContext)_localctx).var = match(KEYWORD_VAL);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				{
				setState(323);
				((ShakeVarDeclarationContext)_localctx).expanding = shakeNamespace();
				}
				setState(324);
				match(DOT);
				}
				break;
			}
			{
			setState(328);
			((ShakeVarDeclarationContext)_localctx).name = shakeIdentifier();
			}
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				{
				setState(329);
				((ShakeVarDeclarationContext)_localctx).colon = match(COLON);
				}
				{
				setState(330);
				((ShakeVarDeclarationContext)_localctx).variableType = shakeType();
				}
				}
			}

			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				{
				setState(333);
				((ShakeVarDeclarationContext)_localctx).assign = match(ASSIGN);
				}
				{
				setState(334);
				((ShakeVarDeclarationContext)_localctx).value = shakeValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeWhileContext extends ParserRuleContext {
		public ShakeValueContext condition;
		public ShakeBlockContext body;
		public TerminalNode KEYWORD_WHILE() { return getToken(ShakeParser.KEYWORD_WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ShakeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ShakeParser.RPAREN, 0); }
		public ShakeValueContext shakeValue() {
			return getRuleContext(ShakeValueContext.class,0);
		}
		public ShakeBlockContext shakeBlock() {
			return getRuleContext(ShakeBlockContext.class,0);
		}
		public ShakeWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeWhileContext shakeWhile() throws RecognitionException {
		ShakeWhileContext _localctx = new ShakeWhileContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_shakeWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(KEYWORD_WHILE);
			setState(338);
			match(LPAREN);
			{
			setState(339);
			((ShakeWhileContext)_localctx).condition = shakeValue();
			}
			setState(340);
			match(RPAREN);
			{
			setState(341);
			((ShakeWhileContext)_localctx).body = shakeBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeDoWhileContext extends ParserRuleContext {
		public ShakeBlockContext body;
		public ShakeValueContext condition;
		public TerminalNode KEYWORD_DO() { return getToken(ShakeParser.KEYWORD_DO, 0); }
		public TerminalNode KEYWORD_WHILE() { return getToken(ShakeParser.KEYWORD_WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(ShakeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ShakeParser.RPAREN, 0); }
		public ShakeBlockContext shakeBlock() {
			return getRuleContext(ShakeBlockContext.class,0);
		}
		public ShakeValueContext shakeValue() {
			return getRuleContext(ShakeValueContext.class,0);
		}
		public ShakeDoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeDoWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeDoWhileContext shakeDoWhile() throws RecognitionException {
		ShakeDoWhileContext _localctx = new ShakeDoWhileContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_shakeDoWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(KEYWORD_DO);
			{
			setState(344);
			((ShakeDoWhileContext)_localctx).body = shakeBlock();
			}
			setState(345);
			match(KEYWORD_WHILE);
			setState(346);
			match(LPAREN);
			{
			setState(347);
			((ShakeDoWhileContext)_localctx).condition = shakeValue();
			}
			setState(348);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeForContext extends ParserRuleContext {
		public ShakeStatementContext init;
		public ShakeValueContext condition;
		public ShakeValueContext round;
		public ShakeBlockContext body;
		public TerminalNode KEYWORD_FOR() { return getToken(ShakeParser.KEYWORD_FOR, 0); }
		public TerminalNode LPAREN() { return getToken(ShakeParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(ShakeParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ShakeParser.SEMICOLON, i);
		}
		public ShakeStatementContext shakeStatement() {
			return getRuleContext(ShakeStatementContext.class,0);
		}
		public List<ShakeValueContext> shakeValue() {
			return getRuleContexts(ShakeValueContext.class);
		}
		public ShakeValueContext shakeValue(int i) {
			return getRuleContext(ShakeValueContext.class,i);
		}
		public ShakeBlockContext shakeBlock() {
			return getRuleContext(ShakeBlockContext.class,0);
		}
		public ShakeForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeForContext shakeFor() throws RecognitionException {
		ShakeForContext _localctx = new ShakeForContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_shakeFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(KEYWORD_FOR);
			setState(351);
			match(LPAREN);
			{
			setState(352);
			((ShakeForContext)_localctx).init = shakeStatement();
			}
			setState(353);
			match(SEMICOLON);
			{
			setState(354);
			((ShakeForContext)_localctx).condition = shakeValue();
			}
			setState(355);
			match(SEMICOLON);
			{
			setState(356);
			((ShakeForContext)_localctx).round = shakeValue();
			}
			{
			setState(357);
			((ShakeForContext)_localctx).body = shakeBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeIfContext extends ParserRuleContext {
		public ShakeValueContext condition;
		public ShakeBlockContext thenBlock;
		public ShakeBlockContext elseBlock;
		public TerminalNode KEYWORD_IF() { return getToken(ShakeParser.KEYWORD_IF, 0); }
		public TerminalNode LPAREN() { return getToken(ShakeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ShakeParser.RPAREN, 0); }
		public ShakeValueContext shakeValue() {
			return getRuleContext(ShakeValueContext.class,0);
		}
		public List<ShakeBlockContext> shakeBlock() {
			return getRuleContexts(ShakeBlockContext.class);
		}
		public ShakeBlockContext shakeBlock(int i) {
			return getRuleContext(ShakeBlockContext.class,i);
		}
		public TerminalNode KEYWORD_ELSE() { return getToken(ShakeParser.KEYWORD_ELSE, 0); }
		public ShakeIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeIfContext shakeIf() throws RecognitionException {
		ShakeIfContext _localctx = new ShakeIfContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_shakeIf);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(KEYWORD_IF);
				setState(360);
				match(LPAREN);
				{
				setState(361);
				((ShakeIfContext)_localctx).condition = shakeValue();
				}
				setState(362);
				match(RPAREN);
				{
				setState(363);
				((ShakeIfContext)_localctx).thenBlock = shakeBlock();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(KEYWORD_IF);
				setState(366);
				match(LPAREN);
				{
				setState(367);
				((ShakeIfContext)_localctx).condition = shakeValue();
				}
				setState(368);
				match(RPAREN);
				{
				setState(369);
				((ShakeIfContext)_localctx).thenBlock = shakeBlock();
				}
				setState(370);
				match(KEYWORD_ELSE);
				{
				setState(371);
				((ShakeIfContext)_localctx).elseBlock = shakeBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeValueContext extends ParserRuleContext {
		public ShakeAssignmentContext shakeAssignment() {
			return getRuleContext(ShakeAssignmentContext.class,0);
		}
		public ShakeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeValueContext shakeValue() throws RecognitionException {
		ShakeValueContext _localctx = new ShakeValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_shakeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			shakeAssignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeAssignmentContext extends ParserRuleContext {
		public ShakeLogicalOrContext shakeLogicalOr() {
			return getRuleContext(ShakeLogicalOrContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ShakeParser.ASSIGN, 0); }
		public ShakeAssignmentContext shakeAssignment() {
			return getRuleContext(ShakeAssignmentContext.class,0);
		}
		public TerminalNode ADD_ASSIGN() { return getToken(ShakeParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(ShakeParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(ShakeParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(ShakeParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(ShakeParser.MOD_ASSIGN, 0); }
		public TerminalNode POW_ASSIGN() { return getToken(ShakeParser.POW_ASSIGN, 0); }
		public ShakeAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeAssignmentContext shakeAssignment() throws RecognitionException {
		ShakeAssignmentContext _localctx = new ShakeAssignmentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_shakeAssignment);
		int _la;
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				shakeLogicalOr();
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(378);
					match(ASSIGN);
					setState(379);
					shakeAssignment();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				shakeLogicalOr();
				setState(383);
				match(ADD_ASSIGN);
				setState(384);
				shakeAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				shakeLogicalOr();
				setState(387);
				match(SUB_ASSIGN);
				setState(388);
				shakeAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				shakeLogicalOr();
				setState(391);
				match(MUL_ASSIGN);
				setState(392);
				shakeAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(394);
				shakeLogicalOr();
				setState(395);
				match(DIV_ASSIGN);
				setState(396);
				shakeAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(398);
				shakeLogicalOr();
				setState(399);
				match(MOD_ASSIGN);
				setState(400);
				shakeAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(402);
				shakeLogicalOr();
				setState(403);
				match(POW_ASSIGN);
				setState(404);
				shakeAssignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeLogicalOrContext extends ParserRuleContext {
		public List<ShakeLogicalXorContext> shakeLogicalXor() {
			return getRuleContexts(ShakeLogicalXorContext.class);
		}
		public ShakeLogicalXorContext shakeLogicalXor(int i) {
			return getRuleContext(ShakeLogicalXorContext.class,i);
		}
		public List<TerminalNode> LOGIC_OR() { return getTokens(ShakeParser.LOGIC_OR); }
		public TerminalNode LOGIC_OR(int i) {
			return getToken(ShakeParser.LOGIC_OR, i);
		}
		public ShakeLogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeLogicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeLogicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeLogicalOrContext shakeLogicalOr() throws RecognitionException {
		ShakeLogicalOrContext _localctx = new ShakeLogicalOrContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_shakeLogicalOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			shakeLogicalXor();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGIC_OR) {
				{
				{
				setState(409);
				match(LOGIC_OR);
				setState(410);
				shakeLogicalXor();
				}
				}
				setState(415);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeLogicalXorContext extends ParserRuleContext {
		public List<ShakeLogicalAndContext> shakeLogicalAnd() {
			return getRuleContexts(ShakeLogicalAndContext.class);
		}
		public ShakeLogicalAndContext shakeLogicalAnd(int i) {
			return getRuleContext(ShakeLogicalAndContext.class,i);
		}
		public List<TerminalNode> LOGIC_XOR() { return getTokens(ShakeParser.LOGIC_XOR); }
		public TerminalNode LOGIC_XOR(int i) {
			return getToken(ShakeParser.LOGIC_XOR, i);
		}
		public ShakeLogicalXorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeLogicalXor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeLogicalXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeLogicalXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeLogicalXor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeLogicalXorContext shakeLogicalXor() throws RecognitionException {
		ShakeLogicalXorContext _localctx = new ShakeLogicalXorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_shakeLogicalXor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			shakeLogicalAnd();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGIC_XOR) {
				{
				{
				setState(417);
				match(LOGIC_XOR);
				setState(418);
				shakeLogicalAnd();
				}
				}
				setState(423);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeLogicalAndContext extends ParserRuleContext {
		public List<ShakeBitwiseOrContext> shakeBitwiseOr() {
			return getRuleContexts(ShakeBitwiseOrContext.class);
		}
		public ShakeBitwiseOrContext shakeBitwiseOr(int i) {
			return getRuleContext(ShakeBitwiseOrContext.class,i);
		}
		public List<TerminalNode> LOGIC_AND() { return getTokens(ShakeParser.LOGIC_AND); }
		public TerminalNode LOGIC_AND(int i) {
			return getToken(ShakeParser.LOGIC_AND, i);
		}
		public ShakeLogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeLogicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeLogicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeLogicalAndContext shakeLogicalAnd() throws RecognitionException {
		ShakeLogicalAndContext _localctx = new ShakeLogicalAndContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_shakeLogicalAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			shakeBitwiseOr();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGIC_AND) {
				{
				{
				setState(425);
				match(LOGIC_AND);
				setState(426);
				shakeBitwiseOr();
				}
				}
				setState(431);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeBitwiseOrContext extends ParserRuleContext {
		public List<ShakeBitwiseXorContext> shakeBitwiseXor() {
			return getRuleContexts(ShakeBitwiseXorContext.class);
		}
		public ShakeBitwiseXorContext shakeBitwiseXor(int i) {
			return getRuleContext(ShakeBitwiseXorContext.class,i);
		}
		public List<TerminalNode> BIT_OR() { return getTokens(ShakeParser.BIT_OR); }
		public TerminalNode BIT_OR(int i) {
			return getToken(ShakeParser.BIT_OR, i);
		}
		public List<TerminalNode> BIT_NOR() { return getTokens(ShakeParser.BIT_NOR); }
		public TerminalNode BIT_NOR(int i) {
			return getToken(ShakeParser.BIT_NOR, i);
		}
		public ShakeBitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeBitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeBitwiseOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeBitwiseOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeBitwiseOrContext shakeBitwiseOr() throws RecognitionException {
		ShakeBitwiseOrContext _localctx = new ShakeBitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_shakeBitwiseOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			shakeBitwiseXor();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BIT_NOR || _la==BIT_OR) {
				{
				setState(437);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BIT_OR:
					{
					setState(433);
					match(BIT_OR);
					setState(434);
					shakeBitwiseXor();
					}
					break;
				case BIT_NOR:
					{
					setState(435);
					match(BIT_NOR);
					setState(436);
					shakeBitwiseXor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(441);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeBitwiseXorContext extends ParserRuleContext {
		public List<ShakeBitwiseAndContext> shakeBitwiseAnd() {
			return getRuleContexts(ShakeBitwiseAndContext.class);
		}
		public ShakeBitwiseAndContext shakeBitwiseAnd(int i) {
			return getRuleContext(ShakeBitwiseAndContext.class,i);
		}
		public List<TerminalNode> BIT_XOR() { return getTokens(ShakeParser.BIT_XOR); }
		public TerminalNode BIT_XOR(int i) {
			return getToken(ShakeParser.BIT_XOR, i);
		}
		public List<TerminalNode> BIT_XNOR() { return getTokens(ShakeParser.BIT_XNOR); }
		public TerminalNode BIT_XNOR(int i) {
			return getToken(ShakeParser.BIT_XNOR, i);
		}
		public ShakeBitwiseXorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeBitwiseXor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeBitwiseXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeBitwiseXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeBitwiseXor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeBitwiseXorContext shakeBitwiseXor() throws RecognitionException {
		ShakeBitwiseXorContext _localctx = new ShakeBitwiseXorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_shakeBitwiseXor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			shakeBitwiseAnd();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BIT_XNOR || _la==BIT_XOR) {
				{
				setState(447);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BIT_XOR:
					{
					setState(443);
					match(BIT_XOR);
					setState(444);
					shakeBitwiseAnd();
					}
					break;
				case BIT_XNOR:
					{
					setState(445);
					match(BIT_XNOR);
					setState(446);
					shakeBitwiseAnd();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(451);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeBitwiseAndContext extends ParserRuleContext {
		public List<ShakeEqualityContext> shakeEquality() {
			return getRuleContexts(ShakeEqualityContext.class);
		}
		public ShakeEqualityContext shakeEquality(int i) {
			return getRuleContext(ShakeEqualityContext.class,i);
		}
		public List<TerminalNode> BIT_AND() { return getTokens(ShakeParser.BIT_AND); }
		public TerminalNode BIT_AND(int i) {
			return getToken(ShakeParser.BIT_AND, i);
		}
		public List<TerminalNode> BIT_NAND() { return getTokens(ShakeParser.BIT_NAND); }
		public TerminalNode BIT_NAND(int i) {
			return getToken(ShakeParser.BIT_NAND, i);
		}
		public ShakeBitwiseAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeBitwiseAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeBitwiseAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeBitwiseAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeBitwiseAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeBitwiseAndContext shakeBitwiseAnd() throws RecognitionException {
		ShakeBitwiseAndContext _localctx = new ShakeBitwiseAndContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_shakeBitwiseAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			shakeEquality();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BIT_NAND || _la==BIT_AND) {
				{
				setState(457);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BIT_AND:
					{
					setState(453);
					match(BIT_AND);
					setState(454);
					shakeEquality();
					}
					break;
				case BIT_NAND:
					{
					setState(455);
					match(BIT_NAND);
					setState(456);
					shakeEquality();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(461);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeEqualityContext extends ParserRuleContext {
		public List<ShakeRelationContext> shakeRelation() {
			return getRuleContexts(ShakeRelationContext.class);
		}
		public ShakeRelationContext shakeRelation(int i) {
			return getRuleContext(ShakeRelationContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(ShakeParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(ShakeParser.EQUALS, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(ShakeParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(ShakeParser.NEQ, i);
		}
		public ShakeEqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeEquality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeEqualityContext shakeEquality() throws RecognitionException {
		ShakeEqualityContext _localctx = new ShakeEqualityContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_shakeEquality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			shakeRelation();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUALS || _la==NEQ) {
				{
				setState(467);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUALS:
					{
					setState(463);
					match(EQUALS);
					setState(464);
					shakeRelation();
					}
					break;
				case NEQ:
					{
					setState(465);
					match(NEQ);
					setState(466);
					shakeRelation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(471);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeRelationContext extends ParserRuleContext {
		public List<ShakeShiftContext> shakeShift() {
			return getRuleContexts(ShakeShiftContext.class);
		}
		public ShakeShiftContext shakeShift(int i) {
			return getRuleContext(ShakeShiftContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(ShakeParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ShakeParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(ShakeParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ShakeParser.GT, i);
		}
		public List<TerminalNode> LTE() { return getTokens(ShakeParser.LTE); }
		public TerminalNode LTE(int i) {
			return getToken(ShakeParser.LTE, i);
		}
		public List<TerminalNode> GTE() { return getTokens(ShakeParser.GTE); }
		public TerminalNode GTE(int i) {
			return getToken(ShakeParser.GTE, i);
		}
		public ShakeRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeRelationContext shakeRelation() throws RecognitionException {
		ShakeRelationContext _localctx = new ShakeRelationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_shakeRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			shakeShift();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 27L) != 0)) {
				{
				setState(481);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(473);
					match(LT);
					setState(474);
					shakeShift();
					}
					break;
				case GT:
					{
					setState(475);
					match(GT);
					setState(476);
					shakeShift();
					}
					break;
				case LTE:
					{
					setState(477);
					match(LTE);
					setState(478);
					shakeShift();
					}
					break;
				case GTE:
					{
					setState(479);
					match(GTE);
					setState(480);
					shakeShift();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(485);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeShiftContext extends ParserRuleContext {
		public List<ShakeAdditionContext> shakeAddition() {
			return getRuleContexts(ShakeAdditionContext.class);
		}
		public ShakeAdditionContext shakeAddition(int i) {
			return getRuleContext(ShakeAdditionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(ShakeParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ShakeParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(ShakeParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ShakeParser.GT, i);
		}
		public ShakeShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeShift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeShift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeShiftContext shakeShift() throws RecognitionException {
		ShakeShiftContext _localctx = new ShakeShiftContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_shakeShift);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			shakeAddition();
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(497);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						setState(487);
						match(LT);
						setState(488);
						match(LT);
						setState(489);
						shakeAddition();
						}
						break;
					case 2:
						{
						setState(490);
						match(GT);
						setState(491);
						match(GT);
						setState(492);
						shakeAddition();
						}
						break;
					case 3:
						{
						setState(493);
						match(GT);
						setState(494);
						match(GT);
						setState(495);
						match(GT);
						setState(496);
						shakeAddition();
						}
						break;
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeAdditionContext extends ParserRuleContext {
		public List<ShakeMultiplicationContext> shakeMultiplication() {
			return getRuleContexts(ShakeMultiplicationContext.class);
		}
		public ShakeMultiplicationContext shakeMultiplication(int i) {
			return getRuleContext(ShakeMultiplicationContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(ShakeParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(ShakeParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ShakeParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ShakeParser.SUB, i);
		}
		public ShakeAdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeAddition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeAdditionContext shakeAddition() throws RecognitionException {
		ShakeAdditionContext _localctx = new ShakeAdditionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_shakeAddition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			shakeMultiplication();
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(507);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADD:
						{
						setState(503);
						match(ADD);
						setState(504);
						shakeMultiplication();
						}
						break;
					case SUB:
						{
						setState(505);
						match(SUB);
						setState(506);
						shakeMultiplication();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeMultiplicationContext extends ParserRuleContext {
		public List<ShakePowerContext> shakePower() {
			return getRuleContexts(ShakePowerContext.class);
		}
		public ShakePowerContext shakePower(int i) {
			return getRuleContext(ShakePowerContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(ShakeParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ShakeParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ShakeParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ShakeParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(ShakeParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(ShakeParser.MOD, i);
		}
		public ShakeMultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeMultiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeMultiplicationContext shakeMultiplication() throws RecognitionException {
		ShakeMultiplicationContext _localctx = new ShakeMultiplicationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_shakeMultiplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			shakePower();
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 7L) != 0)) {
				{
				setState(519);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MUL:
					{
					setState(513);
					match(MUL);
					setState(514);
					shakePower();
					}
					break;
				case DIV:
					{
					setState(515);
					match(DIV);
					setState(516);
					shakePower();
					}
					break;
				case MOD:
					{
					setState(517);
					match(MOD);
					setState(518);
					shakePower();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(523);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakePowerContext extends ParserRuleContext {
		public List<ShakeCastContext> shakeCast() {
			return getRuleContexts(ShakeCastContext.class);
		}
		public ShakeCastContext shakeCast(int i) {
			return getRuleContext(ShakeCastContext.class,i);
		}
		public List<TerminalNode> POW() { return getTokens(ShakeParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(ShakeParser.POW, i);
		}
		public ShakePowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakePower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakePower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakePower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakePower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakePowerContext shakePower() throws RecognitionException {
		ShakePowerContext _localctx = new ShakePowerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_shakePower);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			shakeCast();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POW) {
				{
				{
				setState(525);
				match(POW);
				setState(526);
				shakeCast();
				}
				}
				setState(531);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeCastContext extends ParserRuleContext {
		public ShakeAccessContext shakeAccess() {
			return getRuleContext(ShakeAccessContext.class,0);
		}
		public TerminalNode KEYWORD_AS() { return getToken(ShakeParser.KEYWORD_AS, 0); }
		public ShakeTypeContext shakeType() {
			return getRuleContext(ShakeTypeContext.class,0);
		}
		public ShakeCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeCastContext shakeCast() throws RecognitionException {
		ShakeCastContext _localctx = new ShakeCastContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_shakeCast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			shakeAccess();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_AS) {
				{
				setState(533);
				match(KEYWORD_AS);
				setState(534);
				shakeType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeAccessContext extends ParserRuleContext {
		public ShakeMandoryContext shakeMandory() {
			return getRuleContext(ShakeMandoryContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(ShakeParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ShakeParser.DOT, i);
		}
		public List<ShakeAccessContext> shakeAccess() {
			return getRuleContexts(ShakeAccessContext.class);
		}
		public ShakeAccessContext shakeAccess(int i) {
			return getRuleContext(ShakeAccessContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(ShakeParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ShakeParser.LBRACK, i);
		}
		public List<ShakeValueContext> shakeValue() {
			return getRuleContexts(ShakeValueContext.class);
		}
		public ShakeValueContext shakeValue(int i) {
			return getRuleContext(ShakeValueContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ShakeParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ShakeParser.RBRACK, i);
		}
		public List<ShakeArgumentsContext> shakeArguments() {
			return getRuleContexts(ShakeArgumentsContext.class);
		}
		public ShakeArgumentsContext shakeArguments(int i) {
			return getRuleContext(ShakeArgumentsContext.class,i);
		}
		public List<ShakeTypeArgumentsContext> shakeTypeArguments() {
			return getRuleContexts(ShakeTypeArgumentsContext.class);
		}
		public ShakeTypeArgumentsContext shakeTypeArguments(int i) {
			return getRuleContext(ShakeTypeArgumentsContext.class,i);
		}
		public ShakeAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeAccessContext shakeAccess() throws RecognitionException {
		ShakeAccessContext _localctx = new ShakeAccessContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_shakeAccess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			shakeMandory(0);
			setState(550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(548);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						setState(538);
						match(DOT);
						setState(539);
						shakeAccess();
						}
						break;
					case LBRACK:
						{
						setState(540);
						match(LBRACK);
						setState(541);
						shakeValue();
						setState(542);
						match(RBRACK);
						}
						break;
					case LPAREN:
						{
						setState(544);
						shakeArguments();
						setState(546);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
						case 1:
							{
							setState(545);
							shakeTypeArguments();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeMandoryContext extends ParserRuleContext {
		public ShakeSignContext shakeSign() {
			return getRuleContext(ShakeSignContext.class,0);
		}
		public TerminalNode INCR() { return getToken(ShakeParser.INCR, 0); }
		public ShakeMandoryContext shakeMandory() {
			return getRuleContext(ShakeMandoryContext.class,0);
		}
		public TerminalNode DECR() { return getToken(ShakeParser.DECR, 0); }
		public ShakeMandoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeMandory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeMandory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeMandory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeMandory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeMandoryContext shakeMandory() throws RecognitionException {
		return shakeMandory(0);
	}

	private ShakeMandoryContext shakeMandory(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShakeMandoryContext _localctx = new ShakeMandoryContext(_ctx, _parentState);
		ShakeMandoryContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_shakeMandory, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case HEX_NUMBER:
			case OCT_NUMBER:
			case BIN_NUMBER:
			case INTEGER:
			case KEYWORD_FALSE:
			case KEYWORD_SUPER:
			case KEYWORD_THIS:
			case KEYWORD_TRUE:
			case IDENTIFIER:
			case IDENTIFIER2:
			case STRING:
			case CHAR:
			case SUB:
			case ADD:
			case LOGIC_NOT:
			case BIT_NOT:
			case LPAREN:
				{
				setState(554);
				shakeSign();
				}
				break;
			case INCR:
				{
				setState(555);
				match(INCR);
				setState(556);
				shakeMandory(4);
				}
				break;
			case DECR:
				{
				setState(557);
				match(DECR);
				setState(558);
				shakeMandory(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(565);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						_localctx = new ShakeMandoryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shakeMandory);
						setState(561);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(562);
						match(INCR);
						}
						break;
					case 2:
						{
						_localctx = new ShakeMandoryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shakeMandory);
						setState(563);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(564);
						match(DECR);
						}
						break;
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeSignContext extends ParserRuleContext {
		public ShakePriorityContext shakePriority() {
			return getRuleContext(ShakePriorityContext.class,0);
		}
		public TerminalNode SUB() { return getToken(ShakeParser.SUB, 0); }
		public ShakeSignContext shakeSign() {
			return getRuleContext(ShakeSignContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ShakeParser.ADD, 0); }
		public TerminalNode LOGIC_NOT() { return getToken(ShakeParser.LOGIC_NOT, 0); }
		public TerminalNode BIT_NOT() { return getToken(ShakeParser.BIT_NOT, 0); }
		public ShakeSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeSignContext shakeSign() throws RecognitionException {
		ShakeSignContext _localctx = new ShakeSignContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_shakeSign);
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case HEX_NUMBER:
			case OCT_NUMBER:
			case BIN_NUMBER:
			case INTEGER:
			case KEYWORD_FALSE:
			case KEYWORD_SUPER:
			case KEYWORD_THIS:
			case KEYWORD_TRUE:
			case IDENTIFIER:
			case IDENTIFIER2:
			case STRING:
			case CHAR:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				shakePriority();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(SUB);
				setState(572);
				shakeSign();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				match(ADD);
				setState(574);
				shakeSign();
				}
				break;
			case LOGIC_NOT:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
				match(LOGIC_NOT);
				setState(576);
				shakeSign();
				}
				break;
			case BIT_NOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(577);
				match(BIT_NOT);
				setState(578);
				shakeSign();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakePriorityContext extends ParserRuleContext {
		public ShakeLiteralContext shakeLiteral() {
			return getRuleContext(ShakeLiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ShakeParser.LPAREN, 0); }
		public ShakeValueContext shakeValue() {
			return getRuleContext(ShakeValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ShakeParser.RPAREN, 0); }
		public ShakePriorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakePriority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakePriority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakePriority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakePriority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakePriorityContext shakePriority() throws RecognitionException {
		ShakePriorityContext _localctx = new ShakePriorityContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_shakePriority);
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case HEX_NUMBER:
			case OCT_NUMBER:
			case BIN_NUMBER:
			case INTEGER:
			case KEYWORD_FALSE:
			case KEYWORD_SUPER:
			case KEYWORD_THIS:
			case KEYWORD_TRUE:
			case IDENTIFIER:
			case IDENTIFIER2:
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				shakeLiteral();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				match(LPAREN);
				setState(583);
				shakeValue();
				setState(584);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShakeLiteralContext extends ParserRuleContext {
		public Token literal;
		public TerminalNode CHAR() { return getToken(ShakeParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(ShakeParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(ShakeParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(ShakeParser.FLOAT, 0); }
		public TerminalNode BIN_NUMBER() { return getToken(ShakeParser.BIN_NUMBER, 0); }
		public TerminalNode HEX_NUMBER() { return getToken(ShakeParser.HEX_NUMBER, 0); }
		public TerminalNode OCT_NUMBER() { return getToken(ShakeParser.OCT_NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ShakeParser.IDENTIFIER, 0); }
		public TerminalNode IDENTIFIER2() { return getToken(ShakeParser.IDENTIFIER2, 0); }
		public TerminalNode KEYWORD_TRUE() { return getToken(ShakeParser.KEYWORD_TRUE, 0); }
		public TerminalNode KEYWORD_FALSE() { return getToken(ShakeParser.KEYWORD_FALSE, 0); }
		public TerminalNode KEYWORD_THIS() { return getToken(ShakeParser.KEYWORD_THIS, 0); }
		public TerminalNode KEYWORD_SUPER() { return getToken(ShakeParser.KEYWORD_SUPER, 0); }
		public ShakeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shakeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).enterShakeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShakeParserListener ) ((ShakeParserListener)listener).exitShakeLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShakeParserVisitor ) return ((ShakeParserVisitor<? extends T>)visitor).visitShakeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShakeLiteralContext shakeLiteral() throws RecognitionException {
		ShakeLiteralContext _localctx = new ShakeLiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_shakeLiteral);
		try {
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(588);
				((ShakeLiteralContext)_localctx).literal = match(CHAR);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(589);
				((ShakeLiteralContext)_localctx).literal = match(STRING);
				}
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(590);
				((ShakeLiteralContext)_localctx).literal = match(INTEGER);
				}
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(591);
				((ShakeLiteralContext)_localctx).literal = match(FLOAT);
				}
				}
				break;
			case BIN_NUMBER:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(592);
				((ShakeLiteralContext)_localctx).literal = match(BIN_NUMBER);
				}
				}
				break;
			case HEX_NUMBER:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(593);
				((ShakeLiteralContext)_localctx).literal = match(HEX_NUMBER);
				}
				}
				break;
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(594);
				((ShakeLiteralContext)_localctx).literal = match(OCT_NUMBER);
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(595);
				((ShakeLiteralContext)_localctx).literal = match(IDENTIFIER);
				}
				}
				break;
			case IDENTIFIER2:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(596);
				((ShakeLiteralContext)_localctx).literal = match(IDENTIFIER2);
				}
				}
				break;
			case KEYWORD_TRUE:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(597);
				((ShakeLiteralContext)_localctx).literal = match(KEYWORD_TRUE);
				}
				}
				break;
			case KEYWORD_FALSE:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(598);
				((ShakeLiteralContext)_localctx).literal = match(KEYWORD_FALSE);
				}
				}
				break;
			case KEYWORD_THIS:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(599);
				((ShakeLiteralContext)_localctx).literal = match(KEYWORD_THIS);
				}
				}
				break;
			case KEYWORD_SUPER:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(600);
				((ShakeLiteralContext)_localctx).literal = match(KEYWORD_SUPER);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 48:
			return shakeMandory_sempred((ShakeMandoryContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean shakeMandory_sempred(ShakeMandoryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001[\u025c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0003\u0000k\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0005\u0002p\b\u0002\n\u0002\f\u0002s\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003z\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004~\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0083\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u0089\b\u0006\n\u0006\f\u0006\u008c"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u0094\b\u0007\n\u0007\f\u0007\u0097\t\u0007\u0003\u0007"+
		"\u0099\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0005\t\u00a3\b\t\n\t\f\t\u00a6\t\t\u0001\t\u0001\t\u0003"+
		"\t\u00aa\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00b3\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00bb\b\f\u0005\f\u00bd\b\f\n\f\f\f\u00c0\t"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00cc\b\u000e\u0005\u000e"+
		"\u00ce\b\u000e\n\u000e\f\u000e\u00d1\t\u000e\u0003\u000e\u00d3\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0005\u000f\u00d8\b\u000f\n\u000f"+
		"\f\u000f\u00db\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00e2\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00ed\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00f2\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00f8\b\u0013\u0001\u0013\u0003\u0013\u00fb\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0100\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0105\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u010a\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010e\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0113\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0117\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u011d\b\u0016\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u0121\b\u0017\n\u0017\f\u0017\u0124\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u012b\b\u0018\n\u0018\f\u0018"+
		"\u012e\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0134\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0138\b\u0019\u0001"+
		"\u0019\u0003\u0019\u013b\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0142\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0147\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u014c\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0150\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0176\b\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0003!\u017d"+
		"\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u0197\b!\u0001\"\u0001\"\u0001\""+
		"\u0005\"\u019c\b\"\n\"\f\"\u019f\t\"\u0001#\u0001#\u0001#\u0005#\u01a4"+
		"\b#\n#\f#\u01a7\t#\u0001$\u0001$\u0001$\u0005$\u01ac\b$\n$\f$\u01af\t"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u01b6\b%\n%\f%\u01b9\t%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0005&\u01c0\b&\n&\f&\u01c3\t&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0005\'\u01ca\b\'\n\'\f\'\u01cd\t\'\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0005(\u01d4\b(\n(\f(\u01d7\t(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u01e2\b)\n)"+
		"\f)\u01e5\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0005*\u01f2\b*\n*\f*\u01f5\t*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0005+\u01fc\b+\n+\f+\u01ff\t+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0005,\u0208\b,\n,\f,\u020b\t,\u0001-\u0001-\u0001-\u0005"+
		"-\u0210\b-\n-\f-\u0213\t-\u0001.\u0001.\u0001.\u0003.\u0218\b.\u0001/"+
		"\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0223"+
		"\b/\u0005/\u0225\b/\n/\f/\u0228\t/\u00010\u00010\u00010\u00010\u00010"+
		"\u00010\u00030\u0230\b0\u00010\u00010\u00010\u00010\u00050\u0236\b0\n"+
		"0\f0\u0239\t0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011"+
		"\u00011\u00031\u0244\b1\u00012\u00012\u00012\u00012\u00012\u00032\u024b"+
		"\b2\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00033\u025a\b3\u00013\u0000\u0001`4\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\u0001\b\u0000\f\f\u0015\u0015"+
		"\u001b\u001b\u001e\u001e!\"$&((**\u028c\u0000j\u0001\u0000\u0000\u0000"+
		"\u0002l\u0001\u0000\u0000\u0000\u0004q\u0001\u0000\u0000\u0000\u0006y"+
		"\u0001\u0000\u0000\u0000\b{\u0001\u0000\u0000\u0000\n\u007f\u0001\u0000"+
		"\u0000\u0000\f\u0084\u0001\u0000\u0000\u0000\u000e\u008f\u0001\u0000\u0000"+
		"\u0000\u0010\u009c\u0001\u0000\u0000\u0000\u0012\u00a9\u0001\u0000\u0000"+
		"\u0000\u0014\u00ab\u0001\u0000\u0000\u0000\u0016\u00b2\u0001\u0000\u0000"+
		"\u0000\u0018\u00b4\u0001\u0000\u0000\u0000\u001a\u00c3\u0001\u0000\u0000"+
		"\u0000\u001c\u00c5\u0001\u0000\u0000\u0000\u001e\u00d9\u0001\u0000\u0000"+
		"\u0000 \u00e1\u0001\u0000\u0000\u0000\"\u00e3\u0001\u0000\u0000\u0000"+
		"$\u00e6\u0001\u0000\u0000\u0000&\u00e9\u0001\u0000\u0000\u0000(\u00fc"+
		"\u0001\u0000\u0000\u0000*\u010f\u0001\u0000\u0000\u0000,\u011c\u0001\u0000"+
		"\u0000\u0000.\u011e\u0001\u0000\u0000\u00000\u0127\u0001\u0000\u0000\u0000"+
		"2\u012f\u0001\u0000\u0000\u00004\u013c\u0001\u0000\u0000\u00006\u013e"+
		"\u0001\u0000\u0000\u00008\u0151\u0001\u0000\u0000\u0000:\u0157\u0001\u0000"+
		"\u0000\u0000<\u015e\u0001\u0000\u0000\u0000>\u0175\u0001\u0000\u0000\u0000"+
		"@\u0177\u0001\u0000\u0000\u0000B\u0196\u0001\u0000\u0000\u0000D\u0198"+
		"\u0001\u0000\u0000\u0000F\u01a0\u0001\u0000\u0000\u0000H\u01a8\u0001\u0000"+
		"\u0000\u0000J\u01b0\u0001\u0000\u0000\u0000L\u01ba\u0001\u0000\u0000\u0000"+
		"N\u01c4\u0001\u0000\u0000\u0000P\u01ce\u0001\u0000\u0000\u0000R\u01d8"+
		"\u0001\u0000\u0000\u0000T\u01e6\u0001\u0000\u0000\u0000V\u01f6\u0001\u0000"+
		"\u0000\u0000X\u0200\u0001\u0000\u0000\u0000Z\u020c\u0001\u0000\u0000\u0000"+
		"\\\u0214\u0001\u0000\u0000\u0000^\u0219\u0001\u0000\u0000\u0000`\u022f"+
		"\u0001\u0000\u0000\u0000b\u0243\u0001\u0000\u0000\u0000d\u024a\u0001\u0000"+
		"\u0000\u0000f\u0259\u0001\u0000\u0000\u0000hk\u00050\u0000\u0000ik\u0005"+
		"1\u0000\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000k\u0001"+
		"\u0001\u0000\u0000\u0000lm\u0007\u0000\u0000\u0000m\u0003\u0001\u0000"+
		"\u0000\u0000np\u0003\u0002\u0001\u0000on\u0001\u0000\u0000\u0000ps\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"r\u0005\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tz\u0003\u0000"+
		"\u0000\u0000uv\u0003\u0000\u0000\u0000vw\u0005\u0006\u0000\u0000wx\u0003"+
		"\u0006\u0003\u0000xz\u0001\u0000\u0000\u0000yt\u0001\u0000\u0000\u0000"+
		"yu\u0001\u0000\u0000\u0000z\u0007\u0001\u0000\u0000\u0000{}\u0003\u0006"+
		"\u0003\u0000|~\u0003\u001c\u000e\u0000}|\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\t\u0001\u0000\u0000\u0000\u007f\u0082\u0003\u0000"+
		"\u0000\u0000\u0080\u0081\u0005\u0005\u0000\u0000\u0081\u0083\u0003\b\u0004"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u000b\u0001\u0000\u0000\u0000\u0084\u0085\u0005L\u0000\u0000"+
		"\u0085\u008a\u0003\n\u0005\u0000\u0086\u0087\u0005\u0004\u0000\u0000\u0087"+
		"\u0089\u0003\n\u0005\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008c"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0005K\u0000\u0000\u008e\r\u0001"+
		"\u0000\u0000\u0000\u008f\u0098\u0005V\u0000\u0000\u0090\u0095\u0003\u0010"+
		"\b\u0000\u0091\u0092\u0005\u0004\u0000\u0000\u0092\u0094\u0003\u0010\b"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0098\u0090\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0005W\u0000\u0000"+
		"\u009b\u000f\u0001\u0000\u0000\u0000\u009c\u009d\u0003\u0000\u0000\u0000"+
		"\u009d\u009e\u0005\u0005\u0000\u0000\u009e\u009f\u0003\b\u0004\u0000\u009f"+
		"\u0011\u0001\u0000\u0000\u0000\u00a0\u00a4\u0005X\u0000\u0000\u00a1\u00a3"+
		"\u0003\u0014\n\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a7\u00aa\u0005Y\u0000\u0000\u00a8\u00aa\u0003\u0014"+
		"\n\u0000\u00a9\u00a0\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000"+
		"\u0000\u00aa\u0013\u0001\u0000\u0000\u0000\u00ab\u00ac\u00034\u001a\u0000"+
		"\u00ac\u0015\u0001\u0000\u0000\u0000\u00ad\u00b3\u0003@ \u0000\u00ae\u00af"+
		"\u0003\u0000\u0000\u0000\u00af\u00b0\u0005U\u0000\u0000\u00b0\u00b1\u0003"+
		"@ \u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b3\u0017\u0001\u0000\u0000"+
		"\u0000\u00b4\u00be\u0005V\u0000\u0000\u00b5\u00b6\u0003\u0016\u000b\u0000"+
		"\u00b6\u00b7\u0005\u0004\u0000\u0000\u00b7\u00b8\u0003\u0016\u000b\u0000"+
		"\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00bb\u0005\u0004\u0000\u0000"+
		"\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b5\u0001\u0000\u0000\u0000"+
		"\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005W\u0000\u0000\u00c2"+
		"\u0019\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003\b\u0004\u0000\u00c4\u001b"+
		"\u0001\u0000\u0000\u0000\u00c5\u00d2\u0005L\u0000\u0000\u00c6\u00cf\u0003"+
		"\u001a\r\u0000\u00c7\u00c8\u0005\u0004\u0000\u0000\u00c8\u00c9\u0003\u001a"+
		"\r\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00cc\u0005\u0004\u0000"+
		"\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00c7\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00c6\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005K\u0000\u0000\u00d5\u001d\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d8\u0003 \u0010\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8"+
		"\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0001\u0000\u0000\u0000\u00da\u001f\u0001\u0000\u0000\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00dc\u00e2\u0003\"\u0011\u0000\u00dd\u00e2"+
		"\u0003$\u0012\u0000\u00de\u00e2\u0003&\u0013\u0000\u00df\u00e2\u0003("+
		"\u0014\u0000\u00e0\u00e2\u00032\u0019\u0000\u00e1\u00dc\u0001\u0000\u0000"+
		"\u0000\u00e1\u00dd\u0001\u0000\u0000\u0000\u00e1\u00de\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2!\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005#\u0000\u0000\u00e4"+
		"\u00e5\u0003\u0006\u0003\u0000\u00e5#\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0005\u0019\u0000\u0000\u00e7\u00e8\u0003\u0006\u0003\u0000\u00e8%\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0003\u0004\u0002\u0000\u00ea\u00ec\u0005"+
		"\u0017\u0000\u0000\u00eb\u00ed\u0003\f\u0006\u0000\u00ec\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00f1\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0003\u0006\u0003\u0000\u00ef\u00f0\u0005\u0006"+
		"\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0003\u0000\u0000\u0000\u00f4\u00f7\u0003\u000e"+
		"\u0007\u0000\u00f5\u00f6\u0005\u0005\u0000\u0000\u00f6\u00f8\u0003\b\u0004"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00fb\u0003\u0012\t\u0000"+
		"\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\'\u0001\u0000\u0000\u0000\u00fc\u00ff\u0003\u0004\u0002\u0000\u00fd"+
		"\u0100\u0005.\u0000\u0000\u00fe\u0100\u0005-\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0104\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0003\u0006\u0003\u0000\u0102\u0103\u0005"+
		"\u0006\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u0101\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0001"+
		"\u0000\u0000\u0000\u0106\u0109\u0003\u0000\u0000\u0000\u0107\u0108\u0005"+
		"\u0005\u0000\u0000\u0108\u010a\u0003\b\u0004\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0005U\u0000\u0000\u010c\u010e\u0003@ \u0000"+
		"\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e)\u0001\u0000\u0000\u0000\u010f\u0110\u0003\u0004\u0002\u0000\u0110"+
		"\u0112\u0005\u0010\u0000\u0000\u0111\u0113\u0003\u0000\u0000\u0000\u0112"+
		"\u0111\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0001\u0000\u0000\u0000\u0114\u0116\u0003\u000e\u0007\u0000\u0115"+
		"\u0117\u0003\u0012\t\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0116\u0117"+
		"\u0001\u0000\u0000\u0000\u0117+\u0001\u0000\u0000\u0000\u0118\u011d\u0003"+
		"(\u0014\u0000\u0119\u011d\u0003&\u0013\u0000\u011a\u011d\u0003*\u0015"+
		"\u0000\u011b\u011d\u00032\u0019\u0000\u011c\u0118\u0001\u0000\u0000\u0000"+
		"\u011c\u0119\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011c\u011b\u0001\u0000\u0000\u0000\u011d-\u0001\u0000\u0000\u0000\u011e"+
		"\u0122\u0005X\u0000\u0000\u011f\u0121\u0003,\u0016\u0000\u0120\u011f\u0001"+
		"\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0125\u0001"+
		"\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0126\u0005"+
		"Y\u0000\u0000\u0126/\u0001\u0000\u0000\u0000\u0127\u012c\u0003\b\u0004"+
		"\u0000\u0128\u0129\u0005\u0004\u0000\u0000\u0129\u012b\u0003\b\u0004\u0000"+
		"\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000"+
		"\u012d1\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0003\u0004\u0002\u0000\u0130\u0131\u0005\u000e\u0000\u0000\u0131"+
		"\u0133\u0003\u0000\u0000\u0000\u0132\u0134\u0003\f\u0006\u0000\u0133\u0132"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0137"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0005\u0000\u0000\u0136\u0138"+
		"\u00030\u0018\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u013b\u0003"+
		".\u0017\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b3\u0001\u0000\u0000\u0000\u013c\u013d\u00036\u001b\u0000"+
		"\u013d5\u0001\u0000\u0000\u0000\u013e\u0141\u0003\u0004\u0002\u0000\u013f"+
		"\u0142\u0005.\u0000\u0000\u0140\u0142\u0005-\u0000\u0000\u0141\u013f\u0001"+
		"\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0146\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0003\u0006\u0003\u0000\u0144\u0145\u0005"+
		"\u0006\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0143\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0001"+
		"\u0000\u0000\u0000\u0148\u014b\u0003\u0000\u0000\u0000\u0149\u014a\u0005"+
		"\u0005\u0000\u0000\u014a\u014c\u0003\b\u0004\u0000\u014b\u0149\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0005U\u0000\u0000\u014e\u0150\u0003@ \u0000"+
		"\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000"+
		"\u01507\u0001\u0000\u0000\u0000\u0151\u0152\u0005/\u0000\u0000\u0152\u0153"+
		"\u0005V\u0000\u0000\u0153\u0154\u0003@ \u0000\u0154\u0155\u0005W\u0000"+
		"\u0000\u0155\u0156\u0003\u0012\t\u0000\u01569\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0005\u0011\u0000\u0000\u0158\u0159\u0003\u0012\t\u0000\u0159"+
		"\u015a\u0005/\u0000\u0000\u015a\u015b\u0005V\u0000\u0000\u015b\u015c\u0003"+
		"@ \u0000\u015c\u015d\u0005W\u0000\u0000\u015d;\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0005\u0016\u0000\u0000\u015f\u0160\u0005V\u0000\u0000\u0160"+
		"\u0161\u00034\u001a\u0000\u0161\u0162\u0005\u0003\u0000\u0000\u0162\u0163"+
		"\u0003@ \u0000\u0163\u0164\u0005\u0003\u0000\u0000\u0164\u0165\u0003@"+
		" \u0000\u0165\u0166\u0003\u0012\t\u0000\u0166=\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0005\u0018\u0000\u0000\u0168\u0169\u0005V\u0000\u0000\u0169"+
		"\u016a\u0003@ \u0000\u016a\u016b\u0005W\u0000\u0000\u016b\u016c\u0003"+
		"\u0012\t\u0000\u016c\u0176\u0001\u0000\u0000\u0000\u016d\u016e\u0005\u0018"+
		"\u0000\u0000\u016e\u016f\u0005V\u0000\u0000\u016f\u0170\u0003@ \u0000"+
		"\u0170\u0171\u0005W\u0000\u0000\u0171\u0172\u0003\u0012\t\u0000\u0172"+
		"\u0173\u0005\u0012\u0000\u0000\u0173\u0174\u0003\u0012\t\u0000\u0174\u0176"+
		"\u0001\u0000\u0000\u0000\u0175\u0167\u0001\u0000\u0000\u0000\u0175\u016d"+
		"\u0001\u0000\u0000\u0000\u0176?\u0001\u0000\u0000\u0000\u0177\u0178\u0003"+
		"B!\u0000\u0178A\u0001\u0000\u0000\u0000\u0179\u017c\u0003D\"\u0000\u017a"+
		"\u017b\u0005U\u0000\u0000\u017b\u017d\u0003B!\u0000\u017c\u017a\u0001"+
		"\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u0197\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0003D\"\u0000\u017f\u0180\u0005;\u0000"+
		"\u0000\u0180\u0181\u0003B!\u0000\u0181\u0197\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0003D\"\u0000\u0183\u0184\u0005:\u0000\u0000\u0184\u0185\u0003"+
		"B!\u0000\u0185\u0197\u0001\u0000\u0000\u0000\u0186\u0187\u0003D\"\u0000"+
		"\u0187\u0188\u00059\u0000\u0000\u0188\u0189\u0003B!\u0000\u0189\u0197"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0003D\"\u0000\u018b\u018c\u0005"+
		"8\u0000\u0000\u018c\u018d\u0003B!\u0000\u018d\u0197\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0003D\"\u0000\u018f\u0190\u00057\u0000\u0000\u0190"+
		"\u0191\u0003B!\u0000\u0191\u0197\u0001\u0000\u0000\u0000\u0192\u0193\u0003"+
		"D\"\u0000\u0193\u0194\u00056\u0000\u0000\u0194\u0195\u0003B!\u0000\u0195"+
		"\u0197\u0001\u0000\u0000\u0000\u0196\u0179\u0001\u0000\u0000\u0000\u0196"+
		"\u017e\u0001\u0000\u0000\u0000\u0196\u0182\u0001\u0000\u0000\u0000\u0196"+
		"\u0186\u0001\u0000\u0000\u0000\u0196\u018a\u0001\u0000\u0000\u0000\u0196"+
		"\u018e\u0001\u0000\u0000\u0000\u0196\u0192\u0001\u0000\u0000\u0000\u0197"+
		"C\u0001\u0000\u0000\u0000\u0198\u019d\u0003F#\u0000\u0199\u019a\u0005"+
		"D\u0000\u0000\u019a\u019c\u0003F#\u0000\u019b\u0199\u0001\u0000\u0000"+
		"\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019eE\u0001\u0000\u0000\u0000"+
		"\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a5\u0003H$\u0000\u01a1\u01a2"+
		"\u0005F\u0000\u0000\u01a2\u01a4\u0003H$\u0000\u01a3\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6G\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ad\u0003J%\u0000\u01a9"+
		"\u01aa\u0005E\u0000\u0000\u01aa\u01ac\u0003J%\u0000\u01ab\u01a9\u0001"+
		"\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01aeI\u0001\u0000"+
		"\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b7\u0003L&\u0000"+
		"\u01b1\u01b2\u0005S\u0000\u0000\u01b2\u01b6\u0003L&\u0000\u01b3\u01b4"+
		"\u0005O\u0000\u0000\u01b4\u01b6\u0003L&\u0000\u01b5\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b8K\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000"+
		"\u0000\u01ba\u01c1\u0003N\'\u0000\u01bb\u01bc\u0005T\u0000\u0000\u01bc"+
		"\u01c0\u0003N\'\u0000\u01bd\u01be\u0005P\u0000\u0000\u01be\u01c0\u0003"+
		"N\'\u0000\u01bf\u01bb\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2M\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c4\u01cb\u0003P(\u0000\u01c5"+
		"\u01c6\u0005R\u0000\u0000\u01c6\u01ca\u0003P(\u0000\u01c7\u01c8\u0005"+
		"N\u0000\u0000\u01c8\u01ca\u0003P(\u0000\u01c9\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000"+
		"\u0000\u01ccO\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000"+
		"\u01ce\u01d5\u0003R)\u0000\u01cf\u01d0\u0005G\u0000\u0000\u01d0\u01d4"+
		"\u0003R)\u0000\u01d1\u01d2\u0005J\u0000\u0000\u01d2\u01d4\u0003R)\u0000"+
		"\u01d3\u01cf\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6Q\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d8\u01e3\u0003T*\u0000\u01d9\u01da\u0005"+
		"L\u0000\u0000\u01da\u01e2\u0003T*\u0000\u01db\u01dc\u0005K\u0000\u0000"+
		"\u01dc\u01e2\u0003T*\u0000\u01dd\u01de\u0005I\u0000\u0000\u01de\u01e2"+
		"\u0003T*\u0000\u01df\u01e0\u0005H\u0000\u0000\u01e0\u01e2\u0003T*\u0000"+
		"\u01e1\u01d9\u0001\u0000\u0000\u0000\u01e1\u01db\u0001\u0000\u0000\u0000"+
		"\u01e1\u01dd\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e5\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4S\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e6\u01f3\u0003V+\u0000\u01e7\u01e8\u0005"+
		"L\u0000\u0000\u01e8\u01e9\u0005L\u0000\u0000\u01e9\u01f2\u0003V+\u0000"+
		"\u01ea\u01eb\u0005K\u0000\u0000\u01eb\u01ec\u0005K\u0000\u0000\u01ec\u01f2"+
		"\u0003V+\u0000\u01ed\u01ee\u0005K\u0000\u0000\u01ee\u01ef\u0005K\u0000"+
		"\u0000\u01ef\u01f0\u0005K\u0000\u0000\u01f0\u01f2\u0003V+\u0000\u01f1"+
		"\u01e7\u0001\u0000\u0000\u0000\u01f1\u01ea\u0001\u0000\u0000\u0000\u01f1"+
		"\u01ed\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4"+
		"U\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01fd"+
		"\u0003X,\u0000\u01f7\u01f8\u0005C\u0000\u0000\u01f8\u01fc\u0003X,\u0000"+
		"\u01f9\u01fa\u0005B\u0000\u0000\u01fa\u01fc\u0003X,\u0000\u01fb\u01f7"+
		"\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01ff"+
		"\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0001\u0000\u0000\u0000\u01feW\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001"+
		"\u0000\u0000\u0000\u0200\u0209\u0003Z-\u0000\u0201\u0202\u0005A\u0000"+
		"\u0000\u0202\u0208\u0003Z-\u0000\u0203\u0204\u0005@\u0000\u0000\u0204"+
		"\u0208\u0003Z-\u0000\u0205\u0206\u0005?\u0000\u0000\u0206\u0208\u0003"+
		"Z-\u0000\u0207\u0201\u0001\u0000\u0000\u0000\u0207\u0203\u0001\u0000\u0000"+
		"\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000\u0000"+
		"\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000"+
		"\u0000\u020aY\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000"+
		"\u020c\u0211\u0003\\.\u0000\u020d\u020e\u0005>\u0000\u0000\u020e\u0210"+
		"\u0003\\.\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u0210\u0213\u0001"+
		"\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001"+
		"\u0000\u0000\u0000\u0212[\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000"+
		"\u0000\u0000\u0214\u0217\u0003^/\u0000\u0215\u0216\u0005\r\u0000\u0000"+
		"\u0216\u0218\u0003\b\u0004\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0217"+
		"\u0218\u0001\u0000\u0000\u0000\u0218]\u0001\u0000\u0000\u0000\u0219\u0226"+
		"\u0003`0\u0000\u021a\u021b\u0005\u0006\u0000\u0000\u021b\u0225\u0003^"+
		"/\u0000\u021c\u021d\u0005Z\u0000\u0000\u021d\u021e\u0003@ \u0000\u021e"+
		"\u021f\u0005[\u0000\u0000\u021f\u0225\u0001\u0000\u0000\u0000\u0220\u0222"+
		"\u0003\u0018\f\u0000\u0221\u0223\u0003\u001c\u000e\u0000\u0222\u0221\u0001"+
		"\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0225\u0001"+
		"\u0000\u0000\u0000\u0224\u021a\u0001\u0000\u0000\u0000\u0224\u021c\u0001"+
		"\u0000\u0000\u0000\u0224\u0220\u0001\u0000\u0000\u0000\u0225\u0228\u0001"+
		"\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0226\u0227\u0001"+
		"\u0000\u0000\u0000\u0227_\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000"+
		"\u0000\u0000\u0229\u022a\u00060\uffff\uffff\u0000\u022a\u0230\u0003b1"+
		"\u0000\u022b\u022c\u0005<\u0000\u0000\u022c\u0230\u0003`0\u0004\u022d"+
		"\u022e\u0005=\u0000\u0000\u022e\u0230\u0003`0\u0002\u022f\u0229\u0001"+
		"\u0000\u0000\u0000\u022f\u022b\u0001\u0000\u0000\u0000\u022f\u022d\u0001"+
		"\u0000\u0000\u0000\u0230\u0237\u0001\u0000\u0000\u0000\u0231\u0232\n\u0003"+
		"\u0000\u0000\u0232\u0236\u0005<\u0000\u0000\u0233\u0234\n\u0001\u0000"+
		"\u0000\u0234\u0236\u0005=\u0000\u0000\u0235\u0231\u0001\u0000\u0000\u0000"+
		"\u0235\u0233\u0001\u0000\u0000\u0000\u0236\u0239\u0001\u0000\u0000\u0000"+
		"\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000"+
		"\u0238a\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a"+
		"\u0244\u0003d2\u0000\u023b\u023c\u0005B\u0000\u0000\u023c\u0244\u0003"+
		"b1\u0000\u023d\u023e\u0005C\u0000\u0000\u023e\u0244\u0003b1\u0000\u023f"+
		"\u0240\u0005M\u0000\u0000\u0240\u0244\u0003b1\u0000\u0241\u0242\u0005"+
		"Q\u0000\u0000\u0242\u0244\u0003b1\u0000\u0243\u023a\u0001\u0000\u0000"+
		"\u0000\u0243\u023b\u0001\u0000\u0000\u0000\u0243\u023d\u0001\u0000\u0000"+
		"\u0000\u0243\u023f\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000"+
		"\u0000\u0244c\u0001\u0000\u0000\u0000\u0245\u024b\u0003f3\u0000\u0246"+
		"\u0247\u0005V\u0000\u0000\u0247\u0248\u0003@ \u0000\u0248\u0249\u0005"+
		"W\u0000\u0000\u0249\u024b\u0001\u0000\u0000\u0000\u024a\u0245\u0001\u0000"+
		"\u0000\u0000\u024a\u0246\u0001\u0000\u0000\u0000\u024be\u0001\u0000\u0000"+
		"\u0000\u024c\u025a\u00053\u0000\u0000\u024d\u025a\u00052\u0000\u0000\u024e"+
		"\u025a\u0005\u000b\u0000\u0000\u024f\u025a\u0005\u0007\u0000\u0000\u0250"+
		"\u025a\u0005\n\u0000\u0000\u0251\u025a\u0005\b\u0000\u0000\u0252\u025a"+
		"\u0005\t\u0000\u0000\u0253\u025a\u00050\u0000\u0000\u0254\u025a\u0005"+
		"1\u0000\u0000\u0255\u025a\u0005,\u0000\u0000\u0256\u025a\u0005\u0014\u0000"+
		"\u0000\u0257\u025a\u0005+\u0000\u0000\u0258\u025a\u0005)\u0000\u0000\u0259"+
		"\u024c\u0001\u0000\u0000\u0000\u0259\u024d\u0001\u0000\u0000\u0000\u0259"+
		"\u024e\u0001\u0000\u0000\u0000\u0259\u024f\u0001\u0000\u0000\u0000\u0259"+
		"\u0250\u0001\u0000\u0000\u0000\u0259\u0251\u0001\u0000\u0000\u0000\u0259"+
		"\u0252\u0001\u0000\u0000\u0000\u0259\u0253\u0001\u0000\u0000\u0000\u0259"+
		"\u0254\u0001\u0000\u0000\u0000\u0259\u0255\u0001\u0000\u0000\u0000\u0259"+
		"\u0256\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u0259"+
		"\u0258\u0001\u0000\u0000\u0000\u025ag\u0001\u0000\u0000\u0000Gjqy}\u0082"+
		"\u008a\u0095\u0098\u00a4\u00a9\u00b2\u00ba\u00be\u00cb\u00cf\u00d2\u00d9"+
		"\u00e1\u00ec\u00f1\u00f7\u00fa\u00ff\u0104\u0109\u010d\u0112\u0116\u011c"+
		"\u0122\u012c\u0133\u0137\u013a\u0141\u0146\u014b\u014f\u0175\u017c\u0196"+
		"\u019d\u01a5\u01ad\u01b5\u01b7\u01bf\u01c1\u01c9\u01cb\u01d3\u01d5\u01e1"+
		"\u01e3\u01f1\u01f3\u01fb\u01fd\u0207\u0209\u0211\u0217\u0222\u0224\u0226"+
		"\u022f\u0235\u0237\u0243\u024a\u0259";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}