package lesson08;

public class DemoMath {

    public static void main(String[] args) {
        System.out.println(min(10, 3));
        System.out.println(max(10, 3));
        System.out.println(min(1, 5, 0));
    }
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int min(int a, int b, int c) {
        int d = min(a, b);
        return min(d, c);
    }
}
