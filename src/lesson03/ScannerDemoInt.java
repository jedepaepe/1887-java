package lesson03;

import java.util.Scanner;

public class ScannerDemoInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("vous avez tapé: " + a);
    }
}
