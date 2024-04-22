package lesson26.exercice;

public class ContactDemo {
    public static void main(String[] args) {
        try {
            Contact c = new Contact("1");
        }
        catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
