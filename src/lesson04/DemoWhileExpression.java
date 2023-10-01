package lesson04;

import java.util.Scanner;

public class DemoWhileExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cmd = "";
        while (! cmd.equals("Q")) {
            System.out.println("Tapez 1 pour créer un nouveau compte");
            System.out.println("Tapez 2 pour consulter vos comptes");
            System.out.println("Tapez 3 pour modifier vos comptes");
            System.out.println("Tapez Q pour terminer");
            cmd = scanner.nextLine();
            System.out.println("\nVous avez choisi " + cmd);
        }
        System.out.println("Merci d'avoir fait appel à nos services");
        System.out.println("A bientôt");
    }
}
