package lesson08;

public class MyMath {
    public static void main(String[] args) {
        System.out.println(minimum(10, 3));
        System.out.println(minimum(-100, 1000));
        System.out.println(maximum(2, 10));
        System.out.println(minimum(-10, 100, 10));
    }

    public static int minimum(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    public static int maximum(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int minimum(int a, int b, int c) {
        int d = minimum(a, b);
        return minimum(d, c);
    }
}
