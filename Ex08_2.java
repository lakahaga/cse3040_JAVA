package cse3040_Ex08;
class Employee2
{
	private static int lastId=0;
	private int id;
	public Employee2() {id=++lastId;}
	public int getId() {return this.id;}
	//public int getLastId() {return this.lastId;}
	public static int getLastId() {return lastId;}
}
public class Ex08_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 m= new Employee2();
		Employee2 n= new Employee2();
		System.out.println(m.getId());
		System.out.println(n.getId());
		System.out.println(Employee2.getLastId());
		//System.out.println(m.getLastId());
		System.out.println(Employee2.getLastId());
		//System.out.println(m.getLastId());
		//What will be printed on the display when you execute this program? 
		//1 2 2 2
		//static variable 은 static하게 접근해야 함 
		//바꿔도 출력은 같음 
	}

}
