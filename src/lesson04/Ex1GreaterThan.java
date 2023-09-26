package lesson04;

import java.util.Scanner;

public class Ex1GreaterThan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduisez deux nombres: ");
        double v1 = scanner.nextDouble();
        double v2 = scanner.nextDouble();
        System.out.println(v1 + " > " + v2 + " : " + (v1 > v2));
    }
}
