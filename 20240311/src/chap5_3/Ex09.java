package chap5_3;

import java.util.Arrays;

public class Ex09 {

	public static void main(String[] args) {
		String[] names = new String[10];
		System.out.println(Arrays.toString(names)); //null: 할당된 객체가 없는 상태
		names[0] = "kim";
		names[1] = "park";
		names[2] = "hong";
		names[3] = "lee";
		names[4] = "shin";
		
		System.out.println(Arrays.toString(names));
	}

}
