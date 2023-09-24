package lesson03;

import java.util.Scanner;

public class Ex5RandomImproved {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez introduire la valeur maximum du nombre aléatoire: ");
        int max = scanner.nextInt();
        System.out.println("nombre aléatoire: " + max * Math.random());
    }
}
