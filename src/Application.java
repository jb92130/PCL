import java.io.IOException;
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
	private static StringBuffer sb = new StringBuffer();
	
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
			
			System.out.println(sb.toString());
			
			
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
		
		//System.out.println(st);
		
		if (!tree.isNil()) {
			
			if (tree.getText().equals("PROG")) {
				
				/**
				 * Init fonction système !
				 */
				
				// Init de la pile
				sb.append("// -----------------------------------------------------\n");
				sb.append("// Générer par le super compilateur de la mort qui tue !\n");
				sb.append("// -----------------------------------------------------\n\n\n");
				sb.append("EXIT_EXC    equ     64\n");
				sb.append("READ_EXC    equ     65\n");
				sb.append("WRITE_EXC   equ     66\n");
				sb.append("BP          equ     R13\n");
				sb.append("WR          equ     R14\n");
				sb.append("SP          equ	   R15\n");
				sb.append("STACKA	   equ	   0x1000\n");
				sb.append("RESETA	   equ    0xFFFA\n");
				sb.append("            org	   0xFF20\n");
				sb.append("            start   RESETA\n\n");
				sb.append("START_PRG   LDW	   SP,#STACKA\n");
				sb.append("            //LDW	   SP,(SP)\n");
				
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
						
			            // Création d'un contexte (LINK)
						sb.append("\n\n// Création d'un contexte dans la pile / Let (LINK)\n");
						sb.append("            ADQ -2 ,SP\n");
						sb.append("            STW BP,(SP)\n");
						sb.append("            LDW BP,SP\n");
						sb.append("            SUB SP,R1,SP\n");
						
						SymbolTable newSt = new SymbolTable(st, "LET");
						
						browseTree(currentChild, newSt, countLet+1);
						
						sb.append("\n\n// Suppression du contexte dans la pile (UNLINK)\n");
						sb.append("            LDW SP,BP\n");
						sb.append("            LDW BP,(SP)\n");
						sb.append("            ADQ " + newSt.getCountStack() + ",SP\n");
						    
						if (countLet == 0) {
							/**
							 * Le code est analysé!
							 */
							sb.append("\n\n// Fin du code\n");
							sb.append("FIN         RSB	RESETA-FIN\n");
							sb.append("            JEA	@START_PRG\n\n");
							
							System.out.println("--- FIN D'ANALYSE ---");
						}
						break;
	
					case "DECL_VAR":
						
						try {
							Tree value = null;
							
							Analyze.varExistanceControl(currentChild.getChild(0), st);
							switch (currentChild.getChildCount()) {
								case 2:
									value = currentChild.getChild(1);
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
									value = currentChild.getChild(2);
									symbol = new Symbol(id, currentChild.getChild(1).getText());
									st.getSymbols().add(symbol);
									break;

							}
							
							sb.append("\n");
							
							switch (value.getText()) {
							case "+":
								symbol.setCountStack(st.getCountStack());
								type = Symbol.getTypeByString(value.getChild(0).getText());
								if (type.equals("int")) {
									sb.append("            LDW R1,#" + value.getChild(0).getText() + "\n");
								}
								type = Symbol.getTypeByString(value.getChild(1).getText());
								if (type.equals("int")) {
									sb.append("            LDW R2,#" + value.getChild(1).getText() + "\n");
								}
								sb.append("            ADD R1,R2,R1 // Opération d'addition\n");
								sb.append("            STW	R1,-(SP) // J'empile le résultat\n");
								st.setCountStack(st.getCountStack()+2);
								break;
							case "*":
								symbol.setCountStack(st.getCountStack());
								type = Symbol.getTypeByString(value.getChild(0).getText());
								if (type.equals("int")) {
									sb.append("            LDW R1,#" + value.getChild(0).getText() + "\n");
								}
								type = Symbol.getTypeByString(value.getChild(1).getText());
								if (type.equals("int")) {
									sb.append("            LDW R2,#" + value.getChild(1).getText() + "\n");
								}
								sb.append("            MUL R1,R2,R1 // Opération de multiplication\n");
								sb.append("            STW	R1,-(SP) // J'empile le résultat\n");
								st.setCountStack(st.getCountStack()+2);
								break;
							case "-":
								symbol.setCountStack(st.getCountStack());
								type = Symbol.getTypeByString(value.getChild(0).getText());
								if (type.equals("int")) {
									sb.append("            LDW R1,#" + value.getChild(0).getText() + "\n");
								}
								type = Symbol.getTypeByString(value.getChild(1).getText());
								if (type.equals("int")) {
									sb.append("            LDW R2,#" + value.getChild(1).getText() + "\n");
								}
								sb.append("            SUB R1,R2,R1 // Opération de soustraction\n");
								sb.append("            STW	R1,-(SP) // J'empile le résultat\n");
								st.setCountStack(st.getCountStack()+2);
								break;
							case "/":
								symbol.setCountStack(st.getCountStack());
								type = Symbol.getTypeByString(value.getChild(0).getText());
								if (type.equals("int")) {
									sb.append("            LDW R1,#" + value.getChild(0).getText() + "\n");
								}
								type = Symbol.getTypeByString(value.getChild(1).getText());
								if (type.equals("int")) {
									sb.append("            LDW R2,#" + value.getChild(1).getText() + "\n");
								}
								sb.append("            DIV R1,R2,R1 // Opération de division\n");
								sb.append("            STW	R1,-(SP) // J'empile le résultat\n");
								st.setCountStack(st.getCountStack()+2);
								break;

							default:
								switch (symbol.getType()) {
								case "int":
									symbol.setCountStack(st.getCountStack());
									sb.append("            LDW R1,#"+ value.getText() +" // Je sauvegarde mon " + value.getText() + " dans mon registre\n");
									sb.append("            STW	R1,-(SP) // J'empile\n");
									st.setCountStack(st.getCountStack()+2);
									break;

								case "String":
									symbol.setCountStack(st.getCountStack());
									for (int j = 1; j < value.getText().length()-1; j++) {
										sb.append("            LDW R1,#"+ (int) value.getText().charAt(j) +" // Je sauvegarde mon \"" + value.getText().charAt(j) + "\" dans mon registre\n");
										sb.append("            STW	R1,-(SP) // J'empile\n");
										st.setCountStack(st.getCountStack()+2);
									}
									sb.append("            LDW R1,#0 // Je sauvegarde 0 pour marquer la fin de la string dans mon registre\n");
									sb.append("            STW	R1,-(SP) // J'empile\n");
									//st.setCountStack(st.getCountStack()+2);
									break;
								default:
									break;
								}
								break;
							}
							
							sb.append("\n");
							
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

						
			            // Création d'un contexte (LINK)
						sb.append("\n\n// Création d'un contexte dans la pile / Fonction (LINK)\n");
						sb.append("            ADQ -2,SP\n");
						sb.append("            STW BP,(SP)\n");
						sb.append("            LDW BP,SP\n");
						sb.append("            SUB SP,R1,SP\n");
						
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
						
						sb.append("\n\n// Suppression du contexte dans la pile (UNLINK)\n");
						sb.append("            LDW SP,BP\n");
						sb.append("            LDW BP,(SP)\n");
						sb.append("            ADQ " + stFct.getCountStack() + ",SP\n");
						
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
	private int countStack = 0;
	
	public void setCountStack(int countStack) {
		this.countStack = countStack;
	}
	
	public int getCountStack() {
		return countStack;
	}
	
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
	private int countStack = 2;
	
	public void setCountStack(int countStack) {
		this.countStack = countStack;
	}
	
	public int getCountStack() {
		return countStack;
	}
	
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