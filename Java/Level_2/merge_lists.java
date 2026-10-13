package Level_2;

public class merge_lists {
    public static void main(String[] args){
        int[] nombres = {12,32,4,12,1};
        for (int i = 0; i<nombres.length; i++){
            int min_index = i; 
            
            for (int j = i + 1; j < nombres.length; j++) {
                if (nombres[j] < nombres[min_index]) {
                    min_index = j;
                }
            }

            int temp = nombres[i];
            nombres[i] = nombres[min_index];
            nombres[min_index] = temp;
        }
    }
    
}
