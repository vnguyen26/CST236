/*
 * CST361-Java Design Patterns
 * Vien Nguyen
 * */
public class Circle implements Shape {

	@Override
	public void drawShape() {
		System.out.println("Cirle: draw()");
	}

	@Override
	public void colorShape() {
		System.out.println("Cirle: fill color");
		
	}

	@Override
	public void copyShapre() {
		System.out.println("Cirle: copyy");
		
	}

	@Override
	public void clearShape() {
		System.out.println("Cirle: delete");
		
	}

}
