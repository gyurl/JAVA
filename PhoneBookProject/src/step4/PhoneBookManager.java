package step4;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBookManager {
	final int MAX_CNT = 100;
	Person[] infostorage = new Person[MAX_CNT];
	int curCnt = 0;  //�迭�� ������ġ �˸��� ����
	
	public void searchData() {
		System.out.print("�˻��� �̸��� ==> ");
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
			System.out.println("������ �����ϴ�.");
		}
	}
	
	public void updateData() {
		System.out.print("������ �̸��� ==> ");
		String name = MenuViewer.sc.nextLine();
		boolean isUp = false;
		
		for(int i=0; i<curCnt; i++) {
			if(infostorage[i].name.equals(name)) {
				
			}
		}
		
		//������ ��ü�� ã�Ƽ�
		//���ο� ������ ������ �Է¹޾� �ش��ϴ� ��ü�� ����
		//���� �� �Ϸ����
		//if ��ü�� ������ �˸� �޼��� ���
	}
	
	public void deleteData() {
		System.out.print("������ �̸��� ==> ");
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
	    	System.out.println("�����Ϸ�");
	    } else {
	    	System.out.println("������ ������ �����ϴ�.");
	    }
	}
	    
	    		
				
	    	
	    
	    
	    	
	    	
  	

	
	   //MenuViewer.
		//������ �̸��� �ִ� �迭 ��ġ ã��
		//������ ���� Data�� ������ �̵��ϱ�(����)
		//curCnt--
		//������ �޼��� ���
	public void inputData() {
		System.out.print("�̸��� �Է��ϼ��� ==> ");
		String name = MenuViewer.sc.nextLine();
		System.out.print("������ �Է��ϼ��� ==> ");
		String phonenumber = MenuViewer.sc.nextLine();
		System.out.print("��������� �Է��ϼ��� ==> ");
		String birthday = MenuViewer.sc.nextLine();
		
		infostorage[curCnt++] = new Person(name,phonenumber,birthday);
	}
	public void display() {
		for(int i=0; i<curCnt; i++)
		infostorage[i].showInfo();
	}
}