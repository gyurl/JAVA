package chap13;

public class ThreadEx7_1 extends Thread {

	@Override
	public void run() {
		for(int i=0; i>0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
