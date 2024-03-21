package builders;

import products.Product;

public class ConcreteProductBuilder implements ProductBuilder {
    private String name;
    private String manufacturer;
    private String color;
    private double price;

    @Override
    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ProductBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public ProductBuilder setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    @Override
    public ProductBuilder setColor(String color) {
        this.color= color;
        return this;
    }

    @Override
    public Product build() {
        return new Product(name,color,manufacturer,price);
    }
}
