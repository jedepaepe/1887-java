package lesson06;

import java.util.Scanner;

public class DemoIfRainingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pleut-il? ");
        boolean isRaining = scanner.nextBoolean();
        if (isRaining) {
            System.out.println("Je mets mon manteau");
        }
    }
}
