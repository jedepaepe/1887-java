package lesson04;

import java.util.Scanner;

public class Ex3FindARandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduire un entier entre 0 et 4");
        int guess = scanner.nextInt();
        int random = (int) (5 * Math.random());
        System.out.println("gagné : " + (guess == random));
    }
}
