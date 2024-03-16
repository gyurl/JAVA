package chap5_3;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		int[] arr = {3,1,4,2,0};
		System.out.println(Arrays.toString(arr));
		
		for(int j=0; j<arr.length -1; j++) {
			for(int i=0; i<arr.length-1-j; i++) {
				if(arr[i] > arr[i+1]) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
				//System.out.println("i="+i);
				System.out.println(Arrays.toString(arr));
			}
		
		}
	}
}