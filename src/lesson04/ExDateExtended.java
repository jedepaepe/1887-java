package lesson04;

import java.time.LocalDate;
import java.util.Scanner;

public class ExDateExtended {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quel est l'année, le mois et le jour ? ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate now = LocalDate.now();
        boolean isYearCorrect = now.getYear() == year;
        boolean isMonthCorrect = now.getMonthValue() == month;
        boolean isDayCorrect = now.getDayOfMonth() == day;
        System.out.println("l'année est " + now.getYear() + ", votre réponse est " + isYearCorrect);
        System.out.println("le mois est " + now.getMonthValue() + ", votre réponse est " + isMonthCorrect);
        System.out.println("le jour est " + now.getDayOfMonth() + ", votre réponse est " + isDayCorrect);
        System.out.println("la date est " + now.getYear() + "-" + now.getMonthValue() + "-" + now.getDayOfMonth() +
                ", votre réponse est " + (isYearCorrect && isMonthCorrect && isDayCorrect));
    }
}
