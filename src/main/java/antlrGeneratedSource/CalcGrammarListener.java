// Generated from java-escape by ANTLR 4.11.1
package antlrGeneratedSource;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcGrammarParser}.
 */
public interface CalcGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalcGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalcGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link CalcGrammarParser}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(CalcGrammarParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link CalcGrammarParser}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(CalcGrammarParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code product}
	 * labeled alternative in {@link CalcGrammarParser}.
	 * @param ctx the parse tree
	 */
	void enterProduct(CalcGrammarParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by the {@code product}
	 * labeled alternative in {@link CalcGrammarParser}.
	 * @param ctx the parse tree
	 */
	void exitProduct(CalcGrammarParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sum}
	 * labeled alternative in {@link CalcGrammarParser}.
	 * @param ctx the parse tree
	 */
	void enterSum(CalcGrammarParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link CalcGrammarParser}.
	 * @param ctx the parse tree
	 */
	void exitSum(CalcGrammarParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CalcGrammarParser}.
	 * @param ctx the parse tree
	 */
	void enterId(CalcGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CalcGrammarParser}.
	 * @param ctx the parse tree
	 */
	void exitId(CalcGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CalcGrammarParser}.
	 * @param ctx the parse tree
	 */
	void enterInt(CalcGrammarParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CalcGrammarParser}.
	 * @param ctx the parse tree
	 */
	void exitInt(CalcGrammarParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CalcGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CalcGrammarParser.AssignmentContext ctx);
}