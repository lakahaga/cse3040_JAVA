package cse3040_Ex25;

class Account {
	private int balance=1000;
	public int getBalance() {
		return balance;
	}
	public synchronized void withdraw (int money) {
		if(balance >=money) {
			try {Thread.sleep(1000);}catch (InterruptedException e) {}
			balance-=money;
		}
	}
}

class RunnableEx26 implements Runnable{
	Account acc= new Account();
	public void run() {
		while(acc.getBalance()>=200) {
			int money =200;
			acc.withdraw(money);
			System.out.println("balance: "+acc.getBalance());
		}
	}
}
public class Ex26_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new RunnableEx26();
		new Thread(r).start();
		new Thread(r).start();
	}

}
