package cse3040_Ex10;
//Default method Interface Methods
interface Person
{
	String getName();
	default int getId() {return 0;}
}
interface Identified {
	//default int getId() {return 1;}
}
class Employee implements Person, Identified
{
	private String name;
	public Employee(String name) 
	{ 
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
}
public class Ex10_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee m =new Employee("Peter");
		System.out.println(m.getId());
	}

}
