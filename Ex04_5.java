package cse3040_Ex04;

public class Ex04_5 {
//String Operations 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "JavaJAVA";
		int n=s.length();
		System.out.println("length of String s: "+n+'\n');
		
		for(int i=1; i<=n ; i++)
			System.out.println(s.substring(0,i));
		//Ja - Jav ,,,,
		System.out.println();
		System.out.println(s.substring(2,4));//vaJ
		System.out.println(s.substring(2));//v 
		//마지막 index 지정 안 하면 끝까지 감 
	}

}
