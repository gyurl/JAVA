package chap5;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//1~12 월을 입력받아
		//계절 출력하기
		Scanner sc = new Scanner(System.in);
	    int w = 0;
		String result = "";
		
		System.out.print("월을 입력하세요.==> ");
		w = Integer.parseInt(sc.nextLine());
		
		if(w == 12 || w == 1 || w == 2) {
			result = "겨울";
		} else if (w == 3 || w == 4 || w == 5) {
			result = "봄";
		}else if (w == 6 || w == 7 || w == 8) {
			result = "여름";
		}else if(w == 9 || w == 10 || w == 11) {
			result = "가을";
		}
				
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		switch (w) {
//		case 4 : case 5 : 
//			System.out.println("봄");  //result = "봄";
//			break;
//		case '6' : case '7' : case '8' :
//			System.out.println("여름");
//			break;
//		case 9 : case 10 : case 11 :
//			System.out.println("가을");
//			break;
//		case 12 : case 1 : case 2 : case 3:
//			System.out.println("겨울");
//			break;
//		default :
//			System.out.println("잘못 입력하셨습니다");
//		}
		
		System.out.println("당신이 좋아하는 계절은 " + result);
		
		
		
		
		
		
		
		
	}

}
