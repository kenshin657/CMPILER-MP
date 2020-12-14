// Generated from D:/Programs/Java/CMPILER MP/src\pogC.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pogCParser}.
 */
public interface pogCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pogCParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(pogCParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link pogCParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(pogCParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link pogCParser#mainProg}.
	 * @param ctx the parse tree
	 */
	void enterMainProg(pogCParser.MainProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link pogCParser#mainProg}.
	 * @param ctx the parse tree
	 */
	void exitMainProg(pogCParser.MainProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link pogCParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(pogCParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link pogCParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(pogCParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link pogCParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(pogCParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pogCParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(pogCParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pogCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(pogCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pogCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(pogCParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pogCParser#intDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIntDeclaration(pogCParser.IntDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pogCParser#intDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIntDeclaration(pogCParser.IntDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pogCParser#floatDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFloatDeclaration(pogCParser.FloatDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pogCParser#floatDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFloatDeclaration(pogCParser.FloatDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pogCParser#stringDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStringDeclaration(pogCParser.StringDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pogCParser#stringDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStringDeclaration(pogCParser.StringDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pogCParser#booleanDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDeclaration(pogCParser.BooleanDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pogCParser#booleanDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDeclaration(pogCParser.BooleanDeclarationContext ctx);
}