package chap4;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number=0; 
		int result = 0;
		
		System.out.print("������ �Է�==>");
		try {
			number = Integer.parseInt(sc.nextLine());
		}catch (ArithmeticException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
		}catch (Exception e) {
			System.out.println("���ھȵ�");
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
