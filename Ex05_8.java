package ces3040_Ex05;

public class Ex05_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		while(true) {
		n=(int)(100*Math.random());
		if (n==0) break;
		else if ((n%10)==0) continue;
		else 
			System.out.println(n);
		}
	}

}
