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
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.println("ID또는 pw 불일치");
				continue;
			}
			
//					
//			if(!map.containsKey(id)) {
//				System.out.println("입력하신 id는 존재하지않습니다");
//				continue;
//			}else {
//				if(!map.get(id).equals(password)){
//					System.out.println("비번 불일치");
//				}else {
//					System.out.println("로그인 성공");
//					break;
//				}
//			}
		}
		
	}

}
