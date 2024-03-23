package chap7_7;

public class PolyTest {

	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv ct = new CaptionTv();
		
		Tv tt = new CaptionTv();
		
		ct.caption();
		//tt/caption(); 물려준 멤버만 접근 가능
		
		CaptionTv ct2 = (CaptionTv)tt; //형변환
		ct2.caption();
		
	
	}

}
