package cse3040_Ex10;
//We can also define a variable inside an interface definition
//That variable automatically become public static final variables
interface Motion
{
	int NORTH=1;
	int EAST=2;
	int SOUTH=3;
	int WEST=4;
	
	void move(int direction);
	int getX();
	int getY();
	
}
class TwoDMotion implements Motion
{
	private int posX, posY;
	
	public TwoDMotion() {posX=0; posY=0;}
	public void move(int direction)
	{
		if(direction==NORTH) posY--;
		else if (direction==SOUTH) posY++;
		else if (direction==EAST) posX++;
		else if (direction==WEST) posX--;
	}
	public int getX() {return posX;}
	public int getY() {return posY;}
}
//Static method 
//interface 안에 있는 static method는 그 interface를 implement하는 class의 instance를 만들어 준다. 이때 static method를 이용한다. 
//A method that creates an instance and returns it is called a factory method 
interface IntSequence
{
	static IntSequence digitsOf(int n)
	{
		return new DigitSequence(n);
	}
	boolean hasNext();
	int next();
}
class DigitSequence implements IntSequence
{
	public DigitSequence 
	
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
