import java.io.IOException;
import java.util.HashMap;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import output.GrammarLexer;
import output.GrammarParser;
import output.GrammarParser.prog_return;


public class Application {
	
	private static HashMap<String, String> tabSymbol = new HashMap<String, String> ();

	public static void main(String[] args) {
		ANTLRFileStream input;
		try {
			input = new ANTLRFileStream("tiger/prog.tiger");
			GrammarLexer lexer = new GrammarLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			tokens.setTokenSource(lexer);

			GrammarParser parser = new GrammarParser(tokens);
			prog_return r = parser.prog();
			CommonTree t = (CommonTree) r.getTree();
			
			
			browseTree(t);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void browseTree(Tree tree) {
		if (!tree.isNil()) {
			System.out.println(tree.getText());
			System.out.println(tree.toStringTree());
			tabSymbol.put(tree.getText(), tree.toStringTree());
			for (int i = 0; i < tree.getChildCount(); i++) {
				browseTree(tree.getChild(i));
			}
		}
	}

}
