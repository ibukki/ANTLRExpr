package com.bubuwork.bukki;

// Generated from Bukki.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BukkiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		ID=17, INT=18, FLOAT=19, BOOLEAN=20, MUL=21, DIV=22, ADD=23, SUB=24, COMMA=25, 
		AND=26, OR=27, WS=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ID", 
		"LETTER", "INT", "FLOAT", "DIGIT", "BOOLEAN", "MUL", "DIV", "ADD", "SUB", 
		"COMMA", "AND", "OR", "WS"
	};


	public BukkiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bukki.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00b2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\7\22j\n\22\f\22\16\22m\13\22"+
		"\3\23\3\23\3\24\3\24\3\24\7\24t\n\24\f\24\16\24w\13\24\5\24y\n\24\3\25"+
		"\6\25|\n\25\r\25\16\25}\3\25\3\25\7\25\u0082\n\25\f\25\16\25\u0085\13"+
		"\25\3\25\3\25\6\25\u0089\n\25\r\25\16\25\u008a\5\25\u008d\n\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u009a\n\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\6\37\u00ad\n\37\r\37\16\37\u00ae\3\37\3\37\2\2 \3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\2\'\24)\25+\2-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36\3\2\6\3\2"+
		"\62;\4\2C\\c|\3\2\63;\5\2\13\f\17\17\"\"\u00b9\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2"+
		"\2\2\tE\3\2\2\2\13H\3\2\2\2\rJ\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23Q\3\2"+
		"\2\2\25S\3\2\2\2\27U\3\2\2\2\31W\3\2\2\2\33\\\3\2\2\2\35_\3\2\2\2\37a"+
		"\3\2\2\2!d\3\2\2\2#f\3\2\2\2%n\3\2\2\2\'x\3\2\2\2)\u008c\3\2\2\2+\u008e"+
		"\3\2\2\2-\u0099\3\2\2\2/\u009b\3\2\2\2\61\u009d\3\2\2\2\63\u009f\3\2\2"+
		"\2\65\u00a1\3\2\2\2\67\u00a3\3\2\2\29\u00a5\3\2\2\2;\u00a8\3\2\2\2=\u00ac"+
		"\3\2\2\2?@\7+\2\2@\4\3\2\2\2AB\7*\2\2B\6\3\2\2\2CD\7<\2\2D\b\3\2\2\2E"+
		"F\7k\2\2FG\7h\2\2G\n\3\2\2\2HI\7>\2\2I\f\3\2\2\2JK\7?\2\2K\16\3\2\2\2"+
		"LM\7=\2\2M\20\3\2\2\2NO\7>\2\2OP\7?\2\2P\22\3\2\2\2QR\7A\2\2R\24\3\2\2"+
		"\2ST\7}\2\2T\26\3\2\2\2UV\7@\2\2V\30\3\2\2\2WX\7g\2\2XY\7n\2\2YZ\7u\2"+
		"\2Z[\7g\2\2[\32\3\2\2\2\\]\7?\2\2]^\7?\2\2^\34\3\2\2\2_`\7\177\2\2`\36"+
		"\3\2\2\2ab\7@\2\2bc\7?\2\2c \3\2\2\2de\7#\2\2e\"\3\2\2\2fk\5%\23\2gj\5"+
		"%\23\2hj\t\2\2\2ig\3\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l$\3"+
		"\2\2\2mk\3\2\2\2no\t\3\2\2o&\3\2\2\2py\7\62\2\2qu\t\4\2\2rt\t\2\2\2sr"+
		"\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xp\3\2\2\2x"+
		"q\3\2\2\2y(\3\2\2\2z|\5+\26\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2"+
		"~\177\3\2\2\2\177\u0083\7\60\2\2\u0080\u0082\5+\26\2\u0081\u0080\3\2\2"+
		"\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u008d"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\7\60\2\2\u0087\u0089\5+\26\2"+
		"\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008d\3\2\2\2\u008c{\3\2\2\2\u008c\u0086\3\2\2\2\u008d"+
		"*\3\2\2\2\u008e\u008f\t\2\2\2\u008f,\3\2\2\2\u0090\u0091\7V\2\2\u0091"+
		"\u0092\7T\2\2\u0092\u0093\7W\2\2\u0093\u009a\7G\2\2\u0094\u0095\7H\2\2"+
		"\u0095\u0096\7C\2\2\u0096\u0097\7N\2\2\u0097\u0098\7U\2\2\u0098\u009a"+
		"\7G\2\2\u0099\u0090\3\2\2\2\u0099\u0094\3\2\2\2\u009a.\3\2\2\2\u009b\u009c"+
		"\7,\2\2\u009c\60\3\2\2\2\u009d\u009e\7\61\2\2\u009e\62\3\2\2\2\u009f\u00a0"+
		"\7-\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7/\2\2\u00a2\66\3\2\2\2\u00a3\u00a4"+
		"\7.\2\2\u00a48\3\2\2\2\u00a5\u00a6\7(\2\2\u00a6\u00a7\7(\2\2\u00a7:\3"+
		"\2\2\2\u00a8\u00a9\7~\2\2\u00a9\u00aa\7~\2\2\u00aa<\3\2\2\2\u00ab\u00ad"+
		"\t\5\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\37\2\2\u00b1>\3\2\2\2"+
		"\r\2ikux}\u0083\u008a\u008c\u0099\u00ae\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}