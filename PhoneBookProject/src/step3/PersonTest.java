package step3;

import java.util.Scanner;

public class PersonTest {
	static Scanner sc = new Scanner(System.in);
		
	public static void showMenu() {
		System.out.println("�����ϼ���");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ���α׷� ����");
		System.out.print("���� : ");
	}
	
	public static void inputData() {
		System.out.print("�̸��� �Է��ϼ��� ==> ");
		String name = sc.nextLine();
		System.out.print("������ �Է��ϼ��� ==> ");
		String phonenumber = sc.nextLine();
		System.out.print("��������� �Է��ϼ��� ==> ");
		String birthday = sc.nextLine();
		
		Person p2 = new Person(name,phonenumber,birthday);
		
		p2.showInfo();
	}
	public static void main(String[] args) {
		int choice = 0;
		
		while(true) { //���� �ݺ�
			showMenu();
			choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1 :
				inputData();
			    break;
			case 2 :
				System.out.println("���α׷� ����");
				return;
			} //swtich end
		} //while end
	} //main end

} //class end
