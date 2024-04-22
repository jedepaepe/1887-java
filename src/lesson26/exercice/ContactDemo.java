package lesson26.exercice;

public class ContactDemo {
    public static void main(String[] args) {
        try {
            Contact c = new Contact("Jo", "Elvis", "123456789012345678", "@a");
        }
        catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
