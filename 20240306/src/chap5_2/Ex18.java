package chap5_2;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i=1;
		int sum=0;
		System.out.print("������ �Է��ϼ���. ==> ");
		num = Integer.parseInt(sc.nextLine());
		
		do{
			sum = sum + i;
			i++;
		}while(i<=num);
		
		System.out.println("�� :" + sum);
			
		
		
		
		}

	
}

 







  //���� ����1���� �Է¹޾�,
  //�� ���ں��� 1������ ���� ���ϱ�
  //do-while�� �ۼ��ϱ�