package lesson05;

public class ExShowMultplicationTable {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 10) {
            int i = 0;
            while (i <= 10) {
                System.out.print(i * number + "   ");
                i = i + 1;
            }
            number = number + 1;
            System.out.println();
        }
    }
}
