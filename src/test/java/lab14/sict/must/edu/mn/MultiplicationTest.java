package lab14.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MultiplicationTest {

    @Test
    void testMultiplyPositiveNumbers() {
        Multiplication calc = new Multiplication();
        assertEquals(6.0, calc.multiply(2.0, 3.0), 0.000001,
                "2 * 3 нь 6-тай тэнцүү байх ёстой");
    }

    @Test
    void testMultiplyWithNegativeNumber() {
        Multiplication calc = new Multiplication();
        assertEquals(-6.0, calc.multiply(-2.0, 3.0), 0.000001,
                "-2 * 3 нь -6-тай тэнцүү байх ёстой");
    }
}
