package chap7_3;

public class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		super(x,y);
//		this.x = x;
//		this.y = y;
		this.z = z;
	}
	String getLocation() {
		return "x :" + x +", y :" + y +", z:" + z;
	}
}
