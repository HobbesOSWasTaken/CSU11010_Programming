package etest4;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(100.0);
        circle.resize(90); //90% of its original size
        System.out.printf("Perimeter of the resizable circle is %.2f%n", circle.getPerimeter());
        System.out.printf("Area of the resizable circle is %.2f", circle.getArea());
    }
}
