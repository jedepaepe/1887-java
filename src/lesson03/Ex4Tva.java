package lesson03;

import java.util.Scanner;

public class Ex4Tva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("prix et taux de tva: ");
        double price = scanner.nextDouble();
        double vat = scanner.nextDouble();
        System.out.println("prix tva incluse: " + (price * (1 + vat / 100)));
    }
}
