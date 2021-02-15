package cse3040_Ex18;

//Iterator and ListIterator 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex18_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator<String> itt = list.iterator();
		while(itt.hasNext()) {
			String str= itt.next();
			System.out.println(str);
		}
		ListIterator<String> it = list.listIterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		while(it.hasPrevious()) { System.out.print(it.previous());}
		System.out.println(); 
		
	}

}
