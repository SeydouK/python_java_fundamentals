import numpy as np 

nombre = int(input("Entrez un nombre: "))

list_randomn = [12,2,23,41,212,31,100,12]
trouve = False;
y=0
while y<len(list_randomn):
    print(f"------ {list_randomn[y]}-----")
    for i in range(len(list_randomn)-1):
        sum = list_randomn[y] + list_randomn[i+1]
        print(f"{list_randomn[y]} + {list_randomn[i+1]} = {sum}")
        if sum == nombre: 
            print(f"Trouvé!")
            trouve = True;
            break

    if trouve:
        break;

    y+=1

