package chap5;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan =0;
		System.out.print("단을 입력하세요 ==> ");
		dan = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<10;i++) { //초기값, 조건식, 증감
			System.out.printf("%dx%d = %d%n",dan,i,dan*i); //%d, %f, %s
		}
	}

}
