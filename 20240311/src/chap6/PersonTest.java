package chap6;

public class PersonTest {

	public static void main(String[] args) {
		Person[] p = new Person[3];
		
		System.out.println(p);
		
		for(int i=0; i<p.length; i++) {
			p[i] = new Person();
			p[i].age = i * 20;
		}
		
		for(int i=0; i<p.length; i++) {
			p[i].showInfo();
		}
		System.out.println("=============");
		System.out.println();
		
		
		Person p1 = new Person();  //°´Á¦È­ ÀÎ½ºÅÏ½ºÈ­
		Person p2 = new Person();
		
		System.out.println(p1);
//		System.out.println(p1.age);
//		System.out.println(p1.gender);
//		System.out.println(p1.grade);
//		System.out.println(p1.name);
		
		p1.name = "±è±Ô¸®";
		p1.age = 24;
		p1.gender="fmale";
		p1.grade=4;
		p1.showInfo();
		
		p2.name = "È«±æµ¿";
		p2.age = 32;
		p2.gender="male";
		p2.grade=2;
		p2.showInfo();
	}

}
