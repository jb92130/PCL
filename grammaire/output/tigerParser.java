// $ANTLR 3.5.1 /Users/jean-baptistedominguez/PCL/grammaire/tiger.g 2016-03-02 17:55:07

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class tigerParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Number", "WS", "'('", "')'", 
		"'*'", "'+'", "'-'", "'/'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "multiplyExp", "atomExp", "additionExp", "eval"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public tigerParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public tigerParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public tigerParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return tigerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/jean-baptistedominguez/PCL/grammaire/tiger.g"; }



	// $ANTLR start "eval"
	// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:4:1: eval : additionExp ;
	public final void eval() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "eval");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(4, 0);

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:5:5: ( additionExp )
			dbg.enterAlt(1);

			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:5:10: additionExp
			{
			dbg.location(5,10);
			pushFollow(FOLLOW_additionExp_in_eval19);
			additionExp();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(6, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "eval");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "eval"



	// $ANTLR start "additionExp"
	// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:9:1: additionExp : multiplyExp ( '+' multiplyExp | '-' multiplyExp )* ;
	public final void additionExp() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "additionExp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(9, 0);

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:10:5: ( multiplyExp ( '+' multiplyExp | '-' multiplyExp )* )
			dbg.enterAlt(1);

			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:10:10: multiplyExp ( '+' multiplyExp | '-' multiplyExp )*
			{
			dbg.location(10,10);
			pushFollow(FOLLOW_multiplyExp_in_additionExp41);
			multiplyExp();
			state._fsp--;
			dbg.location(11,10);
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:11:10: ( '+' multiplyExp | '-' multiplyExp )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=3;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==9) ) {
					alt1=1;
				}
				else if ( (LA1_0==10) ) {
					alt1=2;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:11:12: '+' multiplyExp
					{
					dbg.location(11,12);
					match(input,9,FOLLOW_9_in_additionExp55); dbg.location(11,16);
					pushFollow(FOLLOW_multiplyExp_in_additionExp57);
					multiplyExp();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:12:12: '-' multiplyExp
					{
					dbg.location(12,12);
					match(input,10,FOLLOW_10_in_additionExp71); dbg.location(12,16);
					pushFollow(FOLLOW_multiplyExp_in_additionExp73);
					multiplyExp();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(14, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "additionExp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "additionExp"



	// $ANTLR start "multiplyExp"
	// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:17:1: multiplyExp : atomExp ( '*' atomExp | '/' atomExp )* ;
	public final void multiplyExp() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "multiplyExp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:18:5: ( atomExp ( '*' atomExp | '/' atomExp )* )
			dbg.enterAlt(1);

			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:18:10: atomExp ( '*' atomExp | '/' atomExp )*
			{
			dbg.location(18,10);
			pushFollow(FOLLOW_atomExp_in_multiplyExp108);
			atomExp();
			state._fsp--;
			dbg.location(19,10);
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:19:10: ( '*' atomExp | '/' atomExp )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=3;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==8) ) {
					alt2=1;
				}
				else if ( (LA2_0==11) ) {
					alt2=2;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:19:12: '*' atomExp
					{
					dbg.location(19,12);
					match(input,8,FOLLOW_8_in_multiplyExp121); dbg.location(19,16);
					pushFollow(FOLLOW_atomExp_in_multiplyExp123);
					atomExp();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:20:12: '/' atomExp
					{
					dbg.location(20,12);
					match(input,11,FOLLOW_11_in_multiplyExp137); dbg.location(20,16);
					pushFollow(FOLLOW_atomExp_in_multiplyExp139);
					atomExp();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(22, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multiplyExp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "multiplyExp"



	// $ANTLR start "atomExp"
	// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:27:1: atomExp : ( Number | '(' additionExp ')' );
	public final void atomExp() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "atomExp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(27, 0);

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:28:5: ( Number | '(' additionExp ')' )
			int alt3=2;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==Number) ) {
				alt3=1;
			}
			else if ( (LA3_0==6) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:28:10: Number
					{
					dbg.location(28,10);
					match(input,Number,FOLLOW_Number_in_atomExp174); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/jean-baptistedominguez/PCL/grammaire/tiger.g:29:10: '(' additionExp ')'
					{
					dbg.location(29,10);
					match(input,6,FOLLOW_6_in_atomExp185); dbg.location(29,14);
					pushFollow(FOLLOW_additionExp_in_atomExp187);
					additionExp();
					state._fsp--;
					dbg.location(29,26);
					match(input,7,FOLLOW_7_in_atomExp189); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(30, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atomExp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atomExp"

	// Delegated rules



	public static final BitSet FOLLOW_additionExp_in_eval19 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplyExp_in_additionExp41 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_9_in_additionExp55 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_multiplyExp_in_additionExp57 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_10_in_additionExp71 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_multiplyExp_in_additionExp73 = new BitSet(new long[]{0x0000000000000602L});
	public static final BitSet FOLLOW_atomExp_in_multiplyExp108 = new BitSet(new long[]{0x0000000000000902L});
	public static final BitSet FOLLOW_8_in_multiplyExp121 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_atomExp_in_multiplyExp123 = new BitSet(new long[]{0x0000000000000902L});
	public static final BitSet FOLLOW_11_in_multiplyExp137 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_atomExp_in_multiplyExp139 = new BitSet(new long[]{0x0000000000000902L});
	public static final BitSet FOLLOW_Number_in_atomExp174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_6_in_atomExp185 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_additionExp_in_atomExp187 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_atomExp189 = new BitSet(new long[]{0x0000000000000002L});
}
