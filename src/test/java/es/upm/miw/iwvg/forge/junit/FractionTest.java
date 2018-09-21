package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {
    private Fraction fraction;
    private Fraction fractionImpropia;
    private Fraction fractionPropia;
    private Fraction fractionEquivalente;
    private Fraction fractionNoEquivalente;

    @BeforeEach
    void before() {
        fraction = new Fraction(4, 2);
        fractionImpropia = new Fraction(10, 5);
        fractionPropia = new Fraction(2, 5);
        fractionEquivalente = new Fraction(6,3);
        fractionNoEquivalente = new Fraction(7,2);
    }

    @Test
    void testNumeradorPorDefecto(){
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
    }

    @Test
    void testDenominadorPorDefecto(){
        fraction = new Fraction();
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testDecimal(){
        assertEquals(2, this.fraction.decimal());
    }

    @Test
    void testNumerador(){
        assertEquals(4, this.fraction.getNumerator());
    }

    @Test
    void testDenominador(){
        assertEquals(2, this.fraction.getDenominator());
    }

    @Test
    void testDenominadorCero(){
        assertThrows(IllegalArgumentException.class, () -> new Fraction(2, 0).decimal());
    }

    @Test
    void testIsImpropia() {
        assertTrue(this.fractionImpropia.isImpropia());
    }

    @Test
    void testIsPropia() {
        assertNotNull(fraction);
        assertNotNull(fractionImpropia);
        assertNotNull(fractionPropia);
        assertTrue(fractionPropia.isPropia());
        assertFalse(fractionImpropia.isPropia());
        assertFalse(fraction.isPropia());
    }

    @Test
    void testIsEquivalente() {
        assertTrue(fraction.isEquivalente(fractionEquivalente));
        assertFalse(fraction.isEquivalente(fractionNoEquivalente));
    }
}
