package lesson18.vehicule;

public class Plane extends Vehicle {
    private double wingSpane;

    public void changeAltitude() {
        System.out.println("change d'altitude");
    }

    @Override
    public void start() {
        System.out.println("start plane");;
    }

    public Plane() {
    }

    public Plane(String model, String brand, double wingSpane) {
        super(model, brand);
        this.wingSpane = wingSpane;
    }

    public double getWingSpane() {
        return wingSpane;
    }

    public void setWingSpane(double wingSpane) {
        this.wingSpane = wingSpane;
    }
}
