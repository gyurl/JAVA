package chap11;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바",100);
		map.put("이자바",100);
		map.put("강자바",80);
		map.put("안자바",90);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection scores = map.values();
		it = scores.iterator();
		int total = 0;
		
		while(it.hasNext()) {
			total = total + (Integer)it.next();
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (double)total/set.size());
		System.out.println("최고점수 : " + Collections.max(scores));
		System.out.println("최저점수 : " + Collections.min(scores));
	}

}
