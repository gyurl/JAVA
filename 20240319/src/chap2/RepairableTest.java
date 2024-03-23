package chap2;

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marine marine = new Marine();
		SCV scv = new SCV();
		Repair r = new Repair();
		
		scv.repair(tank);
		scv.repair(dropship);
		//scv.repair(marine);
		scv.repair(scv);
		scv.repair(r);
		
	}

}
