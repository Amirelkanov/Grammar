import org.junit.Test
import kotlin.test.assertFailsWith

internal class ExpressionTests {
    @Test
    fun incorrectParenthesesTest() {
        assertFailsWith<InvalidGrammarException> {
            parseAndCalculateExpression(CalcGrammarParserVisitor(), "((4);")
        }
    }

    @Test
    fun extraSignTest() {
        assertFailsWith<InvalidGrammarException> {
            parseAndCalculateExpression(CalcGrammarParserVisitor(), "4+4+;")
        }
    }

    @Test
    fun nothingTest() {
        assertFailsWith<InvalidGrammarException> {
            parseAndCalculateExpression(CalcGrammarParserVisitor(), ";")
        }
    }

    @Test
    fun expressionWithoutSemicolon() {
        assertFailsWith<InvalidGrammarException> {
            parseAndCalculateExpression(CalcGrammarParserVisitor(), "(5 + 4) * 3")
        }
    }
}