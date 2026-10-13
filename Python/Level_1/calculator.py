print("Bienvenue dans le calculateur.")
print()
print("1 - Addition\n")
print("2 - Soustraction\n")
print("3 - Division\n")
choix=input("> ")

if choix == "1":
    print("Combien de nombres voullez vous additioner?\n")
    nbr = int(input("> "))
    nombres = []
    somme=0
    while len(nombres)<nbr:
        nombres.append(int(input(f"Entrer un nombre:\n  > ")))
    for i in range(len(nombres)):
        somme+=nombres[i]
    print(f"Resultat de l'addition: {somme}")
elif choix == "2": 
    print("Combien de nombres voullez vous soustraire?\n")
    nbr = int(input("> "))
    nombres = []
    result = 0
    while len(nombres)<nbr:
        nombres.append(int(input("> ")))
    for i in range(len(nombres)-1): 
        if result == 0: 
            result = nombres[0]
        result -= nombres[i+1]
    print(f"La soustraction est {result}")
elif choix  == "3":
    nombre_1 = int(input("Premier nombre:\n > "))
    print()
    nombre_2 = int(input("Second nombre: \n >"))
    division = nombre_1/nombre_2
    print(f"Le resultat de la division : {division}")
