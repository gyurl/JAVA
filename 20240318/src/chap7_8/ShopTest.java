package chap7_8;

public class ShopTest {

	public static void main(String[] args) {
		Tv t = new Tv();
		Computer c = new Computer();
		Piano p = new Piano();
		//Product pr = new Product(30);
		Buyer b1 = new Buyer();
		
		b1.buy(t);
		b1.buy(c);
		b1.buy(p);
		System.out.println(b1.money);
		System.out.println(b1.bonusPoint);
		
	}

}
