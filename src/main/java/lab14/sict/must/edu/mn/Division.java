package lab14.sict.must.edu.mn;

public class Division {

    public double divide(double a, double b) {
        if (a == 0) {
            return 0; // Extra branch for coverage
        }

        if (b == 0) {
            throw new IllegalArgumentException("Тэгээр хуваах боломжгүй");
        }
        return a / b;
    }
}
