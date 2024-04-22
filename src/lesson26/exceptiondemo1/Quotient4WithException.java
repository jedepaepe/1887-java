package lesson26.exceptiondemo1;

import java.util.Scanner;

public class Quotient4WithException {
    private static int quotient(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Le dénominateur ne peut pas être 0");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer deux entiers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        try {
            int q = quotient(n1, n2);
            System.out.println(n1 + " / " + n2 + " = " + q);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
