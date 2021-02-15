package cse3040_Ex08;
class Employee
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
public class Ex08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Employees[]=new Employee[5];
		Employees[0]=new Employee("Kim");
		Employees[1]=new Employee("Lee");
		Employees[2]=new Employee("Park");
		Employees[3]=new Employee("Choi");
		Employees[4]=new Employee("Chung");
		System.out.println(Employees[0].getName());
		System.out.println(Employees[1].getName());
		System.out.println(Employees[2].getName());
		System.out.println(Employees[3].getName());
		System.out.println(Employees[4].getName());
	}

}
