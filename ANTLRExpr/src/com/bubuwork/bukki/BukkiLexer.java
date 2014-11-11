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
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, ID=16, STRING=17, 
		INT=18, FLOAT=19, BOOLEAN=20, MUL=21, DIV=22, ADD=23, SUB=24, COMMA=25, 
		AND=26, OR=27, EQUAL=28, NOTEQUAL=29, Identifier=30, WS=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'"
	};
	public static final String[] ruleNames = {
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "ID", "LETTER", "STRING", 
		"INT", "FLOAT", "DIGIT", "BOOLEAN", "MUL", "DIV", "ADD", "SUB", "COMMA", 
		"AND", "OR", "EQUAL", "NOTEQUAL", "HexDigit", "IntegerTypeSuffix", "Exponent", 
		"EscapeSequence", "OctalEscape", "UnicodeEscape", "Identifier", "Letter", 
		"JavaIDDigit", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u0106\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\7\21}\n\21\f\21\16\21\u0080\13\21\3\22\3\22\3\23"+
		"\3\23\3\23\7\23\u0087\n\23\f\23\16\23\u008a\13\23\3\23\3\23\3\24\3\24"+
		"\3\24\7\24\u0091\n\24\f\24\16\24\u0094\13\24\5\24\u0096\n\24\3\25\6\25"+
		"\u0099\n\25\r\25\16\25\u009a\3\25\3\25\7\25\u009f\n\25\f\25\16\25\u00a2"+
		"\13\25\3\25\3\25\6\25\u00a6\n\25\r\25\16\25\u00a7\5\25\u00aa\n\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00b7\n\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\5#\u00d5\n#\3#\6#\u00d8"+
		"\n#\r#\16#\u00d9\3$\3$\3$\3$\5$\u00e0\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5"+
		"%\u00eb\n%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\7\'\u00f7\n\'\f\'\16\'\u00fa"+
		"\13\'\3(\3(\3)\3)\3*\6*\u0101\n*\r*\16*\u0102\3*\3*\2\2+\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%"+
		"\23\'\24)\25+\2-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A\2C\2"+
		"E\2G\2I\2K\2M O\2Q\2S!\3\2\16\3\2\62;\4\2C\\c|\4\2$$^^\3\2\63;\5\2\62"+
		";CHch\4\2NNnn\4\2GGgg\4\2--//\n\2$$))^^ddhhppttvv\16\2&&C\\aac|\u00c2"+
		"\u00d8\u00da\u00f8\u00fa\u2001\u3042\u3191\u3302\u3381\u3402\u3d2f\u4e02"+
		"\ua001\uf902\ufb01\21\2\62;\u0662\u066b\u06f2\u06fb\u0968\u0971\u09e8"+
		"\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68\u0c71\u0ce8"+
		"\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u1042\u104b\5\2\13\f\17\17"+
		"\"\"\u010f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2M\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2"+
		"\t[\3\2\2\2\13^\3\2\2\2\r`\3\2\2\2\17b\3\2\2\2\21d\3\2\2\2\23g\3\2\2\2"+
		"\25i\3\2\2\2\27k\3\2\2\2\31m\3\2\2\2\33r\3\2\2\2\35t\3\2\2\2\37w\3\2\2"+
		"\2!y\3\2\2\2#\u0081\3\2\2\2%\u0083\3\2\2\2\'\u0095\3\2\2\2)\u00a9\3\2"+
		"\2\2+\u00ab\3\2\2\2-\u00b6\3\2\2\2/\u00b8\3\2\2\2\61\u00ba\3\2\2\2\63"+
		"\u00bc\3\2\2\2\65\u00be\3\2\2\2\67\u00c0\3\2\2\29\u00c2\3\2\2\2;\u00c5"+
		"\3\2\2\2=\u00c8\3\2\2\2?\u00cb\3\2\2\2A\u00ce\3\2\2\2C\u00d0\3\2\2\2E"+
		"\u00d2\3\2\2\2G\u00df\3\2\2\2I\u00ea\3\2\2\2K\u00ec\3\2\2\2M\u00f3\3\2"+
		"\2\2O\u00fb\3\2\2\2Q\u00fd\3\2\2\2S\u0100\3\2\2\2UV\7+\2\2V\4\3\2\2\2"+
		"WX\7*\2\2X\6\3\2\2\2YZ\7<\2\2Z\b\3\2\2\2[\\\7k\2\2\\]\7h\2\2]\n\3\2\2"+
		"\2^_\7>\2\2_\f\3\2\2\2`a\7?\2\2a\16\3\2\2\2bc\7=\2\2c\20\3\2\2\2de\7>"+
		"\2\2ef\7?\2\2f\22\3\2\2\2gh\7A\2\2h\24\3\2\2\2ij\7}\2\2j\26\3\2\2\2kl"+
		"\7@\2\2l\30\3\2\2\2mn\7g\2\2no\7n\2\2op\7u\2\2pq\7g\2\2q\32\3\2\2\2rs"+
		"\7\177\2\2s\34\3\2\2\2tu\7@\2\2uv\7?\2\2v\36\3\2\2\2wx\7#\2\2x \3\2\2"+
		"\2y~\5#\22\2z}\5#\22\2{}\t\2\2\2|z\3\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|"+
		"\3\2\2\2~\177\3\2\2\2\177\"\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\t\3\2\2"+
		"\u0082$\3\2\2\2\u0083\u0088\7$\2\2\u0084\u0087\5G$\2\u0085\u0087\n\4\2"+
		"\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7$\2\2\u008c&\3\2\2\2\u008d\u0096\7\62\2\2\u008e\u0092\t\5\2\2"+
		"\u008f\u0091\t\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u008d\3\2\2\2\u0095\u008e\3\2\2\2\u0096(\3\2\2\2\u0097\u0099\5+\26\2"+
		"\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a0\7\60\2\2\u009d\u009f\5+\26\2"+
		"\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00aa\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7\60\2\2"+
		"\u00a4\u00a6\5+\26\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u0098\3\2\2\2\u00a9"+
		"\u00a3\3\2\2\2\u00aa*\3\2\2\2\u00ab\u00ac\t\2\2\2\u00ac,\3\2\2\2\u00ad"+
		"\u00ae\7V\2\2\u00ae\u00af\7T\2\2\u00af\u00b0\7W\2\2\u00b0\u00b7\7G\2\2"+
		"\u00b1\u00b2\7H\2\2\u00b2\u00b3\7C\2\2\u00b3\u00b4\7N\2\2\u00b4\u00b5"+
		"\7U\2\2\u00b5\u00b7\7G\2\2\u00b6\u00ad\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b7"+
		".\3\2\2\2\u00b8\u00b9\7,\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb"+
		"\62\3\2\2\2\u00bc\u00bd\7-\2\2\u00bd\64\3\2\2\2\u00be\u00bf\7/\2\2\u00bf"+
		"\66\3\2\2\2\u00c0\u00c1\7.\2\2\u00c18\3\2\2\2\u00c2\u00c3\7(\2\2\u00c3"+
		"\u00c4\7(\2\2\u00c4:\3\2\2\2\u00c5\u00c6\7~\2\2\u00c6\u00c7\7~\2\2\u00c7"+
		"<\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9\u00ca\7?\2\2\u00ca>\3\2\2\2\u00cb\u00cc"+
		"\7#\2\2\u00cc\u00cd\7?\2\2\u00cd@\3\2\2\2\u00ce\u00cf\t\6\2\2\u00cfB\3"+
		"\2\2\2\u00d0\u00d1\t\7\2\2\u00d1D\3\2\2\2\u00d2\u00d4\t\b\2\2\u00d3\u00d5"+
		"\t\t\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d8\4\62;\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00daF\3\2\2\2\u00db\u00dc\7^\2\2\u00dc\u00e0"+
		"\t\n\2\2\u00dd\u00e0\5K&\2\u00de\u00e0\5I%\2\u00df\u00db\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0H\3\2\2\2\u00e1\u00e2\7^\2\2\u00e2"+
		"\u00e3\4\62\65\2\u00e3\u00e4\4\629\2\u00e4\u00eb\4\629\2\u00e5\u00e6\7"+
		"^\2\2\u00e6\u00e7\4\629\2\u00e7\u00eb\4\629\2\u00e8\u00e9\7^\2\2\u00e9"+
		"\u00eb\4\629\2\u00ea\u00e1\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ebJ\3\2\2\2\u00ec\u00ed\7^\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef"+
		"\5A!\2\u00ef\u00f0\5A!\2\u00f0\u00f1\5A!\2\u00f1\u00f2\5A!\2\u00f2L\3"+
		"\2\2\2\u00f3\u00f8\5O(\2\u00f4\u00f7\5O(\2\u00f5\u00f7\5Q)\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9N\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\t\13\2\2"+
		"\u00fcP\3\2\2\2\u00fd\u00fe\t\f\2\2\u00feR\3\2\2\2\u00ff\u0101\t\r\2\2"+
		"\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b*\2\2\u0105T\3\2\2\2\25\2|~"+
		"\u0086\u0088\u0092\u0095\u009a\u00a0\u00a7\u00a9\u00b6\u00d4\u00d9\u00df"+
		"\u00ea\u00f6\u00f8\u0102\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}