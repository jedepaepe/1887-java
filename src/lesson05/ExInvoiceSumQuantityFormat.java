package lesson05;

import java.util.Scanner;

public class ExInvoiceSumQuantityFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        String next = "oui";
        while (next.equals("oui")) {
            System.out.print("Prix de l'article et la quantité: ");
            double price = scanner.nextDouble();
            double quantity = scanner.nextDouble();
            total = total + price * quantity;
            System.out.print("Nouvelle ligne de facture? ");
            next = scanner.next();
        }
        System.out.printf("Le total de la facture est: %.2f", total);
    }
}
