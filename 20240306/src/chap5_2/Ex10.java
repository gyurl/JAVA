package chap5_2;

public class Ex10 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		double[] arr2 = {0.2,0.4,0.65,0.55};
		
		for(int i=2; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		//향상된 for문
		for(int tmp : arr) {
			System.out.println(tmp);
		}
		
		for(double a : arr2) {
			System.out.println(a);
		}
	}

}
