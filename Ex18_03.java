package cse3040_Ex18;

import java.util.ArrayList;
import java.util.Collections;

//Implementing interface Comparable 
class Employee implements Comparable<Employee>{
	private String name;
	private int salary;
	public Employee(String name, int salary) {this.name=name; this.salary=salary;}
	public String getName() {return this.name;}
	public int getSalary() {return this.salary;}
	
	public String toString() {return this.name+ " "+this.salary;}
	public int compareTo(Employee e) {
		if(this.salary< e.getSalary()) return 1;
		else if (this.salary>e.getSalary()) return -1;
		else
			return this.name.compareTo(e.getName());
		
		
	}
}
public class Ex18_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee("Peter",50000));
		emplist.add(new Employee("John",100000));
		emplist.add(new Employee("Robert",100000));
		
		System.out.println(emplist);
		Collections.sort(emplist);
		System.out.println(emplist);
	}

}
