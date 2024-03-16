package chap6_2;

public class CallStackTest {

	public static void main(String[] args) {
		
	}
	static void fristMethod() {
		secondMethod();
	}
	static void secondMethod() {
		System.out.println("seondMethod()");
	}

}
