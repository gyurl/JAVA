package chap6_2;

public class MyMathTest {

	public static void main(String[] args) {
	//	MyMath mm = new MyMath();
		
		long result1 = MyMath.add(5L, 3L);
		long result2 = MyMath.subtract(5L, 3L);
		double result3 = MyMath.multiply(5L, 3L);
		
		System.out.println(MyMath.add(5L,3L));
		System.out.println(MyMath.subtract(5L, 3L));
		System.out.println(MyMath.multiply(5L,3L));
		System.out.println(MyMath.divide(5L,0));


	
	}
}
