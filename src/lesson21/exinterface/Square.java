package lesson21.exinterface;

public class Square implements IShape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("C'est un carré de " + side + "cm de côté");
    }
}
