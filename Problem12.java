package cse3040_mp1;
class SubsequenceChecker {
	public static void check(String sequence, String sub)
	{
		boolean flag=false;
		int j=0;
		int[] indexes= new int[sub.length()];
		for(int i=0;i<sub.length();i++)
		{
			while(j<sequence.length())
			{
				if(sub.charAt(i)==sequence.charAt(j))
				{
					indexes[i]=j;
					break;
				}
				j++;
			}
		}
		if(indexes[sub.length()-1]!=0) {flag=true;}
		else {flag=false;}
		if(flag) {
			System.out.println(sub+" is a subsequence of "+sequence);
			for(int m=0;m<indexes.length;m++)
			{
				System.out.print(indexes[m]+" ");
			}
			System.out.println();
		}
		else { System.out.println(sub+" is not a subsequence of "+sequence);}
	}
}
public class Problem12 {
	public static void main(String[] args) {
		SubsequenceChecker.check("pneumonoultramicroscopicsilicovolcanoconiosis", "miccis");
		SubsequenceChecker.check("pneumonoultramicroscopicsilicovolcanoconiosis", "xmiccis");
	}
}
