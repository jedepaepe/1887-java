package lesson13;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "coucou1";
        String s2 = "coucou2";
        int compare = s1.compareTo(s2);
        System.out.println(compare);

        System.out.println(s1.toUpperCase() + " " + s2.toUpperCase());
    }
}
