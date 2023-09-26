package lesson04;

import java.util.Scanner;

public class Ex2IsCorrect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduisez trois entiers a1 a2 et a3=a1+2: ");
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a1Plusa2 = a1 + a2;
        boolean isCorrect = a3 == a1Plusa2;
        System.out.println(a1 + " + " + a2 + " = " + a3 + " : " + isCorrect);
    }
}
