package org.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void addValues() {
        assertEquals(3, Calculator.addValues(1,2));
        assertEquals(1, Calculator.addValues(-2,3));
    }

    @Test
    void subtractValues() {
        assertEquals(1, Calculator.subtractValues(4,3));
        assertEquals(-5, Calculator.subtractValues(-2,3));
    }

    @Test
    void multipleValues() {
        assertEquals(6, Calculator.multipleValues(2,3));
        assertEquals(-6, Calculator.multipleValues(-2,3));
        assertEquals(0, Calculator.multipleValues(2,0));
    }

    @Test
    void divideValues() {
        assertEquals(3, Calculator.divideValues(6,2));
        assertEquals(0, Calculator.divideValues(-6,0));
    }
}