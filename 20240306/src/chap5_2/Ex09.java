package chap5_2;

import java.util.Arrays;

public class Ex09 {

	public static void main(String[] args) {
		int[] iArr1 = new int [10]; //{0,0,.......0}
		int[] iArr2 = new int [10];
		//int[] iArr3 = new int []{100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for(int i=0; i<iArr1.length; i++) {
			iArr1[i] = i+1;
		}
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random() *10)+1;
		}
		
		for(int i=0; i<iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
			System.out.println(Arrays.toString(iArr1));
			System.out.println(Arrays.toString(iArr2));
			System.out.println(Arrays.toString(chArr));
			System.out.println(chArr);
	
	}
	
}

//배열은 같은 타입의 값을 모아놓은 집합
//인덱스로 요소 접근
//배열이름.length
//반복문 Arrays.toStirng

