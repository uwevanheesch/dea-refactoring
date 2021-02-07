package nl.han.dea;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    private Supermarket sut;

    @BeforeEach
    void setUp() {
        sut = new Supermarket();
    }

    @Test
    void productIsAddedToBasket() {
        sut.addToBasket("apple", 1, 2);
        sut.addToBasket("potatoe", 1, 1);
        assertEquals(2, sut.basket.get("apple:1"));
        assertEquals(1, sut.basket.get("potatoe:1"));
        assertEquals(2, sut.basket.size());
    }

    @Test
    void payCalculatesPriceCorrectly() {
        //arrange (test fixture)
        sut.addToBasket("apple", 1, 2);
        sut.addToBasket("potatoe", 2, 1);
        sut.addToBasket("tomatoe", 1, 10);
        // act
        var actualAmount = sut.pay();
        // assert
        assertEquals(3.11, actualAmount, 0.009);
    }
}