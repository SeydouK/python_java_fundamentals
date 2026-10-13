word = input("Entrez un mot: ")
vowels = ["a","e","i","o","u"]
count = 0

for i in word:
    if i in vowels:
        count += 1

print(f"Le nombre de vowels est: {count}")