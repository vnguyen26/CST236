/*
 * CST361-Java Design Patterns
 * Vien Nguyen
 * */
public class FacadePattern {
	
	public static void main(String[] args) {
		ShapeMaker shapemaker = new ShapeMaker();
		shapemaker.drawCircle();
		shapemaker.drawTriangle();
		shapemaker.drawCone();
	}
}
