package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(4, 2);
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
}