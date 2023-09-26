package lesson03;

import java.util.Scanner;

public class Ex6CylinderVolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hauteur: ");
        double height = scanner.nextDouble();
        System.out.print("rayon: ");
        double radius = scanner.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = height * area;
        System.out.println("aire: " + area);
        System.out.println("volume: " + volume);
    }
}
