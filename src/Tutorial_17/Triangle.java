package Tutorial_17;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (((double)base / 2) * height);
    }

    @Override
    public String toString() {
        return "Color: " + super.getColor() + " Base: " + base + " Height: " + height;
    }
}
