package chap7;

public class Ex02 {

	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv ct = new CaptionTv();
		
		
		t.power();
		ct.power();
		ct.caption = true;
		ct.displayCaption("æ»≥Á«œººø‰");
		
		ct.channel=10;
		ct.channelUp();
		System.out.println(ct.channel);
	}

}
