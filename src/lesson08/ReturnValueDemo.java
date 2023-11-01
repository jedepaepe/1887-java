package lesson08;

import java.util.Scanner;

public class ReturnValueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez donner le rayon du cercle: ");
        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Périmètre = " + perimeter);
        System.out.println("Aire = " + area);
    }
}
