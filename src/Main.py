from src import disassembly
import os
from antlr4 import *

from gen.asm8080Lexer import asm8080Lexer as Lexer
from gen.asm8080Parser import asm8080Parser as Parser
from src.listenersASM8080 import Listerners

if __name__ == '__main__':

    #Desensamblando archivo hexadecimal a ASM8080.
    print("Iniciando proceso de desensamblaje...")
    dirpath = os.getcwd()+ r"\..\inputs"
    nameFile = "whileif"
    disassembly.desensamblar(dirpath, nameFile)
    print("Proceso de desensamblaje completado...")

    #Leyendo archivo de entrada para ANTLR.
    print("abriendo archivo del código fuente...")
    try:
        inputStream = FileStream(dirpath + "\\" + nameFile + "_dis.txt")
        lexer = Lexer(inputStream)
        stream = CommonTokenStream(lexer)
        parser = Parser(stream)
        tree = parser.prog()

        # Recorrer el arbol mediante Listeners.
        print("Recorriendo el arbol y traduciendo el código...")
        print("")
        RegisterPrint = Listerners()
        walker = ParseTreeWalker()
        walker.walk(RegisterPrint, tree)

    except:
        print("Error abriendo archivo del código fuente :c")