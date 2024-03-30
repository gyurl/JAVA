package chap13_1;

public class RunnableEx21 implements Runnable {
	Account acc = new Account();
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random()*3 + 1) * 100;
			acc.withdraw(money);
			System.out.printf("출금액 : %d 잔액 : %d%n",money, money+acc.getBalance());
		}
	}

}
