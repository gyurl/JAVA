package chap6;

public class TvTest {

	public static void main(String[] args) {
		Tv[] t = new Tv[10];
	
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println(t1);
		System.out.println(t1.channel);
		System.out.println(t1.color);
		System.out.println(t1.power);
		System.out.println(t1.size);
		System.out.println(t1.volumn);
		
		t1.powerOnOff();
		System.out.println(t1.power);
		t1.volumnUp();
		System.out.println(t1.volumn);
		t1.channelChange(33);
		System.out.println(t1.channel);
		t1.size = 24;
		System.out.println(t1.size);
		
		
		System.out.println(t2.channel);
		System.out.println(t2.volumn);
		t2.volumnUp();
		System.out.println(t2.volumn);
	}

}
