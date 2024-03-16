package chap5_2;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int input = 0;
		
		while(true) {
		System.out.print("숫자를 입력하세요.==>(END:0) ");
		input = Integer.parseInt(sc.nextLine());
		if(input == 0) break;
		System.out.println(input*2);
		
	}
	}
}
