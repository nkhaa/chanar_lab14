package lab14.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MultiplicationTest {
    @Test
    void testLargeInputThrowsException() {
        Multiplication m = new Multiplication();
        assertThrows(IllegalArgumentException.class, () -> m.multiply(20000, 2));
    }

    @Test
    void testMultiplyPositiveNumbers() {
        Multiplication calc = new Multiplication();
        assertEquals(6.0, calc.multiply((int) 2.0, (int) 3.0), 0.000001,
                "2 * 3 нь 6-тай тэнцүү байх ёстой");
    }

    @Test
    void testMultiplyWithNegativeNumber() {
        Multiplication calc = new Multiplication();
        assertEquals(-6.0, calc.multiply((int) -2.0, (int) 3.0), 0.000001,
                "-2 * 3 нь -6-тай тэнцүү байх ёстой");
    }
}
