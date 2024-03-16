package chap6_2;

public class TestClass {
	int i; //인스턴스 변수 (static이든 아니든 다 o)
	static int s; //static 변수 (static - static)
	
	void instanceMethod() {}  //인스턴스 메서드
	static void staticMethod() {} //클래스 메서드 static메서드

	void instanceMethod2() {
		i = 10;
		s = 5;
		instanceMethod();
		staticMethod();
	}
	static void staticMethod2() {
		//i = 20;
		s = 1;
		
		//instanceMethod();
		staticMethod();
	}
	
	
	
}
