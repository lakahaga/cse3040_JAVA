package cse3040_Ex11;
class Employee {
	private String name;
	private int salary;
	public Employee()
	{
		name="NoName";
		salary=50000;
	}
	public String getName() {return this.name;}
	public int getSalary() {return this.salary;}
	public void setName(String arg)
	{
		this.name=arg;
	}
}
class Manager extends Employee {
	private int bonus;
	public void setBonus(int bonus) {this.bonus = bonus;}
	public int getSalary() {return super.getSalary()+this.bonus;}
	public Manager()
	{
		super.setName("NoName(Manager)");
		bonus=10000;
	}
	
}
public class CreateSubclass {
	public static void main(String[] args) {
		Manager m= new Manager();
		System.out.println(m.getName());
		Employee empl=new Employee();
		System.out.println(empl);
	}
}
