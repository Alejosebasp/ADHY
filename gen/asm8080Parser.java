// Generated from C:/Users/Alejosebasp/Documents/UNAL/Lenguajes/ADHY/grammar\asm8080.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class asm8080Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ASSEMBLER_DIRECTIVE=10, REGISTER=11, OPCODE=12, NAME=13, NUMBER=14, COMMENT=15, 
		STRING=16, EOL=17, WS=18;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_instruction = 2, RULE_opcode = 3, RULE_register_ = 4, 
		RULE_directive = 5, RULE_assemblerdirective = 6, RULE_lbl = 7, RULE_expressionlist = 8, 
		RULE_label = 9, RULE_expression = 10, RULE_multiplyingExpression = 11, 
		RULE_argument = 12, RULE_dollar = 13, RULE_string = 14, RULE_name = 15, 
		RULE_number = 16, RULE_comment = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "instruction", "opcode", "register_", "directive", "assemblerdirective", 
			"lbl", "expressionlist", "label", "expression", "multiplyingExpression", 
			"argument", "dollar", "string", "name", "number", "comment"
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

	@Override
	public String getGrammarFileName() { return "asm8080.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public asm8080Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> EOL() { return getTokens(asm8080Parser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(asm8080Parser.EOL, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(36);
					line();
					}
					break;
				}
				setState(39);
				match(EOL);
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << ASSEMBLER_DIRECTIVE) | (1L << REGISTER) | (1L << OPCODE) | (1L << NAME) | (1L << NUMBER) | (1L << COMMENT) | (1L << STRING) | (1L << EOL))) != 0) );
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

	public static class LineContext extends ParserRuleContext {
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(44);
				lbl();
				}
				break;
			}
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPCODE:
				{
				setState(47);
				instruction();
				}
				break;
			case T__6:
			case T__8:
			case ASSEMBLER_DIRECTIVE:
			case REGISTER:
			case NAME:
			case NUMBER:
			case STRING:
				{
				setState(48);
				directive();
				}
				break;
			case COMMENT:
			case EOL:
				break;
			default:
				break;
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(51);
				comment();
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

	public static class InstructionContext extends ParserRuleContext {
		public OpcodeContext opcode() {
			return getRuleContext(OpcodeContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			opcode();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << REGISTER) | (1L << NAME) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(55);
				expressionlist();
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

	public static class OpcodeContext extends ParserRuleContext {
		public TerminalNode OPCODE() { return getToken(asm8080Parser.OPCODE, 0); }
		public OpcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterOpcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitOpcode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitOpcode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcodeContext opcode() throws RecognitionException {
		OpcodeContext _localctx = new OpcodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_opcode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(OPCODE);
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

	public static class Register_Context extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(asm8080Parser.REGISTER, 0); }
		public Register_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterRegister_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitRegister_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitRegister_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Register_Context register_() throws RecognitionException {
		Register_Context _localctx = new Register_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_register_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(REGISTER);
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

	public static class DirectiveContext extends ParserRuleContext {
		public AssemblerdirectiveContext assemblerdirective() {
			return getRuleContext(AssemblerdirectiveContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << REGISTER) | (1L << NAME) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(62);
				argument();
				}
			}

			setState(65);
			assemblerdirective();
			setState(66);
			expressionlist();
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

	public static class AssemblerdirectiveContext extends ParserRuleContext {
		public TerminalNode ASSEMBLER_DIRECTIVE() { return getToken(asm8080Parser.ASSEMBLER_DIRECTIVE, 0); }
		public AssemblerdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterAssemblerdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitAssemblerdirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitAssemblerdirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssemblerdirectiveContext assemblerdirective() throws RecognitionException {
		AssemblerdirectiveContext _localctx = new AssemblerdirectiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assemblerdirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ASSEMBLER_DIRECTIVE);
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

	public static class LblContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LblContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterLbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitLbl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitLbl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LblContext lbl() throws RecognitionException {
		LblContext _localctx = new LblContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lbl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			label();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(71);
				match(T__0);
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

	public static class ExpressionlistContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterExpressionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitExpressionlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitExpressionlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressionlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			expression();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(75);
				match(T__1);
				setState(76);
				expression();
				}
				}
				setState(81);
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

	public static class LabelContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			name();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			multiplyingExpression();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(86);
				multiplyingExpression();
				}
				}
				setState(91);
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

	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterMultiplyingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitMultiplyingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitMultiplyingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multiplyingExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			argument();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__5) {
				{
				{
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(94);
				argument();
				}
				}
				setState(99);
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

	public static class ArgumentContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Register_Context register_() {
			return getRuleContext(Register_Context.class,0);
		}
		public DollarContext dollar() {
			return getRuleContext(DollarContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argument);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				number();
				}
				break;
			case REGISTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				register_();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				dollar();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				name();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				string();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(105);
				match(T__6);
				setState(106);
				expression();
				setState(107);
				match(T__7);
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

	public static class DollarContext extends ParserRuleContext {
		public DollarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dollar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitDollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitDollar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DollarContext dollar() throws RecognitionException {
		DollarContext _localctx = new DollarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dollar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__8);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(asm8080Parser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(STRING);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(asm8080Parser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(NAME);
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
		public TerminalNode NUMBER() { return getToken(asm8080Parser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(NUMBER);
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
		public TerminalNode COMMENT() { return getToken(asm8080Parser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8080Listener ) ((asm8080Listener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asm8080Visitor ) return ((asm8080Visitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(COMMENT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24|\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\3\2\5\2(\n\2\3\2\6\2+\n\2\r\2\16\2,\3\3\5\3\60\n\3\3\3\3\3\5\3\64"+
		"\n\3\3\3\5\3\67\n\3\3\4\3\4\5\4;\n\4\3\5\3\5\3\6\3\6\3\7\5\7B\n\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\5\tK\n\t\3\n\3\n\3\n\7\nP\n\n\f\n\16\nS\13\n"+
		"\3\13\3\13\3\f\3\f\3\f\7\fZ\n\f\f\f\16\f]\13\f\3\r\3\r\3\r\7\rb\n\r\f"+
		"\r\16\re\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16p\n\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$\2\4\3\2\5\6\3\2\7\b\2z\2*\3\2\2\2"+
		"\4/\3\2\2\2\68\3\2\2\2\b<\3\2\2\2\n>\3\2\2\2\fA\3\2\2\2\16F\3\2\2\2\20"+
		"H\3\2\2\2\22L\3\2\2\2\24T\3\2\2\2\26V\3\2\2\2\30^\3\2\2\2\32o\3\2\2\2"+
		"\34q\3\2\2\2\36s\3\2\2\2 u\3\2\2\2\"w\3\2\2\2$y\3\2\2\2&(\5\4\3\2\'&\3"+
		"\2\2\2\'(\3\2\2\2()\3\2\2\2)+\7\23\2\2*\'\3\2\2\2+,\3\2\2\2,*\3\2\2\2"+
		",-\3\2\2\2-\3\3\2\2\2.\60\5\20\t\2/.\3\2\2\2/\60\3\2\2\2\60\63\3\2\2\2"+
		"\61\64\5\6\4\2\62\64\5\f\7\2\63\61\3\2\2\2\63\62\3\2\2\2\63\64\3\2\2\2"+
		"\64\66\3\2\2\2\65\67\5$\23\2\66\65\3\2\2\2\66\67\3\2\2\2\67\5\3\2\2\2"+
		"8:\5\b\5\29;\5\22\n\2:9\3\2\2\2:;\3\2\2\2;\7\3\2\2\2<=\7\16\2\2=\t\3\2"+
		"\2\2>?\7\r\2\2?\13\3\2\2\2@B\5\32\16\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2C"+
		"D\5\16\b\2DE\5\22\n\2E\r\3\2\2\2FG\7\f\2\2G\17\3\2\2\2HJ\5\24\13\2IK\7"+
		"\3\2\2JI\3\2\2\2JK\3\2\2\2K\21\3\2\2\2LQ\5\26\f\2MN\7\4\2\2NP\5\26\f\2"+
		"OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\23\3\2\2\2SQ\3\2\2\2TU\5 \21"+
		"\2U\25\3\2\2\2V[\5\30\r\2WX\t\2\2\2XZ\5\30\r\2YW\3\2\2\2Z]\3\2\2\2[Y\3"+
		"\2\2\2[\\\3\2\2\2\\\27\3\2\2\2][\3\2\2\2^c\5\32\16\2_`\t\3\2\2`b\5\32"+
		"\16\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\31\3\2\2\2ec\3\2\2\2fp"+
		"\5\"\22\2gp\5\n\6\2hp\5\34\17\2ip\5 \21\2jp\5\36\20\2kl\7\t\2\2lm\5\26"+
		"\f\2mn\7\n\2\2np\3\2\2\2of\3\2\2\2og\3\2\2\2oh\3\2\2\2oi\3\2\2\2oj\3\2"+
		"\2\2ok\3\2\2\2p\33\3\2\2\2qr\7\13\2\2r\35\3\2\2\2st\7\22\2\2t\37\3\2\2"+
		"\2uv\7\17\2\2v!\3\2\2\2wx\7\20\2\2x#\3\2\2\2yz\7\21\2\2z%\3\2\2\2\16\'"+
		",/\63\66:AJQ[co";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}