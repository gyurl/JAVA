package chap9;

public class Ex04 {

	public static void main(String[] args) {
		Point original = new Point(3,5);
		try {
			Point copy = original.clone();
	}catch(CloneNotSupportedException e) {
		System.out.println("복제불가");
		}
	}
}
