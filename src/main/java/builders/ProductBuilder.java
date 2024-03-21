package builders;

import products.Product;

public interface ProductBuilder {
    ProductBuilder setName(String name);
    ProductBuilder setPrice(double price);
    ProductBuilder setManufacturer(String manufacturer);
    ProductBuilder setColor(String color);
    Product build();
}
