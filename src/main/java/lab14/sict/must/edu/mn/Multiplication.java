package lab14.sict.must.edu.mn;

public class Multiplication {

    public double multiply(int a, int b) {

        // Extra branch for Jacoco: validate big input
        if (a > 10000 || b > 10000) {
            throw new IllegalArgumentException("Input too large");
        }

        // Normal multiplication
        return a * b;
    }
}
