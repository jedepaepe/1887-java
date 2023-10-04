package lesson04;

import java.time.LocalDate;

public class DemoLocalDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        System.out.println(year + "-" + month + "-" + day);
    }
}
