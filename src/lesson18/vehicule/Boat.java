package lesson18.vehicule;

public class Boat extends Vehicle {
    private double draught;

    public Boat() {
    }

    public Boat(String model, String brand, double draught) {
        super(model, brand);
        this.draught = draught;
    }

    public double getDraught() {
        return draught;
    }

    public void setDraught(double draught) {
        this.draught = draught;
    }
}
