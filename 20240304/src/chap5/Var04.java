package chap5;

import java.util.Scanner;

public class Var04 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int age=0;
      double height=0.0;
      String name ="";
      
      System.out.print("�̸��� �Է��ϼ���==>");
      name = sc.nextLine();
      System.out.println("���̸� �Է��ϼ���==>");
      age = Integer.parseInt(sc.nextLine());
      System.out.println("Ű�� �Է��ϼ���==>");
      height = Double.parseDouble(sc.nextLine());
      
      System.out.printf("�̸� : %s, ���� : %d, Ű : %f", name, age, height);
      
      }

}
