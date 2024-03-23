package chap5;

public class Card implements Cloneable{
	String kind;
	int number;
	
	Card(){
		this("SPADE",1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	@Override
	public String toString() {
		return "kind: " + kind + ", number : " + number;
	}
	@Override
	protected Card clone() throws CloneNotSupportedException {
		return (Card)super.clone();
	}
	
}
