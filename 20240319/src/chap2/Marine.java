package chap2;

public class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "¸¶¸°";
	}
	
}
