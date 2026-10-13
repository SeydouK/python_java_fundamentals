package Level_2;

import java.util.ArrayList;


public class remove_duplicates {
    public static void main(String[] args){
        int[] liste = {2,1,2,31,4};
        ArrayList<Integer> liste_duplicates = new ArrayList<>();
        for (int i = 0; i<liste.length; i++){
            if (!liste_duplicates.contains(liste[i])){
                liste_duplicates.add(liste[i]);
            }
        }
        System.out.println(liste_duplicates);
    }
}
