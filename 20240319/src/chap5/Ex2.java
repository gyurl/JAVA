package chap5;

public class Ex2 {

	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1 == p2) {
			System.out.println("�������");
		}else {
			System.out.println("�ٸ����");
		}
		
		if(p1.equals(p2)) {
			System.out.println("�������");
		}else {
			System.out.println("�ٸ����");
		}
		
		String s1 = new String("Hello");
		String s2 = new String("hello");
		
		System.out.println(s1.equals(s2));
	}
}
