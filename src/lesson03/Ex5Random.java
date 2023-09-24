package lesson03;

import java.util.Scanner;

public class Ex5Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        System.out.println(max * Math.random());
    }
}
