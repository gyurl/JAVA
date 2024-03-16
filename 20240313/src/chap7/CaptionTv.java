package chap7;

public class CaptionTv extends Tv{
	boolean caption;
	 //ÀÚ¸· on off
	
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
