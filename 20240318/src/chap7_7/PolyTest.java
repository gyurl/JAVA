package chap7_7;

public class PolyTest {

	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv ct = new CaptionTv();
		
		Tv tt = new CaptionTv();
		
		ct.caption();
		//tt/caption(); ������ ����� ���� ����
		
		CaptionTv ct2 = (CaptionTv)tt; //����ȯ
		ct2.caption();
		
	
	}

}
