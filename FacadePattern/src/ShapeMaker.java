/*
 * CST361-Java Design Patterns
 * Vien Nguyen
 * */
public class ShapeMaker {
	private Shape circle;
	private Shape triangle;
	private Shape cone;

	public ShapeMaker() {
		circle = new Circle();
		triangle = new Triangle();
		cone = new Cone();
	}

	public void drawCircle() {
		circle.drawShape();
	}

	public void drawTriangle() {
		triangle.drawShape();
	}

	public void drawCone() {
		cone.drawShape();
	}

}
