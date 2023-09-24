package lesson03;

import java.util.Scanner;

public class Ex2AdditionImproved {
    public static void main(String[] args) {
        System.out.print("Veuillez introduire deux entiers: ");
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
    }
}
