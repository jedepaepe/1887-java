package lesson06;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(2, 11);
        System.out.println("Donner la table de multiplication de " + number);
        boolean isCorrect = false;
        while (! isCorrect) {
            isCorrect = true;
            int i = 1;
            while (i <= 10) {
                int multiple = scanner.nextInt();
                if (i * number != multiple) {
                    System.out.println("erreur, " + i + " * " + number + " n'est pas égal à " + multiple);
                    isCorrect = false;
                }
                i = i + 1;
            }
            if (! isCorrect) {
                System.out.print("Veuillez corriger: ");
            }
        }
        if (isCorrect) {
            System.out.println("bravo");
        }
    }
}
