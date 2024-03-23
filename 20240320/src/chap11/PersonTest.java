package chap11;

import java.util.HashSet;
import java.util.Set;

public class PersonTest {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		
		set.add(new Person("David",10));
		set.add(new Person("David",20));
			
		System.out.println(set);
	
	}

}
