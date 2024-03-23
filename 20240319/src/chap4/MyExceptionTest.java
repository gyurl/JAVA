package chap4;

import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~1000까지 입력==>");
		int input = Integer.parseInt(sc.nextLine());
		
		if(input == 100) {
			try {
				MyException e = new MyException("100입력 불가");	
				throw e;
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("GOOD");
		}
	}

}
