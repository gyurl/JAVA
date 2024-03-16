package chap7;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// 서울-부산까지의 거리는 400km로 가정하고
		//자동차의 최대 속도를 입력받아
		//도착까지의 걸리는 시간을 구하고
		//시간 = 거리/속도
		
		//2시간 이하이면 "hight hight speed
		//3시간 이하이면 "hight  speed
		//4시간 이상이면 "good speed
		
		Scanner sc= new Scanner(System.in);
        final int a = 400;
        int b = 0;
        double time = 0.0;
        String result ="";
        
        System.out.print("속도를 입력하세요. ==>");
        b = Integer.parseInt(sc.nextLine());
        
        time = a / (double) b; //System.out.println("시간 :" + time);
        System.out.println("시간 :" + time);
        
        if(time <= 2) {
        	result = "hight hight speed";
        }else if (time <= 3) {
        	result = "hight speed";
        }else if (time >= 4) {
        	result = "good speed";
        }
        System.out.println(result);
	}

}
