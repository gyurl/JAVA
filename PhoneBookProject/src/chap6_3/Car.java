package chap6_3;

public class Car {
	String color;
	String gearType;
	int door;
	static boolean sun;
	
	static {
		sun = true;
	}
	Car(){
		this("blue", "auto", 5); //this() 또 다른 생성자 호출
		                 
	}
	
	Car(String color, String gearType, int door){
			this.color = color; //this 자기 자신을 가리키는 참조변수
			this.gearType = gearType;
			this.door = door;
	}
		
		void showCar() {
			System.out.printf("색상 : %s, 변속기: %s, 문 개수 : %d%n", color, gearType, door);
			}
}
