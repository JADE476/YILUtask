package Task4;

public class Circle extends AbstractShape {
    private double radius;
    private static final double PI = 3.14;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }
    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
    @Override
    public String type() {
        return "Circle";
    }
}
