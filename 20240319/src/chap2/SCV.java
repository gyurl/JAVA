package chap2;

public class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint!=u.MAX_HP) {
				/* Unit�� HP�� ������Ų��. */
				u.hitPoint++;
			}
			System.out.println( u.toString() + "�� ������ �������ϴ�.");
		}else {
			System.out.println("�����Ұ���");
		}
	}	
}
