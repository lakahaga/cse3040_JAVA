package cse3040_Ex23;

import javax.swing.JOptionPane;

public class Ex23_05  {
	public static void main(String[] args) throws Exception {
		String input = JOptionPane.showInputDialog("Enter any stirng.");
		System.out.print("You have entered :" + input);
	
	
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) { /*do nothing*/}
		}

	}
}