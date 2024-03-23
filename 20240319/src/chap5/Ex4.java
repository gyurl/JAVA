package chap5;

public class Ex4 {

	public static void main(String[] args) {
		Card c1 = new Card("HEART", 7);
		try {
			Card c2 = c1.clone();
			System.out.println(c1);
			System.out.println(c2.toString());
		}catch(Exception e) {
			System.out.println("복제불가");
		}
	}

}
