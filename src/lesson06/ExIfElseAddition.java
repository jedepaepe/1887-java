package lesson06;

import java.util.Scanner;

public class ExIfElseAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("4 + 9 = ");
        int result = scanner.nextInt();
        if (result == 13) {
            System.out.println("exact");
        } else {
            System.out.println("faux, la somme de 4 + 9 = 13");
        }
    }
}
