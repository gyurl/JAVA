package chap5;

import java.util.Scanner;

public class Var03 {

	public static void main(String[] args) {
		//필요한 변수 선언과 초기화
       Scanner sc = new Scanner(System.in);
       int kor=0, eng=0, mat=0, total=0;
	   double avg = 0.0;
       
	  //입력
	  System.out.print("국어 점수를 입력하세요 ==>");
	  kor = Integer.parseInt(sc.nextLine());
	  System.out.print("영어 점수를 입력하세요 ==>");
	  eng = Integer.parseInt(sc.nextLine());
	   System.out.print("수학 점수를 입력하세요 ==>");
	  mat = Integer.parseInt(sc.nextLine());
     
	  //처리
	  //총접과 평균구하기
	  total = kor + eng + mat;
	  avg = total / 3.0;
	  
      //printf문으로 출력하기
      System.out.printf("총점 : %d \n평균 :%f", total, avg);
      
      
 
	}
}
