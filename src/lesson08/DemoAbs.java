package lesson08;

import java.util.Scanner;

public class DemoAbs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre entier ");
        int value = scanner.nextInt();
        System.out.println("La valeur absolue est " + abs(value));

    }

    public static int abs(int value) {
        if (value > 0) {
            return value;
        }
        return -value;
    }
}
