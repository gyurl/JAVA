package chap7_7;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		//System.out.println(car instanceof Car);
		//System.out.println(car instanceof FireEngine);
		
		
		
		car.drive();
		if(car instanceof FireEngine) {
			fe = (FireEngine)car;
			fe.drive();
			car2 = fe;
			car2.drive();
		}	
	}
}


