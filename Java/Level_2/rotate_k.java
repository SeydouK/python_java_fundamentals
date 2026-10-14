package Level_2;

import java.util.Scanner;
import java.util.Arrays;

public class rotate_k{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Entrer une valeur k: ");
        int k = scanner.nextInt(); 
        int[] liste = {1,2,3,4,5};
        int[] result = new int[liste.length];
        for (int i = 0; i < liste.length; i++) {
            result[i] = liste[(i + k) % liste.length];
        }
        System.out.println(result);
    }

}