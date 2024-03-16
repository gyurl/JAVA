package step4;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBookManager {
	final int MAX_CNT = 100;
	Person[] infostorage = new Person[MAX_CNT];
	int curCnt = 0;  //배열에 저장위치 알리기 위함
	
	public void searchData() {
		System.out.print("검색할 이름은 ==> ");
		String name = MenuViewer.sc.nextLine(); 
		  boolean isExist = false;
		for(int i=0; i<curCnt; i++) {
			if(infostorage[i].name.equals(name)) {
				infostorage[i].showInfo();
				isExist = true;
				break;
			}
		}
		if(!isExist) {
			System.out.println("정보가 없습니다.");
		}
	}
	
	public void updateData() {
		System.out.print("수정할 이름은 ==> ");
		String name = MenuViewer.sc.nextLine();
		boolean isUp = false;
		
		for(int i=0; i<curCnt; i++) {
			if(infostorage[i].name.equals(name)) {
				
			}
		}
		
		//수정할 객체를 찾아서
		//새로운 전번과 생일을 입력받아 해당하는 객체에 저장
		//저장 후 완료출력
		//if 객체가 없으면 알림 메세지 출력
	}
	
	public void deleteData() {
		System.out.print("삭제할 이름은 ==> ");
		String delName = MenuViewer.sc.nextLine();        
	    boolean isDel = false;
	    
	    for(int i=0; i<curCnt; i++) {
	    	if(infostorage[i].name.equals(delName)) {
	    		for(int idx=i; idx<curCnt-1; idx++) {
	    			infostorage[idx].name = infostorage[idx+1].name;
	    		}
	    		curCnt--;
	    		isDel = true;
	    	}
	    }
	    		
	    if(isDel == true) {
	    	System.out.println("삭제완료");
	    } else {
	    	System.out.println("삭제할 정보가 없습니다.");
	    }
	}
	    
	    		
				
	    	
	    
	    
	    	
	    	
  	

	
	   //MenuViewer.
		//삭제할 이름이 있는 배열 위치 찾기
		//있으면 뒷쪽 Data를 앞으로 이동하기(삭제)
		//curCnt--
		//없으면 메세지 출력
	public void inputData() {
		System.out.print("이름을 입력하세요 ==> ");
		String name = MenuViewer.sc.nextLine();
		System.out.print("전번을 입력하세요 ==> ");
		String phonenumber = MenuViewer.sc.nextLine();
		System.out.print("생년월일을 입력하세요 ==> ");
		String birthday = MenuViewer.sc.nextLine();
		
		infostorage[curCnt++] = new Person(name,phonenumber,birthday);
	}
	public void display() {
		for(int i=0; i<curCnt; i++)
		infostorage[i].showInfo();
	}
}