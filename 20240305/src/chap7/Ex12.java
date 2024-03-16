package chap7;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
   //주민번호 13자리를 입력받아 남자 여자 출력하기 
		//7번째자리로 판단  charAT()
		Scanner sc =  new Scanner(System.in);
		char ch =' ';
		
		System.out.printf("주민번호를 입력하세요. ==>");
		
		String input = sc.nextLine();
		ch = input.charAt(6);
		
		if(ch == '1' || ch == '3') {
			System.out.printf("남자입니다");
		}else if (ch == '2' || ch == '4') {
			System.out.printf("여자입니다");
		}else {
			System.out.println("잘못입력하였습니다");
		}
		
		
	}

}
