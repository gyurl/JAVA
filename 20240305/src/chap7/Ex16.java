package chap7;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// ����-�λ������ �Ÿ��� 400km�� �����ϰ�
		//�ڵ����� �ִ� �ӵ��� �Է¹޾�
		//���������� �ɸ��� �ð��� ���ϰ�
		//�ð� = �Ÿ�/�ӵ�
		
		//2�ð� �����̸� "hight hight speed
		//3�ð� �����̸� "hight  speed
		//4�ð� �̻��̸� "good speed
		
		Scanner sc= new Scanner(System.in);
        final int a = 400;
        int b = 0;
        double time = 0.0;
        String result ="";
        
        System.out.print("�ӵ��� �Է��ϼ���. ==>");
        b = Integer.parseInt(sc.nextLine());
        
        time = a / (double) b; //System.out.println("�ð� :" + time);
        System.out.println("�ð� :" + time);
        
        if(time <= 2) {
        	result = "hight hight speed";
        }else if (time <= 3) {
        	result = "hight speed";
        }else if (time >= 4) {
        	result = "good speed";
        }
        System.out.println(result);
	}

}
