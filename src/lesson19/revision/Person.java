package lesson19.revision;

public class Person {
    protected String firstName;
    protected String lastName;

    /**
     * constructeur sans paramètre
     */
    public Person() {
    }

    /**
     * constructeur avec paramètre
     * @param firstName : le prénom
     * @param lastName : le nom de famille
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                getName() +
                '}';
    }
}
