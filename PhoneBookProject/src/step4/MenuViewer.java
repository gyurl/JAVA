package step4;

import java.util.Scanner;

public class MenuViewer {
	static Scanner sc = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 전체 출력");
		System.out.println("3. 데이터 조회");
		System.out.println("4. 데이터 수정");
		System.out.println("5. 데이터 삭제");
		System.out.println("7. 프로그램 종료");
		System.out.print("선택 : ");
	}
}
