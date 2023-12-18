package lesson13;

import java.nio.charset.Charset;

public class ExploreString {

    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1.length());

        String s2 = new String("Hello");
        System.out.println(s2.length());

        String s3 = "";
        System.out.println(s3.length());

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        System.out.println("\u03c0");

        String s4 = null;
        System.out.println(s4);

        System.out.println(Charset.defaultCharset());

    }
}
