package lesson04;

import java.util.Scanner;

public class DemoWhileTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("introduisez un nombre: ");
            double value = scanner.nextDouble();
            System.out.println("le double de " + value + " est " + (2 * value));
        }
    }
}
