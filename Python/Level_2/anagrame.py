word_1 = input("Enter the first word: ").lower()
word_2 = input("Enter the seconde word: ").lower()

if len(word_1) == len(word_2):
    for letter in word_1:
        if word_1.count(letter) != word_2.count(letter):
                print("These words are not anagrams.")
                break

    print("These words are anagrams.")

else:
    print("These words are not anagram.")
