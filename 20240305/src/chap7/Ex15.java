package chap7;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int input = 0;
       
       System.out.print("���ڸ� �ϳ� �Է��ϼ���. ==>");
       input = Integer.parseInt(sc.nextLine());
       
       if(input == 0) {
    	   System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
       }else { 
    	   System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�");
    	   System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.", input);
      
       }
	}

}
