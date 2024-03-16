package chap6;

public class Ex05 {

	public static void main(String[] args) {
       int i =5, j = 0;
       
        j = i++;
    	System.out.println("j=i++; 실행 후 : i=" + i+", j="+j);
       //i--; //i = i + 1;
       
       i = 5;
       j = 0;
       
       j = ++i;
       System.out.println("j=++i; 실행 후 : i=" + i +",j="+j);
     
	}

}
