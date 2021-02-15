package cse3040_mp1;

class PalindromeChecker
{
	static private boolean IsPalindrome;
	static private int left;
	static private int right;
	public static void check(String str )
	{
		IsPalindrome=true;
		right = str.length()-1;
		left=0;
		while(left<=right)
		{
			if(str.charAt(left)!=str.charAt(right))
			{
				IsPalindrome=false;
				break;
			}
			left++;
			right--;
			
			
		}
		if(IsPalindrome==true)
		{
			System.out.println(str+" is a palindrome.");
		}
		else {System.out.println(str+" is not a palindrome.");}
	}
	static private String numStr;
	public static void check(int num)
	{
		IsPalindrome=true;
		numStr=Integer.toString(num);
		left=0;
		right = numStr.length()-1;
		while(left<=right)
		{
			if(numStr.charAt(left)!=numStr.charAt(right))
			{
				IsPalindrome=false;
				break;
			}
			left++;
			right--;
			
		}
		
		if(IsPalindrome==true)
		{
			System.out.println(num+" is a palindrome.");
		}
		else {System.out.println(num+" is not a palindrome.");}
	}
	
}

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeChecker.check("abcde"); 
		PalindromeChecker.check("abcba"); 
		PalindromeChecker.check(1234); 
		PalindromeChecker.check(12321);
		
		
	}

}
