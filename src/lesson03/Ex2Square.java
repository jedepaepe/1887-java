package lesson03;

import java.util.Scanner;

public class Ex2Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("coté: ");
        double side = scanner.nextDouble();
        System.out.println("périmètre: " + (4 * side));
        System.out.println("aire: " + (side * side));
    }
}
