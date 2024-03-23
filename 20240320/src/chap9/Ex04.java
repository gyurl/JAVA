package chap9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		List al = new ArrayList();
		for(int i=1; i<=10; i++)
			al.add(i);
		
		for(int i=0; i<al.size(); i++)
			System.out.println(al.get(i));
		
		Iterator it = al.iterator(); //À§Ä¡
		
		while(it.hasNext()) {
			//System.out.println(it.next());
			it.remove();
		}
	}

}
