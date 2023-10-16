package lesson06;

import java.util.Scanner;

public class ExAdditionAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = (int) (Math.random() * 100);
        int value2 = (int) (Math.random() * 100);
        System.out.print(value1 + " + " + value2 + " = ");
        int counter = 1;
        int result = -1;
        while(result != value1 + value2 && counter <= 3) {
            result = scanner.nextInt();
            if (result != value1 + value2 && counter <= 2) {
                System.out.print("erreur, veuillez corriger : ");
            }
            counter++;
        }
        if (result == value1 + value2) {
            System.out.printf("bravo");
        }
        else {
            System.out.printf("perdu, la réponse est " + (value1 + value2));
        }

    }
}
