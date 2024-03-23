package chap7_8;

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship droship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(droship);
		//scv.repair(marine);
		scv.repair(scv);
	}

}
