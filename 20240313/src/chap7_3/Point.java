package chap7_3;

public class Point {
	int x, y; 
	Point(){};
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	String getLacation() {
		return "x :" + x + ", y :"+ y;
	}
}
