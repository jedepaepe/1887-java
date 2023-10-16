package lesson06;

import java.util.Random;

public class RandomGenerationObject {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(20, 100);
    }
}
