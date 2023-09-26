package lesson04;

import java.util.Scanner;

public class RevisionFeetConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("pieds: ");
        double feet = scanner.nextDouble();
        System.out.println("mètres: " + (feet * 0.305));
    }
}
