package chap6;

public class Ex10 {

	public static void main(String[] args) {
		Square[]s = new Square[50];
		
		Square s1 = new Square();
		Square s2 = new Square();
		
		s1.x =25;
		s1.y = 30;
		s1.calRound();
		s1.calArea();
		s1.showInfo();

		s2.x = 40;
		s2.y = 16;
		s2.calRound();
		s2.calArea();
		s2.showInfo();
		
		
		
		
//		int x=10, y=20;
//		int round = 2*(x + y);
//		int area = x + y;
//		
//		System.out.println(round);
//		System.out.println(area);
		
	}

}
