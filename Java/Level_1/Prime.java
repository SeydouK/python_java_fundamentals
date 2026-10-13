import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        Integer nombre = scanner.nextInt();
        Boolean prime = true;

        for (int i=2; i<nombre; i++){
            if (nombre % i == 0){
                prime = false;
                break;
            } 
        }

        if (prime){
            System.out.println("C'est un nombre prime.");
        } else {
            System.out.println("Ce n'est pas un nombre prime.");
        }
    }
}
