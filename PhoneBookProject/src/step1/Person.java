package step1;

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
	
	void showInfo() {
		System.out.printf("�̸� : %s, ���� : %s, ������� : %s%n", name, phonenumber, birthday);
	}
}
