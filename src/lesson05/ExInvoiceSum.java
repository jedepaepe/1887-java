package lesson05;

import java.util.Scanner;

public class ExInvoiceSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        String next = "oui";
        while (next.equals("oui")) {
            System.out.print("Prix de l'article: ");
            double price = scanner.nextDouble();
            total = total + price;
            System.out.print("Nouvelle ligne de facture? ");
            next = scanner.next();
        }
        System.out.println("Le total de la facture est: " + total);
    }
}
