package chap5;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//1~12 ���� �Է¹޾�
		//���� ����ϱ�
		Scanner sc = new Scanner(System.in);
	    int w = 0;
		String result = "";
		
		System.out.print("���� �Է��ϼ���.==> ");
		w = Integer.parseInt(sc.nextLine());
		
		if(w == 12 || w == 1 || w == 2) {
			result = "�ܿ�";
		} else if (w == 3 || w == 4 || w == 5) {
			result = "��";
		}else if (w == 6 || w == 7 || w == 8) {
			result = "����";
		}else if(w == 9 || w == 10 || w == 11) {
			result = "����";
		}
				
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		switch (w) {
//		case 4 : case 5 : 
//			System.out.println("��");  //result = "��";
//			break;
//		case '6' : case '7' : case '8' :
//			System.out.println("����");
//			break;
//		case 9 : case 10 : case 11 :
//			System.out.println("����");
//			break;
//		case 12 : case 1 : case 2 : case 3:
//			System.out.println("�ܿ�");
//			break;
//		default :
//			System.out.println("�߸� �Է��ϼ̽��ϴ�");
//		}
		
		System.out.println("����� �����ϴ� ������ " + result);
		
		
		
		
		
		
		
		
	}

}
