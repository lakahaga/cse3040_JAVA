package cse3040_Ex14;
//Defining and Using a Generic Class
//Modify the following code to use a generic class Box instead of BoxA, BoxB, BoxC.
//Additionally try the following and see what happens 
	//Write a constructor for the generic class
	//Try creating an instance of type T inside the class definition 
	//Try creating an array of generic class

class A {public String toString() {return "Class A Object";}}
class B {public String toString() {return "Class B Object";}}
class C {public String toString() {return "Class C Object";}}

class BoxA{
	A item;
	void setItem(A item) {this.item = item;}
	A getItem() {return item;}
}
class BoxB{
	B item;
	void setItem(B item) {this.item = item;}
	B getItem() {return item;}
}
class BoxC{
	C item;
	void setItem(C item) {this.item = item;}
	C getItem() {return item;}
}
class Box<T>{
	T item;
	void setItem(T item){this.item=item;}
	T getItem() {return item;}
}


public class Ex14_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxA boxa = new BoxA(); 
		boxa.setItem(new A()); 
		BoxB boxb = new BoxB(); 
		boxb.setItem(new B()); 
		BoxC boxc = new BoxC(); 
		boxc.setItem(new C());
		
		System.out.println(boxa.getItem()); 
		System.out.println(boxb.getItem()); 
		System.out.println(boxc.getItem());
		
		//Generic class ver.
		Box<A> boxA = new Box<A>();
		boxA.setItem(new A());
		Box<B> boxB = new Box<B>();
		boxB.setItem(new B());
		Box<C> boxC = new Box<C>();
		boxC.setItem(new C());
		
		System.out.println(boxA.getItem());
		System.out.println(boxB.getItem());
		System.out.println(boxC.getItem());
	}

}
