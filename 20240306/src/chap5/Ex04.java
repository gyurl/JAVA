package chap5;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan =0;
		System.out.print("���� �Է��ϼ��� ==> ");
		dan = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<10;i++) { //�ʱⰪ, ���ǽ�, ����
			System.out.printf("%dx%d = %d%n",dan,i,dan*i); //%d, %f, %s
		}
	}

}
