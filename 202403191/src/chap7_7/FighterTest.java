package chap7_7;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit)
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�");
		
		
		if(f instanceof Figthtable)
			System.out.println("f�� Figthtable�������̽��� �����߽��ϴ�");
		
		if(f instanceof Movable)
			System.out.println("f�� Movable�������̽��� �����߽��ϴ�");
		
		if(f instanceof Attackable)
			System.out.println("f�� ObiectŬ������ �ڼ��Դϴ�");
	}

}
