package nl.han.dea;

import nl.han.dea.supermarket.Supermarket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SupermarketTest {

    private Supermarket sut;

    @BeforeEach
    void setUp() {
        sut = new Supermarket();
    }

    @Test
    void productIsAddedToBasket() {
        sut.addToBasket(Supermarket.APPLE_HONEYCRISP, 2);
        sut.addToBasket(Supermarket.POTATOE_LAURA, 1);
    }

    @Test
    void payCalculatesPriceCorrectly() {
        //arrange (test fixture)
        sut.addToBasket(Supermarket.APPLE_HONEYCRISP, 2);
        sut.addToBasket(Supermarket.POTATOE_LAURA, 1);
        sut.addToBasket(Supermarket.TOMATOE_BIGBEEF, 10);
        // act
        var actualAmount = sut.pay();
        // assert
        assertEquals(3.11, actualAmount, 0.009);
    }

    @Test
    void payCalculatesPricesForDuplicateProducts() {
        sut.addToBasket(Supermarket.APPLE_HONEYCRISP, 1);
        sut.addToBasket(Supermarket.APPLE_HONEYCRISP, 1);
        assertEquals(0.46, sut.pay());
    }
}