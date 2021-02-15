package cse3040_Ex06;

public class Ex06_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7,9};
		int b[]=new int[a.length];
		int i;
		b=a;
		for(i=0;i<a.length;i++)
			System.out.println(a[i]+" "+b[i]);
	}

}
