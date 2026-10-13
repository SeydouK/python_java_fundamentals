import java.util.Scanner; 

public class biggest_smallest {
    public static void main(String[] args){
        Integer[] number = {10,231,212,4,51,0};

        int biggest = number[0];  
        int smallest = number[0];
        for (int i = 0; i<number.length; i++){
            if (number[i]>biggest){
                biggest = number[i];
            } else {
                smallest = number[i];
            }
        }
        System.out.println("Le plus grand nombre est : " + biggest);
        System.out.println("Le plus petit nombre est : " + smallest);
    }
}
