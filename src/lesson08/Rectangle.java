package lesson08;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez donner la longeur et la largeur du rectangle : ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        System.out.println("Périmètre = " + computePerimeter(length, width));
        System.out.println("Aire = " + computeArea(length, width));
    }

    public static double computePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double computeArea(double length, double width) {
        return length * width;
    }
}
