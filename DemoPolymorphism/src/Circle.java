import static java.lang.Math.PI;

public class Circle implements Shape {
    private double radius;

    public Circle( double radius ) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return PI * 2 * radius;
    }
}
