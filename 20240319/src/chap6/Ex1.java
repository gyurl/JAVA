package chap6;

public class Ex1 {

	public static void main(String[] args) {
		Point original = new Point(3,5);
		try {
			Point copy = original.clone();
			System.out.println(original);
			System.out.println(copy);
		}catch(CloneNotSupportedException e) {
			System.out.println("복제불가");
		}
	}

}
