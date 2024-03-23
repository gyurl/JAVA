package chap9;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("10");
		list.add("9");
		list.add("8");
		list.add("7");
		list.add("6");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		//while(it.hasPrevious()) {
		//	System.out.println(it.previous());
	//	}
		//System.out.println();
		
		}
	}


