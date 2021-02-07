package nl.han.dea;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorTest {

    private PriceCalculator sut;

    @BeforeEach
    void setUp() {
        sut = new PriceCalculator();
    }

    @Test
    void unkownTomatoePriceIsCalculatedCorrectly() {
        assertEquals(-1, sut.calculatePriceForTomatoes(42, 4));
    }

    @Test
    void beefTomatoePriceIsCalculatedCorrectly() {
        assertEquals(0.92, sut.calculatePriceForTomatoes(1, 4));
        assertEquals(0.46, sut.calculatePriceForTomatoes(1, 2));
    }

    @Test
    void cherryTomatoePriceIsCalculatedCorrectly() {
        assertEquals(0.56, sut.calculatePriceForTomatoes(2, 4));
        assertEquals(0.28, sut.calculatePriceForTomatoes(2, 2));
    }

    @Test
    void rispTomatoePriceIsCalculatedCorrectly() {
        assertEquals(0.92, sut.calculatePriceForTomatoes(4, 4));
        assertEquals(0.46, sut.calculatePriceForTomatoes(4, 2));
    }

    @Test
    void unkownApplePriceIsCalculatedCorrectly() {
        assertEquals(-1, sut.calculatePriceForApples(42, 4));
    }

    @Test
    void sweetTangoApplePriceIsCalculatedCorrectly() {
        assertEquals(1.4, sut.calculatePriceForApples(1, 4));
        assertEquals(0.7, sut.calculatePriceForApples(1, 2));
    }

    @Test
    void macintoshApplePriceIsCalculatedCorrectly() {
        assertEquals(0.6, sut.calculatePriceForApples(2, 4));
        assertEquals(0.3, sut.calculatePriceForApples(2, 2));
    }

    @Test
    void honeyCrispApplePriceIsCalculatedCorrectly() {
        assertEquals(0.92, sut.calculatePriceForApples(3, 4));
        assertEquals(0.46, sut.calculatePriceForApples(3, 2));
    }

    @Test
    void unkownPotatoePriceIsCalculatedCorrectly() {
        assertEquals(-1, sut.calculatePriceForPotatoes(42, 4));
    }

    @Test
    void lauraPotatoePriceIsCalculatedCorrectly() {
        assertEquals(1.4, sut.calculatePriceForPotatoes(1, 4));
        assertEquals(0.7, sut.calculatePriceForPotatoes(1, 2));
    }

    @Test
    void nicolaPotatoePriceIsCalculatedCorrectly() {
        assertEquals(0.44, sut.calculatePriceForPotatoes(2, 4));
        assertEquals(0.22, sut.calculatePriceForPotatoes(2, 2));
    }

    @Test
    void tajfunPotatoePriceIsCalculatedCorrectly() {
        assertEquals(0.92, sut.calculatePriceForPotatoes(3, 4));
        assertEquals(0.46, sut.calculatePriceForPotatoes(3, 2));
    }


}