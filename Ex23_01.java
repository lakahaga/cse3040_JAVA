package cse3040_Ex23;

class ThreadEx1_1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) System.out.println(getName());
		System.out.println();
		System.out.println("end");
	}
}

class ThreadEx1_2 implements Runnable {
	public void run() {
		for(int i=0;i<5; i++) System.out.println(Thread.currentThread().getName());
	}
}

public class Ex23_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx1_1 t1 = new ThreadEx1_1();
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		
	}

}
