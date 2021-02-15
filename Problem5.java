import java.util.Scanner;

public class Problem5 {
	public static void sort(int[] args)
	{
		int temp;
		for(int i=0;i<args.length;i++)
		{
			for(int j=i;j<args.length;j++)
			{
				if(args[i]<args[j])
				{
					temp=args[i];
					args[i]=args[j];
					args[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter exam scores of each student.");
		int scores[] = new int[5];
		for(int i=0;i<scores.length;i++)
		{
			System.out.print("Score of student "+(i+1)+": ");
			scores[i]=in.nextInt();
		}
		int sortedScores[]=new int[5];
		
		for(int i=0;i<scores.length;i++)
			sortedScores[i]=scores[i];
		sort(sortedScores);
		int first=0,second=0;
		for(int i=0;i<scores.length;i++)
		{
			if(sortedScores[0]==scores[i])
			{
				first=i;
				break;
			}
		}
		for(int i=0;i<scores.length;i++)
		{
			if(sortedScores[1]==scores[i])
			{
				second=i;
				break;
			}
		}
		
		System.out.println("The 1st place is student "+(first+1)+" with "+scores[first]+" points");
		System.out.println("The 2nd place is student "+(second+1)+" with "+scores[second]+" points");
		in.close();
	}
	

}
