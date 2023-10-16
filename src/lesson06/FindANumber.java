package lesson06;

import java.util.Random;
import java.util.Scanner;

public class FindANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = new Random().nextInt(100);
        int guess = -1;
        while (guess != target) {
            System.out.print("Votre proposition: ");
            guess = scanner.nextInt();
            if (target < guess) {
                System.out.println("le nombre recherché est plus petit");
            }
            if (target > guess) {
                System.out.println("le nombre recherché est plus grand");
            }
        }
        System.out.println("bravo, vous avez trouvé");
    }
}
