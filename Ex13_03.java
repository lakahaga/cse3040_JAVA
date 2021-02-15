package cse3040_Ex13;
//Throwing Exceptions 
//The following code produces a compile error. Fix the error by:
//i) Handling the exception in method2
//ii) Handling the exception in method1
//iii)Handling the exception in main method 
//iv) Not handling the exception anywhere 
public class Ex13_03 {

	public static void main(String[] args) {//or throws Exception (iv)
		// TODO Auto-generated method stub
		try {
			method1();
		} catch(Exception e) {
			System.out.println("Exception handled in main method");
		}
	}
	static void method1() throws Exception 
	{
		//try {
		method2();
		//} catch (Exception e)
		//{
		//	System.out.println("Exception handled in method1");
		//}
	}
	static void method2() throws Exception
	{
		//try {
		throw new Exception();
		//} catch (Exception e)
		//{
		//	System.out.println("Exception handled in method2");
		//}
		
	}

}
