package chap5;

public class Ex1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if (v1.equals(v2)) {
			System.out.println("v1�� v2�� �����ϴ�.");
		} else {
			System.out.println("v1�� v2�� �ٸ��ϴ�.");		
		}

		if(v1.value == v2.value) {
			System.out.println("value�� �����ϴ�.");
		}
		
		v2 = v1;

		if (v1.equals(v2)) {
			System.out.println("v1�� v2�� �����ϴ�.");
		} else {
			System.out.println("v1�� v2�� �ٸ��ϴ�.");		
		}
		
		
		
	}

}
