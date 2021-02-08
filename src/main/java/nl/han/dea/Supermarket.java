package nl.han.dea;

import java.util.HashMap;
import java.util.Map;

public class Supermarket {

    Map<String, Integer> basket = new HashMap<>();

    public void addToBasket(String product, int type, int amount) {
        basket.put(product.concat(":").concat(String.valueOf(type)), amount);
    }

    public double pay() {
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = 0;
        for (String item : basket.keySet()) {
            var product = item.split(":")[0];
            var type = Integer.parseInt(item.split(":")[1]);
            var amount = basket.get(item);
            if (product.equals("tomato")) {
                price += priceCalculator.calculatePriceForTomatoes(type, amount);
            } else if (product.equals("potato")) {
                price += priceCalculator.calculatePriceForPotatoes(type, amount);
            } else if (product.equals("apple")) {
                price += priceCalculator.calculatePriceForApples(type, amount);
            }
        }
        return price;
    }

}
