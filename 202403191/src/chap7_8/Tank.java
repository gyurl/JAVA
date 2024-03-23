package chap7_8;

public class Tank extends GroundUnit implements Repairable {
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "tank";
	}
	
}
