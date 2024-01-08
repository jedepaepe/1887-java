package lesson15;

import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("prénom: ");
        String v1 = scanner.nextLine();
        System.out.print("nom de famille: ");
        String v2 = scanner.nextLine();
        Person p1 = new Person(v1, v2);
        System.out.println(p1.getFullName());
    }
}
