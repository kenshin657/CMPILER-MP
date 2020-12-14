// Generated from D:/Programs/Java/CMPILER MP/src\pogC.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pogCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pogCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pogCParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(pogCParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link pogCParser#mainProg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainProg(pogCParser.MainProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link pogCParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(pogCParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link pogCParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(pogCParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pogCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(pogCParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pogCParser#intDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDeclaration(pogCParser.IntDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pogCParser#floatDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatDeclaration(pogCParser.FloatDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pogCParser#floatFormatDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatFormatDeclaration(pogCParser.FloatFormatDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pogCParser#floatF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatF(pogCParser.FloatFContext ctx);
	/**
	 * Visit a parse tree produced by {@link pogCParser#stringDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDeclaration(pogCParser.StringDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pogCParser#booleanDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDeclaration(pogCParser.BooleanDeclarationContext ctx);
}