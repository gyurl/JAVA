package chap6_3;

public class Card {
	String kind;
	int num;
	
	Card(){
		this.kind = "하트";
		this.num = 1;
	}
	
	Card(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	Card(String kind){
		this.kind = kind;
		this.num = 1;
	}
	
	Card(int num){
		this.kind = "다이아몬드";
		this.num = 1;
	}
	void showCard() {
		System.out.printf("%s, %d%n",kind,num);
	}
}
