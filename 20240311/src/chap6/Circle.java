package chap6;

public class Circle {
	final double PI = 3.14;
	double r;
	double round;
	double area;
	
	void calRound() {
		round = 2 * PI * r;
	}
	
	void calArea() {
		area = PI * r * r;
	}
	
	void showResult() {
		System.out.printf("������ : %.2f, �ѷ� : %.2f, ���� : %.2f%n", PI,r,round,area);
	}
	
	
	
	
	
	
	
	//	int x;
//	int y;
//	int round;
//	double pie = 3.14;
//	
//	void calRound() {
//		round=2*(x + y);
//	}
//	
//	void calPie() {
//		pie = x * y;
//	}
//	
//	void showInfo() {
//		System.out.printf("�ѷ� : %d, ���� : %f", round, pie);
//	}
}
