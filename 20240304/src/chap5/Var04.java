package chap5;

import java.util.Scanner;

public class Var04 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int age=0;
      double height=0.0;
      String name ="";
      
      System.out.print("이름을 입력하세요==>");
      name = sc.nextLine();
      System.out.println("나이를 입력하세요==>");
      age = Integer.parseInt(sc.nextLine());
      System.out.println("키를 입력하세요==>");
      height = Double.parseDouble(sc.nextLine());
      
      System.out.printf("이름 : %s, 나이 : %d, 키 : %f", name, age, height);
      
      }

}
