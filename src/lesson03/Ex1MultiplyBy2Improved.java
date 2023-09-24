package lesson03;

import java.util.Scanner;

public class Ex1MultiplyBy2Improved {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez introduire un nombre entier: ");
        int value = scanner.nextInt();
        System.out.println("2 * " + value + " = " + 2 * value);
    }
}
