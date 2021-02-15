package cse3040_Ex07;

class Employee2
{
	private String name;
	private int salary;
	public Employee2()
	{
		this.name="Employee";
		this.salary=50000;
	}
	public Employee2(String name)
	{
		this.name=name;
		this.salary=50000;
	}
	public Employee2(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public String getName()
	{
		return this.name;
	}
	public int getSalary()
	{
		return this.salary;
	}
}
public class Ex07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e1=new Employee2("John", 100000);
		Employee2 e2= new Employee2("Peter");
		Employee2 e3= new Employee2();
		System.out.println("Salary of  "+e1.getName()+" is "+e1.getSalary());
		System.out.println("Salary of  "+e2.getName()+" is "+e2.getSalary());
		System.out.println("Salary of  "+e3.getName()+" is "+e3.getSalary());
		e1.setSalary(150000);
		System.out.println("Salary of  "+e1.getName()+" is "+e1.getSalary());
		
	}

}
