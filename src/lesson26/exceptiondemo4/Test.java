package lesson26.exceptiondemo4;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 2; ++i) {
            System.out.print(i + " ");
            try {
                System.out.println(1 / 0);
            }
            catch (Exception ex) {}
        }
    }
}
