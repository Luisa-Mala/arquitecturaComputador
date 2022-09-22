# def = definir una función
def primo(z):
    # variable contador
    cont = 0
    # range función de rango entre 2 y Z
    for i in range(2, z):
        d = z%i # variable residuo 
        if d == 0:
            cont+=1
    if cont !=0:
        return False
    return True


# variable valor guardado por el usuario
# int() función que retorna un entero
n = int(input("Ingrese un número: "))

if primo(n):
    print("El número es primo")
else:
    print("El número no es primo")