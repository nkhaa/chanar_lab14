package lab14.sict.must.edu.mn;

public class Multiplication {
    /**
     * Multiplies two integers. This method does not accept values greater
     * than 10,000 to avoid overflow in demonstration cases.
     *
     * @param a first number
     * @param b second number
     * @return product of a and b
     * @throws IllegalArgumentException when a or b is too large
     */
    public int multiply(int a, int b) {
        if (Math.abs(a) > 10000 || Math.abs(b) > 10000) {
            throw new IllegalArgumentException("Input value too large");
        }
        return a * b;
    }

}
