package chap4;

public class Ex02 {

	public static void main(String[] args) {
		
		try {
			method();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("��������");
	}
	
	public static void method() throws Exception  {
		
		Exception e = new Exception("���Ƿ� �߻�");
		throw e;  //�����߻�
		
	}
}
