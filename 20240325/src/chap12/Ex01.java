package chap12;

public class Ex01 {

	public static void main(String[] args) {
		FruitBox<Apple> fb = new FruitBox<Apple>();
		FruitBox<Grape> gb = new FruitBox<Grape>();
		//FruitBox<Bannana> gb = new FruitBox<Bannana>();
		
		
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		Box<Grape> grapeBox = new Box<Grape>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		toyBox.add(new Toy());
		
		//appleBox.add(new Fruit());
		
		System.out.println(fruitBox);
		
		
	}

}
