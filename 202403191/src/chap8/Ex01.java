package chap8;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int result = 0;
		
		System.out.println("������ �Է��ϼ��� ==> ");
		try {
			  number = Integer.parseInt(sc.nextLine());
		}catch(ArithmeticException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
		}catch(Exception e) {
			System.out.println("���� �Ұ���");
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

