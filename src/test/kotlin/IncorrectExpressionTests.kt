import org.junit.Test
import kotlin.test.assertEquals

internal class IncorrectExpressionTests {
    @Test
    fun singleNumTest() {
        assertEquals("4 = 4;", parseAndCalculateExpression(CalcGrammarParserVisitor(), "4;"))
    }

    @Test
    fun sumTest() {
        assertEquals("4 + 4 = 8;", parseAndCalculateExpression(CalcGrammarParserVisitor(), "4 + 4;"))
    }

    @Test
    fun prodTest() {
        assertEquals("4 * 4 = 16;", parseAndCalculateExpression(CalcGrammarParserVisitor(), "4 * 4;"))
    }

    @Test
    fun sumAndProdTest() {
        assertEquals("4 + 4 * 3 = 16;", parseAndCalculateExpression(CalcGrammarParserVisitor(), "4 + 4 * 3;"))
    }

    @Test
    fun parenthesesAndSumAndProdTest() {
        assertEquals("(4 + 4) * 3 = 24;", parseAndCalculateExpression(CalcGrammarParserVisitor(), "(4 + 4) * 3;"))
    }
}