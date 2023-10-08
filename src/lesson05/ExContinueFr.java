package lesson05;

import java.util.Scanner;

public class ExContinueFr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = "oui";
        while (next.equals("oui")) {
            System.out.print("Voulez-vous continuer? ");
            next = scanner.next();
        }
        System.out.println("fin");
    }
}
