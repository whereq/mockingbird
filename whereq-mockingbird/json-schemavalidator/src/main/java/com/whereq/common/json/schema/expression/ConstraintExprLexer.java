// Generated from com\whereq\common\json\schema\expression\ConstraintExpr.g4 by ANTLR 4.3
package com.whereq.common.json.schema.expression;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConstraintExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__21=1, T__20=2, T__19=3, T__18=4, T__17=5, T__16=6, T__15=7, T__14=8, 
		T__13=9, T__12=10, T__11=11, T__10=12, T__9=13, T__8=14, T__7=15, T__6=16, 
		T__5=17, T__4=18, T__3=19, T__2=20, T__1=21, T__0=22, IN_OPERATOR=23, 
		BOOLEAN=24, IDENT=25, INTEGER=26, FLOAT=27, STRING=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'"
	};
	public static final String[] ruleNames = {
		"T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", 
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "LETTER", "DIGIT", "QUOTE", "IN_OPERATOR", 
		"BOOLEAN", "IDENT", "INTEGER", "FLOAT", "STRING", "WS"
	};


	public ConstraintExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ConstraintExpr.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0088\n\34\3\35\3\35\3\35"+
		"\7\35\u008d\n\35\f\35\16\35\u0090\13\35\3\36\6\36\u0093\n\36\r\36\16\36"+
		"\u0094\3\37\3\37\3\37\3\37\3 \3 \7 \u009d\n \f \16 \u00a0\13 \3 \3 \3"+
		"!\6!\u00a5\n!\r!\16!\u00a6\3!\3!\3\u009e\2\"\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\2\61\2\63\2\65\31\67\329\33;\34=\35?\36A\37\3\2\4\4\2C\\c|\5"+
		"\2\13\f\16\17\"\"\u00ac\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7H\3\2\2\2\tJ\3\2\2\2\13"+
		"L\3\2\2\2\rO\3\2\2\2\17R\3\2\2\2\21T\3\2\2\2\23W\3\2\2\2\25Z\3\2\2\2\27"+
		"\\\3\2\2\2\31^\3\2\2\2\33`\3\2\2\2\35b\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#"+
		"i\3\2\2\2%k\3\2\2\2\'m\3\2\2\2)o\3\2\2\2+q\3\2\2\2-s\3\2\2\2/u\3\2\2\2"+
		"\61w\3\2\2\2\63y\3\2\2\2\65{\3\2\2\2\67\u0087\3\2\2\29\u0089\3\2\2\2;"+
		"\u0092\3\2\2\2=\u0096\3\2\2\2?\u009a\3\2\2\2A\u00a4\3\2\2\2CD\7\61\2\2"+
		"D\4\3\2\2\2EF\7#\2\2FG\7?\2\2G\6\3\2\2\2HI\7<\2\2I\b\3\2\2\2JK\7]\2\2"+
		"K\n\3\2\2\2LM\7@\2\2MN\7?\2\2N\f\3\2\2\2OP\7~\2\2PQ\7~\2\2Q\16\3\2\2\2"+
		"RS\7>\2\2S\20\3\2\2\2TU\7?\2\2UV\7?\2\2V\22\3\2\2\2WX\7(\2\2XY\7(\2\2"+
		"Y\24\3\2\2\2Z[\7_\2\2[\26\3\2\2\2\\]\7@\2\2]\30\3\2\2\2^_\7A\2\2_\32\3"+
		"\2\2\2`a\7#\2\2a\34\3\2\2\2bc\7>\2\2cd\7?\2\2d\36\3\2\2\2ef\7%\2\2f \3"+
		"\2\2\2gh\7*\2\2h\"\3\2\2\2ij\7+\2\2j$\3\2\2\2kl\7,\2\2l&\3\2\2\2mn\7-"+
		"\2\2n(\3\2\2\2op\7.\2\2p*\3\2\2\2qr\7/\2\2r,\3\2\2\2st\7\60\2\2t.\3\2"+
		"\2\2uv\t\2\2\2v\60\3\2\2\2wx\4\62;\2x\62\3\2\2\2yz\7)\2\2z\64\3\2\2\2"+
		"{|\7k\2\2|}\7p\2\2}\66\3\2\2\2~\177\7v\2\2\177\u0080\7t\2\2\u0080\u0081"+
		"\7w\2\2\u0081\u0088\7g\2\2\u0082\u0083\7h\2\2\u0083\u0084\7c\2\2\u0084"+
		"\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086\u0088\7g\2\2\u0087~\3\2\2\2\u0087"+
		"\u0082\3\2\2\2\u00888\3\2\2\2\u0089\u008e\5/\30\2\u008a\u008d\5/\30\2"+
		"\u008b\u008d\5\61\31\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f:\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0093\5\61\31\2\u0092\u0091\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095<\3\2\2\2\u0096\u0097"+
		"\5;\36\2\u0097\u0098\7\60\2\2\u0098\u0099\5;\36\2\u0099>\3\2\2\2\u009a"+
		"\u009e\5\63\32\2\u009b\u009d\13\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a2\5\63\32\2\u00a2@\3\2\2\2\u00a3\u00a5\t\3\2"+
		"\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b!\2\2\u00a9B\3\2\2\2\t\2\u0087"+
		"\u008c\u008e\u0094\u009e\u00a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
