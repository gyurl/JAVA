package chap5_2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
		System.out.print("숫자를 입력하세요.==> ");
		arr[i] = Integer.parseInt(sc.nextLine());
	
		
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
//		int[] arr = new int[5];
//		
//		System.out.println(Arrays.toString(arr));
		}
	}
}
 //키보드로 부터 숫자를 입력받아 배열에 저장하기
//저장한 배열을 출력하기