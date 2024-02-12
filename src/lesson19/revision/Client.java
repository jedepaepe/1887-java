package lesson19.revision;

public class Client extends Contact {
    private double salesAmount;

    public Client() {
    }

    public Client(String firstName, String lastName, String email, String phone, double salesAmount) {
        super(firstName, lastName, email, phone);
        this.salesAmount = salesAmount;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        return "Client{" +
                "salesAmount=" + salesAmount +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
