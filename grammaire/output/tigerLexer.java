// $ANTLR 3.5.1 /Users/jean-baptistedominguez/PCL/grammaire/tiger.g 2016-03-02 17:55:07

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tigerLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int Number=4;
	public static final int WS=5;

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
	@Override public String getGrammarFileName() { return "/Users/jean-baptistedominguez/PCL/grammaire/tiger.g"; }

	// $ANTLR start "T__6"
	public final void mT__6() throws RecognitionException {
		try {
			int _type = T__6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:2:6: ( '(' )
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:2:8: '('
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
	// $ANTLR end "T__6"

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:3:6: ( ')' )
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:3:8: ')'
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
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:4:6: ( '*' )
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:4:8: '*'
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
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:5:6: ( '+' )
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:5:8: '+'
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
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
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
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
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
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
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



}
