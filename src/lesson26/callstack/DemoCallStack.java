package lesson26.callstack;

public class DemoCallStack {
    private static void method3() {
        System.out.println("méthode 3 exécutée");
    }
    private static void method2() {
        method3();
    }
    private static void method1() {
        method2();
    }
    public static void main(String[] args) {
        method1();
    }
}
