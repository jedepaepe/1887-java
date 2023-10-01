package lesson04;

import java.util.Scanner;

public class ExWhile2Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenu à la recherche du nombre aléatoire");
        int target = (int) (10 * Math.random());
        while (true) {
            System.out.print("proposez un entier entre 0 et 10 non compris");
            int guess = scanner.nextInt();
            System.out.println("correct ? " + (target == guess));
        }
    }
}
