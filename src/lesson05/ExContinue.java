package lesson05;

import java.util.Scanner;

public class ExContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean next = true;
        while (next) {
            System.out.println("Voulez-vous continuer? ");
            next = scanner.nextBoolean();
        }
        System.out.println("fin");
    }
}
