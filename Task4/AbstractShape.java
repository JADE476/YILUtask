package Task4;

public abstract class AbstractShape implements Shape {
    protected String name;
    public AbstractShape(String name) {
        this.name = name;
    }

    @Override
    public abstract double area();
    @Override
    public abstract double perimeter();
    @Override
    public abstract String type();
}
