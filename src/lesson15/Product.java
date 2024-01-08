package lesson15;

public class Product {
    private String number;
    private String label;
    private double price;
    private double stock;

    public Product(String number, String label, double price, double stock) {
        this.number = number;
        this.label = label;
        this.price = price;
        this.stock = stock;
    }

    public Product() {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }
}
