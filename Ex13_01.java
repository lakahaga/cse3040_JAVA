package cse3040_Ex13;
//Exception handling
//The following code may produce an exception. Handle the exception so that the program does not crash

public class Ex13_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =100;
		int result = 0;
		for(int i=0;i<10;i++)
		{
			try {
			result=number/(int)(Math.random()*10);
			//There could be division by zero 
			System.out.println(result);
			}
			catch(ArithmeticException e)//or RuntimeException, Exception
			{
				System.out.println("division by zero");
			}
		}
	}

}
