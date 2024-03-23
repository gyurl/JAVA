package chap7_6;

public class TimeTest {

	public static void main(String[] args) {
		Time t = Time.getInstance();
		Time t2 = Time.getInstance();
		Time t3 = Time.getInstance();
		
		t.setHour(7);
		t.setMinute(12);
		t.setSecond(34);
		
		t.displayTime();
		t2.displayTime();
	}

}
