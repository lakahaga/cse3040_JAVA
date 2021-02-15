package cse3040_Ex13;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallyBlock.method1();
		System.out.println("returned to main method after calling method1.");
		
		byte[] b = new byte[1024];
		FileInputStream input = null;
		try {
			input = new FileInputStream("src/ke/ac/sogangics1aaa.txt");
			input.read(b);
			System.out.println(new String(b));
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("The program exited normally");
		
	}
	static void method1()
	{
		try {
			System.out.println("the try block of method1 is being executed.");
			return;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			System.out.println("The finally block of method 1 is being executed.");
		}
	}
}
