package step3;

import java.util.Scanner;

public class PersonTest {
	static Scanner sc = new Scanner(System.in);
		
	public static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택 : ");
	}
	
	public static void inputData() {
		System.out.print("이름을 입력하세요 ==> ");
		String name = sc.nextLine();
		System.out.print("전번을 입력하세요 ==> ");
		String phonenumber = sc.nextLine();
		System.out.print("생년월일을 입력하세요 ==> ");
		String birthday = sc.nextLine();
		
		Person p2 = new Person(name,phonenumber,birthday);
		
		p2.showInfo();
	}
	public static void main(String[] args) {
		int choice = 0;
		
		while(true) { //무한 반복
			showMenu();
			choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1 :
				inputData();
			    break;
			case 2 :
				System.out.println("프로그램 종료");
				return;
			} //swtich end
		} //while end
	} //main end

} //class end
