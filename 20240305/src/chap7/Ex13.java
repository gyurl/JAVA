package chap7;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num=0;
       String result = "";
       
       //�����Է¹޾�
       System.out.print("���ڸ� �Է��ϼ���. ==>");
       num = Integer.parseInt(sc.nextLine());
      
       //Ȧ������ ¦������ �Ǵ� 2�ǹ�� 
      result = (num%2 == 0) ? "¦��" : "Ȧ��";
       
       
       
//       if(num%2 == 0) {
//    	   result = "¦���Դϴ�";
//       }else {
//    	   result = "Ȧ���Դϴ�";
//       }
       //���
       System.out.println(result);
       
       
	}

}
