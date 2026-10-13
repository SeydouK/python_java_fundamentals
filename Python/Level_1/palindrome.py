mot = input("Entrez un mot: ")
lettres = []
for i in mot:
    lettres.append(i)
lettres = lettres[::-1]
print(''.join(lettres))