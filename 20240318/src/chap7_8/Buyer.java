package chap7_8;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;
	
	
	void buy(Product t) {
		if(money < t.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money = money - t.price;
		bonusPoint = bonusPoint + t.bonusPoint;
		item[i++] = t;
		
		System.out.println(t + " 구입에 성공하였습니다.");
		
	}
	
	void summary() {
		int sum = 0;
		String itemList ="";
		
		for(int i=0; i<item.length; i++) {
			if(item[i]==null) break;
			sum = sum + item[i].price;
			itemList = itemList + item[i].toString() + " ";
		}
		
		System.out.println("구입한 상품의 총금액 : " + sum);
		System.out.println("구입한 상품리스트 : " + itemList);
	}
	
}
