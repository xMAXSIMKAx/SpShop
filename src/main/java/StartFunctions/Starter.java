package StartFunctions;

import builders.ConcreteProductBuilder;
import builders.ProductBuilder;
import director.Director;
import products.Product;

public class Starter {
    public void Starter() {
        ProductBuilder builder = new ConcreteProductBuilder();

        Director director = new Director(builder);

        Product product1 = director.constructProduct("Футболка","Red","Nike",120);
        Product product2 = director.constructProduct("Кепка","White","Nike",70);
        Product product3 = director.constructProduct("Футболка","Blue","Adidas",115);
        Product product4 = director.constructProduct("Кепка","Black","Adidas",65);

        System.out.println("Order 1: ");
        System.out.println("Name: "+product1.getName());
        System.out.println("Color: "+product1.getColor());
        System.out.println("Brand: "+product1.getManufacturer());
        System.out.println("Price: "+product1.getPrice());
        System.out.println("\nName: "+product2.getName());
        System.out.println("Color: "+product2.getColor());
        System.out.println("Brand: "+product2.getManufacturer());
        System.out.println("Price: "+product2.getPrice());

        System.out.println("\nOrder 2: ");
        System.out.println("Name: "+product3.getName());
        System.out.println("Color: "+product3.getColor());
        System.out.println("Brand: "+product3.getManufacturer());
        System.out.println("Price: "+product3.getPrice());
        System.out.println("\nName: "+product4.getName());
        System.out.println("Color: "+product4.getColor());
        System.out.println("Brand: "+product4.getManufacturer());
        System.out.println("Price: "+product4.getPrice());

        System.out.println("\nThanks for buying");

    }

}
