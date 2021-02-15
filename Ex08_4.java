package cse3040_Ex08;
class Employee4
{
	String name;
	public Employee4(String name)
	{
		this.name=name;
	}
}
public class Ex08_4 {
	public static void changeName(Employee4 e, String newName)
	{
		e.name=newName;
	}
	public static void setName(String oldName, String newName)
	{
		oldName=newName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee4 m=new Employee4("Peter");
		System.out.println(m.name);
		setName(m.name,"James");
		System.out.println(m.name);//얘는 걍 변수값을 copy, not reference value 
	
	}

}
