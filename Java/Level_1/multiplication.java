import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre: ");
        int nombre = scanner.nextInt();

        for (int i=1; i<11; i++){
            System.out.println(i + " * " + nombre + " = " + i*nombre);
        }
    }
    
}
