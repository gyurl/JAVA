package step4;

public class Person {
	//�̸�, ����, �������, ����
	String name;
	String phonenumber;
	String birthday;
	
	Person(){
		this.name = "�ƹ���";
		this.phonenumber = "000 -0000-0000";
		this.birthday = "9999-99-99";
	}
	
	
	
	
	 Person(String name, String phonenumber, String birthday) {
		this.name = name;
		this.phonenumber = phonenumber;
		this.birthday = birthday;
	}




	void showInfo() {
		System.out.printf("�̸� : %s, ���� : %s, ������� : %s%n", name, phonenumber, birthday);
	}
}
