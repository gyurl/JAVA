package chap5;

public class Ex1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");		
		}

		if(v1.value == v2.value) {
			System.out.println("value는 같습니다.");
		}
		
		v2 = v1;

		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");		
		}
		
		
		
	}

}
