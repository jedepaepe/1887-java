package lesson05;

import java.util.Scanner;

public class ExMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez préciser un nombre: ");
        long number = scanner.nextLong();
        long i = 0;
        while (i <= 10) {
            System.out.print(i + " * " + number + " = ");
            long guess = scanner.nextLong();
            System.out.println(guess == (i * number));
            i = i + 1;
        }
    }
}
