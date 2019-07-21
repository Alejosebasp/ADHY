# Generated from C:/Users/Alejosebasp/Documents/UNAL/Lenguajes/ADHY/grammar\asm8080.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .asm8080Parser import asm8080Parser
else:
    from asm8080Parser import asm8080Parser

# This class defines a complete listener for a parse tree produced by asm8080Parser.
class asm8080Listener(ParseTreeListener):

    # Enter a parse tree produced by asm8080Parser#prog.
    def enterProg(self, ctx:asm8080Parser.ProgContext):
        pass

    # Exit a parse tree produced by asm8080Parser#prog.
    def exitProg(self, ctx:asm8080Parser.ProgContext):
        pass


    # Enter a parse tree produced by asm8080Parser#line.
    def enterLine(self, ctx:asm8080Parser.LineContext):
        pass

    # Exit a parse tree produced by asm8080Parser#line.
    def exitLine(self, ctx:asm8080Parser.LineContext):
        pass


    # Enter a parse tree produced by asm8080Parser#instruction.
    def enterInstruction(self, ctx:asm8080Parser.InstructionContext):
        pass

    # Exit a parse tree produced by asm8080Parser#instruction.
    def exitInstruction(self, ctx:asm8080Parser.InstructionContext):
        pass


    # Enter a parse tree produced by asm8080Parser#opcode.
    def enterOpcode(self, ctx:asm8080Parser.OpcodeContext):
        pass

    # Exit a parse tree produced by asm8080Parser#opcode.
    def exitOpcode(self, ctx:asm8080Parser.OpcodeContext):
        pass


    # Enter a parse tree produced by asm8080Parser#register_.
    def enterRegister_(self, ctx:asm8080Parser.Register_Context):
        pass

    # Exit a parse tree produced by asm8080Parser#register_.
    def exitRegister_(self, ctx:asm8080Parser.Register_Context):
        pass


    # Enter a parse tree produced by asm8080Parser#directive.
    def enterDirective(self, ctx:asm8080Parser.DirectiveContext):
        pass

    # Exit a parse tree produced by asm8080Parser#directive.
    def exitDirective(self, ctx:asm8080Parser.DirectiveContext):
        pass


    # Enter a parse tree produced by asm8080Parser#assemblerdirective.
    def enterAssemblerdirective(self, ctx:asm8080Parser.AssemblerdirectiveContext):
        pass

    # Exit a parse tree produced by asm8080Parser#assemblerdirective.
    def exitAssemblerdirective(self, ctx:asm8080Parser.AssemblerdirectiveContext):
        pass


    # Enter a parse tree produced by asm8080Parser#lbl.
    def enterLbl(self, ctx:asm8080Parser.LblContext):
        pass

    # Exit a parse tree produced by asm8080Parser#lbl.
    def exitLbl(self, ctx:asm8080Parser.LblContext):
        pass


    # Enter a parse tree produced by asm8080Parser#expressionlist.
    def enterExpressionlist(self, ctx:asm8080Parser.ExpressionlistContext):
        pass

    # Exit a parse tree produced by asm8080Parser#expressionlist.
    def exitExpressionlist(self, ctx:asm8080Parser.ExpressionlistContext):
        pass


    # Enter a parse tree produced by asm8080Parser#label.
    def enterLabel(self, ctx:asm8080Parser.LabelContext):
        pass

    # Exit a parse tree produced by asm8080Parser#label.
    def exitLabel(self, ctx:asm8080Parser.LabelContext):
        pass


    # Enter a parse tree produced by asm8080Parser#expression.
    def enterExpression(self, ctx:asm8080Parser.ExpressionContext):
        pass

    # Exit a parse tree produced by asm8080Parser#expression.
    def exitExpression(self, ctx:asm8080Parser.ExpressionContext):
        pass


    # Enter a parse tree produced by asm8080Parser#multiplyingExpression.
    def enterMultiplyingExpression(self, ctx:asm8080Parser.MultiplyingExpressionContext):
        pass

    # Exit a parse tree produced by asm8080Parser#multiplyingExpression.
    def exitMultiplyingExpression(self, ctx:asm8080Parser.MultiplyingExpressionContext):
        pass


    # Enter a parse tree produced by asm8080Parser#argument.
    def enterArgument(self, ctx:asm8080Parser.ArgumentContext):
        pass

    # Exit a parse tree produced by asm8080Parser#argument.
    def exitArgument(self, ctx:asm8080Parser.ArgumentContext):
        pass


    # Enter a parse tree produced by asm8080Parser#dollar.
    def enterDollar(self, ctx:asm8080Parser.DollarContext):
        pass

    # Exit a parse tree produced by asm8080Parser#dollar.
    def exitDollar(self, ctx:asm8080Parser.DollarContext):
        pass


    # Enter a parse tree produced by asm8080Parser#string.
    def enterString(self, ctx:asm8080Parser.StringContext):
        pass

    # Exit a parse tree produced by asm8080Parser#string.
    def exitString(self, ctx:asm8080Parser.StringContext):
        pass


    # Enter a parse tree produced by asm8080Parser#name.
    def enterName(self, ctx:asm8080Parser.NameContext):
        pass

    # Exit a parse tree produced by asm8080Parser#name.
    def exitName(self, ctx:asm8080Parser.NameContext):
        pass


    # Enter a parse tree produced by asm8080Parser#number.
    def enterNumber(self, ctx:asm8080Parser.NumberContext):
        pass

    # Exit a parse tree produced by asm8080Parser#number.
    def exitNumber(self, ctx:asm8080Parser.NumberContext):
        pass


    # Enter a parse tree produced by asm8080Parser#comment.
    def enterComment(self, ctx:asm8080Parser.CommentContext):
        pass

    # Exit a parse tree produced by asm8080Parser#comment.
    def exitComment(self, ctx:asm8080Parser.CommentContext):
        pass


