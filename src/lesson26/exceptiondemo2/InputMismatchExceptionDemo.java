package lesson26.exceptiondemo2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Entrez un entier: ");
                int number = scanner.nextInt();
                System.out.println("L'entier introduit " + number);
                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Essaiez encore (votre saisie est incorrecte, il faut introduire un entier)");
                scanner.nextLine();
            }
        } while (continueInput);
    }
}
