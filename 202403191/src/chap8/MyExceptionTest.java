package chap8;

import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~1000���� �Է� ==> ");
		
		int input = Integer.parseInt(sc.nextLine());
		
		if(input == 100) {
			try {
				MyException e = new MyException("100�Է� �Ұ�");
				throw e;
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("GOOD");
		}
	}

}
