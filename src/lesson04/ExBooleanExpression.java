package lesson04;

import java.util.Scanner;

public class ExBooleanExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("false || true = ? : ");
        boolean result1 = scanner.nextBoolean();
        System.out.println("you are " + (false || true == result1) + "\n");

        System.out.print("! false && false = ? : ");
        boolean result2 = scanner.nextBoolean();
        System.out.println("you are " + (! false && false == result2) + "\n");

        System.out.print("! (false && false) = ? : ");
        boolean result3 = scanner.nextBoolean();
        System.out.println("you are " + (! (false && false) == result3) + "\n");

        System.out.print("! false && ! false = ? : ");
        boolean result4 = scanner.nextBoolean();
        System.out.println("you are : " + (! false && ! false == result4) + "\n");
    }
}
