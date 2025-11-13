package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void addValues() {
        assertEquals(3,Main.addValues(1,2));
        assertEquals(1,Main.addValues(-2,3));
    }

    @Test
    void subtractValues() {
        assertEquals(1,Main.subtractValues(4,3));
        assertEquals(-5,Main.subtractValues(-2,3));
    }

    @Test
    void multipleValues() {
        assertEquals(6,Main.multipleValues(2,3));
        assertEquals(-6,Main.multipleValues(-2,3));
        assertEquals(0,Main.multipleValues(2,0));
    }

    @Test
    void divideValues() {
        assertEquals(3,Main.divideValues(6,2));
        assertEquals(0,Main.divideValues(-6,0));
    }
}