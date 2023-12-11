package lesson13;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        for (int i = 0; i < s1.length(); ++i) {
            System.out.println(s1.charAt(i));
        }

        boolean contain = s1.contains("a");
        System.out.println(contain);
    }
}
