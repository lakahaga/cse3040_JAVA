package cse3040_Ex25;

import javax.swing.JOptionPane;

class Thread3_1 extends Thread{
	public void run() {
		int i=10;
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			
		}
		System.out.println("coundown complete");
	}
}
public class Ex26_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread3_1 th1= new Thread3_1();
		th1.start();
		String input = JOptionPane.showInputDialog("Enter any string.");
		System.out.println("You entered "+input);
		th1.interrupt();
		System.out.println("isInterruped(): "+th1.isInterrupted());
	}
	

}
