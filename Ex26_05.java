package cse3040_Ex25;

class Thread5_1 extends Thread{
	final static int MAX_MEMORY =1000;
	int usedMemory=0;
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(10*1000); //sleep for 10 seconds
			}catch(InterruptedException e) {
				System.out.println("Awaken by interrupt()");
			}
			gc();
			System.out.println("Garbage Collected. Free Memory: "+freeMemory());
		}
	}
	
	public void gc() {
		usedMemory-=300;
		if(usedMemory < 0) usedMemory =0;
	}
	public int totalMemory() {return MAX_MEMORY;}
	public int freeMemory() {return MAX_MEMORY-usedMemory;}
}
public class Ex26_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread5_1 gc= new Thread5_1();
		gc.setDaemon(true); //set this thread as a daemon thread.
		gc.start();
		
		int requiredMemory =0;
		for(int i=0;i<20; i++) {
			requiredMemory = (int)(Math.random()*10)*20;
			if(gc.freeMemory()<requiredMemory || gc.freeMemory() <gc.totalMemory()*0.4) {
				gc.interrupt();
				//fix UsedMemory > 1000 problem
				try {
					gc.join(100);
				}catch(InterruptedException e) {}
			}
			gc.usedMemory+=requiredMemory;
			System.out.println("usedMemory: "+gc.usedMemory);
		}
	}
	//UsedMemory > 1000 shouldn't happen, but it happens.
	//Why? - interrupt -> gc -> gc.usedMemory+=requiredMemory it should happen like this 
	//but it can be interrupt -> gc.usedMemory+=requiredMemory -> gc 
	//How do we fix this? 
	//gc.usedMemory should wait until gc is executed 
	
}
