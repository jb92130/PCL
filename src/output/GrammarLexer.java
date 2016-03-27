package output;
// $ANTLR 3.5.1 /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g 2016-03-26 19:45:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GrammarLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int BODY=4;
	public static final int BORNE_INF=5;
	public static final int BORNE_SUP=6;
	public static final int COMMENT=7;
	public static final int COND=8;
	public static final int DECLARATIONS=9;
	public static final int DECL_FCT=10;
	public static final int DECL_TYPE=11;
	public static final int DECL_VAR=12;
	public static final int DEF_ARRAY=13;
	public static final int ELSE=14;
	public static final int FCT_ARG=15;
	public static final int FIELD=16;
	public static final int FIELDS=17;
	public static final int FOR=18;
	public static final int ID=19;
	public static final int IF=20;
	public static final int INDICE=21;
	public static final int INT=22;
	public static final int LET=23;
	public static final int OF=24;
	public static final int PARAMS=25;
	public static final int PROG=26;
	public static final int SEQUENCE=27;
	public static final int STRING=28;
	public static final int STRUCT_DEC=29;
	public static final int THEN=30;
	public static final int WHILE=31;
	public static final int WS=32;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GrammarLexer() {} 
	public GrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/jean-baptistedominguez/PCL/grammaire/Grammar.g"; }

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:7:7: ( '&' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:7:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:8:7: ( '(' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:8:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:9:7: ( ')' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:9:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:10:7: ( '*' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:10:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:11:7: ( '+' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:11:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:12:7: ( ',' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:12:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:13:7: ( '-' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:13:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:14:7: ( '.' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:14:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:15:7: ( '/' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:15:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:16:7: ( ':' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:16:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:17:7: ( ':=' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:17:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:18:7: ( ';' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:18:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:19:7: ( '<' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:19:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:20:7: ( '<=' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:20:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:21:7: ( '<>' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:21:9: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:22:7: ( '=' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:22:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:23:7: ( '>' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:23:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:24:7: ( '>=' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:24:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:25:7: ( '[' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:25:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:26:7: ( ']' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:26:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:27:7: ( 'array' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:27:9: 'array'
			{
			match("array"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:28:7: ( 'break' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:28:9: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:29:7: ( 'do' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:29:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:30:7: ( 'else' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:30:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:31:7: ( 'end' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:31:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:32:7: ( 'for' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:32:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:33:7: ( 'function' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:33:9: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:34:7: ( 'if' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:34:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:35:7: ( 'in' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:35:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:36:7: ( 'let' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:36:9: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:37:7: ( 'nil' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:37:9: 'nil'
			{
			match("nil"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:38:7: ( 'of' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:38:9: 'of'
			{
			match("of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:39:7: ( 'then' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:39:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:40:7: ( 'to' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:40:9: 'to'
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:41:7: ( 'type' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:41:9: 'type'
			{
			match("type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:42:7: ( 'var' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:42:9: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:43:7: ( 'while' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:43:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:44:7: ( '{' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:44:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:45:7: ( '|' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:45:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:46:7: ( '}' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:46:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:200:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:200:4: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:200:24: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:204:2: ( ( '0' .. '9' )+ )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:204:4: ( '0' .. '9' )+
			{
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:204:4: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:209:6: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='/') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='/') ) {
					alt6=1;
				}
				else if ( (LA6_1=='*') ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:209:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:209:15: (~ ( '\\n' | '\\r' ) )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:209:29: ( '\\r' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='\r') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:209:29: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:210:11: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:210:16: ( options {greedy=false; } : . )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='*') ) {
							int LA5_1 = input.LA(2);
							if ( (LA5_1=='/') ) {
								alt5=2;
							}
							else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
								alt5=1;
							}

						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:210:44: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop5;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:214:2: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:214:7: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:218:2: ( '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"' )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:218:4: '\"' (~ ( '\\r' | '\\n' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:218:8: (~ ( '\\r' | '\\n' | '\"' ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:8: ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | ID | INT | COMMENT | WS | STRING )
		int alt8=45;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:10: T__33
				{
				mT__33(); 

				}
				break;
			case 2 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:16: T__34
				{
				mT__34(); 

				}
				break;
			case 3 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:22: T__35
				{
				mT__35(); 

				}
				break;
			case 4 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:28: T__36
				{
				mT__36(); 

				}
				break;
			case 5 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:34: T__37
				{
				mT__37(); 

				}
				break;
			case 6 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:40: T__38
				{
				mT__38(); 

				}
				break;
			case 7 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:46: T__39
				{
				mT__39(); 

				}
				break;
			case 8 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:52: T__40
				{
				mT__40(); 

				}
				break;
			case 9 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:58: T__41
				{
				mT__41(); 

				}
				break;
			case 10 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:64: T__42
				{
				mT__42(); 

				}
				break;
			case 11 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:70: T__43
				{
				mT__43(); 

				}
				break;
			case 12 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:76: T__44
				{
				mT__44(); 

				}
				break;
			case 13 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:82: T__45
				{
				mT__45(); 

				}
				break;
			case 14 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:88: T__46
				{
				mT__46(); 

				}
				break;
			case 15 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:94: T__47
				{
				mT__47(); 

				}
				break;
			case 16 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:100: T__48
				{
				mT__48(); 

				}
				break;
			case 17 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:106: T__49
				{
				mT__49(); 

				}
				break;
			case 18 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:112: T__50
				{
				mT__50(); 

				}
				break;
			case 19 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:118: T__51
				{
				mT__51(); 

				}
				break;
			case 20 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:124: T__52
				{
				mT__52(); 

				}
				break;
			case 21 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:130: T__53
				{
				mT__53(); 

				}
				break;
			case 22 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:136: T__54
				{
				mT__54(); 

				}
				break;
			case 23 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:142: T__55
				{
				mT__55(); 

				}
				break;
			case 24 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:148: T__56
				{
				mT__56(); 

				}
				break;
			case 25 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:154: T__57
				{
				mT__57(); 

				}
				break;
			case 26 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:160: T__58
				{
				mT__58(); 

				}
				break;
			case 27 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:166: T__59
				{
				mT__59(); 

				}
				break;
			case 28 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:172: T__60
				{
				mT__60(); 

				}
				break;
			case 29 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:178: T__61
				{
				mT__61(); 

				}
				break;
			case 30 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:184: T__62
				{
				mT__62(); 

				}
				break;
			case 31 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:190: T__63
				{
				mT__63(); 

				}
				break;
			case 32 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:196: T__64
				{
				mT__64(); 

				}
				break;
			case 33 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:202: T__65
				{
				mT__65(); 

				}
				break;
			case 34 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:208: T__66
				{
				mT__66(); 

				}
				break;
			case 35 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:214: T__67
				{
				mT__67(); 

				}
				break;
			case 36 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:220: T__68
				{
				mT__68(); 

				}
				break;
			case 37 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:226: T__69
				{
				mT__69(); 

				}
				break;
			case 38 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:232: T__70
				{
				mT__70(); 

				}
				break;
			case 39 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:238: T__71
				{
				mT__71(); 

				}
				break;
			case 40 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:244: T__72
				{
				mT__72(); 

				}
				break;
			case 41 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:250: ID
				{
				mID(); 

				}
				break;
			case 42 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:253: INT
				{
				mINT(); 

				}
				break;
			case 43 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:257: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 44 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:265: WS
				{
				mWS(); 

				}
				break;
			case 45 :
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:1:268: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\11\uffff\1\45\1\47\1\uffff\1\52\1\uffff\1\54\2\uffff\14\40\20\uffff\2"+
		"\40\1\100\4\40\1\105\1\106\2\40\1\111\1\40\1\113\5\40\1\uffff\1\40\1\122"+
		"\1\123\1\40\2\uffff\1\125\1\126\1\uffff\1\40\1\uffff\1\40\1\131\3\40\1"+
		"\135\2\uffff\1\40\2\uffff\1\137\1\140\1\uffff\1\40\1\142\1\143\1\uffff"+
		"\1\40\2\uffff\1\145\2\uffff\1\40\1\uffff\1\40\1\150\1\uffff";
	static final String DFA8_eofS =
		"\151\uffff";
	static final String DFA8_minS =
		"\1\11\10\uffff\1\52\1\75\1\uffff\1\75\1\uffff\1\75\2\uffff\2\162\1\157"+
		"\1\154\1\157\1\146\1\145\1\151\1\146\1\150\1\141\1\150\20\uffff\1\162"+
		"\1\145\1\60\1\163\1\144\1\162\1\156\2\60\1\164\1\154\1\60\1\145\1\60\1"+
		"\160\1\162\1\151\2\141\1\uffff\1\145\2\60\1\143\2\uffff\2\60\1\uffff\1"+
		"\156\1\uffff\1\145\1\60\1\154\1\171\1\153\1\60\2\uffff\1\164\2\uffff\2"+
		"\60\1\uffff\1\145\2\60\1\uffff\1\151\2\uffff\1\60\2\uffff\1\157\1\uffff"+
		"\1\156\1\60\1\uffff";
	static final String DFA8_maxS =
		"\1\175\10\uffff\1\57\1\75\1\uffff\1\76\1\uffff\1\75\2\uffff\2\162\1\157"+
		"\1\156\1\165\1\156\1\145\1\151\1\146\1\171\1\141\1\150\20\uffff\1\162"+
		"\1\145\1\172\1\163\1\144\1\162\1\156\2\172\1\164\1\154\1\172\1\145\1\172"+
		"\1\160\1\162\1\151\2\141\1\uffff\1\145\2\172\1\143\2\uffff\2\172\1\uffff"+
		"\1\156\1\uffff\1\145\1\172\1\154\1\171\1\153\1\172\2\uffff\1\164\2\uffff"+
		"\2\172\1\uffff\1\145\2\172\1\uffff\1\151\2\uffff\1\172\2\uffff\1\157\1"+
		"\uffff\1\156\1\172\1\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\14\1\uffff\1\20\1"+
		"\uffff\1\23\1\24\14\uffff\1\46\1\47\1\50\1\51\1\52\1\54\1\55\1\53\1\11"+
		"\1\13\1\12\1\16\1\17\1\15\1\22\1\21\23\uffff\1\27\4\uffff\1\34\1\35\2"+
		"\uffff\1\40\1\uffff\1\42\6\uffff\1\31\1\32\1\uffff\1\36\1\37\2\uffff\1"+
		"\44\3\uffff\1\30\1\uffff\1\41\1\43\1\uffff\1\25\1\26\1\uffff\1\45\2\uffff"+
		"\1\33";
	static final String DFA8_specialS =
		"\151\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\42\2\uffff\1\42\22\uffff\1\42\1\uffff\1\43\3\uffff\1\1\1\uffff\1\2"+
			"\1\3\1\4\1\5\1\6\1\7\1\10\1\11\12\41\1\12\1\13\1\14\1\15\1\16\2\uffff"+
			"\32\40\1\17\1\uffff\1\20\3\uffff\1\21\1\22\1\40\1\23\1\24\1\25\2\40\1"+
			"\26\2\40\1\27\1\40\1\30\1\31\4\40\1\32\1\40\1\33\1\34\3\40\1\35\1\36"+
			"\1\37",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\44\4\uffff\1\44",
			"\1\46",
			"",
			"\1\50\1\51",
			"",
			"\1\53",
			"",
			"",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60\1\uffff\1\61",
			"\1\62\5\uffff\1\63",
			"\1\64\7\uffff\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71\6\uffff\1\72\11\uffff\1\73",
			"\1\74",
			"\1\75",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\76",
			"\1\77",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\107",
			"\1\110",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\112",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"",
			"\1\121",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\124",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\127",
			"",
			"\1\130",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\132",
			"\1\133",
			"\1\134",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"\1\136",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\141",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\144",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"",
			"\1\146",
			"",
			"\1\147",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | ID | INT | COMMENT | WS | STRING );";
		}
	}

}
