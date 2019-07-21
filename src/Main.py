from src import dis
import os
from antlr4 import *

from gen.asm8080Lexer import asm8080Lexer as Lexer
from gen.asm8080Parser import asm8080Parser as Parser
from gen.asm8080Listener import asm8080Listener as Listener
from gen.asm8080Visitor import asm8080Visitor as Visitor

class listenerRegister(Listener):
    def enterRegister_(self, ctx:Parser.Register_Context):
        print(ctx.getText())

if __name__ == '__main__':

    #desemamblando archivo
    dirpath = os.getcwd()+ r"\..\inputs"
    print(dirpath)
    dis.desensamblar(dirpath, "invaders")
    print("listo")

    inputStream = FileStream(r"C:\Users\Alejosebasp\Documents\UNAL\Lenguajes\ADHY\inputs\invaders_dis.txt")

    lexer = Lexer(inputStream)
    stream = CommonTokenStream(lexer)
    parser = Parser(stream)
    tree = parser.prog()

    RegisterPrint = listenerRegister()
    walker = ParseTreeWalker()
    walker.walk(RegisterPrint, tree)
