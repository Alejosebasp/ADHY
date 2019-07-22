// Generated from C:/Users/Cristian Martinez/Desktop/UN - Ig. Sistemas/UN 2019 - 1/ADHY/grammar\asm8080.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link asm8080Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface asm8080Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(asm8080Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(asm8080Parser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(asm8080Parser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#opcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcode(asm8080Parser.OpcodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#register_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister_(asm8080Parser.Register_Context ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(asm8080Parser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#assemblerdirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssemblerdirective(asm8080Parser.AssemblerdirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#lbl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbl(asm8080Parser.LblContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#expressionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionlist(asm8080Parser.ExpressionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(asm8080Parser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(asm8080Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(asm8080Parser.MultiplyingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(asm8080Parser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#dollar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDollar(asm8080Parser.DollarContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(asm8080Parser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(asm8080Parser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(asm8080Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link asm8080Parser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(asm8080Parser.CommentContext ctx);
}