package chap7;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num1 = 0;
       int num2 = 0;
       int result =0;
       
       System.out.print("정수를 입력하세요. ==>");
       num1 = Integer.parseInt(sc.nextLine());
       
       System.out.print("정수를 입력하세요. ==>");
       num2 = Integer.parseInt(sc.nextLine());
       
//       if (num1 > num2) {
//    	   System.out.println(num1);
//    	
//       
//      }else if (num1 < num2) {
//  	   System.out.println(num2);

       
       
       
        result = (num1 > num2) ? num1 : num2 ;
        System.out.println("큰수는 : " + result);
       
       
       
       
      }
       
	}


