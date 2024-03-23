package chap6;

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
	public Point clone() throws CloneNotSupportedException {
		return (Point)super.clone();
	}
	
	
}
