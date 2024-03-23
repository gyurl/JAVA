package chap9;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();
		
		for(int i=0; i < objArr.length; i++) {
			set.add(objArr[i]); //hashset에 objarr의 요소 저장
		}
		//hashset에 저장된 요소 출력
		System.out.println(set);
	}

}
