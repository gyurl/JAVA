package chap9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		
		Date today = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
		
		
		System.out.println(sf.format(today));
		
		System.out.println(today);
	}

}
