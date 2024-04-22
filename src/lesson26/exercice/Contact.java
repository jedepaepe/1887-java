package lesson26.exercice;

public class Contact {
    private String firstName;

    public Contact(String firstName) {
        setFirstName(firstName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 2) {
            throw new RuntimeException("Le prénom doit avoir minimum 2 caractères");
        }
        this.firstName = firstName;
    }
}
