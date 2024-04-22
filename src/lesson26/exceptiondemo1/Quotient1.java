package lesson26.exceptiondemo1;

import java.util.Scanner;

public class Quotient1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez deux entiers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int q = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + q);
    }
}
