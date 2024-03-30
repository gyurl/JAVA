package chap15;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("UserInfo.ser");
			ObjectInputStream in = new ObjectInputStream(fis);
			
			ArrayList<UserInfo> list = (ArrayList)in.readObject();
			//UserInfo u1 = (UserInfo)in.readObject();
			//UserInfo u2 = (UserInfo)in.readObject();
			
			//System.out.println(u1);
			//System.out.println(u2);
			
			System.out.println(list);
			in.close();
			
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}
