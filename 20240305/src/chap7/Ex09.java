package chap7;

public class Ex09 {

	public static void main(String[] args) {
       int x = 6;
       char c = 'g';
       //x�� 2�� ��� �̰ų� 2�� ��� ����?�ƴ���
       
       
       System.out.println(x%2==0 && x%3==0);
       
       //2�� ��� �Ǵ� 3�� ��� ������ 6�� ����� �ƴϴ�.
       System.out.println( (x%2==0 || x%3==0) && x%6!=0);
       System.out.println(c >= '0' && c <= '9');
	}

}
