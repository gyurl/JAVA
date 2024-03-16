package chap6;

public class Tv {
	//속성 : 크기, 색상, 채널, 볼륨, 전원: 멤버 변수
	int size;
	String color = "black";
	int channel;
	int volumn;
	boolean power;
	
	//행위 :  켜기/끄기, 볼륨업/다운, 채널 변경 : 멤버 메소드

	void powerOnOff() {
		power = !power;
	}
	
	void volumnUp() {
		volumn++;
	}
	void volumnDawn() {
		volumn--;
	}
	
	void channelChange(int num) {
		channel = num;
	}
	
}
