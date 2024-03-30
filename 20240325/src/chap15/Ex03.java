package chap15;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("UserInfo.ser");
			ObjectOutputStream out = new ObjectOutputStream(fos);
			
			UserInfo u1 = new UserInfo("javaman", "1234",30);
			UserInfo u2 = new UserInfo("javawoman", "5678",20);
			
			 ArrayList<UserInfo> list = new ArrayList();
			 list.add(u1);
			 list.add(u2);
			
			//out.writeObject(u1);
			//out.writeObject(u2);
			 
			out.writeObject(list); 
			out.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}
