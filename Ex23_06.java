package cse3040_Ex23;

import javax.swing.JOptionPane;

class ThreadEx6_1 extends Thread{
	public void run() {
		for (int i=10;i>0;i--) {
			System.out.println(i);
			try {
				sleep(1000);
			}catch(Exception e) {}
		}
	}
}
public class Ex23_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx6_1 th1=new ThreadEx6_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("Enter any string.");
		System.out.println("You have entered: "+input);
	}

}
