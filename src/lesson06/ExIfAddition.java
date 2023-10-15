package lesson06;

import java.util.Scanner;

public class ExIfAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("4 + 9 = ");
        int result = scanner.nextInt();
        if (result == 13) {
            System.out.println("exact");
        }
    }
}
