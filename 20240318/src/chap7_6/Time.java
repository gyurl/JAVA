package chap7_6;

public class Time {
	private int hour;
	private int minute;
	private int second;
	private static Time t;
	
	public static Time getInstance() {
		if(t == null) {
			t = new Time();
		}
		return t;
	}
	
	private Time() {
		
	}
	
	public int getHour() {
		return hour;
	}



	public void setHour(int hour) {
		if(hour < 0 || hour > 23) {
			return;
		}
		this.hour = hour;
	}



	public int getMinute() {
		return minute;
	}



	public void setMinute(int minute) {
		if(minute < 0 || minute > 60) {
			return;
		}
		this.minute = minute;
	}



	public int getSecond() {
		return second;
	}



	public void setSecond(int second) {
		if(second < 0 || second > 60) {
			return;
		}
		this.second = second;
	}



	void displayTime() {
		System.out.printf("%d : %d : %d%n",hour,minute,second);
	}
}
