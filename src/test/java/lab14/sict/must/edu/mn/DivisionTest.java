package lab14.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionTest {

    @Test
    void testDivideNormal() {
        Division calc = new Division();
        assertEquals(2.0, calc.divide(4.0, 2.0), 0.000001);
    }

    @Test
    void testDivideByZeroThrowsException() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class,
                () -> calc.divide(4.0, 0.0));
    }

    @Test
    void testDivideZeroNumerator() {
        Division calc = new Division();
        assertEquals(0.0, calc.divide(0.0, 5.0), 0.000001);
    }
}
