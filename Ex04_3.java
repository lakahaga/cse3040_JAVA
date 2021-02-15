package cse3040_Ex04;

public class Ex04_3 {
//Operator Precedence and Associativity 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1, y=2, z;
		z=x+y*2-++x+(y+=3);//z=8
		
		System.out.println("x: "+x+ " y: "+y+" z: "+z);
		System.out.println("x / y * z : "+(x/y*z));//4
		System.out.println("x = y += z: "+(x=y+=z));//10
	}

}
