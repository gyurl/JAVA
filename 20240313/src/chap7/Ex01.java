package chap7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];
		int curCnt = 0;
		
		while(curCnt<5) {
		System.out.print("이름을 입력하세요 ==> ");
		names[curCnt++] = sc.nextLine();
		}
		
		System.out.println(Arrays.toString(names));
		
		for(int i=0; i<curCnt; i++) {
			if(names [i].equals("홍")) {
				//names[i] = null;
				for(int idx=i; idx<curCnt-1; idx++) {
					names[idx] = names [idx+1];
				}
				curCnt --;
				break;
			}
		}
		
		System.out.println(Arrays.toString(names));
		
	}

}
