package ces3040_Ex05;

public class Ex05_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=(int)(100*Math.random())+1;//+1 주의
		int r=n%5;
		System.out.println("n :"+n);
		System.out.println("n % 5: "+r);
		switch(r)
		{
		case	0:System.out.println("remainder is zero"); break;
		case 	1:System.out.println("remainder is one"); break;
		case	2: System.out.println("remainder is two"); break;
		default : System.out.println("remainder is three or four");

		}
	}

}
