// Generated from C:/Users/Alejosebasp/Documents/UNAL/Lenguajes/ADHY/grammar\asm8080.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link asm8080Parser}.
 */
public interface asm8080Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(asm8080Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(asm8080Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(asm8080Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(asm8080Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(asm8080Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(asm8080Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#opcode}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(asm8080Parser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#opcode}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(asm8080Parser.OpcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#register_}.
	 * @param ctx the parse tree
	 */
	void enterRegister_(asm8080Parser.Register_Context ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#register_}.
	 * @param ctx the parse tree
	 */
	void exitRegister_(asm8080Parser.Register_Context ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(asm8080Parser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(asm8080Parser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#assemblerdirective}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerdirective(asm8080Parser.AssemblerdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#assemblerdirective}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerdirective(asm8080Parser.AssemblerdirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#lbl}.
	 * @param ctx the parse tree
	 */
	void enterLbl(asm8080Parser.LblContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#lbl}.
	 * @param ctx the parse tree
	 */
	void exitLbl(asm8080Parser.LblContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void enterExpressionlist(asm8080Parser.ExpressionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void exitExpressionlist(asm8080Parser.ExpressionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(asm8080Parser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(asm8080Parser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(asm8080Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(asm8080Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(asm8080Parser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(asm8080Parser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(asm8080Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(asm8080Parser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#dollar}.
	 * @param ctx the parse tree
	 */
	void enterDollar(asm8080Parser.DollarContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#dollar}.
	 * @param ctx the parse tree
	 */
	void exitDollar(asm8080Parser.DollarContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(asm8080Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(asm8080Parser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(asm8080Parser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(asm8080Parser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(asm8080Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(asm8080Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8080Parser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(asm8080Parser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8080Parser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(asm8080Parser.CommentContext ctx);
}