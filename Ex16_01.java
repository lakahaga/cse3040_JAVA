package cse3040_Ex16;
//Using ArrayList
//Try changing the for loop so that i starts at 0 and ends at list2.size()-1
//What is the problem when you do this? 

import java.util.ArrayList;


public class Ex16_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1= new ArrayList<Integer>(10);
		list1.add(Integer.valueOf(5));
		list1.add(Integer.valueOf(4));
		list1.add(Integer.valueOf(2));
		list1.add(Integer.valueOf(0));
		list1.add(Integer.valueOf(1));
		list1.add(Integer.valueOf(3));
		
		ArrayList<Integer> list2= new ArrayList<Integer> (list1.subList(1, 4));
		print(list1,list2);
		
		System.out.println("list1.containsAll(list2) " + list1.containsAll(list2));
		list2.add(Integer.valueOf(11));
		list2.add(Integer.valueOf(12));
		list2.add(Integer.valueOf(13));
		print(list1,list2);
		
		list2.set(3, Integer.valueOf(21)); //index 3 에 21 넣기 
		print(list1,list2);
		
		System.out.println("list1.retainAll(list2) : "+ list1.retainAll(list2));
		print(list1,list2);
		
		for(int i=list2.size()-1;i>=0;i--)
		{
			if(list1.contains(list2.get(i)))
					list2.remove(i);
		}//list1이랑 겹치는 원소 지우기 
		print(list1,list2);
	}
	static void print(ArrayList<Integer> list1, ArrayList<Integer> list2)
	{
		System.out.println("list1 :"+list1);
		System.out.println("list2 :"+list2);
		System.out.println();
	}

}
