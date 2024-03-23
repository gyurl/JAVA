package chap4;

public class Ex03 {

	public static void main(String[] args) {
		method1();
		System.out.println("method1()수행을 마치고 main()에돌아옴.");
	}
	
	static void method1() {
		try {
			System.out.println("method1()");
			//System.out.println(0/0);
			//return;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally 블럭");
		}
	}

}
