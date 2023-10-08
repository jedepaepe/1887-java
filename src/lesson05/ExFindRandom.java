package lesson05;

import java.util.Scanner;

public class ExFindRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = (int) (100 * Math.random());
        System.out.print("Cherchez un nombre entre 0 et 100 (non compris): ");
        int guess = scanner.nextInt();
        while (guess != target) {
            System.out.println("Le nombre recherché est-il plus grand que " + guess + " ? " + (target > guess));
            System.out.print("Proposez un autre nombre: ");
            guess = scanner.nextInt();
        }
        System.out.println("bravo, vous avez trouvé");
    }
}
