number = input("Entrez un nombre: ")
sum_digits = 0
sum_digits = [int(number[i])+int(number[i+1]) for i in range(len(number)-1)]

print(sum_digits)