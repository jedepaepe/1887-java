package lesson08;

import java.util.Scanner;

public class StructureDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Choisissez dans l'une de ces options");
            System.out.println("+ pour une addition");
            System.out.println("- pour une soustraction");
            System.out.println("Q pour arrêter l'application");
            choice = scanner.next();
            if (choice.equals("+")) {
                System.out.print("entrez les deux valeurs: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(a + " + " + b + " = " + (a + b));
            }
            else if (choice.equals("-")) {
                System.out.println("entrez les deux valeurs: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(a + " - " + b + " = " + (a - b));
            }
            System.out.println();
        } while (! choice.equals("Q"));
        System.out.println("Merci d'avoir utiliser l'application");
    }
}
