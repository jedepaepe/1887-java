package lesson03;

import java.util.Scanner;

public class DemoArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Le rayon: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("l'aire est: " + area);
    }
}
