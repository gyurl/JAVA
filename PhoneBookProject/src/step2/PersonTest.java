package step2;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.print("�̸��� �Է��ϼ��� ==> ");
		String name = sc.nextLine();
		
		System.out.print("������ �Է��ϼ��� ==> ");
		String phonenumber = sc.nextLine();
		
		System.out.print("��������� �Է��ϼ��� ==> ");
		String birthday = sc.nextLine();
		
		Person p1 = new Person();
		Person p2 = new Person(name,phonenumber,birthday);
		
		p1.showInfo();
		p2.showInfo();
		
	}

}
