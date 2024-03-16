package chap5_2;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i=1;
		int sum=0;
		System.out.print("정수를 입력하세요. ==> ");
		num = Integer.parseInt(sc.nextLine());
		
		do{
			sum = sum + i;
			i++;
		}while(i<=num);
		
		System.out.println("합 :" + sum);
			
		
		
		
		}

	
}

 







  //양의 정수1개를 입력받아,
  //그 숫자부터 1까지의 합을 구하기
  //do-while로 작성하기