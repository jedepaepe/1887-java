package lesson14;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
        char a = "hello".charAt(1);
        System.out.println(a);

        int len = "hello".length();
        System.out.println(len);

        // char b = "hello".charAt(10); // exception out of bound

        String s = null;
        // s.length(); // null pointer exception

        boolean doesContain = "hello".contains("lo");
        System.out.println("hello contient-elle lo? " + doesContain);

        String u = String.valueOf(10);
        System.out.println(u instanceof String);
    }
}
