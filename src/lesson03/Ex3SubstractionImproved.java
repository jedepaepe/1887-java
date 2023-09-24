package lesson03;

import java.util.Scanner;

public class Ex3SubstractionImproved {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduisez deux entiers: ");
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        System.out.println(value1 + " - " + value2 + " = " + (value1 - value2));
    }
}
