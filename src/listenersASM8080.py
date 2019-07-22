from gen.asm8080Parser import asm8080Parser as Parser
from gen.asm8080Listener import asm8080Listener as Listener

registro = ""




class Listerners(Listener):


    def enterMultiplyingExpression(self, ctx: Parser.MultiplyingExpressionContext):
        if (ctx.argument() != None):
            for i in range (0, len(ctx.argument()), 1):
                return self.enterArgument(ctx.argument(i))

    def enterArgument(self, ctx: Parser.ArgumentContext):
        argumento = " "
        if ctx.number() != None:
            argumento = self.enterNumber(ctx.number())
        elif ctx.register_() != None:
            argumento = self.enterRegister_(ctx.register_())
        elif ctx.dollar() != None:
            argumento = self.enterDollar(ctx.dollar())
        elif ctx.name() != None:
            argumento = self.enterName(ctx.name())
        elif ctx.string() != None:
            argumento = self.enterString(ctx.string())
        else:
            pass
            # argumento = self.enterExpression(ctx.expression())
        return argumento

    def enterNumber(self, ctx: Parser.NumberContext):
        numero = ctx.getText()
        return numero

    def enterRegister_(self, ctx: Parser.Register_Context):
        register = ctx.getText()
        return register

    def enterDollar(self, ctx: Parser.DollarContext):
        dollar = ctx.getText()
        return dollar

    def enterName(self, ctx: Parser.NameContext):
        nombre = ctx.getText()
        return nombre

    def enterString(self, ctx: Parser.StringContext):
        cadena = ctx.getText()
        return cadena

    def enterExpression(self, ctx: Parser.ExpressionContext):
        expresion = ctx.getText()
        if ctx.multiplyingExpression() != None:
            for i in range (0, len(ctx.multiplyingExpression()), 1):
                return self.enterMultiplyingExpression(ctx.multiplyingExpression(i))

    def enterExpressionlist(self, ctx:Parser.ExpressionlistContext):
        expresiones = []
        for i in range (0, len(ctx.expression()), 1):
            expresiones.append(self.enterExpression(ctx.expression(i)))
        return expresiones

    def enterInstruction(self, ctx: Parser.InstructionContext):
        global A
        global B
        global C
        global D
        global E
        global L
        global H
        global i

        #  print(self.enterOpcode(ctx.opcode()) + " " + self.enterRegister_(ctx.))
        operacion = self.enterOpcode(ctx.opcode())

        if ctx.expressionlist() != None:
            expresiones = self.enterExpressionlist(ctx.expressionlist())

        if operacion == "NOP":
            #print(operacion)
            pass

        elif operacion == "MOV":
            #A = expresiones[1]
            if(expresiones[0] == "A"):
                if(expresiones[1] == "B"):
                    A = B
                elif (expresiones[1] == "C"):
                    A = C
                elif (expresiones[1] == "D"):
                    A = D
                elif (expresiones[1] == "E"):
                    A = E
                elif (expresiones[1] == "L"):
                    A = L
                elif (expresiones[1] == "H"):
                    A = H
                elif (expresiones[1] == "A"):
                    A = A
            elif(expresiones[0] == "B"):
                if(expresiones[1] == "B"):
                    B = B
                elif (expresiones[1] == "C"):
                    B = C
                elif (expresiones[1] == "D"):
                    B = D
                elif (expresiones[1] == "E"):
                    B = E
                elif (expresiones[1] == "L"):
                    B = L
                elif (expresiones[1] == "H"):
                    B = H
                elif (expresiones[1] == "A"):
                    B = A
            elif(expresiones[0] == "C"):
                if(expresiones[1] == "B"):
                    C = B
                elif (expresiones[1] == "C"):
                    C = C
                elif (expresiones[1] == "D"):
                    C = D
                elif (expresiones[1] == "E"):
                    C = E
                elif (expresiones[1] == "L"):
                    C = L
                elif (expresiones[1] == "H"):
                    C = H
                elif (expresiones[1] == "A"):
                    C = A
            elif(expresiones[0] == "D"):
                if(expresiones[1] == "B"):
                    D = B
                elif (expresiones[1] == "C"):
                    D = C
                elif (expresiones[1] == "D"):
                    D = D
                elif (expresiones[1] == "E"):
                    D = E
                elif (expresiones[1] == "L"):
                    D = L
                elif (expresiones[1] == "H"):
                    D = H
                elif (expresiones[1] == "A"):
                    D = A
            elif(expresiones[0] == "E"):
                if(expresiones[1] == "B"):
                    E = B
                elif (expresiones[1] == "C"):
                    E = C
                elif (expresiones[1] == "D"):
                    E = D
                elif (expresiones[1] == "E"):
                    E = E
                elif (expresiones[1] == "L"):
                    E = L
                elif (expresiones[1] == "H"):
                    E = H
                elif (expresiones[1] == "A"):
                    E = A
            elif(expresiones[0] == "H"):
                if(expresiones[1] == "B"):
                    H = B
                elif (expresiones[1] == "C"):
                    H = C
                elif (expresiones[1] == "D"):
                    H = D
                elif (expresiones[1] == "E"):
                    H = E
                elif (expresiones[1] == "L"):
                    H = L
                elif (expresiones[1] == "H"):
                    H = H
                elif (expresiones[1] == "A"):
                    H = A
            elif(expresiones[0] == "L"):
                if(expresiones[1] == "B"):
                    L = B
                elif (expresiones[1] == "C"):
                    L = C
                elif (expresiones[1] == "D"):
                    L = D
                elif (expresiones[1] == "E"):
                    L = E
                elif (expresiones[1] == "L"):
                    L = L
                elif (expresiones[1] == "H"):
                    L = H
                elif (expresiones[1] == "A"):
                    L = A

            #print("aqui estoy", expresiones[1], "y A =", A)
            #print(A)
            #return ctx.getText()

        elif operacion == "MVI":
            ''' print(expresiones[0], "=", expresiones[1])
            x = expresiones[1][1:len(expresiones[1])]
            y = int(x,16)
            print(y)
            print(expresiones[0], "=", expresiones[1])
            # print (self.enterRegister_(ctx.expressionlist()))'''
            if (expresiones[0] == "B"):
                x = expresiones[1][1:len(expresiones[1])]
                B = int(x, 16)
                print("B =", B)
            elif (expresiones[0] == "C"):
                x = expresiones[1][1:len(expresiones[1])]
                C = int(x, 16)
                print("C =", C)
            elif (expresiones[0] == "D"):
                x = expresiones[1][1:len(expresiones[1])]
                D = int(x, 16)
                print("D =", D)
            elif (expresiones[0] == "E"):
                x = expresiones[1][1:len(expresiones[1])]
                E = int(x, 16)
                print("E =", E)
            elif (expresiones[0] == "L"):
                x = expresiones[1][1:len(expresiones[1])]
                L = int(x, 16)
                print("L =", L)
            elif (expresiones[0] == "H"):
                x = expresiones[1][1:len(expresiones[1])]
                H = int(x, 16)
                print("H =", H)
            elif (expresiones[0] == "A"):
                x = expresiones[1][1:len(expresiones[1])]
                H = int(x, 16)
                print("A =", H)

        elif operacion == "ADD":
            if (expresiones[0] == "B"):
                B = A + B
                print("A = A +", expresiones[0])
            elif (expresiones[0] == "C"):
                B = A + C
                print("A = A +", expresiones[0])
            elif (expresiones[0] == "D"):
                B = A + D
                print("A = A +", expresiones[0])
            elif (expresiones[0] == "E"):
                B = A + E
                print("A = A +", expresiones[0])
            elif (expresiones[0] == "L"):
                B = A + L
                print("A = A +", expresiones[0])
            elif (expresiones[0] == "H"):
                B = A + H
                print("A = A +", expresiones[0])
            elif (expresiones[0] == "A"):
                B = A + A
                print("A = A +", expresiones[0])

        elif operacion == "SUB":
            if (expresiones[0] == "B"):
                B = A - B
                print("A = A -", expresiones[0])
            elif (expresiones[0] == "C"):
                B = A - C
                print("A = A -", expresiones[0])
            elif (expresiones[0] == "D"):
                B = A - D
                print("A = A -", expresiones[0])
            elif (expresiones[0] == "E"):
                B = A - E
                print("A = A -", expresiones[0])
            elif (expresiones[0] == "L"):
                B = A - L
                print("A = A -", expresiones[0])
            elif (expresiones[0] == "H"):
                B = A - H
                print("A = A -", expresiones[0])
            elif (expresiones[0] == "A"):
                B = A - A
                print("A = A -", expresiones[0])

        elif operacion == "INR":
            if (expresiones[0] == "B"):
                print(expresiones[0], "=", expresiones[0], "+ 1")
            elif (expresiones[0] == "C"):
                print(expresiones[0], "=", expresiones[0], "+ 1")
            elif (expresiones[0] == "D"):
                print(expresiones[0], "=", expresiones[0], "+ 1")
            elif (expresiones[0] == "E"):
                print(expresiones[0], "=", expresiones[0], "+ 1")
            elif (expresiones[0] == "L"):
                print(expresiones[0], "=", expresiones[0], "+ 1")
            elif (expresiones[0] == "H"):
                print(expresiones[0], "=", expresiones[0], "+ 1")
            elif (expresiones[0] == "A"):
                print(expresiones[0], "=", expresiones[0], "+ 1")

        elif operacion == "DCR":
            if (expresiones[0] == "B"):
                print(expresiones[0], "=", expresiones[0], "- 1")
            elif (expresiones[0] == "C"):
                print(expresiones[0], "=", expresiones[0], "- 1")
            elif (expresiones[0] == "D"):
                print(expresiones[0], "=", expresiones[0], "- 1")
            elif (expresiones[0] == "E"):
                print(expresiones[0], "=", expresiones[0], "- 1")
            elif (expresiones[0] == "L"):
                print(expresiones[0], "=", expresiones[0], "- 1")
            elif (expresiones[0] == "H"):
                print(expresiones[0], "=", expresiones[0], "- 1")
            elif (expresiones[0] == "A"):
                print(expresiones[0], "=", expresiones[0], "- 1")

        elif operacion == "CMP":
            A = B
            if(expresiones[0] == "B"):
                REG = B
            elif (expresiones[0] == "C"):
                REG = C
            elif (expresiones[0] == "D"):
                REG = D
            elif (expresiones[0] == "E"):
                REG = E
            elif (expresiones[0] == "L"):
                REG = L
            elif (expresiones[0] == "H"):
                REG = H
            elif (expresiones[0] == "A"):
                REG = A
            if ( A - REG < 0):
                print("if (", A, "<", REG,"):")
            elif ( A - REG > 0):
                print("if (", A, ">", REG, "):")
            elif  ( A - REG == 0):
                print("if (", A, "==", REG, "):")

        elif operacion == "ANA":  # LOOP FOR
            A = B
            if(expresiones[0] == "B"):
                REG = B
            elif (expresiones[0] == "C"):
                REG = C
            elif (expresiones[0] == "D"):
                REG = D
            elif (expresiones[0] == "E"):
                REG = E
            elif (expresiones[0] == "L"):
                REG = L
            elif (expresiones[0] == "H"):
                REG = H
            elif (expresiones[0] == "A"):
                REG = A
            # print(A - REG)
            if ( A - REG < 0):
                print("for B in range (", A , ",", A, "<", REG , ", 1):")
            elif ( A - REG > 0):
                print("for B in range (", A , ",", A, ">", REG , ", 1):")
            elif  ( A - REG == 0):
                print("for B in range (", A , ",", A, "==", REG , ", 1):")

        elif operacion == "ORA": # LOOP WHILE
            A = B
            if (expresiones[0] == "B"):
                REG = B
            elif (expresiones[0] == "C"):
                REG = C
            elif (expresiones[0] == "D"):
                REG = D
            elif (expresiones[0] == "E"):
                REG = E
            elif (expresiones[0] == "L"):
                REG = L
            elif (expresiones[0] == "H"):
                REG = H
            elif (expresiones[0] == "A"):
                REG = A
            # print(A - REG)
            if (A - REG < 0):
                print("while", A, "<", REG, ":")
            elif (A - REG > 0):
                print("while", A, ">", REG, ":")
            elif (A - REG == 0):
                print("while", A, "==", REG, ":")
        elif operacion == "ADI":
            pass
        elif operacion == "LXI":
            #print(operacion ,expresiones[0:len(ctx.getText())], expresiones[1])
            pass
        elif operacion == "RPO": # Hello World!
            print("print("+"Hello World!"+")")

        elif operacion == "RPE": # Goodbye, World!
            print("print(" + "Goodbye, World!" + ")")

        elif operacion == "RP": # def FuncionPrueba():
            print("def FuncionPrueba():")

        elif operacion == "XRA":
            if (expresiones[0] == "B"):
                REG = B
            elif (expresiones[0] == "C"):
                REG = C
            elif (expresiones[0] == "D"):
                REG = D
            elif (expresiones[0] == "E"):
                REG = E
            elif (expresiones[0] == "L"):
                REG = L
            elif (expresiones[0] == "H"):
                REG = H
            elif (expresiones[0] == "A"):
                REG = A
            print("print(",expresiones[0], "=", REG, ")")

        elif operacion == "ADC": # print ( R )
            if (expresiones[0] == "B"):
                REG = B
            elif (expresiones[0] == "C"):
                REG = C
            elif (expresiones[0] == "D"):
                REG = D
            elif (expresiones[0] == "E"):
                REG = E
            elif (expresiones[0] == "L"):
                REG = L
            elif (expresiones[0] == "H"):
                REG = H
            elif (expresiones[0] == "A"):
                REG = A
            print("print(", expresiones[0], ")")
        elif operacion == "RNZ":
            pass
        elif operacion == "RZ":
            pass
        elif operacion == "SBB": # return VARIABLE
            if (expresiones[0] == "B"):
                REG = B
            elif (expresiones[0] == "C"):
                REG = C
            elif (expresiones[0] == "D"):
                REG = D
            elif (expresiones[0] == "E"):
                REG = E
            elif (expresiones[0] == "L"):
                REG = L
            elif (expresiones[0] == "H"):
                REG = H
            elif (expresiones[0] == "A"):
                REG = A
            print("return", expresiones[0])

        elif operacion == "RNC":  #return None
            print("return None")

        elif operacion == "RC": # pass
            print("pass")

        elif operacion == "RM":  # if par o impar
            print("h = input('Introduzca un numero: ')")
            print("if h % 2 == 0:")
            print("print('Este numero es par')")
            print("else:")
            print("print('Este numero es impar')")
        elif operacion == "JC":
            print("else:")
            pass
        elif operacion == "LDA":
            return ctx.getText()
        elif operacion == "STA":
            return ctx.getText()
        elif operacion == "JMP":
            return ctx.getText()
        elif operacion == "CALL":
            return ctx.getText()
        elif operacion == "RET":
            return ctx.getText()
        elif operacion == "PUSH":
            pass
        elif operacion == "POP":
            pass
        elif operacion == "RAL":
            pass
        elif operacion == "RAR":
            pass
        elif operacion == "JNZ":
            pass
        elif operacion == "JZ":
            pass
        elif operacion == "JNC":
            pass
        elif operacion == "JPO":
            pass
        elif operacion == "JPE":
            pass
        elif operacion == "JP":
            pass
        elif operacion == "JM":
            pass
        elif operacion == "DI": 
            pass
        elif operacion == "EI":
            pass
        else:
            return ctx.getText()

    def enterOpcode(self, ctx: Parser.OpcodeContext):
        operacion = ctx.getText()
        return operacion

    '''    
        elif operacion == "LDAX":
            pass
        elif operacion == "LHLD":
            pass
        elif operacion == "SHLD":
            pass
        elif operacion == "XTHL":
            pass
        elif operacion == "SPHL":
            pass
        elif operacion == "PCHL":
            pass
        elif operacion == "XCHG":
            pass
        elif operacion == "DAA":
            pass
        elif operacion == "ACI":
            pass
        elif operacion == "SBI":
            pass
        elif operacion == "DAD":
            pass
        elif operacion == "INX":
            pass
        elif operacion == "DCX":
            pass
        elif operacion == "RLC":
            pass
        elif operacion == "RRC":
            pass
        elif operacion == "IN":
            pass
        elif operacion == "OUT":
            pass
        elif operacion == "CMC":
            pass
        elif operacion == "STC":
            pass
        elif operacion == "CMA":
            pass
        elif operacion == "HLT":
            pass
        elif operacion == "RST":
            pass
        elif operacion == "CNZ":
            pass
        elif operacion == "CZ":
            pass
        elif operacion == "CNC":
            pass
        elif operacion == "CC":
            pass
        elif operacion == "CPO":
            pass
        elif operacion == "CPE":
            pass
        elif operacion == "CP":
            pass
        elif operacion == "CM":
            pass '''
