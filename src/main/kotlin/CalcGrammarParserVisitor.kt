import antlrGeneratedSource.CalcGrammarBaseVisitor
import antlrGeneratedSource.CalcGrammarParser.*


class CalcGrammarParserVisitor : CalcGrammarBaseVisitor<Int?>() {
    private val memory: MutableMap<String, Int> = mutableMapOf()

    override fun visitStatement(ctx: StatementContext) =
        if (ctx.assignment() != null) visitAssignment(ctx.assignment())
        else if (ctx.expression() != null) visit(ctx.expression())
        else null

    override fun visitAssignment(ctx: AssignmentContext): Int? {
        val id = ctx.ID()?.text
        val value = visit(ctx.expression())
        if (id != null && value != null)
            memory[id] = value
        return value
    }

    override fun visitSum(ctx: SumContext) =
        visit(ctx.expression(1))?.let { visit(ctx.expression(0))?.plus(it) }

    override fun visitProduct(ctx: ProductContext) =
        visit(ctx.expression(1))?.let { visit(ctx.expression(0))?.times(it) }

    override fun visitInt(ctx: IntContext) = ctx.INT()?.text?.toInt()

    override fun visitParentheses(ctx: ParenthesesContext) = visit(ctx.expression())

    override fun visitId(ctx: IdContext): Int? {
        val id = ctx.ID()?.text
        return if (memory.containsKey(id)) memory[id] else 0
    }
}

