package lesson06;

public class DemoIfElseRaining {
    public static void main(String[] args) {
        boolean isRaining = Math.random() > 0.5;
        if (isRaining) {
            System.out.println("Je mets mon manteau");
        }
        else {
            System.out.println("Je mets mon chapeau");
        }
    }
}
