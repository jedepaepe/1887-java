package lesson26.exceptiondemo3;

public class Test {
    public static void main(String[] args) {
        try {
            int value = 30;
            if (value < 40) {
                throw new Exception("la valeur est trop petite");
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Continue après le catch");
    }
}
