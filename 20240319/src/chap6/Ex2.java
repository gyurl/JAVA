package chap6;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		String[] arrs = {"kim", "hong", "park"};
         // �迭 arr�� �����ؼ� ���� ������ ���ο� �迭�� �����.
		int[] arrClone = arr.clone(); 
		int[] arrClone2 = new int[10];
		System.arraycopy(arr, 1, arrClone2, 5, 3);
		System.out.println(Arrays.toString(arrClone2));
		
		
		String[] arrsClone = arrs.clone();
		arrClone[0]= 6;

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		System.out.println(Arrays.toString(arrs));
		System.out.println(Arrays.toString(arrsClone));
	}

}
