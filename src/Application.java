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
			
			if (tree.getText().equals("PROG")) {
				
				/**
				 * Init fonction système !
				 */
				st = new SymbolTable(st, "PROG");
				Symbol s;
				
				s = new Symbol("print", null);
				s.setFunction(true);
				s.getArguments().add(new Argument("arg1","String"));
				st.getSymbols().add(s);
				
				s = new Symbol("flush", null);
				s.setFunction(true);
				st.getSymbols().add(s);
				
				s = new Symbol("exit", "String");
				s.setFunction(true);
				st.getSymbols().add(s);
				
				s = new Symbol("exit", "int");
				s.setFunction(true);
				s.getArguments().add(new Argument("arg1","String"));
				st.getSymbols().add(s);
				
				s = new Symbol("exit", "String");
				s.setFunction(true);
				s.getArguments().add(new Argument("arg1","int"));
				st.getSymbols().add(s);
				
				s = new Symbol("exit", "int");
				s.setFunction(true);
				s.getArguments().add(new Argument("arg1","String"));
				st.getSymbols().add(s);
				
				s = new Symbol("exit", "String");
				s.setFunction(true);
				s.getArguments().add(new Argument("arg1","String"));
				s.getArguments().add(new Argument("arg2","int"));
				s.getArguments().add(new Argument("arg3","int"));
				st.getSymbols().add(s);
				
				s = new Symbol("exit", "String");
				s.setFunction(true);
				s.getArguments().add(new Argument("arg1","String"));
				s.getArguments().add(new Argument("arg2","String"));
				st.getSymbols().add(s);
				
				s = new Symbol("exit", "int");
				s.setFunction(true);
				s.getArguments().add(new Argument("arg1","int"));
				st.getSymbols().add(s);
				
				s = new Symbol("exit", null);
				s.setFunction(true);
				s.getArguments().add(new Argument("arg1","int"));
				st.getSymbols().add(s);
			}
			
			//System.out.println(tree.getText() + " / " + ((st != null) ? st.getLevel() : "-1"));
			//System.out.println(tree.toStringTree());
			//tabSymbol.put(tree.getText(), );
			for (int i = 0; i < tree.getChildCount(); i++) {
				
				
				currentChild = tree.getChild(i);

				System.out.println(currentChild.getText());
				
				switch (currentChild.getText()) {
					
					case "SEQUENCE":
						Analyze.fctControl(currentChild, st);
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

							Analyze.varExistanceControl(currentChild.getChild(0), st);
						
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
									}
									else {
										type = Symbol.getTypeByString(currentChild.getChild(1).getText());
									}
									
									id = currentChild.getChild(0).getText();
									symbol = new Symbol(id, type);
									st.getSymbols().add(symbol);
									break;
								case 3:
									id = currentChild.getChild(0).getText();
									symbol = new Symbol(id, currentChild.getChild(1).getText());
									st.getSymbols().add(symbol);
									break;

							}
							
							
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
						
						break;
						
					case "DECL_TYPE":
					
						boolean isTable = false;
						id = currentChild.getChild(0).getText();
						
						Analyze.typeExistanceControl(currentChild.getChild(0), st);
						
						switch (currentChild.getChild(1).getChildCount()) {
						case 0:
							type = currentChild.getChild(1).getText();
							symbol = new Symbol(id, type);
							symbol.setTable(isTable);
							break;
							
						case 1:
							type = currentChild.getChild(1).getChild(0).getText();
							isTable = true;
							symbol = new Symbol(id, type);
							symbol.setTable(isTable);
							break;
						}
						
						symbol.setType(true);
						st.getSymbols().add(symbol);
						break;
						
						
						/**
						 * A compléter pour des structures complexes
						 */
						
					case "DECL_FCT":
						
						
						id = currentChild.getChild(0).getText();
						
						// Test existance de la fonction (surcharge interdite si déclarer dans le meme contexte)
						Analyze.fctExistanceControl(currentChild.getChild(0), st);
						
						symbol = new Symbol(id, type);
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
							stFct.getSymbols().add(new Symbol(currentArgument.getId(), currentArgument.getType()));
						}
						
						st.getSymbols().add(symbol);
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
		//throw new Exception("Erreur de déclaration ligne " + child.getLine() + " (" + child.toStringTree() + ")");
	}

	public static void typeExistanceControl(Tree child, SymbolTable st) {
		int index;
		System.out.println(child.getText() + "=====");
		if ((index = st.getIndexSymbolByType(child.getText(), "TYPE")) > -1) {
			System.err.println("Erreur type '" + child.getText() + "', la surcharge d'un type dans le même contexte est interdite - ligne " + child.getLine() + " (" + child.toStringTree() + ")");
		}
	}

	public static void fctExistanceControl(Tree child, SymbolTable st) {
		int index;
		if ((index = st.getIndexSymbolByType(child.getText(), "FCT")) > -1) {
			System.err.println("Erreur fonction '" + child.getText() + "', la surcharge d'une fonction dans le même contexte est interdite - ligne " + child.getLine() + " (" + child.toStringTree() + ")");
		}
	}

	public static void varExistanceControl(Tree child, SymbolTable st) {
		int index;
		if ((index = st.getIndexSymbolByType(child.getText(), "VAR")) > -1) {
			System.err.println("Erreur variable '" + child.getText() + "', la surcharge d'une variable dans le même contexte est interdite - ligne " + child.getLine() + " (" + child.toStringTree() + ")");
		}
	}
	
	public static void fctControl(Tree currentChild, SymbolTable st) {
		System.out.println("-- fctControl ---");
		Symbol symbol;
		for (int i = 0; i < currentChild.getChildCount(); i++) {
			if (currentChild.getChild(i).getChildCount() == 1 && currentChild.getChild(i).getChild(0).getText().equals("PARAMS")) {
				//System.out.println("--- "+ currentChild.getChild(i).getText() + " ---");
				symbol = st.findSymbol(currentChild.getChild(i).getText(), "FCT");
				//System.out.println(st);
				if (symbol == null) {
					System.err.println("Erreur fonction '" + currentChild.getChild(i).getText() + "', elle n'est pas déclaré - ligne " + currentChild.getChild(i).getLine() + " (" + currentChild.getChild(i).toStringTree() + ")");
				}
				else {
					int countArguments = symbol.getArguments().size();
					if (currentChild.getChild(i).getChild(0).getChildCount() != countArguments) {
						System.err.println("Erreur fonction '" + currentChild.getChild(i).getText() + "', le nombre d'argument n'est pas correct - ligne " + currentChild.getChild(i).getLine() + " (" + currentChild.getChild(i).toStringTree() + ")");
					}
					else {
						for (int k = 0; k < currentChild.getChild(i).getChild(0).getChildCount(); k++) {
							boolean find = false;
							Tree currentNode = currentChild.getChild(i).getChild(0).getChild(k);
							String type = null;

							// S'il a des enfants, on doit chercher le type
							if (currentNode.getChildCount() > 0) {
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
							}
							else {
								type = Symbol.getTypeByString(currentNode.getText());
								if (type.equals("VAR")) {
									type = SymbolTable.findTypeByVar(st, currentNode.getText());
								}
							}
							
							if (!symbol.getArguments().get(k).getType().equals(type)) {
								System.err.println("Erreur fonction '" + currentChild.getChild(i).getText() + "',  le type de l'argument n°" + (k+1) + " n'est pas correct - ligne " + currentChild.getChild(i).getLine() + " (" + currentChild.getChild(i).toStringTree() + ")");
							}
						}
					}
				}
				
			}
		}
	}

	public static void condControl(Tree child, SymbolTable st) throws Exception {
		/*System.out.println("------------------------");
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
							throw new Exception("Erreur variable non déclarée" + child.getLine());
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
							throw new Exception("Erreur " + leftElt + " variable non déclarée" + child.getLine());
						}
					}
					else {
						typeRightElt = currentSt.getSymbols().get(rightElt).getType();
						break;
					}
				}
				while (currentSt.getParent() != null);
			}
			
			System.out.println(child.getText() + " = (" + child.getChild(0).getText() + ")");
		}*/
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
	private String id;
	private String type;
	LinkedHashMap<String, Symbol> symbols = new LinkedHashMap<String, Symbol>(); 
	private LinkedList<Argument> arguments = new LinkedList<Argument>();
	private boolean isTable;
	private boolean isType;
	private boolean isFunction;
	
	public Symbol(String id, String type) {
		this.id = id;
		this.type = type;
	}
	
	public boolean isFunction() {
		return isFunction;
	}
	
	public boolean isTable() {
		return isTable;
	}
	
	public boolean isType() {
		return isType;
	}
	
	public void setTable(boolean isTable) {
		this.isTable = isTable;
	}
	
	public void setType(boolean isType) {
		this.isType = isType;
	}
	
	public void setFunction(boolean isFunction) {
		this.isFunction = isFunction;
	}
	
	public LinkedList<Argument> getArguments() {
		return arguments;
	}
	
	@Override
	public String toString() {
		return "\n\n---Symbol---\nid=" + id + "\ntype=" + type + "\nsymbols=" + symbols + "\narguments="
				+ arguments + "\nisTable="
				+ isTable + "\nisFunction=" + isFunction + "\nisType=" + isType + "\n---Fin---\n\n";
	}
	
	public String getType() {
		return type;
	}
	
	public String getId() {
		return id;
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
	private LinkedList<Symbol> symbols = new LinkedList<Symbol>();
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
	
	public Symbol findSymbol(String symbol, String type) {
		SymbolTable currentSt = this;
		do {
			int index;
			if ((index = currentSt.getIndexSymbolByType(symbol, type)) > -1) {
				return currentSt.getSymbols().get(index);
			}
			else {
				currentSt = currentSt.getParent();
			}
		}
		while (currentSt != null);
		return null;
	}

	public static String findTypeByVar(SymbolTable st, String symbol) {
		SymbolTable currentSt = st;
		do {
			int index;
			if ((index = currentSt.getIndexSymbolByType(symbol, "VAR")) > -1) {
				return currentSt.getSymbols().get(index).getType();
			}
			else {
				currentSt = currentSt.getParent();
			}
		}
		while (currentSt != null);
		return null;
	}
	
	// A mettre à jour pour les structures
	public int getIndexSymbolByType(String id, String type) {
		for (int i = 0; i < getSymbols().size(); i++) {
			if (getSymbols().get(i).getId().equals(id)) {
				System.out.println(type + "-----" + id);
				switch (type) {
					case "FCT":
						if (getSymbols().get(i).isFunction()) {
							return i;
						}
						break;
					case "VAR":
						if (!getSymbols().get(i).isFunction()) {
							return i;
						}
						break;
					case "TYPE":
						if (getSymbols().get(i).isType()) {
							return i;
						}
						break;
				}
			}
		}
		
		return -1;
	}

	public SymbolTable getParent() {
		return parent;
	}
	
	public int getLevel() {
		return level;
	}

	public LinkedList<Symbol> getSymbols() {
		return symbols;
	}

	@Override
	public String toString() {
		return "\n\n---SymbolTable---\nparent=" + parent + "\nsymbols=" + symbols
				+ "\nlevel=" + level + "\ntoken=" + token + "\n---Fin---\n\n";
	}

	
	
	
}