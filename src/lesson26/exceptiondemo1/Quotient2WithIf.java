package lesson26.exceptiondemo1;

import java.util.Scanner;

public class Quotient2WithIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez deux entiers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n2 != 0) {
            int q = n1 / n2;
            System.out.println(n1 + " / " + n2 + " = " + q);
        } else {
            System.out.println("La division par zéro est impossible");
        }
    }
}
