package chap7_8;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;
	
	
	void buy(Product t) {
		if(money < t.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money = money - t.price;
		bonusPoint = bonusPoint + t.bonusPoint;
		item[i++] = t;
		
		System.out.println(t + " ���Կ� �����Ͽ����ϴ�.");
		
	}
	
	void summary() {
		int sum = 0;
		String itemList ="";
		
		for(int i=0; i<item.length; i++) {
			if(item[i]==null) break;
			sum = sum + item[i].price;
			itemList = itemList + item[i].toString() + " ";
		}
		
		System.out.println("������ ��ǰ�� �ѱݾ� : " + sum);
		System.out.println("������ ��ǰ����Ʈ : " + itemList);
	}
	
}
