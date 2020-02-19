public class Tutorial_12_Complex {
    private static double x;
    private static double y;

    public Tutorial_12_Complex() {
        x = 0;
        y = 0;
    }

    public Tutorial_12_Complex(double realPart, double imaginaryPart) {
        x = realPart;
        y = imaginaryPart;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static Tutorial_12_Complex add(Tutorial_12_Complex a) {
        return new Tutorial_12_Complex(x + a.getX(), y + a.getY());
    }


}
