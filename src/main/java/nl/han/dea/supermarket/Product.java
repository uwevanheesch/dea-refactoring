package nl.han.dea.supermarket;

public class Product {
    private ProductType productType;
    private String name;
    private double price;

    public Product(ProductType productType, String name, double price) {
        this.productType = productType;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
