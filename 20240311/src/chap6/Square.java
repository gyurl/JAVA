package chap6;

public class Square {
	int x; //���ΰ�
	int y; //���ΰ�
	int round;
	int area;
	
	void calRound() {
		round =2*(x + y);
	}
	
	void calArea() {
		area = x * y;
	}
	
	void showInfo() {
		System.out.printf("���� : %d, ���� : %d, �ѷ� : %d, ���� : %d%n", x,y,round,area);
	}
}
