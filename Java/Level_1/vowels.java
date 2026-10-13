import java.util.Scanner;
import java.util.Arrays;

public class vowels {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un mot: ");
        String mot = scanner.nextLine();
        String[] letters = mot.split("");
        String[] vowels = {"a", "e", "i", "o", "u"};
        int count = 0;

        for(int i = 0; i<letters.length; i++){
            System.out.println(letters[i]);
            if (Arrays.asList(vowels).contains(letters[i])){
                count += 1;
            }
        }

        System.out.println(count);


    }
    
}
