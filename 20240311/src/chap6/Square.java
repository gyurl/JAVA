package chap6;

public class Square {
	int x; //가로값
	int y; //세로값
	int round;
	int area;
	
	void calRound() {
		round =2*(x + y);
	}
	
	void calArea() {
		area = x * y;
	}
	
	void showInfo() {
		System.out.printf("가로 : %d, 세로 : %d, 둘레 : %d, 넓이 : %d%n", x,y,round,area);
	}
}
