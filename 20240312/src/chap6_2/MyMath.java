package chap6_2;

public class MyMath {
	static long add(long a, long b) {
		return a + b;
	}
	
	static long subtract(long a, long b) {
		return a - b;
		}
	
	static long multiply(long a, long b) {
		return a * b;
		}
	
	static double divide(double a, double b) {
		return a / b;
		}
}

// 오류 메세지
//int divide(int a, int b) {
//  if(b==0){
//		system.out.println("0으로 나눌 수 없습니다")
//  		return 0; 
// 		}