package step1;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		
		p.showInfo();
		
		System.out.print("이름을 입력하세요 ==> ");
		p.name = sc.nextLine();
		
		System.out.print("전번을 입력하세요 ==> ");
		p.phonenumber = sc.nextLine();
		
		System.out.print("생년월일을 입력하세요 ==> ");
		p.birthday = sc.nextLine();
		
		
		p.showInfo();
	}

}
