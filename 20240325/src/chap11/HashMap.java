package chap11;

import java.util.Scanner;

public class HashMap {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
	//	map.put("asdf", "1234");
		
		Scanner s= new Scanner(System.in);
		
		while(true){
			System.out.print("ID ==> ");
			String id = s.nextLine();
			System.out.print("password ==>");
			String password = s.nextLine();
			
			if(map.containsKey(id) && map.get(id).equals(password)) {
				System.out.println("�α��� ����");
				break;
			}else {
				System.out.println("ID�Ǵ� pw ����ġ");
				continue;
			}
			
//					
//			if(!map.containsKey(id)) {
//				System.out.println("�Է��Ͻ� id�� ���������ʽ��ϴ�");
//				continue;
//			}else {
//				if(!map.get(id).equals(password)){
//					System.out.println("��� ����ġ");
//				}else {
//					System.out.println("�α��� ����");
//					break;
//				}
//			}
		}
		
	}

}
