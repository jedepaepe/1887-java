package lesson04;

import java.util.Scanner;

public class Ex4MultipleOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez donner trois nombres entier");
        System.out.print("le troisième doit être un multiple des deux autres: ");
        int divider1 = scanner.nextInt();
        int divider2 = scanner.nextInt();
        int multiple = scanner.nextInt();
        boolean isMultipleOf1 = multiple % divider1 == 0;
        boolean isMultipleOf2 = multiple % divider2 == 0;
        System.out.println(multiple + " est-il divisible par " + divider1 + " : " + isMultipleOf1);
        System.out.println(multiple + " est-il divisible par " + divider2 + " : " + isMultipleOf2);
        System.out.println(multiple + " est-il divisible par " + divider1 + " et " + divider2 + " : " +
                (isMultipleOf1 && isMultipleOf2));
    }
}
