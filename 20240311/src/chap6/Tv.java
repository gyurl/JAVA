package chap6;

public class Tv {
	//�Ӽ� : ũ��, ����, ä��, ����, ����: ��� ����
	int size;
	String color = "black";
	int channel;
	int volumn;
	boolean power;
	
	//���� :  �ѱ�/����, ������/�ٿ�, ä�� ���� : ��� �޼ҵ�

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
