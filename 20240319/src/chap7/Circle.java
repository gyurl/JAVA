package chap7;

public class Circle implements Cloneable {
	Point p;
	double r;
	
	public Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}

	@Override
	protected Circle clone() throws CloneNotSupportedException {
		Object obj = null;
		obj = super.clone();
		Circle c = (Circle)obj;
		c.p = new Point(this.p.x, this.p.y);
		
		return c;
	}
	
}
