package nl.han.dea.supermarket;

public class Supermarket {
    public static final Product APPLE_TANGO = new Product(ProductType.APPLE, "Sweet Tango", 0.35);
    public static final Product APPLE_MCINTOSH = new Product(ProductType.APPLE, "MC Intosh", 0.15);
    public static final Product APPLE_HONEYCRISP = new Product(ProductType.APPLE, "Honey Crisp", 0.23);

    public static final Product POTATO_LAURA = new Product(ProductType.POTATO, "Laura", 0.35);
    public static final Product POTATO_NICOLA = new Product(ProductType.POTATO, "Nicola", 0.11);
    public static final Product POTATO_TAJFUN = new Product(ProductType.POTATO, "Tajfun", 0.23);

    public static final Product TOMATO_BIGBEEF = new Product(ProductType.TOMATO, "Big Beef", 0.23);
    public static final Product TOMATO_CHERRY = new Product(ProductType.TOMATO, "Cherry", 0.14);
    public static final Product TOMATO_RISP = new Product(ProductType.TOMATO, "Risp", 0.23);

    ShoppingBasket shoppingBasket = new ShoppingBasket();

    public void addToBasket(Product product, int amount) {
        shoppingBasket.add(product, amount);
    }

    public double pay() {
        return shoppingBasket.calculateTotalPrice();
    }

}
