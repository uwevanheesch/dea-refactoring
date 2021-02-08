package nl.han.dea;

public class PriceCalculator {

    public double calculatePriceForTomatoes(int type, int quantity) {
        if (type == 1) { // Big Beef Tomato 0,23 Euro/piece
            return quantity * 0.23;
        }
        if (type == 2) { // Cherry tomatoes 0,12 Euro/piece
            return quantity * 0.14;
        }
        if (type == 4) {
            return quantity * 0.23;
        }
        return -1;
    }

    public double calculatePriceForApples(int type, int quantity) {
        if (type == 1) { // Sweet Tango
            return quantity * 0.35;
        }
        if (type == 2) { // McIntosh
            return quantity * 0.15;
        }
        if (type == 3) { //  HoneyCrisp
            return quantity * 0.23;
        }
        return -1;
    }

    public double calculatePriceForPotatoes(int type, int quantity) {
        if (type == 1) { // Laura 0,08 Euro
            return quantity * 0.35;
        }
        if (type == 2) { // Nicola
            return quantity * 0.11;
        }
        if (type == 3) { //  Tajfun 0,17 Euro
            return quantity * 0.23;
        }
        return -1;
    }


}
