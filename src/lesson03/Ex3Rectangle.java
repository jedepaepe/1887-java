package lesson03;

import java.util.Scanner;

public class Ex3Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("longeur: ");
        double length = scanner.nextDouble();
        System.out.print("largeur: ");
        double width = scanner.nextDouble();
        System.out.println("périmère: " + (2 * (length + width)));
        System.out.println("area: " + (length * width));
    }
}
