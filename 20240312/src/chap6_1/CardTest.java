package chap6_1;

public class CardTest {

	public static void main(String[] args) {
		Card [] c = new Card[5];
		
		for(int i=0; i<c.length;i++){
		c[i] = new Card();
		c[i].number = i * 10;
		c[i].width = i * 20;
		c[i].height = i * 12;
	}
		
		for(int i=0; i<c.length; i++){
		c[i].showInfo();
		}
		
		System.out.println("--------------------------------------");
		System.out.println();
		
		Card c1 = new Card();
		Card c2 = new Card();
		
		c1.kind = "Heart";
		c1.number = 7;
//		c1.width = 4;
//		c1.height = 2;
		
		c2.kind = "Spade";
		c2.number = 43;
//		c2.width = 500;
//		c2.height = 1500;
		Card.width = 230;
		Card.height = 12222;
//	
		c1.showInfo();
		c2.showInfo();
	}

}
