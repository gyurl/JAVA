package chap6;

public class Time {
	private int hour;  //외부접근 금지
	private int minute;
	private int second;
	
	//getter setter 생성

	
	
	void showTime() {
		System.out.printf("%02d:%02d:%02d%n",hour,minute,second);
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
		if(minute < 0 || minute > 59) {
			return;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second < 0 || second > 59) {
			return;
		}
		this.second = second;
	}
}
