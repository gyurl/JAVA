package chap6;

public class Ex02 {

	public static void main(String[] args) {
       int i = (int) 0.5; //�ٿ�ĳ����
       
       byte b = 10;
       i = b; //�ڵ� ����ȯ
       
       long l = 128L;
       i =(int)l; //�ٿ�ĳ����
       b = (byte)l;
       
       System.out.println(i);
       System.out.println(b);
       
       char c = 'c';
       i = (int)c;
       System.out.println(i);
       
       boolean b1 = true;
       //i = (int)b1;
	}

}
