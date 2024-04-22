package lesson26.exercice;

public class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public Contact(String firstName, String lastName, String phone, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setEmail(email);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 2) {
            throw new RuntimeException("Le prénom doit avoir minimum 2 caractères");
        }
        if (firstName.length() > 15) {
            throw new RuntimeException("Le prénom doit avoir maximum 15 caractères");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 2) {
            throw new RuntimeException("Le nom de famille doit avoir minimum 2 caractères");
        }
        if (lastName.length() > 20) {
            throw new RuntimeException("Le nom de famille doit avoir maximum 20 caractères");
        }
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.length() < 10) {
            throw new RuntimeException("Le numéro de téléphone doit avoir minimum 10 chiffres");
        }
        if (phone.length() > 20) {
            throw  new RuntimeException("Le numéro de téléphone doit avoir maximum 20 chiffres");
        }
        for(char c : phone.toCharArray()) {
            if (c < '0' || c > '9') {
                throw  new RuntimeException("Le numéro de téléphone ne peut contenir que des chiffres");
            }
        }
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (! email.contains("@")) {
            throw  new RuntimeException("email doit contenir @");
        }
        String[] split = email.split("@");
        if (split.length > 2) {
            throw  new RuntimeException("email doit contenir 1 seul @");
        }
        if (split[0].length() < 1) {
            throw new RuntimeException("la première partie de l'email doit contenir au moins 1 caractère");
        }
        if (split.length < 2) {
            throw  new RuntimeException("la seconde partie de l'email doit contenir au moins 1 caractère");
        }
        this.email = email;
    }
}
