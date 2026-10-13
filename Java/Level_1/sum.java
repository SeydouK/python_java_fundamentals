import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre: ");
        Integer nombre = scanner.nextInt();
        int sum = 0;
        while (nombre > 0){
            int digit = nombre%10;
            System.out.println(digit);
            sum += digit;
            nombre = nombre / 10;
        }
        System.out.println(sum);
    }
    
}
