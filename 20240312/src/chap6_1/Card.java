package chap6_1;

public class Card {
	//�Ӽ� :  ����, ��ȣ, ����, ����(�������)
	String kind;  //�ν��Ͻ� ����
	int number;
	static int width=100;  //Ŭ���� ����
	static int height=250;
	//��� : �������(��� �޼ҵ�)
	void showInfo() {
		System.out.printf("���� : %s, ��ȣ : %d, ���� : %d, ���� : %d%n", kind, number, width, height);
	}
	
}
