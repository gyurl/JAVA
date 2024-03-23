package chap2;

public class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);		// Tank의 HP는 150이다.
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank";
	}

	
}
