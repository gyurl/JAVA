package chap9;

public class Ex2 {

	public static void main(String[] args) {
		Person p1  = new Person(8011081111222L);
		Person p2  = new Person(8011081111222L);
		
		System.out.println(System.identityHashCode(p1));
		System.out.println(System.identityHashCode(p2));
		
//		if(p1 == p2) {
//			System.out.println("같은 사람");
//		}else {
//			System.out.println("다른 사람");
//		}
//		if(p1.equals(p2)) {
//			System.out.println("같은 사람");
//		}else {
//			System.out.println("다른 사람");
//		}
		
//		String s1 = new String("Hello");
//		String s2 = new String("Hello");
	
		String s1 ="Hello";
		String s2 ="Hello";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);
		System.out.println(System.identityHashCode(s2));
	}

}
