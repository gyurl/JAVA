package chap6_3;

public class CardTest {

	public static void main(String[] args) {
		Card c1 = new Card();	
		Card c2 = new Card("크로바", 7);
		Card c3 = new Card("스페이드", 3);
		Card c4 = new Card("하트");
		Card c5 = new Card(5);
		
		c1.showCard();
		c2.showCard();
		c3.showCard();
		c4.showCard();
		c5.showCard();
	}

}
