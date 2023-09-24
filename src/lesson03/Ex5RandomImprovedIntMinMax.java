package lesson03;

import java.util.Scanner;

public class Ex5RandomImprovedIntMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez introduire les valeurs minimum et maximum du nombre aléatoire: ");
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int delta = max - min;
        int result = min + (int) (delta * Math.random());
        System.out.println("nombre aléatoire: " + result);
        result = min + (int) (delta * Math.random());
        System.out.println("nombre aléatoire: " + result);
        result = min + (int) (delta * Math.random());
        System.out.println("nombre aléatoire: " + result);
        result = min + (int) (delta * Math.random());
        System.out.println("nombre aléatoire: " + result);
        result = min + (int) (delta * Math.random());
        System.out.println("nombre aléatoire: " + result);
        result = min + (int) (delta * Math.random());
        System.out.println("nombre aléatoire: " + result);
        result = min + (int) (delta * Math.random());
        System.out.println("nombre aléatoire: " + result);
        result = min + (int) (delta * Math.random());
        System.out.println("nombre aléatoire: " + result);
        result = min + (int) (delta * Math.random());
        System.out.println("nombre aléatoire: " + result);
        result = min + (int) (delta * Math.random());
        System.out.println("nombre aléatoire: " + result);
    }
}
