package products;

public class Product {
    String name;
    String color;
    String manufacturer;
    double price;

    public Product(String name, String color, String manufacturer, double price) {
        this.name = name;
        this.color = color;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }
}
