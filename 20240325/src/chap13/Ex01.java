package chap13;

public class Ex01 {

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		//ThreadEx1_2 t2 = new ThreadEx1_2();
		//Runnable tmp = new ThreadEx1_2();
		Thread t2 = new Thread(new ThreadEx1_2());
		
		t1.start();
		t2.start();
		
		for(int i=0; i<500; i++)
			System.out.println("main()");
	}

}
