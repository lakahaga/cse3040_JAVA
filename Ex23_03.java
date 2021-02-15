package cse3040_Ex23;

public class Ex23_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime =System.currentTimeMillis();
		
		for(int i=0;i<300;i++) {
			System.out.printf("%s", new String("-"));
		}
		
		System.out.print("elapsed time : "+(System.currentTimeMillis() - startTime));
		
		for(int i=0;i<300;i++) {
			System.out.printf("%s", new String("|"));
		}
		
		System.out.println("elapssed time: "+ (System.currentTimeMillis()- startTime));
	}

}
