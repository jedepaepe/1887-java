package lesson07;

import java.util.Scanner;

public class RevisionWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        while (! choice.equals("Q")) {
            System.out.println("Tapez 1 pour afficher la liste des tâches");
            System.out.println("Tapez 2 pour créer une nouvelle tâche");
            System.out.println("Tapez 3 pour éditer une tâche");
            System.out.println("Tapez Q pour quitter l'application");
            choice = scanner.nextLine();
        }
        System.out.println("merci d'avoir utiliser l'application");
    }
}
