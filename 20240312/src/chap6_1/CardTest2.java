package chap6_1;

public class CardTest2 {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		c1.showInfo();
		c2.showInfo();
		
		System.out.println();
		System.out.println("c1�� ���� ���θ� ���� 50, 80, ���� �����մϴ�.");
		
		Card.width = 50;
		Card.height = 80;
		
		c1.showInfo();
		c2.showInfo();
		
	}

}
