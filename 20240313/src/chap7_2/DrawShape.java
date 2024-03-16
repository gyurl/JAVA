package chap7_2;

public class DrawShape {

	public static void main(String[] args) {
		Shape s = new Shape();
		s.hashCode();
		
		Point[] p = {	new Point(100, 100),
						new Point(140, 50),
						new Point(200, 100)
					};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle();
		Circle c2 = new Circle(new Point(150, 150), 50);
		Circle c3 = new Circle(p[2], 25);
		
		
		t.draw();
		c.draw();
		c2.draw();
		c3.draw();
	}

}
