package chap7;

public class Ex01 {

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(1,1), 2.0);
		try {
			Circle c2 = c1.clone();
			System.out.println(c1);
			System.out.println(c2);
			
			c2.p.x = 19;
			c2.p.y = 19;
			
			System.out.println(c1);
			System.out.println(c2);
			
			System.out.println(c2.getClass());
			System.out.println(c2.getClass().getName());
			System.out.println(c2.getClass().toGenericString());
			System.out.println(c2.getClass().toString());
			
		} catch(CloneNotSupportedException e ) {
			System.out.println("복제불가");
		}
	}

}
