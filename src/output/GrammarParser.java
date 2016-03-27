package output;
// $ANTLR 3.5.1 /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g 2016-03-26 19:45:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class GrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BODY", "BORNE_INF", "BORNE_SUP", 
		"COMMENT", "COND", "DECLARATIONS", "DECL_FCT", "DECL_TYPE", "DECL_VAR", 
		"DEF_ARRAY", "ELSE", "FCT_ARG", "FIELD", "FIELDS", "FOR", "ID", "IF", 
		"INDICE", "INT", "LET", "OF", "PARAMS", "PROG", "SEQUENCE", "STRING", 
		"STRUCT_DEC", "THEN", "WHILE", "WS", "'&'", "'('", "')'", "'*'", "'+'", 
		"','", "'-'", "'.'", "'/'", "':'", "':='", "';'", "'<'", "'<='", "'<>'", 
		"'='", "'>'", "'>='", "'['", "']'", "'array'", "'break'", "'do'", "'else'", 
		"'end'", "'for'", "'function'", "'if'", "'in'", "'let'", "'nil'", "'of'", 
		"'then'", "'to'", "'type'", "'var'", "'while'", "'{'", "'|'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return GrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/jean-baptistedominguez/PCL/grammaire/Grammar.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:37:1: prog : expr EOF -> ^( PROG expr ) ;
	public final GrammarParser.prog_return prog() throws RecognitionException {
		GrammarParser.prog_return retval = new GrammarParser.prog_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope expr1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:38:2: ( expr EOF -> ^( PROG expr ) )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:38:4: expr EOF
			{
			pushFollow(FOLLOW_expr_in_prog143);
			expr1=expr();
			state._fsp--;

			stream_expr.add(expr1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog145);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 38:13: -> ^( PROG expr )
			{
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:38:16: ^( PROG expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROG, "PROG"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:41:1: expr : ( 'break' -> 'break' | STRING -> STRING | loop -> loop | condition -> condition | let -> let | operation -> operation );
	public final GrammarParser.expr_return expr() throws RecognitionException {
		GrammarParser.expr_return retval = new GrammarParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal3=null;
		Token STRING4=null;
		ParserRuleReturnScope loop5 =null;
		ParserRuleReturnScope condition6 =null;
		ParserRuleReturnScope let7 =null;
		ParserRuleReturnScope operation8 =null;

		Object string_literal3_tree=null;
		Object STRING4_tree=null;
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
		RewriteRuleSubtreeStream stream_loop=new RewriteRuleSubtreeStream(adaptor,"rule loop");
		RewriteRuleSubtreeStream stream_let=new RewriteRuleSubtreeStream(adaptor,"rule let");
		RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:42:2: ( 'break' -> 'break' | STRING -> STRING | loop -> loop | condition -> condition | let -> let | operation -> operation )
			int alt1=6;
			switch ( input.LA(1) ) {
			case 54:
				{
				alt1=1;
				}
				break;
			case STRING:
				{
				alt1=2;
				}
				break;
			case 58:
			case 69:
				{
				alt1=3;
				}
				break;
			case 60:
				{
				alt1=4;
				}
				break;
			case 62:
				{
				alt1=5;
				}
				break;
			case ID:
			case INT:
			case 34:
			case 39:
			case 63:
				{
				alt1=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:42:4: 'break'
					{
					string_literal3=(Token)match(input,54,FOLLOW_54_in_expr167);  
					stream_54.add(string_literal3);

					// AST REWRITE
					// elements: 54
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 42:13: -> 'break'
					{
						adaptor.addChild(root_0, stream_54.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:43:4: STRING
					{
					STRING4=(Token)match(input,STRING,FOLLOW_STRING_in_expr178);  
					stream_STRING.add(STRING4);

					// AST REWRITE
					// elements: STRING
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 43:12: -> STRING
					{
						adaptor.addChild(root_0, stream_STRING.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:44:4: loop
					{
					pushFollow(FOLLOW_loop_in_expr189);
					loop5=loop();
					state._fsp--;

					stream_loop.add(loop5.getTree());
					// AST REWRITE
					// elements: loop
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 44:10: -> loop
					{
						adaptor.addChild(root_0, stream_loop.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:45:5: condition
					{
					pushFollow(FOLLOW_condition_in_expr204);
					condition6=condition();
					state._fsp--;

					stream_condition.add(condition6.getTree());
					// AST REWRITE
					// elements: condition
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 45:15: -> condition
					{
						adaptor.addChild(root_0, stream_condition.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:46:4: let
					{
					pushFollow(FOLLOW_let_in_expr214);
					let7=let();
					state._fsp--;

					stream_let.add(let7.getTree());
					// AST REWRITE
					// elements: let
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 46:9: -> let
					{
						adaptor.addChild(root_0, stream_let.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:47:4: operation
					{
					pushFollow(FOLLOW_operation_in_expr226);
					operation8=operation();
					state._fsp--;

					stream_operation.add(operation8.getTree());
					// AST REWRITE
					// elements: operation
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 47:14: -> operation
					{
						adaptor.addChild(root_0, stream_operation.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class operation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operation"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:50:1: operation : orOperation ( options {greedy=true; } : ':=' ^ expr )? ;
	public final GrammarParser.operation_return operation() throws RecognitionException {
		GrammarParser.operation_return retval = new GrammarParser.operation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal10=null;
		ParserRuleReturnScope orOperation9 =null;
		ParserRuleReturnScope expr11 =null;

		Object string_literal10_tree=null;

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:51:2: ( orOperation ( options {greedy=true; } : ':=' ^ expr )? )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:51:4: orOperation ( options {greedy=true; } : ':=' ^ expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_orOperation_in_operation243);
			orOperation9=orOperation();
			state._fsp--;

			adaptor.addChild(root_0, orOperation9.getTree());

			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:51:16: ( options {greedy=true; } : ':=' ^ expr )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==43) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:51:43: ':=' ^ expr
					{
					string_literal10=(Token)match(input,43,FOLLOW_43_in_operation256); 
					string_literal10_tree = (Object)adaptor.create(string_literal10);
					root_0 = (Object)adaptor.becomeRoot(string_literal10_tree, root_0);

					pushFollow(FOLLOW_expr_in_operation260);
					expr11=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr11.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operation"


	public static class field_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "field_list"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:54:1: field_list : id= ID '=' ex= expr ( ',' field= field_list )? -> ^( '=' $id $ex) ( $field)? ;
	public final GrammarParser.field_list_return field_list() throws RecognitionException {
		GrammarParser.field_list_return retval = new GrammarParser.field_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token id=null;
		Token char_literal12=null;
		Token char_literal13=null;
		ParserRuleReturnScope ex =null;
		ParserRuleReturnScope field =null;

		Object id_tree=null;
		Object char_literal12_tree=null;
		Object char_literal13_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_field_list=new RewriteRuleSubtreeStream(adaptor,"rule field_list");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:55:2: (id= ID '=' ex= expr ( ',' field= field_list )? -> ^( '=' $id $ex) ( $field)? )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:55:4: id= ID '=' ex= expr ( ',' field= field_list )?
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_field_list279);  
			stream_ID.add(id);

			char_literal12=(Token)match(input,48,FOLLOW_48_in_field_list281);  
			stream_48.add(char_literal12);

			pushFollow(FOLLOW_expr_in_field_list287);
			ex=expr();
			state._fsp--;

			stream_expr.add(ex.getTree());
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:55:26: ( ',' field= field_list )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==38) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:55:27: ',' field= field_list
					{
					char_literal13=(Token)match(input,38,FOLLOW_38_in_field_list290);  
					stream_38.add(char_literal13);

					pushFollow(FOLLOW_field_list_in_field_list296);
					field=field_list();
					state._fsp--;

					stream_field_list.add(field.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: ex, id, field, 48
			// token labels: id
			// rule labels: ex, field, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleSubtreeStream stream_ex=new RewriteRuleSubtreeStream(adaptor,"rule ex",ex!=null?ex.getTree():null);
			RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field",field!=null?field.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 55:53: -> ^( '=' $id $ex) ( $field)?
			{
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:55:56: ^( '=' $id $ex)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_48.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_ex.nextTree());
				adaptor.addChild(root_0, root_1);
				}

				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:55:72: ( $field)?
				if ( stream_field.hasNext() ) {
					adaptor.addChild(root_0, stream_field.nextTree());
				}
				stream_field.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field_list"


	public static class orOperation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orOperation"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:58:1: orOperation : andOperation ( options {greedy=true; } : ( '|' ^) andOperation )* ;
	public final GrammarParser.orOperation_return orOperation() throws RecognitionException {
		GrammarParser.orOperation_return retval = new GrammarParser.orOperation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal15=null;
		ParserRuleReturnScope andOperation14 =null;
		ParserRuleReturnScope andOperation16 =null;

		Object char_literal15_tree=null;

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:59:2: ( andOperation ( options {greedy=true; } : ( '|' ^) andOperation )* )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:59:4: andOperation ( options {greedy=true; } : ( '|' ^) andOperation )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andOperation_in_orOperation330);
			andOperation14=andOperation();
			state._fsp--;

			adaptor.addChild(root_0, andOperation14.getTree());

			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:59:17: ( options {greedy=true; } : ( '|' ^) andOperation )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==71) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:59:43: ( '|' ^) andOperation
					{
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:59:43: ( '|' ^)
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:59:44: '|' ^
					{
					char_literal15=(Token)match(input,71,FOLLOW_71_in_orOperation343); 
					char_literal15_tree = (Object)adaptor.create(char_literal15);
					root_0 = (Object)adaptor.becomeRoot(char_literal15_tree, root_0);

					}

					pushFollow(FOLLOW_andOperation_in_orOperation347);
					andOperation16=andOperation();
					state._fsp--;

					adaptor.addChild(root_0, andOperation16.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orOperation"


	public static class andOperation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "andOperation"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:62:1: andOperation : booleanOperation ( options {greedy=true; } : ( '&' ^) booleanOperation )* ;
	public final GrammarParser.andOperation_return andOperation() throws RecognitionException {
		GrammarParser.andOperation_return retval = new GrammarParser.andOperation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal18=null;
		ParserRuleReturnScope booleanOperation17 =null;
		ParserRuleReturnScope booleanOperation19 =null;

		Object char_literal18_tree=null;

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:63:2: ( booleanOperation ( options {greedy=true; } : ( '&' ^) booleanOperation )* )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:63:4: booleanOperation ( options {greedy=true; } : ( '&' ^) booleanOperation )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_booleanOperation_in_andOperation361);
			booleanOperation17=booleanOperation();
			state._fsp--;

			adaptor.addChild(root_0, booleanOperation17.getTree());

			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:63:21: ( options {greedy=true; } : ( '&' ^) booleanOperation )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==33) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:63:47: ( '&' ^) booleanOperation
					{
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:63:47: ( '&' ^)
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:63:48: '&' ^
					{
					char_literal18=(Token)match(input,33,FOLLOW_33_in_andOperation374); 
					char_literal18_tree = (Object)adaptor.create(char_literal18);
					root_0 = (Object)adaptor.becomeRoot(char_literal18_tree, root_0);

					}

					pushFollow(FOLLOW_booleanOperation_in_andOperation378);
					booleanOperation19=booleanOperation();
					state._fsp--;

					adaptor.addChild(root_0, booleanOperation19.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "andOperation"


	public static class booleanOperation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "booleanOperation"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:66:1: booleanOperation : arithmeticOperation ( options {greedy=true; } : ( '=' ^| '<>' ^| '>' ^| '<' ^| '>=' ^| '<=' ^) arithmeticOperation )* ;
	public final GrammarParser.booleanOperation_return booleanOperation() throws RecognitionException {
		GrammarParser.booleanOperation_return retval = new GrammarParser.booleanOperation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal21=null;
		Token string_literal22=null;
		Token char_literal23=null;
		Token char_literal24=null;
		Token string_literal25=null;
		Token string_literal26=null;
		ParserRuleReturnScope arithmeticOperation20 =null;
		ParserRuleReturnScope arithmeticOperation27 =null;

		Object char_literal21_tree=null;
		Object string_literal22_tree=null;
		Object char_literal23_tree=null;
		Object char_literal24_tree=null;
		Object string_literal25_tree=null;
		Object string_literal26_tree=null;

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:67:2: ( arithmeticOperation ( options {greedy=true; } : ( '=' ^| '<>' ^| '>' ^| '<' ^| '>=' ^| '<=' ^) arithmeticOperation )* )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:67:4: arithmeticOperation ( options {greedy=true; } : ( '=' ^| '<>' ^| '>' ^| '<' ^| '>=' ^| '<=' ^) arithmeticOperation )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithmeticOperation_in_booleanOperation393);
			arithmeticOperation20=arithmeticOperation();
			state._fsp--;

			adaptor.addChild(root_0, arithmeticOperation20.getTree());

			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:67:24: ( options {greedy=true; } : ( '=' ^| '<>' ^| '>' ^| '<' ^| '>=' ^| '<=' ^) arithmeticOperation )*
			loop7:
			while (true) {
				int alt7=2;
				switch ( input.LA(1) ) {
				case 48:
					{
					alt7=1;
					}
					break;
				case 47:
					{
					alt7=1;
					}
					break;
				case 49:
					{
					alt7=1;
					}
					break;
				case 45:
					{
					alt7=1;
					}
					break;
				case 50:
					{
					alt7=1;
					}
					break;
				case 46:
					{
					alt7=1;
					}
					break;
				}
				switch (alt7) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:67:50: ( '=' ^| '<>' ^| '>' ^| '<' ^| '>=' ^| '<=' ^) arithmeticOperation
					{
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:67:50: ( '=' ^| '<>' ^| '>' ^| '<' ^| '>=' ^| '<=' ^)
					int alt6=6;
					switch ( input.LA(1) ) {
					case 48:
						{
						alt6=1;
						}
						break;
					case 47:
						{
						alt6=2;
						}
						break;
					case 49:
						{
						alt6=3;
						}
						break;
					case 45:
						{
						alt6=4;
						}
						break;
					case 50:
						{
						alt6=5;
						}
						break;
					case 46:
						{
						alt6=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}
					switch (alt6) {
						case 1 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:67:51: '=' ^
							{
							char_literal21=(Token)match(input,48,FOLLOW_48_in_booleanOperation406); 
							char_literal21_tree = (Object)adaptor.create(char_literal21);
							root_0 = (Object)adaptor.becomeRoot(char_literal21_tree, root_0);

							}
							break;
						case 2 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:67:58: '<>' ^
							{
							string_literal22=(Token)match(input,47,FOLLOW_47_in_booleanOperation411); 
							string_literal22_tree = (Object)adaptor.create(string_literal22);
							root_0 = (Object)adaptor.becomeRoot(string_literal22_tree, root_0);

							}
							break;
						case 3 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:67:66: '>' ^
							{
							char_literal23=(Token)match(input,49,FOLLOW_49_in_booleanOperation416); 
							char_literal23_tree = (Object)adaptor.create(char_literal23);
							root_0 = (Object)adaptor.becomeRoot(char_literal23_tree, root_0);

							}
							break;
						case 4 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:67:73: '<' ^
							{
							char_literal24=(Token)match(input,45,FOLLOW_45_in_booleanOperation421); 
							char_literal24_tree = (Object)adaptor.create(char_literal24);
							root_0 = (Object)adaptor.becomeRoot(char_literal24_tree, root_0);

							}
							break;
						case 5 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:67:80: '>=' ^
							{
							string_literal25=(Token)match(input,50,FOLLOW_50_in_booleanOperation426); 
							string_literal25_tree = (Object)adaptor.create(string_literal25);
							root_0 = (Object)adaptor.becomeRoot(string_literal25_tree, root_0);

							}
							break;
						case 6 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:67:88: '<=' ^
							{
							string_literal26=(Token)match(input,46,FOLLOW_46_in_booleanOperation431); 
							string_literal26_tree = (Object)adaptor.create(string_literal26);
							root_0 = (Object)adaptor.becomeRoot(string_literal26_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_arithmeticOperation_in_booleanOperation435);
					arithmeticOperation27=arithmeticOperation();
					state._fsp--;

					adaptor.addChild(root_0, arithmeticOperation27.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanOperation"


	public static class arithmeticOperation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithmeticOperation"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:70:1: arithmeticOperation : multExpr ( options {greedy=true; } : ( '+' ^| '-' ^) multExpr )* ;
	public final GrammarParser.arithmeticOperation_return arithmeticOperation() throws RecognitionException {
		GrammarParser.arithmeticOperation_return retval = new GrammarParser.arithmeticOperation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal29=null;
		Token char_literal30=null;
		ParserRuleReturnScope multExpr28 =null;
		ParserRuleReturnScope multExpr31 =null;

		Object char_literal29_tree=null;
		Object char_literal30_tree=null;

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:71:2: ( multExpr ( options {greedy=true; } : ( '+' ^| '-' ^) multExpr )* )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:71:4: multExpr ( options {greedy=true; } : ( '+' ^| '-' ^) multExpr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multExpr_in_arithmeticOperation450);
			multExpr28=multExpr();
			state._fsp--;

			adaptor.addChild(root_0, multExpr28.getTree());

			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:71:13: ( options {greedy=true; } : ( '+' ^| '-' ^) multExpr )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==37) ) {
					alt9=1;
				}
				else if ( (LA9_0==39) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:71:39: ( '+' ^| '-' ^) multExpr
					{
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:71:39: ( '+' ^| '-' ^)
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==37) ) {
						alt8=1;
					}
					else if ( (LA8_0==39) ) {
						alt8=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:71:40: '+' ^
							{
							char_literal29=(Token)match(input,37,FOLLOW_37_in_arithmeticOperation463); 
							char_literal29_tree = (Object)adaptor.create(char_literal29);
							root_0 = (Object)adaptor.becomeRoot(char_literal29_tree, root_0);

							}
							break;
						case 2 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:71:47: '-' ^
							{
							char_literal30=(Token)match(input,39,FOLLOW_39_in_arithmeticOperation468); 
							char_literal30_tree = (Object)adaptor.create(char_literal30);
							root_0 = (Object)adaptor.becomeRoot(char_literal30_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multExpr_in_arithmeticOperation473);
					multExpr31=multExpr();
					state._fsp--;

					adaptor.addChild(root_0, multExpr31.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithmeticOperation"


	public static class multExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multExpr"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:76:1: multExpr : minus ( options {greedy=true; } : ( '*' ^| '/' ^) minus )* ;
	public final GrammarParser.multExpr_return multExpr() throws RecognitionException {
		GrammarParser.multExpr_return retval = new GrammarParser.multExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal33=null;
		Token char_literal34=null;
		ParserRuleReturnScope minus32 =null;
		ParserRuleReturnScope minus35 =null;

		Object char_literal33_tree=null;
		Object char_literal34_tree=null;

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:77:2: ( minus ( options {greedy=true; } : ( '*' ^| '/' ^) minus )* )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:77:4: minus ( options {greedy=true; } : ( '*' ^| '/' ^) minus )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_minus_in_multExpr491);
			minus32=minus();
			state._fsp--;

			adaptor.addChild(root_0, minus32.getTree());

			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:77:10: ( options {greedy=true; } : ( '*' ^| '/' ^) minus )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==36) ) {
					alt11=1;
				}
				else if ( (LA11_0==41) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:77:37: ( '*' ^| '/' ^) minus
					{
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:77:37: ( '*' ^| '/' ^)
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==36) ) {
						alt10=1;
					}
					else if ( (LA10_0==41) ) {
						alt10=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:77:38: '*' ^
							{
							char_literal33=(Token)match(input,36,FOLLOW_36_in_multExpr505); 
							char_literal33_tree = (Object)adaptor.create(char_literal33);
							root_0 = (Object)adaptor.becomeRoot(char_literal33_tree, root_0);

							}
							break;
						case 2 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:77:44: '/' ^
							{
							char_literal34=(Token)match(input,41,FOLLOW_41_in_multExpr509); 
							char_literal34_tree = (Object)adaptor.create(char_literal34);
							root_0 = (Object)adaptor.becomeRoot(char_literal34_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_minus_in_multExpr514);
					minus35=minus();
					state._fsp--;

					adaptor.addChild(root_0, minus35.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multExpr"


	public static class minus_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "minus"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:81:1: minus : ( '-' ^)? atom ;
	public final GrammarParser.minus_return minus() throws RecognitionException {
		GrammarParser.minus_return retval = new GrammarParser.minus_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal36=null;
		ParserRuleReturnScope atom37 =null;

		Object char_literal36_tree=null;

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:82:2: ( ( '-' ^)? atom )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:82:4: ( '-' ^)? atom
			{
			root_0 = (Object)adaptor.nil();


			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:82:4: ( '-' ^)?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==39) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:82:5: '-' ^
					{
					char_literal36=(Token)match(input,39,FOLLOW_39_in_minus533); 
					char_literal36_tree = (Object)adaptor.create(char_literal36);
					root_0 = (Object)adaptor.becomeRoot(char_literal36_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_atom_in_minus538);
			atom37=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom37.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "minus"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:85:1: atom : ( INT -> INT | 'nil' -> 'nil' | ID ( after_id )? -> ^( ID ( after_id )? ) | '(' ( expr_seq )? ')' -> ( expr_seq )? );
	public final GrammarParser.atom_return atom() throws RecognitionException {
		GrammarParser.atom_return retval = new GrammarParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT38=null;
		Token string_literal39=null;
		Token ID40=null;
		Token char_literal42=null;
		Token char_literal44=null;
		ParserRuleReturnScope after_id41 =null;
		ParserRuleReturnScope expr_seq43 =null;

		Object INT38_tree=null;
		Object string_literal39_tree=null;
		Object ID40_tree=null;
		Object char_literal42_tree=null;
		Object char_literal44_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleSubtreeStream stream_expr_seq=new RewriteRuleSubtreeStream(adaptor,"rule expr_seq");
		RewriteRuleSubtreeStream stream_after_id=new RewriteRuleSubtreeStream(adaptor,"rule after_id");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:86:2: ( INT -> INT | 'nil' -> 'nil' | ID ( after_id )? -> ^( ID ( after_id )? ) | '(' ( expr_seq )? ')' -> ( expr_seq )? )
			int alt15=4;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt15=1;
				}
				break;
			case 63:
				{
				alt15=2;
				}
				break;
			case ID:
				{
				alt15=3;
				}
				break;
			case 34:
				{
				alt15=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:86:4: INT
					{
					INT38=(Token)match(input,INT,FOLLOW_INT_in_atom550);  
					stream_INT.add(INT38);

					// AST REWRITE
					// elements: INT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 86:11: -> INT
					{
						adaptor.addChild(root_0, stream_INT.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:87:4: 'nil'
					{
					string_literal39=(Token)match(input,63,FOLLOW_63_in_atom564);  
					stream_63.add(string_literal39);

					// AST REWRITE
					// elements: 63
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 87:13: -> 'nil'
					{
						adaptor.addChild(root_0, stream_63.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:88:4: ID ( after_id )?
					{
					ID40=(Token)match(input,ID,FOLLOW_ID_in_atom578);  
					stream_ID.add(ID40);

					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:88:7: ( after_id )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==34||LA13_0==40||LA13_0==51||LA13_0==70) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:88:7: after_id
							{
							pushFollow(FOLLOW_after_id_in_atom580);
							after_id41=after_id();
							state._fsp--;

							stream_after_id.add(after_id41.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: ID, after_id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 88:19: -> ^( ID ( after_id )? )
					{
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:88:22: ^( ID ( after_id )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:88:27: ( after_id )?
						if ( stream_after_id.hasNext() ) {
							adaptor.addChild(root_1, stream_after_id.nextTree());
						}
						stream_after_id.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:89:4: '(' ( expr_seq )? ')'
					{
					char_literal42=(Token)match(input,34,FOLLOW_34_in_atom597);  
					stream_34.add(char_literal42);

					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:89:8: ( expr_seq )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==ID||LA14_0==INT||LA14_0==STRING||LA14_0==34||LA14_0==39||LA14_0==54||LA14_0==58||LA14_0==60||(LA14_0 >= 62 && LA14_0 <= 63)||LA14_0==69) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:89:8: expr_seq
							{
							pushFollow(FOLLOW_expr_seq_in_atom599);
							expr_seq43=expr_seq();
							state._fsp--;

							stream_expr_seq.add(expr_seq43.getTree());
							}
							break;

					}

					char_literal44=(Token)match(input,35,FOLLOW_35_in_atom602);  
					stream_35.add(char_literal44);

					// AST REWRITE
					// elements: expr_seq
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 89:23: -> ( expr_seq )?
					{
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:89:28: ( expr_seq )?
						if ( stream_expr_seq.hasNext() ) {
							adaptor.addChild(root_0, stream_expr_seq.nextTree());
						}
						stream_expr_seq.reset();

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class after_id_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "after_id"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:92:1: after_id : ( lvalue | '(' ( expr_list )? ')' -> ^( PARAMS ( expr_list )? ) | '{' ( ( field_list )? ) '}' -> ^( STRUCT_DEC field_list ) );
	public final GrammarParser.after_id_return after_id() throws RecognitionException {
		GrammarParser.after_id_return retval = new GrammarParser.after_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal46=null;
		Token char_literal48=null;
		Token char_literal49=null;
		Token char_literal51=null;
		ParserRuleReturnScope lvalue45 =null;
		ParserRuleReturnScope expr_list47 =null;
		ParserRuleReturnScope field_list50 =null;

		Object char_literal46_tree=null;
		Object char_literal48_tree=null;
		Object char_literal49_tree=null;
		Object char_literal51_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
		RewriteRuleSubtreeStream stream_field_list=new RewriteRuleSubtreeStream(adaptor,"rule field_list");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:93:2: ( lvalue | '(' ( expr_list )? ')' -> ^( PARAMS ( expr_list )? ) | '{' ( ( field_list )? ) '}' -> ^( STRUCT_DEC field_list ) )
			int alt18=3;
			switch ( input.LA(1) ) {
			case 40:
			case 51:
				{
				alt18=1;
				}
				break;
			case 34:
				{
				alt18=2;
				}
				break;
			case 70:
				{
				alt18=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:93:4: lvalue
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lvalue_in_after_id623);
					lvalue45=lvalue();
					state._fsp--;

					adaptor.addChild(root_0, lvalue45.getTree());

					}
					break;
				case 2 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:94:5: '(' ( expr_list )? ')'
					{
					char_literal46=(Token)match(input,34,FOLLOW_34_in_after_id630);  
					stream_34.add(char_literal46);

					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:94:9: ( expr_list )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==ID||LA16_0==INT||LA16_0==STRING||LA16_0==34||LA16_0==39||LA16_0==54||LA16_0==58||LA16_0==60||(LA16_0 >= 62 && LA16_0 <= 63)||LA16_0==69) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:94:9: expr_list
							{
							pushFollow(FOLLOW_expr_list_in_after_id632);
							expr_list47=expr_list();
							state._fsp--;

							stream_expr_list.add(expr_list47.getTree());
							}
							break;

					}

					char_literal48=(Token)match(input,35,FOLLOW_35_in_after_id635);  
					stream_35.add(char_literal48);

					// AST REWRITE
					// elements: expr_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 94:25: -> ^( PARAMS ( expr_list )? )
					{
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:94:28: ^( PARAMS ( expr_list )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:94:37: ( expr_list )?
						if ( stream_expr_list.hasNext() ) {
							adaptor.addChild(root_1, stream_expr_list.nextTree());
						}
						stream_expr_list.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:95:4: '{' ( ( field_list )? ) '}'
					{
					char_literal49=(Token)match(input,70,FOLLOW_70_in_after_id650);  
					stream_70.add(char_literal49);

					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:95:8: ( ( field_list )? )
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:95:9: ( field_list )?
					{
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:95:9: ( field_list )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==ID) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:95:9: field_list
							{
							pushFollow(FOLLOW_field_list_in_after_id653);
							field_list50=field_list();
							state._fsp--;

							stream_field_list.add(field_list50.getTree());
							}
							break;

					}

					}

					char_literal51=(Token)match(input,72,FOLLOW_72_in_after_id657);  
					stream_72.add(char_literal51);

					// AST REWRITE
					// elements: field_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 95:27: -> ^( STRUCT_DEC field_list )
					{
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:95:30: ^( STRUCT_DEC field_list )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRUCT_DEC, "STRUCT_DEC"), root_1);
						adaptor.addChild(root_1, stream_field_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "after_id"


	public static class lvalue_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lvalue"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:98:1: lvalue : ( '.' ID ( lvalue )? -> ^( '.' ID ( lvalue )? ) | '[' expr ']' ( crochet )? -> ^( INDICE expr ) ( crochet )? );
	public final GrammarParser.lvalue_return lvalue() throws RecognitionException {
		GrammarParser.lvalue_return retval = new GrammarParser.lvalue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal52=null;
		Token ID53=null;
		Token char_literal55=null;
		Token char_literal57=null;
		ParserRuleReturnScope lvalue54 =null;
		ParserRuleReturnScope expr56 =null;
		ParserRuleReturnScope crochet58 =null;

		Object char_literal52_tree=null;
		Object ID53_tree=null;
		Object char_literal55_tree=null;
		Object char_literal57_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_lvalue=new RewriteRuleSubtreeStream(adaptor,"rule lvalue");
		RewriteRuleSubtreeStream stream_crochet=new RewriteRuleSubtreeStream(adaptor,"rule crochet");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:99:3: ( '.' ID ( lvalue )? -> ^( '.' ID ( lvalue )? ) | '[' expr ']' ( crochet )? -> ^( INDICE expr ) ( crochet )? )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==40) ) {
				alt21=1;
			}
			else if ( (LA21_0==51) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:99:5: '.' ID ( lvalue )?
					{
					char_literal52=(Token)match(input,40,FOLLOW_40_in_lvalue678);  
					stream_40.add(char_literal52);

					ID53=(Token)match(input,ID,FOLLOW_ID_in_lvalue680);  
					stream_ID.add(ID53);

					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:99:12: ( lvalue )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==40||LA19_0==51) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:99:12: lvalue
							{
							pushFollow(FOLLOW_lvalue_in_lvalue682);
							lvalue54=lvalue();
							state._fsp--;

							stream_lvalue.add(lvalue54.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: ID, 40, lvalue
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 99:22: -> ^( '.' ID ( lvalue )? )
					{
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:99:25: ^( '.' ID ( lvalue )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_40.nextNode(), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:99:34: ( lvalue )?
						if ( stream_lvalue.hasNext() ) {
							adaptor.addChild(root_1, stream_lvalue.nextTree());
						}
						stream_lvalue.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:100:5: '[' expr ']' ( crochet )?
					{
					char_literal55=(Token)match(input,51,FOLLOW_51_in_lvalue702);  
					stream_51.add(char_literal55);

					pushFollow(FOLLOW_expr_in_lvalue703);
					expr56=expr();
					state._fsp--;

					stream_expr.add(expr56.getTree());
					char_literal57=(Token)match(input,52,FOLLOW_52_in_lvalue704);  
					stream_52.add(char_literal57);

					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:100:15: ( crochet )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==40||LA20_0==51||LA20_0==64) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:100:15: crochet
							{
							pushFollow(FOLLOW_crochet_in_lvalue705);
							crochet58=crochet();
							state._fsp--;

							stream_crochet.add(crochet58.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: crochet, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 100:25: -> ^( INDICE expr ) ( crochet )?
					{
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:100:28: ^( INDICE expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INDICE, "INDICE"), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:100:43: ( crochet )?
						if ( stream_crochet.hasNext() ) {
							adaptor.addChild(root_0, stream_crochet.nextTree());
						}
						stream_crochet.reset();

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lvalue"


	public static class crochet_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "crochet"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:104:2: crochet : ( 'of' expr -> ^( OF expr ) | lvalue );
	public final GrammarParser.crochet_return crochet() throws RecognitionException {
		GrammarParser.crochet_return retval = new GrammarParser.crochet_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal59=null;
		ParserRuleReturnScope expr60 =null;
		ParserRuleReturnScope lvalue61 =null;

		Object string_literal59_tree=null;
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:105:2: ( 'of' expr -> ^( OF expr ) | lvalue )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==64) ) {
				alt22=1;
			}
			else if ( (LA22_0==40||LA22_0==51) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:105:4: 'of' expr
					{
					string_literal59=(Token)match(input,64,FOLLOW_64_in_crochet736);  
					stream_64.add(string_literal59);

					pushFollow(FOLLOW_expr_in_crochet738);
					expr60=expr();
					state._fsp--;

					stream_expr.add(expr60.getTree());
					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 105:15: -> ^( OF expr )
					{
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:105:18: ^( OF expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OF, "OF"), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:106:4: lvalue
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_lvalue_in_crochet752);
					lvalue61=lvalue();
					state._fsp--;

					adaptor.addChild(root_0, lvalue61.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "crochet"


	public static class let_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "let"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:122:2: let : 'let' declaration_list 'in' ( expr_seq )? 'end' -> ^( LET declaration_list ( expr_seq )? ) ;
	public final GrammarParser.let_return let() throws RecognitionException {
		GrammarParser.let_return retval = new GrammarParser.let_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal62=null;
		Token string_literal64=null;
		Token string_literal66=null;
		ParserRuleReturnScope declaration_list63 =null;
		ParserRuleReturnScope expr_seq65 =null;

		Object string_literal62_tree=null;
		Object string_literal64_tree=null;
		Object string_literal66_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_expr_seq=new RewriteRuleSubtreeStream(adaptor,"rule expr_seq");
		RewriteRuleSubtreeStream stream_declaration_list=new RewriteRuleSubtreeStream(adaptor,"rule declaration_list");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:123:3: ( 'let' declaration_list 'in' ( expr_seq )? 'end' -> ^( LET declaration_list ( expr_seq )? ) )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:123:5: 'let' declaration_list 'in' ( expr_seq )? 'end'
			{
			string_literal62=(Token)match(input,62,FOLLOW_62_in_let773);  
			stream_62.add(string_literal62);

			pushFollow(FOLLOW_declaration_list_in_let775);
			declaration_list63=declaration_list();
			state._fsp--;

			stream_declaration_list.add(declaration_list63.getTree());
			string_literal64=(Token)match(input,61,FOLLOW_61_in_let777);  
			stream_61.add(string_literal64);

			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:123:33: ( expr_seq )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==ID||LA23_0==INT||LA23_0==STRING||LA23_0==34||LA23_0==39||LA23_0==54||LA23_0==58||LA23_0==60||(LA23_0 >= 62 && LA23_0 <= 63)||LA23_0==69) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:123:33: expr_seq
					{
					pushFollow(FOLLOW_expr_seq_in_let779);
					expr_seq65=expr_seq();
					state._fsp--;

					stream_expr_seq.add(expr_seq65.getTree());
					}
					break;

			}

			string_literal66=(Token)match(input,57,FOLLOW_57_in_let782);  
			stream_57.add(string_literal66);

			// AST REWRITE
			// elements: expr_seq, declaration_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 124:5: -> ^( LET declaration_list ( expr_seq )? )
			{
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:124:8: ^( LET declaration_list ( expr_seq )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LET, "LET"), root_1);
				adaptor.addChild(root_1, stream_declaration_list.nextTree());
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:124:31: ( expr_seq )?
				if ( stream_expr_seq.hasNext() ) {
					adaptor.addChild(root_1, stream_expr_seq.nextTree());
				}
				stream_expr_seq.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "let"


	public static class declaration_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration_list"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:127:2: declaration_list : ( declaration )+ -> ^( DECLARATIONS ( declaration )+ ) ;
	public final GrammarParser.declaration_list_return declaration_list() throws RecognitionException {
		GrammarParser.declaration_list_return retval = new GrammarParser.declaration_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope declaration67 =null;

		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:128:3: ( ( declaration )+ -> ^( DECLARATIONS ( declaration )+ ) )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:128:5: ( declaration )+
			{
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:128:5: ( declaration )+
			int cnt24=0;
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==59||(LA24_0 >= 67 && LA24_0 <= 68)) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:128:5: declaration
					{
					pushFollow(FOLLOW_declaration_in_declaration_list815);
					declaration67=declaration();
					state._fsp--;

					stream_declaration.add(declaration67.getTree());
					}
					break;

				default :
					if ( cnt24 >= 1 ) break loop24;
					EarlyExitException eee = new EarlyExitException(24, input);
					throw eee;
				}
				cnt24++;
			}

			// AST REWRITE
			// elements: declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 128:20: -> ^( DECLARATIONS ( declaration )+ )
			{
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:128:23: ^( DECLARATIONS ( declaration )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARATIONS, "DECLARATIONS"), root_1);
				if ( !(stream_declaration.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_declaration.nextTree());
				}
				stream_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration_list"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:132:1: declaration : ( type_declaration -> type_declaration | variable_declaration -> variable_declaration | function_declaration -> function_declaration );
	public final GrammarParser.declaration_return declaration() throws RecognitionException {
		GrammarParser.declaration_return retval = new GrammarParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope type_declaration68 =null;
		ParserRuleReturnScope variable_declaration69 =null;
		ParserRuleReturnScope function_declaration70 =null;

		RewriteRuleSubtreeStream stream_variable_declaration=new RewriteRuleSubtreeStream(adaptor,"rule variable_declaration");
		RewriteRuleSubtreeStream stream_type_declaration=new RewriteRuleSubtreeStream(adaptor,"rule type_declaration");
		RewriteRuleSubtreeStream stream_function_declaration=new RewriteRuleSubtreeStream(adaptor,"rule function_declaration");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:133:2: ( type_declaration -> type_declaration | variable_declaration -> variable_declaration | function_declaration -> function_declaration )
			int alt25=3;
			switch ( input.LA(1) ) {
			case 67:
				{
				alt25=1;
				}
				break;
			case 68:
				{
				alt25=2;
				}
				break;
			case 59:
				{
				alt25=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:133:4: type_declaration
					{
					pushFollow(FOLLOW_type_declaration_in_declaration845);
					type_declaration68=type_declaration();
					state._fsp--;

					stream_type_declaration.add(type_declaration68.getTree());
					// AST REWRITE
					// elements: type_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 133:22: -> type_declaration
					{
						adaptor.addChild(root_0, stream_type_declaration.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:134:4: variable_declaration
					{
					pushFollow(FOLLOW_variable_declaration_in_declaration856);
					variable_declaration69=variable_declaration();
					state._fsp--;

					stream_variable_declaration.add(variable_declaration69.getTree());
					// AST REWRITE
					// elements: variable_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 134:26: -> variable_declaration
					{
						adaptor.addChild(root_0, stream_variable_declaration.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:135:4: function_declaration
					{
					pushFollow(FOLLOW_function_declaration_in_declaration867);
					function_declaration70=function_declaration();
					state._fsp--;

					stream_function_declaration.add(function_declaration70.getTree());
					// AST REWRITE
					// elements: function_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 135:26: -> function_declaration
					{
						adaptor.addChild(root_0, stream_function_declaration.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class type_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_declaration"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:138:1: type_declaration : 'type' ID '=' type_def -> ^( DECL_TYPE ID type_def ) ;
	public final GrammarParser.type_declaration_return type_declaration() throws RecognitionException {
		GrammarParser.type_declaration_return retval = new GrammarParser.type_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal71=null;
		Token ID72=null;
		Token char_literal73=null;
		ParserRuleReturnScope type_def74 =null;

		Object string_literal71_tree=null;
		Object ID72_tree=null;
		Object char_literal73_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_type_def=new RewriteRuleSubtreeStream(adaptor,"rule type_def");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:139:2: ( 'type' ID '=' type_def -> ^( DECL_TYPE ID type_def ) )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:139:4: 'type' ID '=' type_def
			{
			string_literal71=(Token)match(input,67,FOLLOW_67_in_type_declaration886);  
			stream_67.add(string_literal71);

			ID72=(Token)match(input,ID,FOLLOW_ID_in_type_declaration888);  
			stream_ID.add(ID72);

			char_literal73=(Token)match(input,48,FOLLOW_48_in_type_declaration892);  
			stream_48.add(char_literal73);

			pushFollow(FOLLOW_type_def_in_type_declaration894);
			type_def74=type_def();
			state._fsp--;

			stream_type_def.add(type_def74.getTree());
			// AST REWRITE
			// elements: type_def, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 140:4: -> ^( DECL_TYPE ID type_def )
			{
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:140:7: ^( DECL_TYPE ID type_def )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL_TYPE, "DECL_TYPE"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_type_def.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_declaration"


	public static class type_def_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_def"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:144:1: type_def : ( ID -> ID | '{' ( type_fields )? '}' -> ( type_fields )? | 'array' 'of' ID -> ^( DEF_ARRAY ID ) );
	public final GrammarParser.type_def_return type_def() throws RecognitionException {
		GrammarParser.type_def_return retval = new GrammarParser.type_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID75=null;
		Token char_literal76=null;
		Token char_literal78=null;
		Token string_literal79=null;
		Token string_literal80=null;
		Token ID81=null;
		ParserRuleReturnScope type_fields77 =null;

		Object ID75_tree=null;
		Object char_literal76_tree=null;
		Object char_literal78_tree=null;
		Object string_literal79_tree=null;
		Object string_literal80_tree=null;
		Object ID81_tree=null;
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_type_fields=new RewriteRuleSubtreeStream(adaptor,"rule type_fields");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:145:2: ( ID -> ID | '{' ( type_fields )? '}' -> ( type_fields )? | 'array' 'of' ID -> ^( DEF_ARRAY ID ) )
			int alt27=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt27=1;
				}
				break;
			case 70:
				{
				alt27=2;
				}
				break;
			case 53:
				{
				alt27=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:145:4: ID
					{
					ID75=(Token)match(input,ID,FOLLOW_ID_in_type_def921);  
					stream_ID.add(ID75);

					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 145:22: -> ID
					{
						adaptor.addChild(root_0, stream_ID.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:146:4: '{' ( type_fields )? '}'
					{
					char_literal76=(Token)match(input,70,FOLLOW_70_in_type_def935);  
					stream_70.add(char_literal76);

					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:146:8: ( type_fields )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==ID) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:146:8: type_fields
							{
							pushFollow(FOLLOW_type_fields_in_type_def937);
							type_fields77=type_fields();
							state._fsp--;

							stream_type_fields.add(type_fields77.getTree());
							}
							break;

					}

					char_literal78=(Token)match(input,72,FOLLOW_72_in_type_def940);  
					stream_72.add(char_literal78);

					// AST REWRITE
					// elements: type_fields
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 146:27: -> ( type_fields )?
					{
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:146:30: ( type_fields )?
						if ( stream_type_fields.hasNext() ) {
							adaptor.addChild(root_0, stream_type_fields.nextTree());
						}
						stream_type_fields.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:147:4: 'array' 'of' ID
					{
					string_literal79=(Token)match(input,53,FOLLOW_53_in_type_def952);  
					stream_53.add(string_literal79);

					string_literal80=(Token)match(input,64,FOLLOW_64_in_type_def955);  
					stream_64.add(string_literal80);

					ID81=(Token)match(input,ID,FOLLOW_ID_in_type_def957);  
					stream_ID.add(ID81);

					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 147:34: -> ^( DEF_ARRAY ID )
					{
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:147:37: ^( DEF_ARRAY ID )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEF_ARRAY, "DEF_ARRAY"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_def"


	public static class type_field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_field"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:150:1: type_field : id= ID ':' type_id= ID -> ^( FIELD $id $type_id) ;
	public final GrammarParser.type_field_return type_field() throws RecognitionException {
		GrammarParser.type_field_return retval = new GrammarParser.type_field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token id=null;
		Token type_id=null;
		Token char_literal82=null;

		Object id_tree=null;
		Object type_id_tree=null;
		Object char_literal82_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:151:2: (id= ID ':' type_id= ID -> ^( FIELD $id $type_id) )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:151:4: id= ID ':' type_id= ID
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_type_field984);  
			stream_ID.add(id);

			char_literal82=(Token)match(input,42,FOLLOW_42_in_type_field986);  
			stream_42.add(char_literal82);

			type_id=(Token)match(input,ID,FOLLOW_ID_in_type_field990);  
			stream_ID.add(type_id);

			// AST REWRITE
			// elements: id, type_id
			// token labels: type_id, id
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_type_id=new RewriteRuleTokenStream(adaptor,"token type_id",type_id);
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 152:4: -> ^( FIELD $id $type_id)
			{
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:152:7: ^( FIELD $id $type_id)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELD, "FIELD"), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_type_id.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_field"


	public static class variable_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variable_declaration"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:155:1: variable_declaration : 'var' name= ID ( ':' type_id= ID )? ':=' expr -> ^( DECL_VAR $name ( $type_id)? expr ) ;
	public final GrammarParser.variable_declaration_return variable_declaration() throws RecognitionException {
		GrammarParser.variable_declaration_return retval = new GrammarParser.variable_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token name=null;
		Token type_id=null;
		Token string_literal83=null;
		Token char_literal84=null;
		Token string_literal85=null;
		ParserRuleReturnScope expr86 =null;

		Object name_tree=null;
		Object type_id_tree=null;
		Object string_literal83_tree=null;
		Object char_literal84_tree=null;
		Object string_literal85_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:156:2: ( 'var' name= ID ( ':' type_id= ID )? ':=' expr -> ^( DECL_VAR $name ( $type_id)? expr ) )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:156:4: 'var' name= ID ( ':' type_id= ID )? ':=' expr
			{
			string_literal83=(Token)match(input,68,FOLLOW_68_in_variable_declaration1019);  
			stream_68.add(string_literal83);

			name=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration1023);  
			stream_ID.add(name);

			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:156:18: ( ':' type_id= ID )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==42) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:156:19: ':' type_id= ID
					{
					char_literal84=(Token)match(input,42,FOLLOW_42_in_variable_declaration1026);  
					stream_42.add(char_literal84);

					type_id=(Token)match(input,ID,FOLLOW_ID_in_variable_declaration1030);  
					stream_ID.add(type_id);

					}
					break;

			}

			string_literal85=(Token)match(input,43,FOLLOW_43_in_variable_declaration1035);  
			stream_43.add(string_literal85);

			pushFollow(FOLLOW_expr_in_variable_declaration1037);
			expr86=expr();
			state._fsp--;

			stream_expr.add(expr86.getTree());
			// AST REWRITE
			// elements: type_id, expr, name
			// token labels: type_id, name
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_type_id=new RewriteRuleTokenStream(adaptor,"token type_id",type_id);
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 157:4: -> ^( DECL_VAR $name ( $type_id)? expr )
			{
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:157:7: ^( DECL_VAR $name ( $type_id)? expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL_VAR, "DECL_VAR"), root_1);
				adaptor.addChild(root_1, stream_name.nextNode());
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:157:25: ( $type_id)?
				if ( stream_type_id.hasNext() ) {
					adaptor.addChild(root_1, stream_type_id.nextNode());
				}
				stream_type_id.reset();

				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable_declaration"


	public static class function_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_declaration"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:161:1: function_declaration : 'function' name= ID '(' ( type_fields )? ')' ( ':' type_return= ID )? '=' expr -> ^( DECL_FCT $name ( type_fields )? ( $type_return)? expr ) ;
	public final GrammarParser.function_declaration_return function_declaration() throws RecognitionException {
		GrammarParser.function_declaration_return retval = new GrammarParser.function_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token name=null;
		Token type_return=null;
		Token string_literal87=null;
		Token char_literal88=null;
		Token char_literal90=null;
		Token char_literal91=null;
		Token char_literal92=null;
		ParserRuleReturnScope type_fields89 =null;
		ParserRuleReturnScope expr93 =null;

		Object name_tree=null;
		Object type_return_tree=null;
		Object string_literal87_tree=null;
		Object char_literal88_tree=null;
		Object char_literal90_tree=null;
		Object char_literal91_tree=null;
		Object char_literal92_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_type_fields=new RewriteRuleSubtreeStream(adaptor,"rule type_fields");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:162:2: ( 'function' name= ID '(' ( type_fields )? ')' ( ':' type_return= ID )? '=' expr -> ^( DECL_FCT $name ( type_fields )? ( $type_return)? expr ) )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:162:4: 'function' name= ID '(' ( type_fields )? ')' ( ':' type_return= ID )? '=' expr
			{
			string_literal87=(Token)match(input,59,FOLLOW_59_in_function_declaration1070);  
			stream_59.add(string_literal87);

			name=(Token)match(input,ID,FOLLOW_ID_in_function_declaration1074);  
			stream_ID.add(name);

			char_literal88=(Token)match(input,34,FOLLOW_34_in_function_declaration1077);  
			stream_34.add(char_literal88);

			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:162:28: ( type_fields )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ID) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:162:28: type_fields
					{
					pushFollow(FOLLOW_type_fields_in_function_declaration1079);
					type_fields89=type_fields();
					state._fsp--;

					stream_type_fields.add(type_fields89.getTree());
					}
					break;

			}

			char_literal90=(Token)match(input,35,FOLLOW_35_in_function_declaration1082);  
			stream_35.add(char_literal90);

			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:162:45: ( ':' type_return= ID )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==42) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:162:46: ':' type_return= ID
					{
					char_literal91=(Token)match(input,42,FOLLOW_42_in_function_declaration1085);  
					stream_42.add(char_literal91);

					type_return=(Token)match(input,ID,FOLLOW_ID_in_function_declaration1089);  
					stream_ID.add(type_return);

					}
					break;

			}

			char_literal92=(Token)match(input,48,FOLLOW_48_in_function_declaration1094);  
			stream_48.add(char_literal92);

			pushFollow(FOLLOW_expr_in_function_declaration1096);
			expr93=expr();
			state._fsp--;

			stream_expr.add(expr93.getTree());
			// AST REWRITE
			// elements: expr, type_return, name, type_fields
			// token labels: name, type_return
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleTokenStream stream_type_return=new RewriteRuleTokenStream(adaptor,"token type_return",type_return);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 163:4: -> ^( DECL_FCT $name ( type_fields )? ( $type_return)? expr )
			{
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:163:7: ^( DECL_FCT $name ( type_fields )? ( $type_return)? expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL_FCT, "DECL_FCT"), root_1);
				adaptor.addChild(root_1, stream_name.nextNode());
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:163:24: ( type_fields )?
				if ( stream_type_fields.hasNext() ) {
					adaptor.addChild(root_1, stream_type_fields.nextTree());
				}
				stream_type_fields.reset();

				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:163:38: ( $type_return)?
				if ( stream_type_return.hasNext() ) {
					adaptor.addChild(root_1, stream_type_return.nextNode());
				}
				stream_type_return.reset();

				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_declaration"


	public static class type_fields_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_fields"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:167:1: type_fields : type_field ( ',' type_field )* -> ^( FIELDS ( type_field )+ ) ;
	public final GrammarParser.type_fields_return type_fields() throws RecognitionException {
		GrammarParser.type_fields_return retval = new GrammarParser.type_fields_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal95=null;
		ParserRuleReturnScope type_field94 =null;
		ParserRuleReturnScope type_field96 =null;

		Object char_literal95_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_type_field=new RewriteRuleSubtreeStream(adaptor,"rule type_field");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:168:2: ( type_field ( ',' type_field )* -> ^( FIELDS ( type_field )+ ) )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:168:4: type_field ( ',' type_field )*
			{
			pushFollow(FOLLOW_type_field_in_type_fields1132);
			type_field94=type_field();
			state._fsp--;

			stream_type_field.add(type_field94.getTree());
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:168:15: ( ',' type_field )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==38) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:168:16: ',' type_field
					{
					char_literal95=(Token)match(input,38,FOLLOW_38_in_type_fields1135);  
					stream_38.add(char_literal95);

					pushFollow(FOLLOW_type_field_in_type_fields1137);
					type_field96=type_field();
					state._fsp--;

					stream_type_field.add(type_field96.getTree());
					}
					break;

				default :
					break loop31;
				}
			}

			// AST REWRITE
			// elements: type_field
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 168:34: -> ^( FIELDS ( type_field )+ )
			{
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:168:37: ^( FIELDS ( type_field )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELDS, "FIELDS"), root_1);
				if ( !(stream_type_field.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_type_field.hasNext() ) {
					adaptor.addChild(root_1, stream_type_field.nextTree());
				}
				stream_type_field.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_fields"


	public static class loop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "loop"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:173:1: loop : ( 'while' cond= expr 'do' e= expr -> ^( WHILE ^( COND $cond) ^( BODY $e) ) | 'for' ID ':=' inf= expr 'to' sup= expr 'do' e= expr -> ^( FOR ID ^( BORNE_INF $inf) ^( BORNE_SUP $sup) ^( BODY $e) ) );
	public final GrammarParser.loop_return loop() throws RecognitionException {
		GrammarParser.loop_return retval = new GrammarParser.loop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal97=null;
		Token string_literal98=null;
		Token string_literal99=null;
		Token ID100=null;
		Token string_literal101=null;
		Token string_literal102=null;
		Token string_literal103=null;
		ParserRuleReturnScope cond =null;
		ParserRuleReturnScope e =null;
		ParserRuleReturnScope inf =null;
		ParserRuleReturnScope sup =null;

		Object string_literal97_tree=null;
		Object string_literal98_tree=null;
		Object string_literal99_tree=null;
		Object ID100_tree=null;
		Object string_literal101_tree=null;
		Object string_literal102_tree=null;
		Object string_literal103_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:174:3: ( 'while' cond= expr 'do' e= expr -> ^( WHILE ^( COND $cond) ^( BODY $e) ) | 'for' ID ':=' inf= expr 'to' sup= expr 'do' e= expr -> ^( FOR ID ^( BORNE_INF $inf) ^( BORNE_SUP $sup) ^( BODY $e) ) )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==69) ) {
				alt32=1;
			}
			else if ( (LA32_0==58) ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:174:5: 'while' cond= expr 'do' e= expr
					{
					string_literal97=(Token)match(input,69,FOLLOW_69_in_loop1165);  
					stream_69.add(string_literal97);

					pushFollow(FOLLOW_expr_in_loop1169);
					cond=expr();
					state._fsp--;

					stream_expr.add(cond.getTree());
					string_literal98=(Token)match(input,55,FOLLOW_55_in_loop1172);  
					stream_55.add(string_literal98);

					pushFollow(FOLLOW_expr_in_loop1176);
					e=expr();
					state._fsp--;

					stream_expr.add(e.getTree());
					// AST REWRITE
					// elements: e, cond
					// token labels: 
					// rule labels: e, cond, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
					RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond",cond!=null?cond.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 175:5: -> ^( WHILE ^( COND $cond) ^( BODY $e) )
					{
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:175:8: ^( WHILE ^( COND $cond) ^( BODY $e) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:175:16: ^( COND $cond)
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
						adaptor.addChild(root_2, stream_cond.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:175:30: ^( BODY $e)
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);
						adaptor.addChild(root_2, stream_e.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:176:5: 'for' ID ':=' inf= expr 'to' sup= expr 'do' e= expr
					{
					string_literal99=(Token)match(input,58,FOLLOW_58_in_loop1207);  
					stream_58.add(string_literal99);

					ID100=(Token)match(input,ID,FOLLOW_ID_in_loop1209);  
					stream_ID.add(ID100);

					string_literal101=(Token)match(input,43,FOLLOW_43_in_loop1211);  
					stream_43.add(string_literal101);

					pushFollow(FOLLOW_expr_in_loop1215);
					inf=expr();
					state._fsp--;

					stream_expr.add(inf.getTree());
					string_literal102=(Token)match(input,66,FOLLOW_66_in_loop1217);  
					stream_66.add(string_literal102);

					pushFollow(FOLLOW_expr_in_loop1221);
					sup=expr();
					state._fsp--;

					stream_expr.add(sup.getTree());
					string_literal103=(Token)match(input,55,FOLLOW_55_in_loop1223);  
					stream_55.add(string_literal103);

					pushFollow(FOLLOW_expr_in_loop1227);
					e=expr();
					state._fsp--;

					stream_expr.add(e.getTree());
					// AST REWRITE
					// elements: inf, e, ID, sup
					// token labels: 
					// rule labels: inf, e, retval, sup
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_inf=new RewriteRuleSubtreeStream(adaptor,"rule inf",inf!=null?inf.getTree():null);
					RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_sup=new RewriteRuleSubtreeStream(adaptor,"rule sup",sup!=null?sup.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 177:5: -> ^( FOR ID ^( BORNE_INF $inf) ^( BORNE_SUP $sup) ^( BODY $e) )
					{
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:177:8: ^( FOR ID ^( BORNE_INF $inf) ^( BORNE_SUP $sup) ^( BODY $e) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:177:17: ^( BORNE_INF $inf)
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BORNE_INF, "BORNE_INF"), root_2);
						adaptor.addChild(root_2, stream_inf.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:177:35: ^( BORNE_SUP $sup)
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BORNE_SUP, "BORNE_SUP"), root_2);
						adaptor.addChild(root_2, stream_sup.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:177:53: ^( BODY $e)
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_2);
						adaptor.addChild(root_2, stream_e.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "loop"


	public static class condition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condition"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:180:1: condition : 'if' cond= expr 'then' e1= expr ( options {greedy=true; } : 'else' e2= expr )? -> ^( IF ^( COND $cond) ^( THEN $e1) ( ^( ELSE $e2) )? ) ;
	public final GrammarParser.condition_return condition() throws RecognitionException {
		GrammarParser.condition_return retval = new GrammarParser.condition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal104=null;
		Token string_literal105=null;
		Token string_literal106=null;
		ParserRuleReturnScope cond =null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		Object string_literal104_tree=null;
		Object string_literal105_tree=null;
		Object string_literal106_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:181:3: ( 'if' cond= expr 'then' e1= expr ( options {greedy=true; } : 'else' e2= expr )? -> ^( IF ^( COND $cond) ^( THEN $e1) ( ^( ELSE $e2) )? ) )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:181:5: 'if' cond= expr 'then' e1= expr ( options {greedy=true; } : 'else' e2= expr )?
			{
			string_literal104=(Token)match(input,60,FOLLOW_60_in_condition1276);  
			stream_60.add(string_literal104);

			pushFollow(FOLLOW_expr_in_condition1280);
			cond=expr();
			state._fsp--;

			stream_expr.add(cond.getTree());
			string_literal105=(Token)match(input,65,FOLLOW_65_in_condition1282);  
			stream_65.add(string_literal105);

			pushFollow(FOLLOW_expr_in_condition1286);
			e1=expr();
			state._fsp--;

			stream_expr.add(e1.getTree());
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:181:35: ( options {greedy=true; } : 'else' e2= expr )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==56) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:181:62: 'else' e2= expr
					{
					string_literal106=(Token)match(input,56,FOLLOW_56_in_condition1299);  
					stream_56.add(string_literal106);

					pushFollow(FOLLOW_expr_in_condition1303);
					e2=expr();
					state._fsp--;

					stream_expr.add(e2.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: e2, cond, e1
			// token labels: 
			// rule labels: cond, e1, e2, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond",cond!=null?cond.getTree():null);
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
			RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 182:5: -> ^( IF ^( COND $cond) ^( THEN $e1) ( ^( ELSE $e2) )? )
			{
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:182:8: ^( IF ^( COND $cond) ^( THEN $e1) ( ^( ELSE $e2) )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:182:13: ^( COND $cond)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND, "COND"), root_2);
				adaptor.addChild(root_2, stream_cond.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:182:27: ^( THEN $e1)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);
				adaptor.addChild(root_2, stream_e1.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:182:39: ( ^( ELSE $e2) )?
				if ( stream_e2.hasNext() ) {
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:182:39: ^( ELSE $e2)
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);
					adaptor.addChild(root_2, stream_e2.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_e2.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condition"


	public static class expr_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_list"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:187:1: expr_list : expr ( ',' expr )* -> ( expr )+ ;
	public final GrammarParser.expr_list_return expr_list() throws RecognitionException {
		GrammarParser.expr_list_return retval = new GrammarParser.expr_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal108=null;
		ParserRuleReturnScope expr107 =null;
		ParserRuleReturnScope expr109 =null;

		Object char_literal108_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:188:3: ( expr ( ',' expr )* -> ( expr )+ )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:188:5: expr ( ',' expr )*
			{
			pushFollow(FOLLOW_expr_in_expr_list1358);
			expr107=expr();
			state._fsp--;

			stream_expr.add(expr107.getTree());
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:188:10: ( ',' expr )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==38) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:188:11: ',' expr
					{
					char_literal108=(Token)match(input,38,FOLLOW_38_in_expr_list1361);  
					stream_38.add(char_literal108);

					pushFollow(FOLLOW_expr_in_expr_list1363);
					expr109=expr();
					state._fsp--;

					stream_expr.add(expr109.getTree());
					}
					break;

				default :
					break loop34;
				}
			}

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 188:24: -> ( expr )+
			{
				if ( !(stream_expr.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_0, stream_expr.nextTree());
				}
				stream_expr.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_list"


	public static class expr_seq_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_seq"
	// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:193:1: expr_seq : expr ( ';' expr )* -> ^( SEQUENCE ( expr )+ ) ;
	public final GrammarParser.expr_seq_return expr_seq() throws RecognitionException {
		GrammarParser.expr_seq_return retval = new GrammarParser.expr_seq_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal111=null;
		ParserRuleReturnScope expr110 =null;
		ParserRuleReturnScope expr112 =null;

		Object char_literal111_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:194:2: ( expr ( ';' expr )* -> ^( SEQUENCE ( expr )+ ) )
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:194:4: expr ( ';' expr )*
			{
			pushFollow(FOLLOW_expr_in_expr_seq1390);
			expr110=expr();
			state._fsp--;

			stream_expr.add(expr110.getTree());
			// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:194:9: ( ';' expr )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==44) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:194:10: ';' expr
					{
					char_literal111=(Token)match(input,44,FOLLOW_44_in_expr_seq1393);  
					stream_44.add(char_literal111);

					pushFollow(FOLLOW_expr_in_expr_seq1395);
					expr112=expr();
					state._fsp--;

					stream_expr.add(expr112.getTree());
					}
					break;

				default :
					break loop35;
				}
			}

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 194:23: -> ^( SEQUENCE ( expr )+ )
			{
				// /Users/jean-baptistedominguez/PCL/grammaire/Grammar.g:194:26: ^( SEQUENCE ( expr )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);
				if ( !(stream_expr.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_1, stream_expr.nextTree());
				}
				stream_expr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_seq"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_prog143 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_expr167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_expr178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_in_expr189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condition_in_expr204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_let_in_expr214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operation_in_expr226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orOperation_in_operation243 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_operation256 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_operation260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_field_list279 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_field_list281 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_field_list287 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_field_list290 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_field_list_in_field_list296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_andOperation_in_orOperation330 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_orOperation343 = new BitSet(new long[]{0x8000008400480000L});
	public static final BitSet FOLLOW_andOperation_in_orOperation347 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_booleanOperation_in_andOperation361 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_33_in_andOperation374 = new BitSet(new long[]{0x8000008400480000L});
	public static final BitSet FOLLOW_booleanOperation_in_andOperation378 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_arithmeticOperation_in_booleanOperation393 = new BitSet(new long[]{0x0007E00000000002L});
	public static final BitSet FOLLOW_48_in_booleanOperation406 = new BitSet(new long[]{0x8000008400480000L});
	public static final BitSet FOLLOW_47_in_booleanOperation411 = new BitSet(new long[]{0x8000008400480000L});
	public static final BitSet FOLLOW_49_in_booleanOperation416 = new BitSet(new long[]{0x8000008400480000L});
	public static final BitSet FOLLOW_45_in_booleanOperation421 = new BitSet(new long[]{0x8000008400480000L});
	public static final BitSet FOLLOW_50_in_booleanOperation426 = new BitSet(new long[]{0x8000008400480000L});
	public static final BitSet FOLLOW_46_in_booleanOperation431 = new BitSet(new long[]{0x8000008400480000L});
	public static final BitSet FOLLOW_arithmeticOperation_in_booleanOperation435 = new BitSet(new long[]{0x0007E00000000002L});
	public static final BitSet FOLLOW_multExpr_in_arithmeticOperation450 = new BitSet(new long[]{0x000000A000000002L});
	public static final BitSet FOLLOW_37_in_arithmeticOperation463 = new BitSet(new long[]{0x8000008400480000L});
	public static final BitSet FOLLOW_39_in_arithmeticOperation468 = new BitSet(new long[]{0x8000008400480000L});
	public static final BitSet FOLLOW_multExpr_in_arithmeticOperation473 = new BitSet(new long[]{0x000000A000000002L});
	public static final BitSet FOLLOW_minus_in_multExpr491 = new BitSet(new long[]{0x0000021000000002L});
	public static final BitSet FOLLOW_36_in_multExpr505 = new BitSet(new long[]{0x8000008400480000L});
	public static final BitSet FOLLOW_41_in_multExpr509 = new BitSet(new long[]{0x8000008400480000L});
	public static final BitSet FOLLOW_minus_in_multExpr514 = new BitSet(new long[]{0x0000021000000002L});
	public static final BitSet FOLLOW_39_in_minus533 = new BitSet(new long[]{0x8000000400480000L});
	public static final BitSet FOLLOW_atom_in_minus538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_atom564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom578 = new BitSet(new long[]{0x0008010400000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_after_id_in_atom580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_atom597 = new BitSet(new long[]{0xD440008C10480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_seq_in_atom599 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_atom602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_after_id623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_after_id630 = new BitSet(new long[]{0xD440008C10480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_list_in_after_id632 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_after_id635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_after_id650 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
	public static final BitSet FOLLOW_field_list_in_after_id653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_after_id657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_lvalue678 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_lvalue680 = new BitSet(new long[]{0x0008010000000002L});
	public static final BitSet FOLLOW_lvalue_in_lvalue682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_lvalue702 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_lvalue703 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_lvalue704 = new BitSet(new long[]{0x0008010000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_crochet_in_lvalue705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_crochet736 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_crochet738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_crochet752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_let773 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000018L});
	public static final BitSet FOLLOW_declaration_list_in_let775 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_let777 = new BitSet(new long[]{0xD640008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_seq_in_let779 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_let782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declaration_list815 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000018L});
	public static final BitSet FOLLOW_type_declaration_in_declaration845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_declaration_in_declaration856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_declaration_in_declaration867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_type_declaration886 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_type_declaration888 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_type_declaration892 = new BitSet(new long[]{0x0020000000080000L,0x0000000000000040L});
	public static final BitSet FOLLOW_type_def_in_type_declaration894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type_def921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_type_def935 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
	public static final BitSet FOLLOW_type_fields_in_type_def937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_type_def940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_type_def952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_type_def955 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_type_def957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type_field984 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_type_field986 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_type_field990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_variable_declaration1019 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_variable_declaration1023 = new BitSet(new long[]{0x00000C0000000000L});
	public static final BitSet FOLLOW_42_in_variable_declaration1026 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_variable_declaration1030 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_variable_declaration1035 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_variable_declaration1037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_function_declaration1070 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_function_declaration1074 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_function_declaration1077 = new BitSet(new long[]{0x0000000800080000L});
	public static final BitSet FOLLOW_type_fields_in_function_declaration1079 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_function_declaration1082 = new BitSet(new long[]{0x0001040000000000L});
	public static final BitSet FOLLOW_42_in_function_declaration1085 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_function_declaration1089 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_function_declaration1094 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_function_declaration1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_field_in_type_fields1132 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_type_fields1135 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_type_field_in_type_fields1137 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_69_in_loop1165 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_loop1169 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_loop1172 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_loop1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_loop1207 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_loop1209 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_loop1211 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_loop1215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_loop1217 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_loop1221 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_loop1223 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_loop1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_condition1276 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_condition1280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_condition1282 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_condition1286 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_condition1299 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_condition1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_list1358 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_expr_list1361 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_expr_list1363 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_expr_in_expr_seq1390 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_expr_seq1393 = new BitSet(new long[]{0xD440008410480000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_expr_seq1395 = new BitSet(new long[]{0x0000100000000002L});
}
