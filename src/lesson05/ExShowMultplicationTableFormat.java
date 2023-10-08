package lesson05;

public class ExShowMultplicationTableFormat {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 10) {
            int i = 0;
            while (i <= 10) {
                System.out.printf("%3d   ", i * number);
                i = i + 1;
            }
            number = number + 1;
            System.out.println();
        }
    }
}
