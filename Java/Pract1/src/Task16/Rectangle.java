package Task16;

public class Rectangle extends Figure{
    private double width, height;

    public Rectangle(double width, double height, String color) {
        this.height = height;
        this.width = width;
        super(color);
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
