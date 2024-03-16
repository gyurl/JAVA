package chap7_2;

public class Circle extends Shape {
	Point center;
	int r;
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	Circle(){
		this(new Point(0,0),100);
	}
	@Override
	void draw() {
		System.out.printf("[center=(%d,%d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
	
	
}
