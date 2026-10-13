liste = [102,32,213,102,31,102]
new_liste = []

for i in liste: 
    if i not in new_liste:
        new_liste.append(i)

print(new_liste)