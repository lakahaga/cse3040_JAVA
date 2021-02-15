package cse3040_Ex12;

class Employee{
	private String name;
	protected int salary;
	public Employee(String name, int salary) { this.name=name; this.salary=salary;}
	public String getName() {return this.name;}
	public int getSalary() {return this.salary;}
	//overriding
	public boolean equals(Object otherObject)
	{
		if(this==otherObject) return true;
		if(otherObject ==null) return false;
		if(getClass()!=otherObject.getClass()) return false;
		Employee other= (Employee) otherObject;
		//return (this.name== other.name && this.salary==other.salary);
		//new String으로 만들어도 내용이 같으면 true를 return 하기 위해 
		return (this.name.equals(other.name)&& this.salary == other.salary);
		//this is right way to write equals 
		//override hashCode
	}
	public int hashCode() {// no argument because this is instance method 
		//return same hashCode if two objects have same contents(name, salary)
		return this.name.hashCode()+salary;//그냥 이렇게 만들어볼게요 
	}
}
public class Ex12_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee e1 = new Employee("John",50000);
		//Employee e2 = new Employee("John",50000);
		//result= false for both
		//왜냐면 같은 object이어야 true를 return 
		//so, we override equals 
		Employee e1 = new Employee(new String("John"),50000);
		Employee e2= new Employee( new String("John"),50000);
		//이렇게 해도 false for both, this is not what we want 
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		//hash code
		System.out.println(e1.hashCode() + " "+e2.hashCode());
		//they have different hashCode because they are different object 
		//hashCode 같게 해주려면? 
		//overriding 
	
		
		
	}

}
