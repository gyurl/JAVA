package chap9;

public class Ex01 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1�� v2�� ����");
		}else {
			System.out.println("v1�� v2�� �ٸ�");
		}
		
		//System.out.println(v1.equals(v2));
		//System.out.println(v1);
	//	System.out.println(v2);
		
		v2 = v1;
		if(v1.equals(v2)) {
			System.out.println("v1�� v2�� ����");
		}else {
			System.out.println("v1�� v2�� �ٸ�");
		}
	
		if(v1.value == v2.value) {
			System.out.println("value�� �����ϴ�");
		}
		
	}

}
