package chap9;

import java.util.Arrays;

public class CloneEx2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		String[] arrs = {"kim","lee","park"};
		int [] arrClone = arr.clone();
		int [] arrClone2 = new int[10];
		System.arraycopy(arr, 1, arrClone2, 0 ,3);
		
		String[] arrsClone = arrs.clone();
		arrClone[0] = 6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		System.out.println(Arrays.toString(arrs));
		System.out.println(Arrays.toString(arrs.clone()));
	}

}
