package lesson03;

import java.util.Scanner;

public class Ex5RandomImprovedIntMinMaxMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez introduire les valeurs minimum et maximum du nombre aléatoire: ");
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        System.out.println("nombre aléatoire: " + random(min, max));
        System.out.println("nombre aléatoire: " + random(min, max));
        System.out.println("nombre aléatoire: " + random(min, max));
        System.out.println("nombre aléatoire: " + random(min, max));
        System.out.println("nombre aléatoire: " + random(min, max));
        System.out.println("nombre aléatoire: " + random(min, max));
        System.out.println("nombre aléatoire: " + random(min, max));
        System.out.println("nombre aléatoire: " + random(min, max));
        System.out.println("nombre aléatoire: " + random(min, max));
        System.out.println("nombre aléatoire: " + random(min, max));
        System.out.println("nombre aléatoire: " + random(min, max));
        System.out.println("nombre aléatoire: " + random(min, max));
    }

    public static int random(int min, int max) {
        int delta = max - min;
        return min + (int) (delta * Math.random());
    }
}
