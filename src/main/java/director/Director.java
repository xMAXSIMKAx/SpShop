package director;

import builders.ProductBuilder;
import products.Product;

public class Director {
    private ProductBuilder productBuilder;

    public Director(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }

    public Product constructProduct(String name, String color, String manufacturer, double price) {
        return productBuilder.setName(name)
                .setColor(color)
                .setManufacturer(manufacturer)
                .setPrice(price)
                .build();
    }
}
