package chap7;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// ������ �Է¹޾� 0~100 A~F���� ���
		//100~90 A
		//89~80 B
		//79~70 C
		//69~60 D
		//60 �̸� F
		
		Scanner sc = new Scanner (System.in);
		int sco = 0;
		String result ="";
		
		System.out.print("������ �Է��ϼ���. ==>");
		sco = Integer.parseInt(sc.nextLine());
		
		if(sco >= 90) {
			result = "A";
		}else if(sco >= 80 && sco <= 89) {  //>=80 
			result = "B";                   // "
		}else if(sco >= 70 && sco <= 79) {
			result = "C";
		}else if(sco >= 60 && sco <=69) {
			result = "D";
		}else if(sco <60) {
			result = "F";
		}
		
	System.out.println(result);

		
	
	}

}
