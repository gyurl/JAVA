package chap7_7;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit)
			System.out.println("f는 Unit클래스의 자손입니다");
		
		
		if(f instanceof Figthtable)
			System.out.println("f는 Figthtable인터페이스를 구현했습니다");
		
		if(f instanceof Movable)
			System.out.println("f는 Movable인터페이스를 구현했습니다");
		
		if(f instanceof Attackable)
			System.out.println("f는 Obiect클래스의 자손입니다");
	}

}
