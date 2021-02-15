package cse3040_Ex19;

import java.util.HashSet;

class Person{
	private String name;
	private int age;
	Person(String name, int age) {this.name=name; this.age=age;}
	public String toString() {return name + ":"+age;}
	public String getName() { return this.name;}
	public int getAge() {return this.age;}
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person temp=(Person)obj;
			return name.equals(temp.name) && age==temp.age;
		}
		return false;
	}
	public int hashCode() {return (name+(age+"")).hashCode();}
}
public class Ex19_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("David" ,10));
		set.add(new Person("David" ,10));
		System.out.println(set);
	}

}
