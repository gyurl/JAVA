package step4;

import java.util.Scanner;

public class PersonTest {

	
	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();
		
		int choice = 0;
		
		while(true) { //���� �ݺ�
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
				manager.searchData(); //��ȸ
				break;
			case 4 :
				manager.updateData(); //����
				break;
			case 5 :
				manager.deleteData(); //����
				break;
			case 7 :
				System.out.println("���α׷� ����");
				return;
			} //swtich end
		} //while end
	} //main end

} //class end
