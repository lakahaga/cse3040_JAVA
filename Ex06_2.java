package cse3040_Ex06;

public class Ex06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];//둘의 차이는?
		int b[]=new int[10];
		int i;
		for(i=0;i<5;i++)
		{
			a[i]=(i+1)*10+1;
			b[i]=(i+1)*100+5;
		}
		for(i=0;i<15;i++)
			System.out.println(a[i]+" "+b[i]);
	}

}
