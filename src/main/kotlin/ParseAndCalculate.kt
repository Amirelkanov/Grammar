import antlrGeneratedSource.CalcGrammarLexer
import antlrGeneratedSource.CalcGrammarParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

fun parseAndCalculateExpression(visitor: CalcGrammarParserVisitor, expression: String): String {
    val inputStream = CharStreams.fromString(expression.replace("\\s".toRegex(), ""))
    val lexer = CalcGrammarLexer(inputStream)
    val tokens = CommonTokenStream(lexer)
    val parser = CalcGrammarParser(tokens)

    parser.removeErrorListeners()
    parser.addErrorListener(GrammarErrorListener())

    return "${
        expression.substring(
            0 until
                    (if (expression.indexOf('=') != -1) expression.indexOf('=') else expression.length) - 1)
    } = ${visitor.visitStatement(parser.statement())};"
}

fun parseAndCalculateExpressionsFromFile(fileName: String): String {
    val visitor = CalcGrammarParserVisitor()
    val strBuilder = StringBuilder()

    File(fileName).forEachLine { expression ->
        strBuilder.append(parseAndCalculateExpression(visitor, expression))
        strBuilder.append("\n")
    }
    return strBuilder.toString()
}