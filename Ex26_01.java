package cse3040_Ex25;

class Thread_1 extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		for(int i=0;i<300;i++) {
			System.out.print("-");
		}
		System.out.println("<<end of th1>>");
	}
}

class Thread_2 extends Thread{
	public void run() {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		for(int i=0;i<300;i++) {
			System.out.print("|");
		}
		System.out.println("<<end of th2>>");
	}
}
public class Ex26_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_1 th1 = new Thread_1();
		Thread_2 th2 = new Thread_2();
		th1.start();
		th2.start();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		//using sleep, 순서를 정해줌 
		System.out.println("<<end of main>>");
	}

}
