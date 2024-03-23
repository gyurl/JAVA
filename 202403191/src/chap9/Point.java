package chap9;

public class Point implements Cloneable{
	int x, y;
	
	public Point(int x, int y) {
	this.x = x;
	this.y = y;
	
	
}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	protected Point clone() throws CloneNotSupportedException {
		return (Point)super.clone();
	}
}