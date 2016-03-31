import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;

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
			
			browseTree(t, null, 0);
			
			
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
	
	private static void browseTree(Tree tree, SymbolTable st, int countLet) {
		
		//System.out.println(st);
		//System.out.println(countLevel);
		
		String id;
		Symbol symbol = null;
		Tree currentChild = null;
		String type = null;
		
		if (!tree.isNil()) {
			
			//System.out.println(tree.getText() + " / " + ((st != null) ? st.getLevel() : "-1"));
			//System.out.println(tree.toStringTree());
			//tabSymbol.put(tree.getText(), );
			for (int i = 0; i < tree.getChildCount(); i++) {
				
				
				currentChild = tree.getChild(i);

				System.out.println(currentChild.getText());
				
				switch (currentChild.getText()) {
					
					case "SEQUENCE":
						break;
				
					case "PROG":
						browseTree(currentChild, st, countLet);
						break;
						
					case "LET":
						browseTree(currentChild, new SymbolTable(st, "LET"), countLet+1);
						if (countLet-1 == 0) {
							/**
							 * Le code est analysé!
							 */
							System.out.println("--- FIN D'ANALYSE ---");
							System.exit(0);
						}
						break;
	
					case "DECL_VAR":
						
						try {
							
							//Analyze.decVarControl(tree.getChild(i), st);
						
							switch (currentChild.getChildCount()) {
								case 2:
									// S'il a des enfants, on doit chercher le type
									if (currentChild.getChild(1).getChildCount() > 0) {
										Tree currentNode = currentChild.getChild(1);
										boolean find = false;
										while(currentNode.getChildCount() > 0 && !find) {
											for (int j = 0; j < currentNode.getChildCount() && !find; j++) {
												currentNode = currentNode.getChild(j);
												if (currentNode.getChildCount() == 0) {
													type = Symbol.getTypeByString(currentNode.getText());
													if (type.equals("VAR")) {
														type = SymbolTable.findTypeByVar(st, currentNode.getText());
														if (type != null) {
															find = true;
														}
													}
												}
											}
										}
										symbol = new Symbol(type);
									}
									else {
										type = Symbol.getTypeByString(currentChild.getChild(1).getText());
										symbol = new Symbol(type);
									}
									
									id = currentChild.getChild(0).getText();
									st.getSymbols().put(id, symbol);
									break;
								case 3:
									symbol = new Symbol(currentChild.getChild(1).getText());
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
							symbol = new Symbol(type);
							symbol.setTable(isTable);
							break;
							
						case 1:
							type = currentChild.getChild(1).getChild(0).getText();
							isTable = true;
							symbol = new Symbol(type);
							symbol.setTable(isTable);
							break;
						}
						
						st.getSymbols().put(id, symbol);
						break;
						
						/**
						 * A compléter pour des structures complexes
						 */
						
					case "DECL_FCT":
						
						id = currentChild.getChild(0).getText();
						symbol = new Symbol(type);
						symbol.setFunction(true);
						
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
						browseTree(currentChild, stFct, countLet);
						break;
						
					/*case "COND":
						
						// Controle sémentique du COND
						// A faire
						try {
							Analyze.condControl(currentChild, st);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						browseTree(currentChild, st, countLet);
						break;
						*/
					case "FOR":
						
						// Controle sémentique du for
						// A faire
						//Analyze.forControl(currentChild, st);
						browseTree(currentChild, st, countLet);
						break;
						
					case "IF":
						
						// Controle sémentique du if
						// A faire
						//Analyze.ifControl(currentChild, st);
						browseTree(currentChild, st, countLet);
						break;
						
					default:
						browseTree(currentChild, st, countLet);
						break;
				}
			}
		}
	}
	
}

class Analyze {

	public static void decVarControl(Tree child, SymbolTable st) throws Exception {
		//throw new Exception("Erreur de déclaration ligne " + child.getCharPositionInLine() + " (" + child.toStringTree() + ")");
	}

	public static void condControl(Tree child, SymbolTable st) throws Exception {
		System.out.println("------------------------");
		System.out.println("---Condition Control ---");
		if (child.getChild(0).getText().equals("COND")) {
			condControl(child.getChild(0), st);
		}
		else {
			Tree nodeCond = child.getChild(0);
			String leftElt = null, rightElt = null;
			if (nodeCond.getChild(0).getChildCount() == 0) {
				leftElt = nodeCond.getChild(0).getText();
			}
			if (nodeCond.getChild(1).getChildCount() == 0) {
				rightElt = nodeCond.getChild(1).getText();
			}
			
			System.out.println(Symbol.getTypeByString(leftElt));
			String typeLeftElt = Symbol.getTypeByString(leftElt), typeRightElt = Symbol.getTypeByString(rightElt);
			SymbolTable currentSt = st;

			if (typeLeftElt.equals("VAR")) {
				do {
					Set<String> keys = currentSt.getSymbols().keySet();
					if (!keys.contains(leftElt)) {
						if (currentSt.getParent() != null) {
							currentSt = currentSt.getParent();
						}
						else {
							throw new Exception("Erreur variable non déclarée" + child.getCharPositionInLine());
						}
					}
					else {
						typeLeftElt = currentSt.getSymbols().get(leftElt).getType();
						break;
					}
				}
				while (currentSt.getParent() != null);
			}
			
			if (typeRightElt.equals("VAR")) {
				do {
					Set<String> keys = currentSt.getSymbols().keySet();
					if (!keys.contains(rightElt)) {
						if (currentSt.getParent() != null) {
							currentSt = currentSt.getParent();
						}
						else {
							throw new Exception("Erreur " + leftElt + " variable non déclarée" + child.getCharPositionInLine());
						}
					}
					else {
						typeRightElt = currentSt.getSymbols().get(rightElt).getType();
						break;
					}
				}
				while (currentSt.getParent() != null);
			}
			
			/*String firstElt = child.getChild(1).getText();
			if (child.getChild(2).getText().equals("INDICE")) {
				
			}*/
			System.out.println(child.getText() + " = (" + child.getChild(0).getText() + ")");
		}
	}

	public static void forControl(Tree child, SymbolTable st) {
		// TODO Auto-generated method stub
		
	}

	public static void ifControl(Tree child, SymbolTable st) {
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
		return "\n\n---Symbol---\ntype=" + type + "\nsymbols=" + symbols + "\narguments="
				+ arguments + "\nisTable="
				+ isTable + "\nisFunction=" + isFunction + "\n---Fin---\n\n";
	}
	
	public String getType() {
		return type;
	}
	
	public static String getTypeByString(String elt) {
		
		if (elt != null && elt.indexOf("\"") > -1) {
			return "String";
		}
		
		try {
			Integer.parseInt(elt);
			return "int";
		} catch (Exception e) {}
		
		return "VAR";
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
	
	public static String findTypeByVar(SymbolTable st, String symbol) {
		SymbolTable currentSt = st;
		do {
			Set<String> keys = currentSt.getSymbols().keySet();
			if (keys.contains(symbol)) {
				System.out.println(currentSt.getSymbols().get(symbol));
				return currentSt.getSymbols().get(symbol).getType();
			}
			else {
				currentSt = currentSt.getParent();
			}
		}
		while (currentSt != null);
		return null;
	}

	public SymbolTable getParent() {
		return parent;
	}
	
	public int getLevel() {
		return level;
	}

	public LinkedHashMap<String, Symbol> getSymbols() {
		return symbols;
	}

	@Override
	public String toString() {
		return "\n\n---SymbolTable---\nparent=" + parent + "\nsymbols=" + symbols
				+ "\nlevel=" + level + "\ntoken=" + token + "\n---Fin---\n\n";
	}

	
	
	
}