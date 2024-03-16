package chap5_2;

public class Ex15 {

	public static void main(String[] args) {
		int sum =0;
		int i = 0;
		
		while(i<100) {
			i++;
			sum = sum + i;
			if(sum > 100) break;
		}
		
		
		
		
//		
//		while(true) {
//			if(sum > 100) break;
//			++i;
//			sum += i;
//		} 
		System.out.println("i= "+ i);
		System.out.println("sum= "+ sum);
	}

}
