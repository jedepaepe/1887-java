package lesson06;

import java.util.Scanner;

public class ExIfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quelle est l'aire d'un carré de 5 cm de coté ? ");
        int guess = scanner.nextInt();
        if (guess == 5 * 5) {
            System.out.println("exact");
        }
    }
}
