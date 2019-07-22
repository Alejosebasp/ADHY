from src import disassembly
import os
from antlr4 import *

from gen.asm8080Lexer import asm8080Lexer as Lexer
from gen.asm8080Parser import asm8080Parser as Parser
from src.listenersASM8080 import Listerners

if __name__ == '__main__':

    #Desensamblando archivo hexadecimal a ASM8080.
    dirpath = os.getcwd()+ r"\..\inputs"
    print(dirpath)
    disassembly.desensamblar(dirpath, "invaders")
    print("listo")

    #Leyendo archivo de entrada para ANTLR.
    inputStream = FileStream(r"C:\Users\Alejosebasp\Documents\UNAL\Lenguajes\ADHY\inputs\invaders_dis.txt")
    lexer = Lexer(inputStream)
    stream = CommonTokenStream(lexer)
    parser = Parser(stream)
    tree = parser.prog()

    #Recorrer el arbol mediante Listeners.
    RegisterPrint = Listerners()
    walker = ParseTreeWalker()
    walker.walk(RegisterPrint, tree)
