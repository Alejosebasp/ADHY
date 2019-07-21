from src import dis
import os

if __name__ == '__main__':

    #desemamblando archivo
    dirpath = os.getcwd()+ r"\..\inputs"
    print(dirpath)
    dis.desensamblar(dirpath, "invaders")
    print("listo")
