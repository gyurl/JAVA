package chap7;

public class Ex09 {

	public static void main(String[] args) {
       int x = 6;
       char c = 'g';
       //x가 2의 배수 이거나 2의 배수 인지?아닌지
       
       
       System.out.println(x%2==0 && x%3==0);
       
       //2의 배수 또는 3의 배수 이지만 6의 배수는 아니다.
       System.out.println( (x%2==0 || x%3==0) && x%6!=0);
       System.out.println(c >= '0' && c <= '9');
	}

}
