package chap5;

import java.util.Scanner;

public class Var03 {

	public static void main(String[] args) {
		//�ʿ��� ���� ����� �ʱ�ȭ
       Scanner sc = new Scanner(System.in);
       int kor=0, eng=0, mat=0, total=0;
	   double avg = 0.0;
       
	  //�Է�
	  System.out.print("���� ������ �Է��ϼ��� ==>");
	  kor = Integer.parseInt(sc.nextLine());
	  System.out.print("���� ������ �Է��ϼ��� ==>");
	  eng = Integer.parseInt(sc.nextLine());
	   System.out.print("���� ������ �Է��ϼ��� ==>");
	  mat = Integer.parseInt(sc.nextLine());
     
	  //ó��
	  //������ ��ձ��ϱ�
	  total = kor + eng + mat;
	  avg = total / 3.0;
	  
      //printf������ ����ϱ�
      System.out.printf("���� : %d \n��� :%f", total, avg);
      
      
 
	}
}
