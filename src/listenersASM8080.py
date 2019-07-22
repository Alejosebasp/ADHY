
from gen.asm8080Parser import asm8080Parser as Parser
from gen.asm8080Listener import asm8080Listener as Listener

class Listerners(Listener):
    def enterRegister_(self, ctx:Parser.Register_Context):
        print(ctx.getText())
