package chap6_3;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Black", "manual", 4);
		Car c3 = new Car();
		
		c1.color = "White";
		c1.gearType = "auto";
		c1.door = 4;
		
		
		
		c1.showCar();
		c2.showCar();
		c3.showCar();
			
		
	}

}
