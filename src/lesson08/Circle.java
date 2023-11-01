package lesson08;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez donner le rayon du cercle: ");
        double radius = scanner.nextDouble();
        System.out.println("Périmètre = " + computePerimeter(radius));
        System.out.println("Aire = " + computeArea(radius));
    }

    public static double computePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double computeArea(double radius) {
        return Math.PI * radius * radius;
    }
}
