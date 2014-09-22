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
		WS=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ID", 
		"LETTER", "INT", "FLOAT", "DIGIT", "BOOLEAN", "MUL", "DIV", "ADD", "SUB", 
		"COMMA", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\7\22f\n\22\f\22\16\22i\13\22\3\23\3\23\3\24\3\24"+
		"\3\24\7\24p\n\24\f\24\16\24s\13\24\5\24u\n\24\3\25\6\25x\n\25\r\25\16"+
		"\25y\3\25\3\25\7\25~\n\25\f\25\16\25\u0081\13\25\3\25\3\25\6\25\u0085"+
		"\n\25\r\25\16\25\u0086\5\25\u0089\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u0096\n\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\6\35\u00a3\n\35\r\35\16\35\u00a4\3\35\3\35\2"+
		"\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\2\'\24)\25+\2-\26/\27\61\30\63\31\65\32\67\339\34\3"+
		"\2\6\3\2\62;\4\2C\\c|\3\2\63;\5\2\13\f\17\17\"\"\u00af\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2"+
		")\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13"+
		"D\3\2\2\2\rF\3\2\2\2\17H\3\2\2\2\21J\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27"+
		"Q\3\2\2\2\31S\3\2\2\2\33X\3\2\2\2\35[\3\2\2\2\37]\3\2\2\2!`\3\2\2\2#b"+
		"\3\2\2\2%j\3\2\2\2\'t\3\2\2\2)\u0088\3\2\2\2+\u008a\3\2\2\2-\u0095\3\2"+
		"\2\2/\u0097\3\2\2\2\61\u0099\3\2\2\2\63\u009b\3\2\2\2\65\u009d\3\2\2\2"+
		"\67\u009f\3\2\2\29\u00a2\3\2\2\2;<\7+\2\2<\4\3\2\2\2=>\7*\2\2>\6\3\2\2"+
		"\2?@\7<\2\2@\b\3\2\2\2AB\7k\2\2BC\7h\2\2C\n\3\2\2\2DE\7>\2\2E\f\3\2\2"+
		"\2FG\7?\2\2G\16\3\2\2\2HI\7=\2\2I\20\3\2\2\2JK\7>\2\2KL\7?\2\2L\22\3\2"+
		"\2\2MN\7A\2\2N\24\3\2\2\2OP\7}\2\2P\26\3\2\2\2QR\7@\2\2R\30\3\2\2\2ST"+
		"\7g\2\2TU\7n\2\2UV\7u\2\2VW\7g\2\2W\32\3\2\2\2XY\7?\2\2YZ\7?\2\2Z\34\3"+
		"\2\2\2[\\\7\177\2\2\\\36\3\2\2\2]^\7@\2\2^_\7?\2\2_ \3\2\2\2`a\7#\2\2"+
		"a\"\3\2\2\2bg\5%\23\2cf\5%\23\2df\t\2\2\2ec\3\2\2\2ed\3\2\2\2fi\3\2\2"+
		"\2ge\3\2\2\2gh\3\2\2\2h$\3\2\2\2ig\3\2\2\2jk\t\3\2\2k&\3\2\2\2lu\7\62"+
		"\2\2mq\t\4\2\2np\t\2\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2tl\3\2\2\2tm\3\2\2\2u(\3\2\2\2vx\5+\26\2wv\3\2\2\2xy\3\2"+
		"\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{\177\7\60\2\2|~\5+\26\2}|\3\2\2\2~"+
		"\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0089\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0082\u0084\7\60\2\2\u0083\u0085\5+\26\2\u0084\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088w\3\2\2\2\u0088\u0082\3\2\2\2\u0089*\3\2\2\2\u008a"+
		"\u008b\t\2\2\2\u008b,\3\2\2\2\u008c\u008d\7V\2\2\u008d\u008e\7T\2\2\u008e"+
		"\u008f\7W\2\2\u008f\u0096\7G\2\2\u0090\u0091\7H\2\2\u0091\u0092\7C\2\2"+
		"\u0092\u0093\7N\2\2\u0093\u0094\7U\2\2\u0094\u0096\7G\2\2\u0095\u008c"+
		"\3\2\2\2\u0095\u0090\3\2\2\2\u0096.\3\2\2\2\u0097\u0098\7,\2\2\u0098\60"+
		"\3\2\2\2\u0099\u009a\7\61\2\2\u009a\62\3\2\2\2\u009b\u009c\7-\2\2\u009c"+
		"\64\3\2\2\2\u009d\u009e\7/\2\2\u009e\66\3\2\2\2\u009f\u00a0\7.\2\2\u00a0"+
		"8\3\2\2\2\u00a1\u00a3\t\5\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\b\35\2\2\u00a7:\3\2\2\2\r\2egqty\177\u0086\u0088\u0095\u00a4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}