
public class Driver {

	public static void main(String[] args) {


		Shape circle = new Circle(3);
		Shape square = new Square(4);
		Shape triangle = new Triangle(3, 5, 6);
		System.out.println(circle.area());
		System.out.println(circle.perimeter());
		
		System.out.println(square.area());
		System.out.println(square.perimeter());

		System.out.println(triangle.area());
		System.out.println(triangle.perimeter());

		
	}

}
