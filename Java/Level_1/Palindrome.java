import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un mot: ");
        String mot = scanner.nextLine();
        String[] letters = mot.split("");
        
        for(int i=letters.length-1; i>=0;i--){
            System.out.println(letters[i]);
        }
        String reversed = new StringBuilder(String.join("",letters))
                .toString();

        System.out.println(reversed);
    }
    
}
