package cse3040_Ex25;

import javax.swing.JOptionPane;

class ThreadEx26_1 extends Thread{
	public void run() {
		int i=10;
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for( long x=0; x<250000000L;x++); //waste time
		}
	}
	
}

public class Ex26_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx26_1 th1 = new ThreadEx26_1();
		th1.start();
		String input =JOptionPane.showInputDialog("Enter any String");
		System.out.println("You entered "+input);
		th1.interrupt();
		System.out.println("isInterrupted(): "+th1.isInterrupted());
	}
	//Countdown stops when user enter the string 
}
