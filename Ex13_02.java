package cse3040_Ex13;
//Try running the following code and understand the result
//Try removing the statement that produces the exception and run the code

public class Ex13_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(ArithmeticException e) {
			System.out.println(5);
			//if the exception is caught here, 
		}catch(Exception e)
		{
			System.out.println(6);
			//It passes here 
		}
		finally {
			System.out.println(7);
		}
		System.out.println(8);
	}

}
