package Level_2;

import java.util.Scanner;

public class two_numbers_add_up {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre un nombre: ");
        int nombre = scanner.nextInt();
        
        int[] nombres = {1,23,41,2}; 
        
        for (int start=0; start<nombres.length;start++){
            int index_start = start;

            for (int j = start + 1; j < nombres.length; j++) {
                int sum = nombres[index_start] + nombres[j];        

                if (sum == nombre){
                    System.out.println("Trouvé!");
                    break;
                }
            }

        }

        
        
    }
}
