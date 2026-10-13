texte = input("Entrez un texte: ")
texte_liste = []

for i in texte.split(' '): 
    if i not in texte_liste: 
        texte_liste.append(i)

print(texte_liste)
