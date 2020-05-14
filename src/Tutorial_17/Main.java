package Tutorial_17;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle("White", 10, 10);
        Shape tri = new Triangle("Black", 35, 10);
        System.out.printf("Rectangle Info: %nArea: %s %s%n", rect.getArea(), rect.toString());
        System.out.printf("Triangle Info: %nArea: %.2f %s%n", tri.getArea(), tri.toString());
    }
}
