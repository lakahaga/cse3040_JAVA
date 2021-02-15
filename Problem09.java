package cse3040_HW2;

class Point 
{
	private double[] point;
	public Point(double[] arr) {this.point=arr;}
	public int getLength()
	{
		return point.length;
	}
	public double getComponent(int i)
	{
		return point[i];
	}
}
class EuclideanDistance
{
	private static double dist=0;
	static double getDist(Point p1, Point p2)
	{
		if(p1.getLength()!=p2.getLength())
			return -1;
		for(int i=0;i<p1.getLength();i++)
		{
			dist+=Math.pow(p1.getComponent(i)-p2.getComponent(i),2);
		}
		dist=Math.sqrt(dist);
		return dist;
		
	}
}
class ManhattanDistance
{
	private static double dist=0;
	static double getDist(Point p1, Point p2)
	{
		if(p1.getLength()!=p2.getLength())
			return -1;
		for(int i=0;i<p1.getLength();i++)
		{
			dist+=Math.abs(p1.getComponent(i)-p2.getComponent(i));
		}
		return dist;
	}
}
public class Problem09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(new double[] {1.0,2.0,3.0});
		Point p2 = new Point(new double[] {4.0,5.0,6.0});
		System.out.println("Euclidean Distance: " + EuclideanDistance.getDist(p1,p2));
		System.out.println("Manhattan Distance: "+ManhattanDistance.getDist(p1, p2));
		Point p3 = new Point(new double[] {1.0,2.0,3.0});
		Point p4 = new Point(new double[] {4.0,5.0});
		System.out.println("Euclidean Distance: " + EuclideanDistance.getDist(p3,p4));
		System.out.println("Manhattan Distance: "+ManhattanDistance.getDist(p3, p4));
		
	}

}
