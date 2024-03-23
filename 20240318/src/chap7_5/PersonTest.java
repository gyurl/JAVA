package chap7_5;

public class PersonTest {

	public static void main(String[] args) {
		System.out.println(Person.name);
		Person.sleep();
		Person.name = "ȫ�浿";
		
		Person p = new Person();
		
		System.out.println(p.name);
		System.out.println(p.age);
		p.sleep();
		
	}

}
