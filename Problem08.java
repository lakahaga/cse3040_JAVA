package cse3040_HW2;
class Shape
{
	private double area;
	public Shape(double s)
	{
		this.area =s;
	}
	public double getArea() { return this.area;}
	
}
class Circle extends Shape
{
	private double circleA;
	public Circle(double r)
	{
		super(r);
		this.circleA=Math.PI*r*r;
	}
	public double getArea() {return this.circleA;}
	
}
class Square extends Shape
{
	private double squareA;
	public Square(double s)
	{
		super(s);
		this.squareA=s*s;
	}
	public double getArea() {return this.squareA;}
}
class Rectangle extends Shape
{
	private double rectangleA;
	public Rectangle(double s1,double s2)
	{
		super(s1);
		this.rectangleA=s1*s2;
	}
	public double getArea() {return this.rectangleA;}
}


public class Problem08 {
	private static double sum;
	private static int i;
	public static double sumArea(Shape[] arr)
	{
		for(i=0;i<arr.length;i++)
			sum+=arr[i].getArea();
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] arr = { new Circle(5.0), new Square(4.0),
				new Rectangle(3.0, 4.0), new Square(5.0)};
		System.out.println("Total area of the shapes is: " + sumArea(arr));
		
	}

}






