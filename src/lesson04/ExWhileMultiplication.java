package lesson04;

import java.util.Scanner;

public class ExWhileMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean success = false;
        while (! success) {
            System.out.print("Combien font 8 * 7 ? ");
            int guess = scanner.nextInt();
            success = guess == (8 * 7);
        }
        System.out.println("exact");
    }
}
