<<<<<<< HEAD
// $ANTLR 3.5.1 C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g 2016-03-11 11:40:13
=======
// $ANTLR 3.5.1 /Users/jean-baptistedominguez/PCL/grammaire/tiger.g 2016-03-02 17:55:07
>>>>>>> 2db0b05a71a7ac5ea9086138d9027dc896cda632

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tigerLexer extends Lexer {
	public static final int EOF=-1;
<<<<<<< HEAD
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
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
	public static final int CHAR=4;
	public static final int COMMENT=5;
	public static final int ESC_SEQ=6;
	public static final int EXPONENT=7;
	public static final int FLOAT=8;
	public static final int HEX_DIGIT=9;
	public static final int ID=10;
	public static final int INT=11;
	public static final int OCTAL_ESC=12;
	public static final int RelOp=13;
	public static final int STRING=14;
	public static final int UNICODE_ESC=15;
	public static final int UnaryOp=16;
	public static final int WS=17;
=======
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int Number=4;
	public static final int WS=5;
>>>>>>> 2db0b05a71a7ac5ea9086138d9027dc896cda632

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tigerLexer() {} 
	public tigerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tigerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
<<<<<<< HEAD
	@Override public String getGrammarFileName() { return "C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g"; }

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:2:7: ( '&' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:2:9: '&'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:3:7: ( '(' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:3:9: '('
=======
	@Override public String getGrammarFileName() { return "/Users/jean-baptistedominguez/PCL/grammaire/tiger.g"; }

	// $ANTLR start "T__6"
	public final void mT__6() throws RecognitionException {
		try {
			int _type = T__6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:2:6: ( '(' )
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:2:8: '('
>>>>>>> 2db0b05a71a7ac5ea9086138d9027dc896cda632
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
<<<<<<< HEAD
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:4:7: ( ')' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:4:9: ')'
=======
	// $ANTLR end "T__6"

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:3:6: ( ')' )
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:3:8: ')'
>>>>>>> 2db0b05a71a7ac5ea9086138d9027dc896cda632
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
<<<<<<< HEAD
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:5:7: ( '*' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:5:9: '*'
=======
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:4:6: ( '*' )
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:4:8: '*'
>>>>>>> 2db0b05a71a7ac5ea9086138d9027dc896cda632
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
<<<<<<< HEAD
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:6:7: ( '+' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:6:9: '+'
=======
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:5:6: ( '+' )
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:5:8: '+'
>>>>>>> 2db0b05a71a7ac5ea9086138d9027dc896cda632
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
<<<<<<< HEAD
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:7:7: ( ',' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:7:9: ','
			{
			match(','); 
=======
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:6:7: ( '-' )
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:6:9: '-'
			{
			match('-'); 
>>>>>>> 2db0b05a71a7ac5ea9086138d9027dc896cda632
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
<<<<<<< HEAD
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:8:7: ( '.' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:8:9: '.'
			{
			match('.'); 
=======
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:7:7: ( '/' )
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:7:9: '/'
			{
			match('/'); 
>>>>>>> 2db0b05a71a7ac5ea9086138d9027dc896cda632
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
<<<<<<< HEAD
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:9:7: ( '/' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:9:9: '/'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:10:7: ( ':' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:10:9: ':'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:11:7: ( ':=' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:11:9: ':='
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:12:7: ( ';' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:12:9: ';'
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:13:7: ( '=' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:13:9: '='
			{
			match('='); 
=======
	// $ANTLR end "T__11"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:34:5: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:34:10: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:34:10: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:34:22: ( '.' ( '0' .. '9' )+ )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='.') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:34:23: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:34:27: ( '0' .. '9' )+
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
							// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:
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
					break;

			}

>>>>>>> 2db0b05a71a7ac5ea9086138d9027dc896cda632
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
<<<<<<< HEAD
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:14:7: ( 'arrayof' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:14:9: 'arrayof'
			{
			match("arrayof"); 

=======
	// $ANTLR end "Number"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:39:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:39:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
>>>>>>> 2db0b05a71a7ac5ea9086138d9027dc896cda632
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
<<<<<<< HEAD
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:15:7: ( 'break' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:15:9: 'break'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:16:7: ( 'do' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:16:9: 'do'
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:17:7: ( 'else' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:17:9: 'else'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:18:7: ( 'end' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:18:9: 'end'
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:19:7: ( 'for' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:19:9: 'for'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:20:7: ( 'function' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:20:9: 'function'
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:21:7: ( 'if' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:21:9: 'if'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:22:7: ( 'in' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:22:9: 'in'
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:23:7: ( 'let' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:23:9: 'let'
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:24:7: ( 'nil' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:24:9: 'nil'
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
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:25:7: ( 'of' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:25:9: 'of'
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:26:7: ( 'then' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:26:9: 'then'
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:27:7: ( 'to' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:27:9: 'to'
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:28:7: ( 'type' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:28:9: 'type'
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:29:7: ( 'var' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:29:9: 'var'
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:30:7: ( 'while' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:30:9: 'while'
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:31:7: ( '{' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:31:9: '{'
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
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:32:7: ( '|' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:32:9: '|'
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
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:33:7: ( '}' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:33:9: '}'
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
	// $ANTLR end "T__49"

	// $ANTLR start "RelOp"
	public final void mRelOp() throws RecognitionException {
		try {
			int _type = RelOp;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:104:7: ( '=' | '>' | '<' || '<=' | '>=' )
			int alt1=6;
			switch ( input.LA(1) ) {
			case '=':
				{
				alt1=1;
				}
				break;
			case '>':
				{
				int LA1_2 = input.LA(2);
				if ( (LA1_2=='=') ) {
					alt1=6;
				}

				else {
					alt1=2;
				}

				}
				break;
			case '<':
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3=='=') ) {
					alt1=5;
				}

				else {
					alt1=3;
				}

				}
				break;
			default:
				alt1=4;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:104:9: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:105:4: '>'
					{
					match('>'); 
					}
					break;
				case 3 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:106:4: '<'
					{
					match('<'); 
					}
					break;
				case 4 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:108:2: 
					{
					}
					break;
				case 5 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:108:4: '<='
					{
					match("<="); 

					}
					break;
				case 6 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:109:4: '>='
					{
					match(">="); 

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
	// $ANTLR end "RelOp"

	// $ANTLR start "UnaryOp"
	public final void mUnaryOp() throws RecognitionException {
		try {
			int _type = UnaryOp;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:111:9: ( '-' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:111:11: '-'
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
	// $ANTLR end "UnaryOp"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:113:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:113:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:113:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:
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
					break loop2;
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
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:116:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:116:7: ( '0' .. '9' )+
			{
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:116:7: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
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

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:120:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt10=3;
			alt10 = dfa10.predict(input);
			switch (alt10) {
				case 1 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:120:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:120:9: ( '0' .. '9' )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:
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
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					match('.'); 
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:120:25: ( '0' .. '9' )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:
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
							break loop5;
						}
					}

					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:120:37: ( EXPONENT )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='E'||LA6_0=='e') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:120:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:121:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:121:13: ( '0' .. '9' )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:
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
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:121:25: ( EXPONENT )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='E'||LA8_0=='e') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:121:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:122:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:122:9: ( '0' .. '9' )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:
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
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					mEXPONENT(); 

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
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:126:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='/') ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1=='/') ) {
					alt14=1;
				}
				else if ( (LA14_1=='*') ) {
					alt14=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:126:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:126:14: (~ ( '\\n' | '\\r' ) )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\t')||(LA11_0 >= '\u000B' && LA11_0 <= '\f')||(LA11_0 >= '\u000E' && LA11_0 <= '\uFFFF')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:
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
							break loop11;
						}
					}

					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:126:28: ( '\\r' )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='\r') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:126:28: '\\r'
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
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:127:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:127:14: ( options {greedy=false; } : . )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0=='*') ) {
							int LA13_1 = input.LA(2);
							if ( (LA13_1=='/') ) {
								alt13=2;
							}
							else if ( ((LA13_1 >= '\u0000' && LA13_1 <= '.')||(LA13_1 >= '0' && LA13_1 <= '\uFFFF')) ) {
								alt13=1;
							}

						}
						else if ( ((LA13_0 >= '\u0000' && LA13_0 <= ')')||(LA13_0 >= '+' && LA13_0 <= '\uFFFF')) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:127:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop13;
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
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:130:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:130:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:138:5: ( ( ESC_SEQ | ( '\\\\' | '\\'' ) )* ( '\\'' ) )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:138:8: ( ESC_SEQ | ( '\\\\' | '\\'' ) )* ( '\\'' )
			{
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:138:8: ( ESC_SEQ | ( '\\\\' | '\\'' ) )*
			loop15:
			while (true) {
				int alt15=3;
				int LA15_0 = input.LA(1);
				if ( (LA15_0=='\'') ) {
					int LA15_1 = input.LA(2);
					if ( (LA15_1=='\''||LA15_1=='\\') ) {
						alt15=2;
					}

				}
				else if ( (LA15_0=='\\') ) {
					int LA15_2 = input.LA(2);
					if ( (LA15_2=='\''||(LA15_2 >= '0' && LA15_2 <= '7')||LA15_2=='u') ) {
						alt15=1;
					}
					else if ( (LA15_2=='\"'||LA15_2=='\\'||LA15_2=='b'||LA15_2=='f'||LA15_2=='n'||LA15_2=='r'||LA15_2=='t') ) {
						alt15=1;
					}

				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:138:10: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:138:20: ( '\\\\' | '\\'' )
					{
					if ( input.LA(1)=='\''||input.LA(1)=='\\' ) {
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
					break loop15;
				}
			}

			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:138:35: ( '\\'' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:138:36: '\\''
			{
			match('\''); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:141:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:141:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:141:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='\\') ) {
				alt16=1;
			}
			else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '&')||(LA16_0 >= '(' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\uFFFF')) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:141:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:141:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:146:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:146:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:146:22: ( '+' | '-' )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='+'||LA17_0=='-') ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:146:33: ( '0' .. '9' )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:
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
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:149:11: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:153:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt19=1;
					}
					break;
				case 'u':
					{
					alt19=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt19=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:153:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:154:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:155:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:160:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt20=3;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='\\') ) {
				int LA20_1 = input.LA(2);
				if ( ((LA20_1 >= '0' && LA20_1 <= '3')) ) {
					int LA20_2 = input.LA(3);
					if ( ((LA20_2 >= '0' && LA20_2 <= '7')) ) {
						int LA20_4 = input.LA(4);
						if ( ((LA20_4 >= '0' && LA20_4 <= '7')) ) {
							alt20=1;
						}

						else {
							alt20=2;
						}

					}

					else {
						alt20=3;
					}

				}
				else if ( ((LA20_1 >= '4' && LA20_1 <= '7')) ) {
					int LA20_3 = input.LA(3);
					if ( ((LA20_3 >= '0' && LA20_3 <= '7')) ) {
						alt20=2;
					}

					else {
						alt20=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:160:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:161:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:162:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:167:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:167:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RelOp | UnaryOp | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
		int alt21=41;
		alt21 = dfa21.predict(input);
		switch (alt21) {
			case 1 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:10: T__18
				{
				mT__18(); 

				}
				break;
			case 2 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:16: T__19
				{
				mT__19(); 

				}
				break;
			case 3 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:22: T__20
				{
				mT__20(); 

				}
				break;
			case 4 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:28: T__21
				{
				mT__21(); 

				}
				break;
			case 5 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:34: T__22
				{
				mT__22(); 

				}
				break;
			case 6 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:40: T__23
				{
				mT__23(); 

				}
				break;
			case 7 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:46: T__24
				{
				mT__24(); 

				}
				break;
			case 8 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:52: T__25
				{
				mT__25(); 

				}
				break;
			case 9 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:58: T__26
				{
				mT__26(); 

				}
				break;
			case 10 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:64: T__27
				{
				mT__27(); 

				}
				break;
			case 11 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:70: T__28
				{
				mT__28(); 

				}
				break;
			case 12 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:76: T__29
				{
				mT__29(); 

				}
				break;
			case 13 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:82: T__30
				{
				mT__30(); 

				}
				break;
			case 14 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:88: T__31
				{
				mT__31(); 

				}
				break;
			case 15 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:94: T__32
				{
				mT__32(); 

				}
				break;
			case 16 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:100: T__33
				{
				mT__33(); 

				}
				break;
			case 17 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:106: T__34
				{
				mT__34(); 

				}
				break;
			case 18 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:112: T__35
				{
				mT__35(); 

				}
				break;
			case 19 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:118: T__36
				{
				mT__36(); 

				}
				break;
			case 20 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:124: T__37
				{
				mT__37(); 

				}
				break;
			case 21 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:130: T__38
				{
				mT__38(); 

				}
				break;
			case 22 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:136: T__39
				{
				mT__39(); 

				}
				break;
			case 23 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:142: T__40
				{
				mT__40(); 

				}
				break;
			case 24 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:148: T__41
				{
				mT__41(); 

				}
				break;
			case 25 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:154: T__42
				{
				mT__42(); 

				}
				break;
			case 26 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:160: T__43
				{
				mT__43(); 

				}
				break;
			case 27 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:166: T__44
				{
				mT__44(); 

				}
				break;
			case 28 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:172: T__45
				{
				mT__45(); 

				}
				break;
			case 29 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:178: T__46
				{
				mT__46(); 

				}
				break;
			case 30 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:184: T__47
				{
				mT__47(); 

				}
				break;
			case 31 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:190: T__48
				{
				mT__48(); 

				}
				break;
			case 32 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:196: T__49
				{
				mT__49(); 

				}
				break;
			case 33 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:202: RelOp
				{
				mRelOp(); 

				}
				break;
			case 34 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:208: UnaryOp
				{
				mUnaryOp(); 

				}
				break;
			case 35 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:216: ID
				{
				mID(); 

				}
				break;
			case 36 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:219: INT
				{
				mINT(); 

				}
				break;
			case 37 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:223: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 38 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:229: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 39 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:237: WS
				{
				mWS(); 

				}
				break;
			case 40 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:240: STRING
				{
				mSTRING(); 

				}
				break;
			case 41 :
				// C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\tiger.g:1:247: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	protected DFA21 dfa21 = new DFA21(this);
	static final String DFA10_eotS =
		"\5\uffff";
	static final String DFA10_eofS =
		"\5\uffff";
	static final String DFA10_minS =
		"\2\56\3\uffff";
	static final String DFA10_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA10_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA10_specialS =
		"\5\uffff}>";
	static final String[] DFA10_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "119:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA21_eotS =
		"\1\33\6\uffff\1\42\1\45\1\47\2\uffff\14\35\6\uffff\1\72\2\uffff\1\40\7"+
		"\uffff\2\35\1\77\4\35\1\104\1\105\2\35\1\110\1\35\1\112\3\35\3\uffff\2"+
		"\35\1\uffff\1\35\1\127\1\130\1\35\2\uffff\1\132\1\133\1\uffff\1\35\1\uffff"+
		"\1\35\1\136\1\35\1\40\5\uffff\2\35\1\147\2\uffff\1\35\2\uffff\1\151\1"+
		"\152\1\uffff\1\35\5\uffff\1\35\1\157\1\uffff\1\35\2\uffff\1\161\2\uffff"+
		"\1\35\1\uffff\1\35\2\uffff\1\166\1\35\2\uffff\1\170\1\uffff";
	static final String DFA21_eofS =
		"\171\uffff";
	static final String DFA21_minS =
		"\1\11\6\uffff\1\60\1\52\1\75\2\uffff\2\162\1\157\1\154\1\157\1\146\1\145"+
		"\1\151\1\146\1\150\1\141\1\150\6\uffff\1\56\2\uffff\1\0\7\uffff\1\162"+
		"\1\145\1\60\1\163\1\144\1\162\1\156\2\60\1\164\1\154\1\60\1\145\1\60\1"+
		"\160\1\162\1\151\1\uffff\1\42\1\uffff\2\141\1\uffff\1\145\2\60\1\143\2"+
		"\uffff\2\60\1\uffff\1\156\1\uffff\1\145\1\60\1\154\1\47\1\60\2\47\1\42"+
		"\1\47\1\171\1\153\1\60\2\uffff\1\164\2\uffff\2\60\1\uffff\1\145\1\uffff"+
		"\1\60\2\47\1\uffff\1\157\1\60\1\uffff\1\151\2\uffff\2\60\1\47\1\146\1"+
		"\uffff\1\157\1\uffff\2\60\1\156\1\47\1\uffff\1\60\1\uffff";
	static final String DFA21_maxS =
		"\1\175\6\uffff\1\71\1\57\1\75\2\uffff\2\162\1\157\1\156\1\165\1\156\1"+
		"\145\1\151\1\146\1\171\1\141\1\150\6\uffff\1\145\2\uffff\1\uffff\7\uffff"+
		"\1\162\1\145\1\172\1\163\1\144\1\162\1\156\2\172\1\164\1\154\1\172\1\145"+
		"\1\172\1\160\1\162\1\151\1\uffff\1\165\1\uffff\2\141\1\uffff\1\145\2\172"+
		"\1\143\2\uffff\2\172\1\uffff\1\156\1\uffff\1\145\1\172\1\154\1\47\1\146"+
		"\2\134\1\165\1\134\1\171\1\153\1\172\2\uffff\1\164\2\uffff\2\172\1\uffff"+
		"\1\145\1\uffff\1\146\2\134\1\uffff\1\157\1\172\1\uffff\1\151\2\uffff\1"+
		"\172\1\146\1\134\1\146\1\uffff\1\157\1\uffff\1\146\1\172\1\156\1\134\1"+
		"\uffff\1\172\1\uffff";
	static final String DFA21_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff\1\13\1\14\14\uffff\1\36\1\37"+
		"\1\40\1\41\1\42\1\43\1\uffff\1\47\1\50\1\uffff\1\7\1\45\1\46\1\10\1\12"+
		"\1\11\1\14\21\uffff\1\44\1\uffff\1\51\2\uffff\1\17\4\uffff\1\24\1\25\2"+
		"\uffff\1\30\1\uffff\1\32\14\uffff\1\21\1\22\1\uffff\1\26\1\27\2\uffff"+
		"\1\34\1\uffff\1\50\3\uffff\1\50\2\uffff\1\20\1\uffff\1\31\1\33\4\uffff"+
		"\1\16\1\uffff\1\35\4\uffff\1\15\1\uffff\1\23";
	static final String DFA21_specialS =
		"\41\uffff\1\0\127\uffff}>";
	static final String[] DFA21_transitionS = {
			"\2\37\2\uffff\1\37\22\uffff\1\37\5\uffff\1\1\1\41\1\2\1\3\1\4\1\5\1\6"+
			"\1\34\1\7\1\10\12\36\1\11\1\12\1\uffff\1\13\3\uffff\32\35\1\uffff\1\40"+
			"\2\uffff\1\35\1\uffff\1\14\1\15\1\35\1\16\1\17\1\20\2\35\1\21\2\35\1"+
			"\22\1\35\1\23\1\24\4\35\1\25\1\35\1\26\1\27\3\35\1\30\1\31\1\32",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\43",
			"\1\44\4\uffff\1\44",
			"\1\46",
			"",
			"",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54\1\uffff\1\55",
			"\1\56\5\uffff\1\57",
			"\1\60\7\uffff\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65\6\uffff\1\66\11\uffff\1\67",
			"\1\70",
			"\1\71",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\43\1\uffff\12\36\13\uffff\1\43\37\uffff\1\43",
			"",
			"",
			"\47\74\1\uffff\64\74\1\73\uffa3\74",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\75",
			"\1\76",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\106",
			"\1\107",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\111",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\113",
			"\1\114",
			"\1\115",
			"",
			"\1\123\4\uffff\1\116\10\uffff\4\120\4\121\44\uffff\1\122\5\uffff\1\123"+
			"\3\uffff\1\123\7\uffff\1\123\3\uffff\1\123\1\uffff\1\123\1\117",
			"",
			"\1\124",
			"\1\125",
			"",
			"\1\126",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\131",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\1\134",
			"",
			"\1\135",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\137",
			"\1\140",
			"\12\141\7\uffff\6\141\32\uffff\6\141",
			"\1\140\10\uffff\10\142\44\uffff\1\40",
			"\1\140\10\uffff\10\143\44\uffff\1\40",
			"\1\40\4\uffff\1\144\10\uffff\10\40\44\uffff\1\40\5\uffff\1\40\3\uffff"+
			"\1\40\7\uffff\1\40\3\uffff\1\40\1\uffff\2\40",
			"\1\140\64\uffff\1\40",
			"\1\145",
			"\1\146",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"",
			"\1\150",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\1\153",
			"",
			"\12\154\7\uffff\6\154\32\uffff\6\154",
			"\1\140\10\uffff\10\155\44\uffff\1\40",
			"\1\140\64\uffff\1\40",
			"",
			"\1\156",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\1\160",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\162\7\uffff\6\162\32\uffff\6\162",
			"\1\140\64\uffff\1\40",
			"\1\163",
			"",
			"\1\164",
			"",
			"\12\165\7\uffff\6\165\32\uffff\6\165",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\167",
			"\1\140\64\uffff\1\40",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			""
	};

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RelOp | UnaryOp | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA21_33 = input.LA(1);
						s = -1;
						if ( (LA21_33=='\\') ) {s = 59;}
						else if ( ((LA21_33 >= '\u0000' && LA21_33 <= '&')||(LA21_33 >= '(' && LA21_33 <= '[')||(LA21_33 >= ']' && LA21_33 <= '\uFFFF')) ) {s = 60;}
						else s = 32;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 21, _s, input);
			error(nvae);
			throw nvae;
		}
	}
=======
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | Number | WS )
		int alt4=8;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt4=1;
			}
			break;
		case ')':
			{
			alt4=2;
			}
			break;
		case '*':
			{
			alt4=3;
			}
			break;
		case '+':
			{
			alt4=4;
			}
			break;
		case '-':
			{
			alt4=5;
			}
			break;
		case '/':
			{
			alt4=6;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=7;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=8;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:1:10: T__6
				{
				mT__6(); 

				}
				break;
			case 2 :
				// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:1:15: T__7
				{
				mT__7(); 

				}
				break;
			case 3 :
				// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:1:20: T__8
				{
				mT__8(); 

				}
				break;
			case 4 :
				// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:1:25: T__9
				{
				mT__9(); 

				}
				break;
			case 5 :
				// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:1:30: T__10
				{
				mT__10(); 

				}
				break;
			case 6 :
				// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:1:36: T__11
				{
				mT__11(); 

				}
				break;
			case 7 :
				// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:1:42: Number
				{
				mNumber(); 

				}
				break;
			case 8 :
				// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:1:49: WS
				{
				mWS(); 

				}
				break;

		}
	}


>>>>>>> 2db0b05a71a7ac5ea9086138d9027dc896cda632

}
