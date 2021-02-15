package cse3040_Ex09;
interface intSequence 
{
	boolean hasNext();
	int next();
}
class SimpleSequence implements intSequence
{
	private int i;
	public boolean hasNext()
	{
		return true;
	}
	public int next()
	{
		i++;
		return i;
	}
}
class SquareSequence implements intSequence
{
	private int i;
	public boolean hasNext()
	{
		return true;
	}
	public int next() 
	{
		i++;
		return i*i;
	}
}
class DigitSequence implements intSequence
{
	private int number;
	public DigitSequence (int n){this.number=n;}
	public boolean hasNext()
	{
		return number!=0;
	}
	public int next()
	{
		int result;
		result=number%10;
		number/=10;
		return result;
	}
	public int rest() {return number;}
}
public class Ex09_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
