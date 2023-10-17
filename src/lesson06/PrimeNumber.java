package lesson06;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez introduire un nombre entier: ");
        int number = scanner.nextInt();
        int guess = 2;
        boolean hasDivider = false;
        while (guess < number / 2 && ! hasDivider) {
            if (number % guess == 0) {
                System.out.println(number + " n'est pas un nombre premier,\nil est divisible par " + guess);
                hasDivider = true;
            }
            guess = guess + 1;
        }
        if (! hasDivider) {
            System.out.println(number + " est un nombre premier");
        }
    }
}
