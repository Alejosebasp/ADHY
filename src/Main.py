from src import disassembly
import os

if __name__ == '__main__':

    #desemamblando archivo
    dirpath = os.getcwd()+ r"\..\inputs"
    print(dirpath)
    disassembly.desensamblar(dirpath, "invaders")
    print("listo")
