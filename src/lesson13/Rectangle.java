package lesson13;

public class Rectangle {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

    public double getArea() {
        return height * width;
    }
}
