package chap9;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		int[] i = new int[2];
		
		i[0] = 10;
		i[1] = 200;
		
		int[] i2 = new int[4];
		i2[0] = i[0];
		i2[1] = i[1];
		
		i = i2;
		i[2] = 1000;
		i[3] = 2000;
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("1");
		al.add(1);
		al.add(1.0);
		al.add('1');
		al.add(1.0f);
		
		System.out.println(Arrays.toString(i));
		System.out.println(al);
		
	}

}
