import random
import asyncio

class Transporte:
    def __init__(self, terreno):
        self.terreno = terreno      
    def mostrar_transporte(self):
        match self.terreno:
            case 0:
                print("El modo de transporte es Normal")
                print("--------------------------------")
                print("       ")
            case 1:
                print("El modo de transporte es Formación estrella")
                print("--------------------------------")
                print("       ")
            case 2:
                print("El modo de transporte es Alas")
                print("--------------------------------")
                print("       ")
            case 3:
                print("El modo de transporte es Ruedas de tanque")
                print("--------------------------------")
                print("       ")
            case 4:
                print("El modo de transporte es Pies anti-derrapamiento")
                print("--------------------------------")
                print("       ")
class Terreno(Transporte):
    def __init__(self, terreno):
        super().__init__(terreno)
        self.terreno
    def mostrar_terreno(self):
        match self.terreno:
            case 0:
                print("--------------------------------")
                print("El terreno es Plano")
                print("       ")
            case 1:
                print("--------------------------------")
                print("El terreno es Agua")
                print("       ")
            case 2:
                print("--------------------------------")
                print("El terreno es Aire")
                print("       ")
            case 3:
                print("--------------------------------")
                print("El terreno es Sinuroso")
                print("       ")
            case 4:
                print("--------------------------------")
                print("El terreno es Lava")
                print("       ")
        super().mostrar_transporte()

async def action():
    while True:
        n = random.randint(0,4)
        case1 = Terreno(n)
        case1.mostrar_terreno()
        await asyncio.sleep(4) 

asyncio.run(action())
