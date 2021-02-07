package nl.han.dea.supermarket;

public class Supermarket {
    public static final Product APPLE_TANGO = new Product(ProductType.APPLE, "Sweet Tango", 0.35);
    public static final Product APPLE_MCINTOSH = new Product(ProductType.APPLE, "MC Intosh", 0.15);
    public static final Product APPLE_HONEYCRISP = new Product(ProductType.APPLE, "Honey Crisp", 0.23);

    public static final Product POTATOE_LAURA = new Product(ProductType.POTATOE, "Laura", 0.35);
    public static final Product POTATOE_NICOLA = new Product(ProductType.POTATOE, "Nicola", 0.11);
    public static final Product POTATOE_TAJFUN = new Product(ProductType.POTATOE, "Tajfun", 0.23);

    public static final Product TOMATOE_BIGBEEF = new Product(ProductType.TOMATOE, "Big Beef", 0.23);
    public static final Product TOMATOE_CHERRY = new Product(ProductType.TOMATOE, "Cherry", 0.14);
    public static final Product TOMATOE_RISP = new Product(ProductType.TOMATOE, "Risp", 0.23);

    ShoppingBasket shoppingBasket = new ShoppingBasket();

    public void addToBasket(Product product, int amount) {
        shoppingBasket.add(product, amount);
    }

    public double pay() {
        return shoppingBasket.calculateTotalPrice();
    }

}
