package Level_2;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;

public class count_duplicate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un texte: ");
        String texte = scanner.nextLine();

        String[] mots = texte.split("\\s+");
        HashMap<String, Integer> duplicates = new HashMap<>();

        for (String mot: mots){
            duplicates.put(mot,duplicates.getOrDefault(mot, 0)+1);
        }

        System.out.println(duplicates);
        scanner.close();

    }
}
