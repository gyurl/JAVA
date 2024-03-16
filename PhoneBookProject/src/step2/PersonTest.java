package step2;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.print("이름을 입력하세요 ==> ");
		String name = sc.nextLine();
		
		System.out.print("전번을 입력하세요 ==> ");
		String phonenumber = sc.nextLine();
		
		System.out.print("생년월일을 입력하세요 ==> ");
		String birthday = sc.nextLine();
		
		Person p1 = new Person();
		Person p2 = new Person(name,phonenumber,birthday);
		
		p1.showInfo();
		p2.showInfo();
		
	}

}
