package lesson06;

import java.util.Scanner;

public class ExIfRainingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pleut-il? (oui/non) ");
        String isRaining = scanner.next();
        if (isRaining.equals("oui")) {
            System.out.println("Je mets mon manteau");
        }
    }
}
