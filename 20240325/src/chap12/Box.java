package chap12;

import java.util.ArrayList;

public class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}

	@Override
	public String toString() {
		return list.toString();
	}
	
}
