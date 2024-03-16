package step4;

import java.util.Scanner;

public class PersonTest {

	
	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();
		
		int choice = 0;
		
		while(true) { //무한 반복
			MenuViewer.showMenu();
			choice = Integer.parseInt(MenuViewer.sc.nextLine());
			
			switch(choice) {
			case 1 :
			manager.inputData();
			    break;
			case 2 :
				manager.display();
				break;
			case 3 :
				manager.searchData(); //조회
				break;
			case 4 :
				manager.updateData(); //수정
				break;
			case 5 :
				manager.deleteData(); //삭제
				break;
			case 7 :
				System.out.println("프로그램 종료");
				return;
			} //swtich end
		} //while end
	} //main end

} //class end
