package chap7_4;

public class Point3D extends Point {
	
	int z;

	@Override
	protected String getLocation() {
		return super.getLocation() + ", z:" + z;
		//return "x:" + x +", y:" + y +", z:" + z;
	}
	
	
}
