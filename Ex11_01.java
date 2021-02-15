package cse3040_Ex11;
class Employee {
	private String name;
	private int salary;
	public Employee()
	{
		name="NoName";
		salary=50000;
	}
	public void setName(String name) {this.name=name;}
	public String getName() {return this.name;}
	public int getSalary() {return this.salary;}
}
class Manager extends Employee{
	private int bonus;
	public void setBonus(int bonus) {this.bonus=bonus;}
	public int getSalary() {return super.getSalary()+this.bonus;}
	public Manager()
	{
		super.
	}
	
}
public class Ex11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m= new Manager();
		System.out.println(m.getName());
		System.out.println(m.getSalary());
	}

}
