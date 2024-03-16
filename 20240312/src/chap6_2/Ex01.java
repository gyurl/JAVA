package chap6_2;

public class Ex01 {
	int i=150;
	static int j=230;
	static int [] numArr = new int[10];
	static void printArr() {
		 for(int i=0; i<10; i++)
		    	System.out.printf("¹è¿­ %d ", numArr[i]);
		    System.out.println();
	}
	
	
	public static void main(String[] args) {
		//int [] numArr = new int[10];
		
		for(int i=0; i<10; i++) 
			numArr[i] = (int)(Math.random()*10);
		
		printArr();	
//	    for(int i=0; i<10; i++)
//	    	System.out.printf("%d", numArr[i]);
//	    System.out.println();
		
	    numArr[5] = numArr[5]*100;
	    
	    printArr();	
//	    for(int i=0; i<10; i++)
//	    	System.out.printf("%d", numArr[i]);
//	    System.out.println();
	    
	}
		
}


