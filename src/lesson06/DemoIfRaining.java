package lesson06;

public class DemoIfRaining {
    public static void main(String[] args) {
        boolean isRaining = Math.random() > 0.1;
        if (isRaining) {
            System.out.println("Je mets mon manteau");
        }
    }
}
