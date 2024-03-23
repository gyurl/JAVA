package chap4;

public class Ex02 {

	public static void main(String[] args) {
		
		try {
			method();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("정상종료");
	}
	
	public static void method() throws Exception  {
		
		Exception e = new Exception("고의로 발생");
		throw e;  //강제발생
		
	}
}
