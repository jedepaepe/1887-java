package lesson08;

import java.util.Scanner;

public class StructureDemoMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            showMenu();
            choice = scanner.next();
            if (choice.equals("+")) {
                doAddition(scanner);
            }
            else if (choice.equals("-")) {
                doSubstraction(scanner);
            }
            System.out.println();
        } while (! choice.equals("Q"));
        System.out.println("Merci d'avoir utiliser l'application");
    }

    private static void showMenu() {
        System.out.println("Choisissez dans l'une de ces options");
        System.out.println("+ pour une addition");
        System.out.println("- pour une soustraction");
        System.out.println("Q pour arrêter l'application");
    }

    private static void doAddition(Scanner scanner) {
        System.out.print("entrez les deux valeurs: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    private static void doSubstraction(Scanner scanner) {
        System.out.println("entrez les deux valeurs: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + " - " + b + " = " + (a - b));
    }
}
