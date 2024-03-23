package chap5;

public class Ex3 {

	public static void main(String[] args) {
		Person p1 = new Person(12341234L);
		Person p2 = new Person(12341234L);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(System.identityHashCode(p1));
		System.out.println(System.identityHashCode(p2));
		
		//String s1 = new String("Hello");
		//String s2 = new String("Hello");
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
	}

}
