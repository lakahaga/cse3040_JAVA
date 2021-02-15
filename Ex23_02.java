package cse3040_Ex23;

class ThreadEx2_1 extends Thread{
	public void throwException() {
		try {
			throw new Exception();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void run() {
		throwException();
	}
}
public class Ex23_02 {
	public static void main(String[] args) throws Exception{
		ThreadEx2_1 t1 = new ThreadEx2_1();
		t1.start();
		t1.run();
	}
}
