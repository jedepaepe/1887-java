package lesson19.revision;

public class Employee extends Contact {
    private double salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String email, String phone, double salary) {
        super(firstName, lastName, email, phone);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
