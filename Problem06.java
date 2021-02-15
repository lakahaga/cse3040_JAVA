package cse3040_HW2;

interface IntSequence
{
	boolean hasNext();
	int next();
}
class FibonacciSequence implements IntSequence
{
	private int i=-1;
	private int n1=0, n2=0;
	public boolean hasNext() { return true;}
	public int next()
	{
		
		if(++i<2)
		{
			if(i==0)
			{
				n1=i;
				return i;
			}
			else 
			{
				n2=i;
				return i;
			}
		}
		else
		{
			i=n1+n2;
			n1=n2;
			n2=i;
			return i;
		}
	}
}
public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntSequence seq=new FibonacciSequence();
		for(int i=0;i<20;i++)
		{
			if(seq.hasNext()==false) break;
			System.out.print(seq.next()+" ");
		}
		System.out.println(" ");
	}

}
