package com.bubuwork.bukki;

// Generated from Bukki.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BukkiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		ID=17, INT=18, FLOAT=19, BOOLEAN=20, MUL=21, DIV=22, ADD=23, SUB=24, COMMA=25, 
		WS=26;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'('", "':'", "'if'", "'<'", "'='", "';'", "'<='", 
		"'?'", "'{'", "'>'", "'else'", "'=='", "'}'", "'>='", "'!'", "ID", "INT", 
		"FLOAT", "BOOLEAN", "'*'", "'/'", "'+'", "'-'", "','", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_stat = 2, RULE_ifstat = 3, RULE_condstat = 4, 
		RULE_func = 5, RULE_fname = 6, RULE_params = 7, RULE_expr = 8, RULE_param = 9;
	public static final String[] ruleNames = {
		"prog", "block", "stat", "ifstat", "condstat", "func", "fname", "params", 
		"expr", "param"
	};

	@Override
	public String getGrammarFileName() { return "Bukki.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BukkiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitProg(this);
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
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20); stat();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__12) | (1L << T__6) | (1L << T__0) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN))) != 0) );
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

	public static class BlockContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(T__6);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__12) | (1L << T__6) | (1L << T__0) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(26); stat();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32); match(T__2);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(BukkiParser.ID, 0); }
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfcondContext extends StatContext {
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public IfcondContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitIfcond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallfuncContext extends StatContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public CallfuncContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitCallfunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CodeblockContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CodeblockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondContext extends StatContext {
		public CondstatContext condstat() {
			return getRuleContext(CondstatContext.class,0);
		}
		public CondContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new CodeblockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34); block();
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35); match(ID);
				setState(36); match(T__10);
				setState(37); expr(0);
				setState(38); match(T__9);
				}
				break;
			case 3:
				_localctx = new CallfuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40); func();
				setState(41); match(T__9);
				}
				break;
			case 4:
				_localctx = new IfcondContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(43); ifstat();
				}
				break;
			case 5:
				_localctx = new CondContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(44); condstat();
				setState(45); match(T__9);
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

	public static class IfstatContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitIfstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(T__12);
			setState(50); expr(0);
			setState(51); stat();
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(52); match(T__4);
				setState(53); stat();
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

	public static class CondstatContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condstat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitCondstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondstatContext condstat() throws RecognitionException {
		CondstatContext _localctx = new CondstatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); expr(0);
			setState(57); match(T__7);
			setState(58); expr(0);
			setState(59); match(T__13);
			setState(60); expr(0);
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

	public static class FuncContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode ID() { return getToken(BukkiParser.ID, 0); }
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(62); match(ID);
				setState(63); match(T__10);
				}
				break;
			}
			setState(66); fname();
			setState(67); match(T__14);
			setState(68); params();
			setState(69); match(T__15);
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

	public static class FnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BukkiParser.ID, 0); }
		public FnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitFname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnameContext fname() throws RecognitionException {
		FnameContext _localctx = new FnameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(ID);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); param();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(74); match(COMMA);
				setState(75); param();
				}
				}
				setState(80);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddsubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddsubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitAddsub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitLe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MuldivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MuldivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitMuldiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GeContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitGe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitGt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncparamContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public FuncparamContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitFuncparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(82); match(T__0);
				setState(83); expr(3);
				}
				break;
			case T__14:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84); match(T__14);
				setState(85); expr(0);
				setState(86); match(T__15);
				}
				break;
			case ID:
			case INT:
			case FLOAT:
			case BOOLEAN:
				{
				_localctx = new FuncparamContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88); param();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(112);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MuldivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(92);
						((MuldivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MuldivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(93); expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AddsubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(95);
						((AddsubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddsubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(96); expr(10);
						}
						break;
					case 3:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(98); match(T__3);
						setState(99); expr(9);
						}
						break;
					case 4:
						{
						_localctx = new GtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(101); match(T__5);
						setState(102); expr(8);
						}
						break;
					case 5:
						{
						_localctx = new GeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(104); match(T__1);
						setState(105); expr(7);
						}
						break;
					case 6:
						{
						_localctx = new LtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(107); match(T__11);
						setState(108); expr(6);
						}
						break;
					case 7:
						{
						_localctx = new LeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(109);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(110); match(T__8);
						setState(111); expr(5);
						}
						break;
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ParamContext extends ParserRuleContext {
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	 
		public ParamContext() { }
		public void copyFrom(ParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdContext extends ParamContext {
		public TerminalNode ID() { return getToken(BukkiParser.ID, 0); }
		public IdContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ParamContext {
		public TerminalNode INT() { return getToken(BukkiParser.INT, 0); }
		public IntContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ParamContext {
		public TerminalNode BOOLEAN() { return getToken(BukkiParser.BOOLEAN, 0); }
		public BoolContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends ParamContext {
		public TerminalNode FLOAT() { return getToken(BukkiParser.FLOAT, 0); }
		public FloatContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BukkiVisitor ) return ((BukkiVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117); match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118); match(FLOAT);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119); match(BOOLEAN);
				}
				break;
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120); match(ID);
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
		case 8: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 10);
		case 1: return precpred(_ctx, 9);
		case 2: return precpred(_ctx, 8);
		case 3: return precpred(_ctx, 7);
		case 4: return precpred(_ctx, 6);
		case 5: return precpred(_ctx, 5);
		case 6: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34~\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\5\59\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7C\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\7\tO\n\t\f\t\16\tR\13\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\\\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\ns\n\n\f\n\16\nv\13\n\3\13"+
		"\3\13\3\13\3\13\5\13|\n\13\3\13\2\3\22\f\2\4\6\b\n\f\16\20\22\24\2\4\3"+
		"\2\27\30\3\2\31\32\u0088\2\27\3\2\2\2\4\33\3\2\2\2\6\61\3\2\2\2\b\63\3"+
		"\2\2\2\n:\3\2\2\2\fB\3\2\2\2\16I\3\2\2\2\20K\3\2\2\2\22[\3\2\2\2\24{\3"+
		"\2\2\2\26\30\5\6\4\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3"+
		"\2\2\2\32\3\3\2\2\2\33\37\7\f\2\2\34\36\5\6\4\2\35\34\3\2\2\2\36!\3\2"+
		"\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\20\2\2#\5\3"+
		"\2\2\2$\62\5\4\3\2%&\7\23\2\2&\'\7\b\2\2\'(\5\22\n\2()\7\t\2\2)\62\3\2"+
		"\2\2*+\5\f\7\2+,\7\t\2\2,\62\3\2\2\2-\62\5\b\5\2./\5\n\6\2/\60\7\t\2\2"+
		"\60\62\3\2\2\2\61$\3\2\2\2\61%\3\2\2\2\61*\3\2\2\2\61-\3\2\2\2\61.\3\2"+
		"\2\2\62\7\3\2\2\2\63\64\7\6\2\2\64\65\5\22\n\2\658\5\6\4\2\66\67\7\16"+
		"\2\2\679\5\6\4\28\66\3\2\2\289\3\2\2\29\t\3\2\2\2:;\5\22\n\2;<\7\13\2"+
		"\2<=\5\22\n\2=>\7\5\2\2>?\5\22\n\2?\13\3\2\2\2@A\7\23\2\2AC\7\b\2\2B@"+
		"\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\5\16\b\2EF\7\4\2\2FG\5\20\t\2GH\7\3\2\2"+
		"H\r\3\2\2\2IJ\7\23\2\2J\17\3\2\2\2KP\5\24\13\2LM\7\33\2\2MO\5\24\13\2"+
		"NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\21\3\2\2\2RP\3\2\2\2ST\b\n\1"+
		"\2TU\7\22\2\2U\\\5\22\n\5VW\7\4\2\2WX\5\22\n\2XY\7\3\2\2Y\\\3\2\2\2Z\\"+
		"\5\24\13\2[S\3\2\2\2[V\3\2\2\2[Z\3\2\2\2\\t\3\2\2\2]^\f\f\2\2^_\t\2\2"+
		"\2_s\5\22\n\r`a\f\13\2\2ab\t\3\2\2bs\5\22\n\fcd\f\n\2\2de\7\17\2\2es\5"+
		"\22\n\13fg\f\t\2\2gh\7\r\2\2hs\5\22\n\nij\f\b\2\2jk\7\21\2\2ks\5\22\n"+
		"\tlm\f\7\2\2mn\7\7\2\2ns\5\22\n\bop\f\6\2\2pq\7\n\2\2qs\5\22\n\7r]\3\2"+
		"\2\2r`\3\2\2\2rc\3\2\2\2rf\3\2\2\2ri\3\2\2\2rl\3\2\2\2ro\3\2\2\2sv\3\2"+
		"\2\2tr\3\2\2\2tu\3\2\2\2u\23\3\2\2\2vt\3\2\2\2w|\7\24\2\2x|\7\25\2\2y"+
		"|\7\26\2\2z|\7\23\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\25\3\2"+
		"\2\2\f\31\37\618BP[rt{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}