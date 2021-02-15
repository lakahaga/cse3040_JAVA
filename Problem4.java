import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text =in.nextLine();
		System.out.print("Enter a string: ");
		String target=in.nextLine();
		while(target.length()<1)
		{
			System.out.println("You must enter a string");
			System.out.print("Enter a string: ");
			target=in.nextLine();
		}
		int x=target.length();
		int count=0, flag=0;
		for(int i=0;i<text.length()-x+1;i++)
		{
			for(int j=0;j<x;j++)
			{
				char comText,comTar;
				comText=text.charAt(i+j);
				comTar=target.charAt(j);
				if(comText!=comTar) 
				{
					flag=1;
					break;
				}
				else flag=0;
			}
			if(flag==0) 
			{
				count++;
			}
			
			flag=0;
		}
		System.out.println("There are "+count+" instances "+target+".");
		in.close();
	}

}
