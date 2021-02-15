import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text =in.nextLine();
		System.out.print("Enter a letter: ");
		String target=in.nextLine();
		while(target.length()>1||target.length()<1)
		{
			System.out.println("You must enter a single letter.");
			System.out.print("Enter a letter: ");
			target=in.nextLine();
		}
		char target_letter=target.charAt(0);
		int count=0;
		for(int i=0;i<text.length();i++)
		{
			char letter=text.charAt(i);
			if(letter==target_letter)
				count++;
		}
		String message = String.format("There are %d %c's in the text.",count,target_letter);
		System.out.println(message);
		in.close();
	}
}
