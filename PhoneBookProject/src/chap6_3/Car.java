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
		this("blue", "auto", 5); //this() �� �ٸ� ������ ȣ��
		                 
	}
	
	Car(String color, String gearType, int door){
			this.color = color; //this �ڱ� �ڽ��� ����Ű�� ��������
			this.gearType = gearType;
			this.door = door;
	}
		
		void showCar() {
			System.out.printf("���� : %s, ���ӱ�: %s, �� ���� : %d%n", color, gearType, door);
			}
}
