package chap6_2;

public class TestClass {
	int i; //�ν��Ͻ� ���� (static�̵� �ƴϵ� �� o)
	static int s; //static ���� (static - static)
	
	void instanceMethod() {}  //�ν��Ͻ� �޼���
	static void staticMethod() {} //Ŭ���� �޼��� static�޼���

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
