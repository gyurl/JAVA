package chap13;

import javax.swing.JOptionPane;

public class ThreadEx7 {

	public static void main(String[] args) {
		ThreadEx7_1 th1 = new ThreadEx7_1();
		th1.setDaemon(true);
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ��� ");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�");
	}

}
