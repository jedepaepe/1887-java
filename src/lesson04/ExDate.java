package lesson04;

import java.time.LocalDate;
import java.util.Scanner;

public class ExDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quel est l'année, le mois et le jour ? ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate now = LocalDate.now();
        System.out.println("l'année est " + now.getYear() + ", votre réponse est " + (now.getYear() == year));
        System.out.println("le mois est " + now.getMonth() + ", votre réponse est " + (now.getMonthValue() == month));
        System.out.println("le jour est " + now.getDayOfMonth() + ", votre réponse est " + (now.getDayOfMonth() == day));
    }
}
