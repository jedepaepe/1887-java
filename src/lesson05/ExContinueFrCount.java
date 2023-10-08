package lesson05;

import java.util.Scanner;

public class ExContinueFrCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String next = "oui";
        while (next.equals("oui")) {
            count = count + 1;
            System.out.print("Voulez-vous continuer? ");
            next = scanner.next();
        }
        System.out.println("Le nombre d'itérations est " + count);
    }
}
