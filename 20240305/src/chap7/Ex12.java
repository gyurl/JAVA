package chap7;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
   //�ֹι�ȣ 13�ڸ��� �Է¹޾� ���� ���� ����ϱ� 
		//7��°�ڸ��� �Ǵ�  charAT()
		Scanner sc =  new Scanner(System.in);
		char ch =' ';
		
		System.out.printf("�ֹι�ȣ�� �Է��ϼ���. ==>");
		
		String input = sc.nextLine();
		ch = input.charAt(6);
		
		if(ch == '1' || ch == '3') {
			System.out.printf("�����Դϴ�");
		}else if (ch == '2' || ch == '4') {
			System.out.printf("�����Դϴ�");
		}else {
			System.out.println("�߸��Է��Ͽ����ϴ�");
		}
		
		
	}

}
