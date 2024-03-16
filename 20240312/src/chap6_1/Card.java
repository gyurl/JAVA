package chap6_1;

public class Card {
	//속성 :  종류, 번호, 가로, 세로(멤버변수)
	String kind;  //인스턴스 변수
	int number;
	static int width=100;  //클래스 변수
	static int height=250;
	//기능 : 정보출력(멤버 메소드)
	void showInfo() {
		System.out.printf("종류 : %s, 번호 : %d, 가로 : %d, 세로 : %d%n", kind, number, width, height);
	}
	
}
