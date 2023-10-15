package lesson06;

import java.util.Scanner;

public class ExIsEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Un nombre entier: ");
        int nombre = scanner.nextInt();
        if (nombre % 2 == 0) {
            System.out.println(nombre + " est un nombre pair.");
        } else {
            System.out.println(nombre + " est un nombre impair.");
        }
    }
}