package cse3040_Ex25;

class Thread4_1 extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {System.out.print(new String("-"));}
	}
}

class Thread4_2 extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {System.out.println(new String("|"));}
	}
}
public class Ex26_04 {
	static long startTime= 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread4_1 th1= new Thread4_1();
		Thread4_2 th2= new Thread4_2();
		th1.start();
		th2.start();
		startTime=System.currentTimeMillis();
		try {
			th1.join();
			th2.join();
		}catch(InterruptedException e) {}
		System.out.print("elapsed time: "+(System.currentTimeMillis()- Ex26_04.startTime));
	}

}
