n = int(input("Entrez un nombre: "))
prime = True 
for i in range(2, n):
    if n % i == 0:
        prime = False 
        break
    
if prime: 
    print("Ce nombre est premier.")
else:
    print("Ce nombre n'est pas premier.")    
    