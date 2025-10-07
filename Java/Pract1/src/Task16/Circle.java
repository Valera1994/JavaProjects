package Task16;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        super(color);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
