package chap7;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num=0;
       String result = "";
       
       //정수입력받아
       System.out.print("숫자를 입력하세요. ==>");
       num = Integer.parseInt(sc.nextLine());
      
       //홀수인지 짝수인지 판단 2의배수 
      result = (num%2 == 0) ? "짝수" : "홀수";
       
       
       
//       if(num%2 == 0) {
//    	   result = "짝수입니다";
//       }else {
//    	   result = "홀수입니다";
//       }
       //출력
       System.out.println(result);
       
       
	}

}
