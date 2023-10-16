package lesson06;

public class RandomGenerationCasting {
    public static void main(String[] args) {
        int count = 0;
        while (count < 100) {
            int number = (int) (Math.random() * 100);
            System.out.println(number);
            count++;
        }
    }
}
