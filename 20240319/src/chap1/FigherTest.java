package chap1;

public class FigherTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			System.out.println("f는 Unit 클래스의 자손입니다.");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable 를 구현했습니다.");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Movable 를 구현했습니다.");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable를 구현했습니다.");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object 클래스의 자손입니다.");
		}
	}

}
