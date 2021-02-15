import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("ASCII code teller. Enter a letter: ");
		String letter = in.nextLine();
		if(letter.length()!=1) 
			{
				System.out.println("You must input a single uppercase or lowercase alphabet.");
				System.exit(0);
			}
		else 
		{
			char target=letter.charAt(0);
			if(target<'A'||(target>'Z'&&target<'a')||target>'z')
			{
				System.out.println("You must input a single uppercase or lowercase alphabet.");
				System.exit(0);
			}
			else 
				System.out.println("The ASCII code of "+target+" is "+(int)target);
		}
		in.close();
	}

}
