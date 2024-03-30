package chap13_1;

public class ThreadEx21 {

	public static void main(String[] args) {
		Runnable r = new RunnableEx21();
		
		Thread t1 = new Thread(new RunnableEx21());
		Thread t2 = new Thread(new RunnableEx21());
		
		t1.start();
		t2.start();
	}

}
