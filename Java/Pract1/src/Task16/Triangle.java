package Task16;

public class Triangle extends Figure{
    private double a, b, c;

    public Triangle(double a, double b, double c, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        super(color);
    }

    @Override
    public double area() {
        double half = perimeter() / 2;
        return Math.sqrt(half * (half - a) * (half - b) * (half - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
