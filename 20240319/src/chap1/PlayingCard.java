package chap1;

public interface PlayingCard {
	public static final int SPADE = 4;
	int DIAMOND = 3;
	int HEART = 2;
	int CLOVER = 1;
	
	public abstract String getCardNumber();
	String getCardKind();
}
