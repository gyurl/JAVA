package chap6_2;

public class CalcuTest {

	public static void main(String[] args) {
		Calcu c1 = new Calcu();
		
		
		int result = c1.add(35,65);
		
		System.out.println(result);
		
		System.out.println(c1.subtract(25, 54));
		System.out.println(c1.add(1, 2, 3));
		System.out.println(c1.add(0.1, 0.4));
		
	}

}
