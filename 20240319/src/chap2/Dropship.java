package chap2;

public class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);		// Dropship�� HP�� 125�̴�.
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Dropship";
	}
}
