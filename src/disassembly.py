import binascii


def get_destino(offset, hexed, addt, x):
    destino = ""

    for i in range(1, offset + 1):
        offset_byte = hexed[(x * 2) + i * 2] + hexed[(x * 2) + i * 2 + 1]
        destino = offset_byte + destino

    destino = addt + destino
    return destino


def desensamblar(ruta, nombre):
    source = ruta + "\\" + nombre
    filename = ruta + '\\' + nombre + "_dis.txt"

    # Lectura de archivo
    with open(source, "rb") as f:
        content = f.read()

    hexed = binascii.hexlify(content).decode()
    bit_size = int(len(hexed) / 2)

    # Variable que almacena las operaciones
    buffer = ""

    opcode = 0
    cont = 0

    # Incrementa en 1 -> R = R + 1
    INR = "INR"
    # Asigna un valor a un registro -> R = (valor)
    MVI = "MVI"
    # Decrementa en 1 -> R = R - 1
    DCR = "DCR"
    # Carga un dato de 16-bit en el registro par
    LXI = "LXI"

    # Traductor - Desensamblador
    for x in range(0, bit_size):

        if cont > 0:
            cont -= 1
            opcode += 1
            continue

        # Identifica el byte para asignarle una operación
        byte = hexed[x * 2] + hexed[(x * 2) + 1]
        instruccion = ""

        # Registro de memoria
        posMemoria = ""

        if byte == "00":
            instruccion = "NOP"

        elif byte == "01":
            instruccion = "LXI"

            offset = 2  # Numero menos uno de instruciones que hace
            addr = "B,$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "02":
            instruccion = "STAX"
            posMemoria = "B"

        elif byte == "03":
            instruccion = "INX"
            posMemoria = "B"

        elif byte == "04":
            instruccion = INR
            posMemoria = "B"

        elif byte == "05":
            instruccion = "DCR"
            posMemoria = "B"

        elif byte == "06":
            instruccion = "MVI"
            offset = 1
            addr = "B,$"

            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "07":
            instruccion = "RLC"

        elif byte == "08":
            instruccion = ""

        elif byte == "09":
            instruccion = "DAD"
            posMemoria = "B"

        elif byte == "0a":
            instruccion = "LDAX"
            posMemoria = "B"

        elif byte == "0b":
            instruccion = "DCX"
            posMemoria = "B"

        elif byte == "0c":
            instruccion = INR
            posMemoria = "C"

        elif byte == "0d":
            instruccion = "DCR"
            posMemoria = "C"

        elif byte == "0e":
            instruccion = "MVI"
            offset = 1
            addr = "C,$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "0f":
            instruccion = "RRC"

        elif byte == "10":
            instruccion = ""

        elif byte == "11":
            instruccion = "LXI"
            offset = 2
            addr = "$,D"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "12":
            instruccion = "STAX"
            posMemoria = "D"

        elif byte == "13":
            instruccion = "INX"
            posMemoria = "D"

        elif byte == "14":
            instruccion = INR
            posMemoria = "D"

        elif byte == "15":
            instruccion = "DCR"
            posMemoria = "D"

        elif byte == "16":
            instruccion = "MVI"
            offset = 1
            addr = "D,$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "17":
            instruccion = "RAL"

        elif byte == "18":
            instruccion = ""

        elif byte == "19":
            instruccion = "DAD"
            posMemoria = "D"

        elif byte == "1a":
            instruccion = "LDAX"
            posMemoria = "D"

        elif byte == "1b":
            instruccion = "DCX"
            posMemoria = "D"

        elif byte == "1c":
            instruccion = INR
            posMemoria = "E"

        elif byte == "1d":
            instruccion = "DCR"
            posMemoria = "E"

        elif byte == "1e":
            instruccion = "MVI"
            offset = 1
            addr = "E,$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "1f":
            instruccion = "RAR"

        elif byte == "20":
            instruccion = "RIM"

        elif byte == "21":
            instruccion = "LXI"
            offset = 2
            addr = "$,H"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "22":
            instruccion = "SHLD"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "23":
            instruccion = "INX"
            posMemoria = "H"

        elif byte == "24":
            instruccion = INR
            posMemoria = "H"

        elif byte == "25":
            instruccion = "DCR"
            posMemoria = "H"

        elif byte == "26":
            instruccion = "MVI"
            offset = 1
            addr = "H,$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "27":
            instruccion = "DAA"

        elif byte == "28":
            instruccion = ""

        elif byte == "29":
            instruccion = "DAD"
            posMemoria = "H"

        elif byte == "2a":
            instruccion = "LHLD"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "2b":
            instruccion = "DCX"
            posMemoria = "H"

        elif byte == "2c":
            instruccion = INR
            posMemoria = "L"

        elif byte == "2d":
            instruccion = "DCR"
            posMemoria = "L"

        elif byte == "2e":
            instruccion = "MVI"
            offset = 1
            addr = "L,$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "2f":
            instruccion = "CMA"

        elif byte == "30":
            instruccion = "SIM"

        elif byte == "31":
            instruccion = "LXI"
            offset = 2
            addr = "$,SP"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "32":
            instruccion = "STA"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "33":
            instruccion = "INX"
            posMemoria = "SP"

        elif byte == "34":
            instruccion = INR
            posMemoria = "M"

        elif byte == "35":
            instruccion = "DCR"
            posMemoria = "M"

        elif byte == "36":
            instruccion = "MVI"
            offset = 1
            addr = "M,$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "37":
            instruccion = "STC"

        elif byte == "38":
            instruccion = ""

        elif byte == "39":
            instruccion = "DAD"
            posMemoria = "SP"

        elif byte == "3a":
            instruccion = "LDA"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "3b":
            instruccion = "DCX"
            posMemoria = "SP"

        elif byte == "3c":
            instruccion = INR
            posMemoria = "A"

        elif byte == "3d":
            instruccion = "DCR"
            posMemoria = "A"

        elif byte == "3e":
            instruccion = "MVI"
            offset = 1
            addr = "A,$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "3f":
            instruccion = "CMC"

        # MOV B
        elif byte == "40":
            instruccion = "MOV"
            posMemoria = "B,B"

        elif byte == "41":
            instruccion = "MOV"
            posMemoria = "B,C"

        elif byte == "42":
            instruccion = "MOV"
            posMemoria = "B,D"

        elif byte == "43":
            instruccion = "MOV"
            posMemoria = "B,E"

        elif byte == "44":
            instruccion = "MOV"
            posMemoria = "B,H"

        elif byte == "45":
            instruccion = "MOV"
            posMemoria = "B,L"

        elif byte == "46":
            instruccion = "MOV"
            posMemoria = "B,M"

        elif byte == "47":
            instruccion = "MOV"
            posMemoria = "B,A"

        # MOV C
        elif byte == "48":
            instruccion = "MOV"
            posMemoria = "C,B"

        elif byte == "49":
            instruccion = "MOV"
            posMemoria = "C,C"

        elif byte == "4a":
            instruccion = "MOV"
            posMemoria = "C,D"

        elif byte == "4b":
            instruccion = "MOV"
            posMemoria = "C,E"

        elif byte == "4c":
            instruccion = "MOV"
            posMemoria = "C,H"

        elif byte == "4d":
            instruccion = "MOV"
            posMemoria = "C,L"

        elif byte == "4e":
            instruccion = "MOV"
            posMemoria = "C,M"

        elif byte == "4f":
            instruccion = "MOV"
            posMemoria = "C,A"

        # MOV D
        elif byte == "50":
            instruccion = "MOV"
            posMemoria = "D,B"

        elif byte == "51":
            instruccion = "MOV"
            posMemoria = "D,C"

        elif byte == "52":
            instruccion = "MOV"
            posMemoria = "D,D"

        elif byte == "53":
            instruccion = "MOV"
            posMemoria = "D,E"

        elif byte == "54":
            instruccion = "MOV"
            posMemoria = "D,H"

        elif byte == "55":
            instruccion = "MOV"
            posMemoria = "D,L"

        elif byte == "56":
            instruccion = "MOV"
            posMemoria = "D,M"

        elif byte == "57":
            instruccion = "MOV"
            posMemoria = "D,A"

        # MOV E
        elif byte == "58":
            instruccion = "MOV"
            posMemoria = "E,B"

        elif byte == "59":
            instruccion = "MOV"
            posMemoria = "E,C"

        elif byte == "5a":
            instruccion = "MOV"
            posMemoria = "E,D"

        elif byte == "5b":
            instruccion = "MOV"
            posMemoria = "E,E"

        elif byte == "5c":
            instruccion = "MOV"
            posMemoria = "E,H"

        elif byte == "5d":
            instruccion = "MOV"
            posMemoria = "E,L"

        elif byte == "5e":
            instruccion = "MOV"
            posMemoria = "E,M"

        elif byte == "5f":
            instruccion = "MOV"
            posMemoria = "E,A"

        # MOV H
        elif byte == "60":
            instruccion = "MOV"
            posMemoria = "H,B"

        elif byte == "61":
            instruccion = "MOV"
            posMemoria = "H,C"

        elif byte == "62":
            instruccion = "MOV"
            posMemoria = "H,D"

        elif byte == "63":
            instruccion = "MOV"
            posMemoria = "H,E"

        elif byte == "64":
            instruccion = "MOV"
            posMemoria = "H,H"

        elif byte == "65":
            instruccion = "MOV"
            posMemoria = "H,L"

        elif byte == "66":
            instruccion = "MOV"
            posMemoria = "H,M"

        elif byte == "67":
            instruccion = "MOV"
            posMemoria = "H,A"

        # MOV L
        elif byte == "68":
            instruccion = "MOV"
            posMemoria = "L,B"

        elif byte == "69":
            instruccion = "MOV"
            posMemoria = "L,C"

        elif byte == "6a":
            instruccion = "MOV"
            posMemoria = "L,D"

        elif byte == "6b":
            instruccion = "MOV"
            posMemoria = "L,E"

        elif byte == "6c":
            instruccion = "MOV"
            posMemoria = "L,H"

        elif byte == "6d":
            instruccion = "MOV"
            posMemoria = "L,L"

        elif byte == "6e":
            instruccion = "MOV"
            posMemoria = "L,M"

        elif byte == "6f":
            instruccion = "MOV"
            posMemoria = "L,A"

        # MOV M
        elif byte == "70":
            instruccion = "MOV"
            posMemoria = "M,B"

        elif byte == "71":
            instruccion = "MOV"
            posMemoria = "M,C"

        elif byte == "72":
            instruccion = "MOV"
            posMemoria = "M,D"

        elif byte == "73":
            instruccion = "MOV"
            posMemoria = "M,E"

        elif byte == "74":
            instruccion = "MOV"
            posMemoria = "M,H"

        elif byte == "75":
            instruccion = "MOV"
            posMemoria = "M,L"

        elif byte == "76":
            instruccion = "MOV"
            posMemoria = "M,M"

        elif byte == "77":
            instruccion = "MOV"
            posMemoria = "M,A"

        # MOV A
        elif byte == "78":
            instruccion = "MOV"
            posMemoria = "A,B"

        elif byte == "79":
            instruccion = "MOV"
            posMemoria = "A,C"

        elif byte == "7a":
            instruccion = "MOV"
            posMemoria = "A,D"

        elif byte == "7b":
            instruccion = "MOV"
            posMemoria = "A,E"

        elif byte == "7c":
            instruccion = "MOV"
            posMemoria = "A,H"

        elif byte == "7d":
            instruccion = "MOV"
            posMemoria = "A,L"

        elif byte == "7e":
            instruccion = "MOV"
            posMemoria = "A,M"

        elif byte == "7f":
            instruccion = "MOV"
            posMemoria = "A,A"

        # ADD
        elif byte == "80":
            instruccion = "ADD"
            posMemoria = "B"

        elif byte == "81":
            instruccion = "ADD"
            posMemoria = "C"

        elif byte == "82":
            instruccion = "ADD"
            posMemoria = "D"

        elif byte == "83":
            instruccion = "ADD"
            posMemoria = "E"

        elif byte == "84":
            instruccion = "ADD"
            posMemoria = "H"

        elif byte == "85":
            instruccion = "ADD"
            posMemoria = "L"

        elif byte == "86":
            instruccion = "ADD"
            posMemoria = "B"

        elif byte == "87":
            instruccion = "ADD"
            posMemoria = "A"

        # ADC
        elif byte == "88":
            instruccion = "ADC"
            posMemoria = "B"

        elif byte == "89":
            instruccion = "ADC"
            posMemoria = "C"

        elif byte == "8a":
            instruccion = "ADC"
            posMemoria = "D"

        elif byte == "8b":
            instruccion = "ADC"
            posMemoria = "E"

        elif byte == "8c":
            instruccion = "ADC"
            posMemoria = "H"

        elif byte == "8d":
            instruccion = "ADC"
            posMemoria = "L"

        elif byte == "8e":
            instruccion = "ADC"
            posMemoria = "M"

        elif byte == "8f":
            instruccion = "ADC"
            posMemoria = "A"

        # SUB
        elif byte == "90":
            instruccion = "SUB"
            posMemoria = "B"

        elif byte == "91":
            instruccion = "SUB"
            posMemoria = "C"

        elif byte == "92":
            instruccion = "SUB"
            posMemoria = "D"

        elif byte == "93":
            instruccion = "SUB"
            posMemoria = "E"

        elif byte == "94":
            instruccion = "SUB"
            posMemoria = "H"

        elif byte == "95":
            instruccion = "SUB"
            posMemoria = "L"

        elif byte == "96":
            instruccion = "SUB"
            posMemoria = "M"

        elif byte == "97":
            instruccion = "SUB"
            posMemoria = "A"

        # SBB
        elif byte == "98":
            instruccion = "SBB"
            posMemoria = "B"

        elif byte == "99":
            instruccion = "SBB"
            posMemoria = "C"

        elif byte == "9a":
            instruccion = "SBB"
            posMemoria = "D"

        elif byte == "9b":
            instruccion = "SBB"
            posMemoria = "E"

        elif byte == "9c":
            instruccion = "SBB"
            posMemoria = "H"

        elif byte == "9d":
            instruccion = "SBB"
            posMemoria = "L"

        elif byte == "9e":
            instruccion = "SBB"
            posMemoria = "M"

        elif byte == "9f":
            instruccion = "SBB"
            posMemoria = "A"

        # ANA
        elif byte == "a0":
            instruccion = "ANA"
            posMemoria = "B"

        elif byte == "a1":
            instruccion = "ANA"
            posMemoria = "C"

        elif byte == "a2":
            instruccion = "ANA"
            posMemoria = "D"

        elif byte == "a3":
            instruccion = "ANA"
            posMemoria = "E"

        elif byte == "a4":
            instruccion = "ANA"
            posMemoria = "H"

        elif byte == "a5":
            instruccion = "ANA"
            posMemoria = "L"

        elif byte == "a6":
            instruccion = "ANA"
            posMemoria = "M"

        elif byte == "a7":
            instruccion = "ANA"
            posMemoria = "A"

        # XRA
        elif byte == "a8":
            instruccion = "XRA"
            posMemoria = "B"

        elif byte == "a9":
            instruccion = "XRA"
            posMemoria = "C"

        elif byte == "aa":
            instruccion = "XRA"
            posMemoria = "D"

        elif byte == "ab":
            instruccion = "XRA"
            posMemoria = "E"

        elif byte == "ac":
            instruccion = "XRA"
            posMemoria = "H"

        elif byte == "ad":
            instruccion = "XRA"
            posMemoria = "L"

        elif byte == "ae":
            instruccion = "XRA"
            posMemoria = "M"

        elif byte == "af":
            instruccion = "XRA"
            posMemoria = "A"

        # ORA
        elif byte == "b0":
            instruccion = "ORA"
            posMemoria = "B"

        elif byte == "b1":
            instruccion = "ORA"
            posMemoria = "C"

        elif byte == "b2":
            instruccion = "ORA"
            posMemoria = "D"

        elif byte == "b3":
            instruccion = "ORA"
            posMemoria = "E"

        elif byte == "b4":
            instruccion = "ORA"
            posMemoria = "H"

        elif byte == "b5":
            instruccion = "ORA"
            posMemoria = "L"

        elif byte == "b6":
            instruccion = "ORA"
            posMemoria = "M"

        elif byte == "b7":
            instruccion = "ORA"
            posMemoria = "A"
        # CMP
        elif byte == "b8":
            instruccion = "CMP"
            posMemoria = "B"

        elif byte == "b9":
            instruccion = "CMP"
            posMemoria = "C"

        elif byte == "ba":
            instruccion = "CMP"
            posMemoria = "D"

        elif byte == "bb":
            instruccion = "CMP"
            posMemoria = "E"

        elif byte == "bc":
            instruccion = "CMP"
            posMemoria = "H"

        elif byte == "bd":
            instruccion = "CMP"
            posMemoria = "L"

        elif byte == "be":
            instruccion = "CMP"
            posMemoria = "M"

        elif byte == "bf":
            instruccion = "CMP"
            posMemoria = "A"

        elif byte == "c0":
            instruccion = "RNZ"
            posMemoria = ""

        elif byte == "c1":
            instruccion = "POP"
            posMemoria = "B"

        elif byte == "c2":
            instruccion = "JNZ"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "c3":
            instruccion = "JMP"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "c4":
            instruccion = "CNZ"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "c5":
            instruccion = "PUSH"
            posMemoria = "B"

        elif byte == "c6":
            instruccion = "ADI"
            offset = 1
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "c7":
            instruccion = "RST"
            posMemoria = "0"

        elif byte == "c8":
            instruccion = "RZ"
            posMemoria = ""

        elif byte == "c9":
            instruccion = "RET"
            posMemoria = ""

        elif byte == "ca":
            instruccion = "JZ"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "cb":
            instruccion = ""
            posMemoria = ""

        elif byte == "cc":
            instruccion = "CZ"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "cd":
            instruccion = "CALL"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "ce":
            instruccion = "ACI"
            offset = 1
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "cf":
            instruccion = "RST"
            posMemoria = "1"

        elif byte == "d0":
            instruccion = "RNC"
            posMemoria = ""

        elif byte == "d1":
            instruccion = "POP"
            posMemoria = "D"

        elif byte == "d2":
            instruccion = "JNC"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "d3":
            instruccion = "OUT"
            offset = 1
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "d4":
            instruccion = "CNC"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "d5":
            instruccion = "PUSH"
            posMemoria = "D"

        elif byte == "d6":
            instruccion = "SUI"
            offset = 1
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "d7":
            instruccion = "RST"
            posMemoria = "2"

        elif byte == "d8":
            instruccion = "RC"
            posMemoria = ""

        elif byte == "d9":
            instruccion = ""
            posMemoria = ""

        elif byte == "da":
            instruccion = "JC"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "db":
            instruccion = "IN"
            offset = 1
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "dc":
            instruccion = "CC"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "dd":
            instruccion = ""
            posMemoria = ""

        elif byte == "de":
            instruccion = "SBI"
            offset = 1
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "df":
            instruccion = "RST"
            posMemoria = "3"

        elif byte == "e0":
            instruccion = "RPO"
            posMemoria = ""

        elif byte == "e1":
            instruccion = "POP"
            posMemoria = "H"

        elif byte == "e2":
            instruccion = "JPO"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "e3":
            instruccion = "XTHL"
            posMemoria = ""

        elif byte == "e4":
            instruccion = "CPO"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "e5":
            instruccion = "PUSH"
            posMemoria = "H"

        elif byte == "e6":
            instruccion = "ANI"
            offset = 1
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "e7":
            instruccion = "RST"
            posMemoria = "4"

        elif byte == "e8":
            instruccion = "RPE"
            posMemoria = ""

        elif byte == "e9":
            instruccion = "PCHL"
            posMemoria = ""

        elif byte == "ea":
            instruccion = "JPE"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "eb":
            instruccion = "XCHG"
            posMemoria = ""

        elif byte == "ec":
            instruccion = "CPE"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "ed":
            instruccion = ""
            posMemoria = ""

        elif byte == "ee":
            instruccion = "XRI"
            offset = 1
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "ef":
            instruccion = "RST"
            posMemoria = "5"

        elif byte == "f0":
            instruccion = "RP"
            posMemoria = ""

        elif byte == "f1":
            instruccion = "POP"
            posMemoria = "PSW"

        elif byte == "f2":
            instruccion = "JP"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "f3":
            instruccion = "DI"
            posMemoria = ""

        elif byte == "f4":
            instruccion = "CP"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "f5":
            instruccion = "PUSH"
            posMemoria = "PSW"

        elif byte == "f6":
            instruccion = "ORI"
            offset = 1
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "f7":
            instruccion = "RST"
            posMemoria = "6"

        elif byte == "f8":
            instruccion = "RM"
            posMemoria = ""

        elif byte == "f9":
            instruccion = "SPHL"
            posMemoria = ""

        elif byte == "fa":
            instruccion = "JM"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "fb":
            instruccion = "EI"
            posMemoria = ""

        elif byte == "fc":
            instruccion = "CM"
            offset = 2
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "fd":
            instruccion = ""
            posMemoria = ""

        elif byte == "fe":
            instruccion = "CPI"
            offset = 1
            addr = "$"
            posMemoria = get_destino(offset, hexed, addr, x)
            cont = int(offset)

        elif byte == "ff":
            instruccion = "RST"
            posMemoria = "7"

        buffer += instruccion + "\t" + posMemoria + "\n"

        opcode += 1

    with open(filename, "w") as f:
        f.write(buffer)
