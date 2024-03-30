package chap13;

public class ThreadEx19_1 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<300; i++)
			System.out.println(new String("-"));
	}
	
}
