package lesson03;

import java.util.Scanner;

public class Ex1CirclePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("rayon: ");
        double radius = scanner.nextDouble();
        System.out.println("périmètre: " + (2 * Math.PI * radius));
    }
}
