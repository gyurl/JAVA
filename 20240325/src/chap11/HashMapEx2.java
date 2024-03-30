package chap11;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("���ڹ�",100);
		map.put("���ڹ�",100);
		map.put("���ڹ�",80);
		map.put("���ڹ�",90);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("������ ��� : " + set);
		
		Collection scores = map.values();
		it = scores.iterator();
		int total = 0;
		
		while(it.hasNext()) {
			total = total + (Integer)it.next();
		}
		System.out.println("���� : " + total);
		System.out.println("��� : " + (double)total/set.size());
		System.out.println("�ְ����� : " + Collections.max(scores));
		System.out.println("�������� : " + Collections.min(scores));
	}

}
