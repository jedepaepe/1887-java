package lesson08;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez deux entiers ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Le maximum est " + math(a, b));
    }

    public static int math(int value1, int value2) {
        if (value1 < value2) {
            return value2;
        }
        return value1;
    }
}
