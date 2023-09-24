package lesson03;

import java.util.Scanner;

public class Ex4Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        System.out.println(Math.pow(value1, value2));
    }
}
