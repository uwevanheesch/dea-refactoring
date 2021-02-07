package nl.han.dea.supermarket;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<Product, Integer> products = new HashMap<>();

    public void add(Product product, int quantity) {
        if (products.containsKey(product)) {
            products.put(product, products.get(product) + quantity);
        } else {
            products.put(product, quantity);
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : products.keySet()) {
            totalPrice += product.getPrice() * products.get(product);
        }
        return totalPrice;
    }
}
