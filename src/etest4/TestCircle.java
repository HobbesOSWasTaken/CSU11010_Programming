package etest4;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(100.0);
        System.out.printf("Perimeter of the circle is %.2f%n", circle.getPerimeter());
        System.out.printf("Area of the circle is %.2f", circle.getArea());
    }
}
