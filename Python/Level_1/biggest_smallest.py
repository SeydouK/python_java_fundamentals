liste = [10,42,123,1,21]
biggest = liste[0]
smallest = liste[0]
for i in liste:
    if i > biggest: 
        biggest = i
    else:
        smallest = i

print("Le plus grand nombre est", biggest, "et le plus petit nombre est", smallest)
