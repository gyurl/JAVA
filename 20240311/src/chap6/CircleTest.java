package chap6;

public class CircleTest {

	public static void main(String[] args) {
		Circle[] c = new Circle[3];
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle();  //인스턴스화
			c[i].r = i * 15;
			c[i].calArea();
			c[i].calRound();
			c[i].showResult();
		}
		
		
		
		
		
		
		
		
		//		Circle c1 = new Circle();
//		
//		c1.x=12;
//		c1.y=4;
//		c1.calRound();
//		c1.calPie();
//		c1.showInfo();
	}

}
