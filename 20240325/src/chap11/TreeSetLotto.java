package chap11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		Set set = new TreeSet();
		Set set2 = new HashSet();
		
		for(int i=0; set.size() <6; i++) {
			int num = (int)(Math.random()*45) +1;
			set.add(num);
			set2.add(num);
		}
		//List list = new LinkedList(set2);
		//Collections.sort(list);
		System.out.println(set);
		System.out.println(set2);
	}

}
