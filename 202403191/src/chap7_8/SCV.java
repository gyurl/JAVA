package chap7_8;

public class SCV extends GroundUnit implements Repairable {
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit) r;
			while(u.hitPoint != u.MAX_HP) {
				/*Unit의 Hp를 증가시킨다*/
				u.hitPoint++;
			}
			System.out.println(u.toString()+ "의 수리가 끝났습니다.");
		}else {
			System.out.println("수리 불가능");
		}
		
	}
	@Override
	public String toString() {
		return "SCV";
	}
}
