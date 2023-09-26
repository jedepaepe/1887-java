package lesson04;

import java.util.Scanner;

public class DemoBooleanComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("introduisez deux entiers: ");
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();

            boolean v1GreaterThanV2 = v1 > v2;
            System.out.println(v1 + " > " + v2 + " : " + v1GreaterThanV2);

            boolean v1SmallerThanV2 = v1 < v2;
            System.out.println(v1 + " < " + v2 + " : " + v1SmallerThanV2);

            boolean v1EqualsToV2 = v1 == v2;
            System.out.println(v1 + " == " + v2 + " : " + v1EqualsToV2);

            boolean v1GreaterOrEqualsToV2 = v1 >= v2;
            System.out.println(v1 + " >= " + v2 + " : " + v1GreaterOrEqualsToV2);

            boolean v1SmallerOrEqualsToV2 = v1 <= v2;
            System.out.println(v1 + " <= " + v2 + " : " + v1SmallerOrEqualsToV2);
        }
    }
}
