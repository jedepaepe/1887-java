package lesson15;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Product Form");
        Product product = new Product();

        System.out.print("numéro: ");
        String number = scanner.nextLine();
        product.setNumber(number);

        System.out.print("label: ");
        product.setLabel(scanner.nextLine());

        System.out.print("prix: ");
        product.setPrice(scanner.nextDouble());

        System.out.print("stock: ");
        product.setStock(scanner.nextDouble());

        System.out.println("Le produit a été créé");
        System.out.println("number: " + product.getNumber());

        // insère le product dans la db
    }
}
