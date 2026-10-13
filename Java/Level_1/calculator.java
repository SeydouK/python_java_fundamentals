import java.util.ArrayList;
import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        System.out.println("Bienvenue dans le calculateur: "); 
        System.out.println("\n");
        System.out.println("1 - Addition");
        System.out.println("2 - Soustraction");
        System.out.println("3 - Division");
        System.out.println("Faites votre choix: \n> ");

        Scanner scanner = new Scanner(System.in);
        Integer choix = scanner.nextInt();
        ArrayList<Integer> nombres = new ArrayList<>();

        if (choix == 1){
            System.out.println("Combien de nombres voullez vous additioner?\n> ");
            Integer nbrs = scanner.nextInt();
            while (nombres.size()<nbrs){
                System.out.println("Entre un nombre:\n>");
                int nombre = scanner.nextInt();
                nombres.add(nombre);
            }
            int somme = 0;
            for (int i = 0; i<nombres.size(); i++){
                somme += nombres.get(i);
            }
            System.out.println("La somme est " + somme);
        }

        else if (choix==2){
            System.out.println("Combien de nombres voullez vous soustraire?");
            int nbrs = scanner.nextInt();
            while(nombres.size()<nbrs){
                System.out.println("Entre un nombre:\n>");
                int nombre = scanner.nextInt();
                nombres.add(nombre);
            }
            int soustraction = nombres.get(0);
            for (int i = 0; i<nombres.size()-1; i++){
                soustraction -=nombres.get(i+1);
            }
            System.out.println("La soustraction est " + soustraction);
        }
        else if (choix==3){
            System.out.println("Entrez le nombre que vous voullez diviser:\n > ");
            int nombre_1 = scanner.nextInt();
            System.out.println("Entrez le second nombre que vous voullez diviser:\n >");
            int nombre_2 = scanner.nextInt();

            System.out.println("Resultat de la division  : " + nombre_1 + "/" +nombre_2 + "=" +nombre_1/nombre_2);
        }
    }
}