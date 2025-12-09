package lab14.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class DivisionTest {

    @Test
    void testDivideNormal() {
        Division calc = new Division();
        assertEquals(2.0, calc.divide(4.0, 2.0), 0.000001,
                "4 / 2 нь 2-той тэнцүү байх ёстой");
    }

    @Test
    void testDivideByZeroThrowsException() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class,
                () -> calc.divide(4.0, 0.0),
                "Тэгээр хуваах нь IllegalArgumentException шидэх ёстой");
    }
}
