package step1;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		
		p.showInfo();
		
		System.out.print("�̸��� �Է��ϼ��� ==> ");
		p.name = sc.nextLine();
		
		System.out.print("������ �Է��ϼ��� ==> ");
		p.phonenumber = sc.nextLine();
		
		System.out.print("��������� �Է��ϼ��� ==> ");
		p.birthday = sc.nextLine();
		
		
		p.showInfo();
	}

}
