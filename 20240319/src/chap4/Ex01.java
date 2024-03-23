package chap4;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number=0; 
		int result = 0;
		
		System.out.print("정수를 입력==>");
		try {
			number = Integer.parseInt(sc.nextLine());
		}catch (ArithmeticException e) {
			System.out.println("숫자만 입력하세요.");
		}catch (Exception e) {
			System.out.println("글자안됨");
		}
		
		for(int i=0; i<10; i++) {
			try {
				result = number/ (int)(Math.random() * 10);
				System.out.println(result);
			}catch(ArithmeticException e) {
				System.out.println("by zero");
			}
		}
	}

}
