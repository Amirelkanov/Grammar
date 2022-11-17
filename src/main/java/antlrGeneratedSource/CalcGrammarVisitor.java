// Generated from java-escape by ANTLR 4.11.1
package antlrGeneratedSource;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CalcGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(CalcGrammarParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code product}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProduct(CalcGrammarParser.ProductContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sum}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(CalcGrammarParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CalcGrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CalcGrammarParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalcGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CalcGrammarParser.AssignmentContext ctx);
}