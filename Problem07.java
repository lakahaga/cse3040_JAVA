package cse3040_HW2;

import java.util.Scanner;
interface IntSequenceStr 
{
	boolean hasNext();
	int next();
}
class BinarySequenceStr implements IntSequenceStr
{
	private int num;
	private int j=-1;
	public BinarySequenceStr(int num)
	{
		this.num=num;
		MakeBinary(this.num);
	}
	public boolean hasNext()
	{
		if(j>=Binary.length()-1)
			return false;
		else
		{
			j++;
			return true;
		}
			
	}
	static String Binary="";
	
	static void MakeBinary(int n)
	{
		while(n>0)
		{
			if(n%2==1)
				Binary+='1';
			else
				Binary+='0';
			n/=2;
		}
		char[] Barr=Binary.toCharArray();
		Binary="";
		for(int i=Barr.length-1;i>=0;i--)
			Binary+=Barr[i];
		
	}
	private int remainder;
	public int next()
	{
		remainder = Character.getNumericValue(Binary.charAt(j));
		return remainder;
	}
		
		
}
public class Problem07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		String str=in.nextLine();
		int num=Integer.parseInt(str);
		in.close();
		System.out.println("Integer: "+num);
		IntSequenceStr seq = new BinarySequenceStr(num);
		System.out.print("Binary number: ");
		while(seq.hasNext()) System.out.print(seq.next());
		System.out.println(" ");
	}

}
