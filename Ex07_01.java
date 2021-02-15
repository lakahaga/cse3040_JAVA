package cse3040_Ex07;

class Employee1
{
	private String name;
	public Employee1()
	{
		this.name="anonymous";
	}
	public Employee1(String name)
	{
		this.name=name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
}
public class Ex07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1= new Employee1("Henry");
		Employee1 e2= new Employee1();
		System.out.println(e1.getName());
		System.out.println(e2.getName());
		e2.setName(e1.getName()+" Cavill");
		System.out.println(e2.getName());
	}

}
