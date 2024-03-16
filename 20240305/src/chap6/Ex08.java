package chap6;

public class Ex08 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str1));
		System.out.println(str2 == str3);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
			
		
		
		
		
		
		
//		char ch = 'A';
//		String name1 = "abc";
//		String name2 = "abc";
//		String name3 = new String("abc");
//		
//		System.out.println(name1 == name2);
//		System.out.println(name1 == name3);
//		System.out.println(name2 == name3);
//		System.out.println(name2.equals(name3));
//		
		
		
		
//       System.out.println(10 == 10.0f);
//       System.out.println('0' == 0);
//       System.out.println((int)'0');
//       System.out.println('A' == 65);
//       System.out.println('A' > 'B');
//       System.out.println('A' + 1 != 'B');
//       System.out.println('a'== 'a');
//       System.out.println("abc" == "abc");
	}

}
