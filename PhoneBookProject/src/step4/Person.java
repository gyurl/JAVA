package step4;

public class Person {
	//이름, 전번, 생년월일, 메일
	String name;
	String phonenumber;
	String birthday;
	
	Person(){
		this.name = "아무개";
		this.phonenumber = "000 -0000-0000";
		this.birthday = "9999-99-99";
	}
	
	
	
	
	 Person(String name, String phonenumber, String birthday) {
		this.name = name;
		this.phonenumber = phonenumber;
		this.birthday = birthday;
	}




	void showInfo() {
		System.out.printf("이름 : %s, 전번 : %s, 생년월일 : %s%n", name, phonenumber, birthday);
	}
}
