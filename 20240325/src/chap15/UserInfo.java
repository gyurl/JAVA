package chap15;

import java.io.Serializable;

public class UserInfo implements Serializable{ //ÆÄÀÏ¾Æ¿ôÇ²
	String name;
	String password;
	int age;
	
	public UserInfo() {
		this("UnKnown", "1111", 0);
	}
	
	public UserInfo(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
}
