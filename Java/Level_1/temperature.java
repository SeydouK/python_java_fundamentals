import java.util.Scanner;

public class temperature {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une temperature en celsius :"); 
        double temp_cel = scanner.nextDouble(); 
        double temp_fah = temp_cel * 9/5 + 32;
        System.out.println("La temperature en fahrenheit est : " + temp_fah);
    }
}
