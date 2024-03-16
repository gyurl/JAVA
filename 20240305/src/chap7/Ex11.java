package chap7;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char ch =' ';
       
       System.out.printf("문자를 하나 입력하세요.>");
       
       String input = sc.nextLine();
       ch = input.charAt(0);
       
       if('0' <= ch && ch <= '9') {
    	   System.out.printf("입력하신 문자는 숫자입니다.%n");
       }else if((ch >='a' && ch<= 'z') || ('A' <= ch && ch <= 'Z')) {
    	   System.out.printf("입력하신 문자는 영문자입니다.%n");
       }else {
    	   System.out.printf("입력하신 문자는 숫자도 영문자도 아닙니다");
	} 
  
}
}