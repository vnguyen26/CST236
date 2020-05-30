import static java.lang.Math.sqrt;

public class Triangle implements Shape {
    private double a, b, c; 

    public Triangle( double a, double b, double c ) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        // Heron's formula
        return sqrt( (a+b-c)*(a-b+c)*(-a+b+c)*(a+b+c) ) / 4.0;
    }

    public double perimeter() {
        return a+b+c;
    }
}