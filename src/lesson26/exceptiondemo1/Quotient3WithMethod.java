package lesson26.exceptiondemo1;

import java.util.Scanner;

public class Quotient3WithMethod {
    private static int quotient(int numerator, int denominator) {
        if (denominator == 0) System.exit(1);
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez deux entiers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int q = quotient(n1, n2);
        System.out.println(n1 + " / " + n2 + " = " + q);
    }
}
