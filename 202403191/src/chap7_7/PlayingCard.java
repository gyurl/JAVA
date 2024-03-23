package chap7_7;

public interface PlayingCard {
	public static final int sapde = 4;
	int DIAMOND =3;
	int HEART = 2;
	int CLOVER =1;
	
	public abstract String getCaedNumber();
	String getCardKind();
}
