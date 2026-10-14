package Level_2;

import java.util.Scanner;

public class anagram{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first and second word: ");
        String word_1 = scanner.nextLine();
        String word_2 = scanner.nextLine();

        if (word_1.length() != word_2.length()){
            System.out.println("These words are not anagrams.");
        } else {
            int count_1 = 0;
            int count_2 = 0;
            for (int i=0; i<word_1.length(); i++){
                if (word_1.charAt(i) == word_2.charAt(i)) count_1++;
                if (word_2.charAt(i) == word_1.charAt(i)) count_2++;
            }
            if (count_1 == count_2){
                System.out.println("Those words are anagrams.");
            } else {
                System.out.println("Those words are not anagram.");
            }
        }
    }
}