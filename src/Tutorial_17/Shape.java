package Tutorial_17;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public abstract String toString();

    public String getColor() {
        return color;
    }
}
