import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import output.GrammarLexer;
import output.GrammarParser;
import output.GrammarParser.prog_return;


public class Application {
	
	private static LinkedHashMap<String, Symbol> tabSymbol = new LinkedHashMap<String, Symbol> ();
	
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
			
			browseTree(t, null);
			
			
			/*for (Symbol sym : tabSymbol.values()) {
				System.out.println(sym.toString());
			}*/
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void browseTree(Tree tree, SymbolTable st) {
		
		System.out.println(st);
		
		String id;
		Symbol symbol = null;
		Tree currentChild = null;
		String type = null;
		
		if (!tree.isNil()) {
			System.out.println(tree.getText() + " / " + ((st != null) ? st.getLevel() : "-1"));
			//System.out.println(tree.toStringTree());
			//tabSymbol.put(tree.getText(), );
			for (int i = 0; i < tree.getChildCount(); i++) {
				
				currentChild = tree.getChild(i);
				
				switch (currentChild.getText()) {
					case "PROG":
						browseTree(currentChild, new SymbolTable(st, "PROG"));
						break;
						
					case "LET":
						browseTree(currentChild, new SymbolTable(st, "LET"));
						break;
	
					case "DECL_VAR":
						
						try {
							
							Analyze.decVar(tree.getChild(i), st);
						
							switch (currentChild.getChildCount()) {
								case 2:
									try {
										Integer.parseInt(currentChild.getChild(2).getText());
										type = "int";
									}
									catch (Exception e) {
										type = "String";
									}
									symbol = new Symbol(type);
		
								case 3:
									symbol = new Symbol(currentChild.getChild(1).getText());
									
								default:
									id = currentChild.getChild(0).getText();
									st.getSymbols().put(id, symbol);
									break;
							}
							
							
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
						
						break;
						
					case "DECL_TYPE":
						
						boolean isTable = false;
						id = currentChild.getChild(0).getText();
						
						switch (currentChild.getChild(1).getChildCount()) {
						case 0:
							type = currentChild.getChild(1).getText();
							
						case 1:
							type = currentChild.getChild(1).getChild(0).getText();
							isTable = true;
							
						default:
							symbol = new Symbol(type);
							symbol.setTable(isTable);
							break;
						}
						
						st.getSymbols().put(id, symbol);
						break;
						
					case "DECL_FCT":
						
						id = currentChild.getChild(0).getText();
						System.out.println("ID="+id);
						symbol = new Symbol(type);
						symbol.setFunction(true);
						//System.out.println("SEQ=" + tree.getChild(i).getChild(3).getText());
						
						SymbolTable stFct = new SymbolTable(st, "DECL_FCT");
						
						
						// On teste s'il y a des paramètres
						if (currentChild.getChild(1).getText().equals("FIELDS")) {
							
							Tree t = currentChild.getChild(1);
							for (int j = 0; j < t.getChildCount(); j++) {
								symbol.getArguments().add(new Argument(t.getChild(j).getChild(0).getText(), t.getChild(j).getChild(1).getText()));
							}
						}
						
						Argument currentArgument;
						for (int j = 0; j < symbol.getArguments().size(); j++) {
							currentArgument = symbol.getArguments().get(j);
							stFct.getSymbols().put(currentArgument.getId(), new Symbol(currentArgument.getType()));
						}
						
						st.getSymbols().put(id, symbol);
						browseTree(currentChild, stFct);
						break;
						
					default:
						browseTree(currentChild, st);
						break;
				}
			}
		}
	}
	
}

class Analyze {

	public static void decVar(Tree child, SymbolTable st) throws Exception {
		//throw new Exception("Erreur de déclaration ligne " + child.getCharPositionInLine() + " (" + child.toStringTree() + ")");
	}
	
}

class Argument {
	private String id;
	private String type;
	
	public Argument(String id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	
	public String getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Argument [id=" + id + ", type=" + type + "]";
	}
	
}

class Symbol {
	private String type;
	LinkedHashMap<String, Symbol> symbols = new LinkedHashMap<String, Symbol>(); 
	private LinkedList<Argument> arguments = new LinkedList<Argument>();
	private boolean isTable;
	private boolean isFunction;
	
	public Symbol(String type) {
		super();
		this.type = type;
	}
	
	public void setTable(boolean isTable) {
		this.isTable = isTable;
	}
	
	public void setFunction(boolean isFunction) {
		this.isFunction = isFunction;
	}
	
	public LinkedList<Argument> getArguments() {
		return arguments;
	}
	
	@Override
	public String toString() {
		return "Symbol [type=" + type + ", symbols=" + symbols + ", arguments="
				+ arguments + ", isTable="
				+ isTable + ", isFunction=" + isFunction + "]\n";
	}
	
}

class SymbolTable {
	private SymbolTable parent;
	private LinkedHashMap<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();
	private int level;
	private String token;
	
	public SymbolTable(SymbolTable st, String token) {
		this.parent = st;
		if (st != null) {
			this.level=st.getLevel()+1;
		}
		else {
			this.level = 0;
		}
		this.token = token;
	}
	
	public int getLevel() {
		return level;
	}

	public LinkedHashMap<String, Symbol> getSymbols() {
		return symbols;
	}

	@Override
	public String toString() {
		return "\nSymbolTable [parent=" + parent + ", symbols=" + symbols
				+ ", level=" + level + ", token=" + token + "]\n";
	}

	
	
	
}