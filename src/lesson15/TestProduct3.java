package lesson15;

import java.util.Scanner;

public class TestProduct3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Product Form");

        System.out.print("numéro: ");
        String number = scanner.nextLine();

        System.out.print("label: ");
        String label = scanner.nextLine();

        System.out.print("prix: ");
        double price = scanner.nextDouble();

        System.out.print("stock: ");
        double stock = scanner.nextDouble();

        Product product = new Product(number, label, price, stock);
        // insère le product dans la db
    }
}
