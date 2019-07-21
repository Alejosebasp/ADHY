# Generated from C:/Users/Alejosebasp/Documents/UNAL/Lenguajes/ADHY/grammar\asm8080.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .asm8080Parser import asm8080Parser
else:
    from asm8080Parser import asm8080Parser

# This class defines a complete generic visitor for a parse tree produced by asm8080Parser.

class asm8080Visitor(ParseTreeVisitor):

    # Visit a parse tree produced by asm8080Parser#prog.
    def visitProg(self, ctx:asm8080Parser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#line.
    def visitLine(self, ctx:asm8080Parser.LineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#instruction.
    def visitInstruction(self, ctx:asm8080Parser.InstructionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#opcode.
    def visitOpcode(self, ctx:asm8080Parser.OpcodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#register_.
    def visitRegister_(self, ctx:asm8080Parser.Register_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#directive.
    def visitDirective(self, ctx:asm8080Parser.DirectiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#assemblerdirective.
    def visitAssemblerdirective(self, ctx:asm8080Parser.AssemblerdirectiveContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#lbl.
    def visitLbl(self, ctx:asm8080Parser.LblContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#expressionlist.
    def visitExpressionlist(self, ctx:asm8080Parser.ExpressionlistContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#label.
    def visitLabel(self, ctx:asm8080Parser.LabelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#expression.
    def visitExpression(self, ctx:asm8080Parser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#multiplyingExpression.
    def visitMultiplyingExpression(self, ctx:asm8080Parser.MultiplyingExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#argument.
    def visitArgument(self, ctx:asm8080Parser.ArgumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#dollar.
    def visitDollar(self, ctx:asm8080Parser.DollarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#string.
    def visitString(self, ctx:asm8080Parser.StringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#name.
    def visitName(self, ctx:asm8080Parser.NameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#number.
    def visitNumber(self, ctx:asm8080Parser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by asm8080Parser#comment.
    def visitComment(self, ctx:asm8080Parser.CommentContext):
        return self.visitChildren(ctx)



del asm8080Parser