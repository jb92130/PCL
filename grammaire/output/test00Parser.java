// $ANTLR 3.5.1 /Users/jean-baptistedominguez/PCL/grammaire/test00.g 2016-03-16 18:44:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class test00Parser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NEWLINE", "WS", 
		"'('", "')'", "'*'", "'+'", "'-'", "'/'", "'='"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int ID=4;
	public static final int INT=5;
	public static final int NEWLINE=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "prog", "expr", "multExpr", "atom", "stat"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public test00Parser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public test00Parser(TokenStream input, int port, RecognizerSharedState state) {
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

	public test00Parser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return test00Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/jean-baptistedominguez/PCL/grammaire/test00.g"; }



	// $ANTLR start "prog"
	// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:4:1: prog : ( stat )+ ;
	public final void prog() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(4, 0);

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:4:5: ( ( stat )+ )
			dbg.enterAlt(1);

			// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:4:9: ( stat )+
			{
			dbg.location(4,9);
			// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:4:9: ( stat )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ID && LA1_0 <= NEWLINE)||LA1_0==8||LA1_0==12) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:4:9: stat
					{
					dbg.location(4,9);
					pushFollow(FOLLOW_stat_in_prog12);
					stat();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
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
		dbg.location(4, 14);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:6:1: stat : ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE );
	public final void stat() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(6, 0);

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:6:5: ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE )
			int alt2=3;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case INT:
			case 8:
			case 12:
				{
				alt2=1;
				}
				break;
			case ID:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==14) ) {
					alt2=2;
				}
				else if ( ((LA2_2 >= 10 && LA2_2 <= 13)) ) {
					alt2=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NEWLINE:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:6:9: expr NEWLINE
					{
					dbg.location(6,9);
					pushFollow(FOLLOW_expr_in_stat39);
					expr();
					state._fsp--;
					dbg.location(6,14);
					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat41); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:7:9: ID '=' expr NEWLINE
					{
					dbg.location(7,9);
					match(input,ID,FOLLOW_ID_in_stat51); dbg.location(7,12);
					match(input,14,FOLLOW_14_in_stat53); dbg.location(7,16);
					pushFollow(FOLLOW_expr_in_stat55);
					expr();
					state._fsp--;
					dbg.location(7,21);
					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat57); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:8:9: NEWLINE
					{
					dbg.location(8,9);
					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat67); 
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
		dbg.location(9, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stat"



	// $ANTLR start "expr"
	// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:12:1: expr : multExpr ( ( '+' | '-' ) ( multExpr )* ) ;
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:12:9: ( multExpr ( ( '+' | '-' ) ( multExpr )* ) )
			dbg.enterAlt(1);

			// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:12:13: multExpr ( ( '+' | '-' ) ( multExpr )* )
			{
			dbg.location(12,13);
			pushFollow(FOLLOW_multExpr_in_expr86);
			multExpr();
			state._fsp--;
			dbg.location(13,9);
			// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:13:9: ( ( '+' | '-' ) ( multExpr )* )
			dbg.enterAlt(1);

			// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:13:10: ( '+' | '-' ) ( multExpr )*
			{
			dbg.location(13,10);
			if ( (input.LA(1) >= 11 && input.LA(1) <= 12) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}dbg.location(13,21);
			// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:13:21: ( multExpr )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= ID && LA3_0 <= INT)||LA3_0==8||LA3_0==12) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:13:21: multExpr
					{
					dbg.location(13,21);
					pushFollow(FOLLOW_multExpr_in_expr105);
					multExpr();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(14, 5);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "multExpr"
	// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:16:1: multExpr : atom ( ( '*' | '/' ) atom )* ;
	public final void multExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "multExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:16:10: ( atom ( ( '*' | '/' ) atom )* )
			dbg.enterAlt(1);

			// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:16:14: atom ( ( '*' | '/' ) atom )*
			{
			dbg.location(16,14);
			pushFollow(FOLLOW_atom_in_multExpr124);
			atom();
			state._fsp--;
			dbg.location(16,20);
			// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:16:20: ( ( '*' | '/' ) atom )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==10||LA4_0==13) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:16:21: ( '*' | '/' ) atom
					{
					dbg.location(16,21);
					if ( input.LA(1)==10||input.LA(1)==13 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(16,31);
					pushFollow(FOLLOW_atom_in_multExpr134);
					atom();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(17, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:19:1: atom : ( INT | '-' INT | ID | '(' expr ')' );
	public final void atom() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:20:5: ( INT | '-' INT | ID | '(' expr ')' )
			int alt5=4;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt5=1;
				}
				break;
			case 12:
				{
				alt5=2;
				}
				break;
			case ID:
				{
				alt5=3;
				}
				break;
			case 8:
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:20:9: INT
					{
					dbg.location(20,9);
					match(input,INT,FOLLOW_INT_in_atom157); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:21:7: '-' INT
					{
					dbg.location(21,7);
					match(input,12,FOLLOW_12_in_atom166); dbg.location(21,11);
					match(input,INT,FOLLOW_INT_in_atom168); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:22:9: ID
					{
					dbg.location(22,9);
					match(input,ID,FOLLOW_ID_in_atom178); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/jean-baptistedominguez/PCL/grammaire/test00.g:23:9: '(' expr ')'
					{
					dbg.location(23,9);
					match(input,8,FOLLOW_8_in_atom188); dbg.location(23,13);
					pushFollow(FOLLOW_expr_in_atom190);
					expr();
					state._fsp--;
					dbg.location(23,18);
					match(input,9,FOLLOW_9_in_atom192); 
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
		dbg.location(24, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog12 = new BitSet(new long[]{0x0000000000001172L});
	public static final BitSet FOLLOW_expr_in_stat39 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_stat41 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stat51 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stat53 = new BitSet(new long[]{0x0000000000001130L});
	public static final BitSet FOLLOW_expr_in_stat55 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_stat57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_stat67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr86 = new BitSet(new long[]{0x0000000000001800L});
	public static final BitSet FOLLOW_set_in_expr98 = new BitSet(new long[]{0x0000000000001132L});
	public static final BitSet FOLLOW_multExpr_in_expr105 = new BitSet(new long[]{0x0000000000001132L});
	public static final BitSet FOLLOW_atom_in_multExpr124 = new BitSet(new long[]{0x0000000000002402L});
	public static final BitSet FOLLOW_set_in_multExpr128 = new BitSet(new long[]{0x0000000000001130L});
	public static final BitSet FOLLOW_atom_in_multExpr134 = new BitSet(new long[]{0x0000000000002402L});
	public static final BitSet FOLLOW_INT_in_atom157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_atom166 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_INT_in_atom168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_atom188 = new BitSet(new long[]{0x0000000000001130L});
	public static final BitSet FOLLOW_expr_in_atom190 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_atom192 = new BitSet(new long[]{0x0000000000000002L});
}
