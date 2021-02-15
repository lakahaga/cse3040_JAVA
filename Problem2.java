import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer=(int)(100*Math.random())+1;
		int i=1,min=1,max=100;
		Scanner in= new Scanner(System.in);
		while(true)
		{
			System.out.print("["+i+"] Guess a number ("+min+" - "+max+"): ");
			int guessingNum=in.nextInt();
			if(guessingNum>max || guessingNum<min)
			{
				System.out.println("Not in range!");
				continue;
			}
			if(guessingNum==answer)
			{
				System.out.println("Correct! Number of guesses: "+i);
				break;
			}
			else if (guessingNum>answer)
			{
				System.out.println("Too large!");
				max=guessingNum-1;
			}
			else
			{
				System.out.println("Too small!");
				min=guessingNum+1;
			}
			i++;	
		}
		in.close();
		
	}

}
