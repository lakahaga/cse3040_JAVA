package cse3040_Ex17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArryaList VS LinkedLIst : add & remove

public class Ex17_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList <>(2000000);
		LinkedList<String> ll= new LinkedList<>();
		
		System.out.println("=== sequentail add ===");
		System.out.println("ArrayList : "+add1(al));
		System.out.println("Linkedlist: "+add1(ll));
		System.out.println();
		
		System.out.println("=== non-sequentail add ===");
		System.out.println("ArrayList : "+add2(al));
		System.out.println("Linkedlist: "+add2(ll));
		System.out.println();
		
		System.out.println("=== sequential delete ===");
		System.out.println("ArrayList : "+remove1(al));
		System.out.println("Linkedlist: "+remove1(ll));
		System.out.println();
		/*
		System.out.println("=== non-sequentail delete ===");
		System.out.println("ArrayList : "+remove2(al));
		System.out.println("Linkedlist: "+remove2(ll));
		System.out.println();*/
	}
	public static long add1(List<String> list)
	{
		long start = System.currentTimeMillis();
		for(int i=0;i<1000000; i++) list.add(i+"");
		long end =  System.currentTimeMillis();
		return end - start;
	}
	public static long add2(List<String> list)
	{
		long start =System.currentTimeMillis();
		for (int i=0; i<100000;i++) list.add(500,"X");
		long end = System.currentTimeMillis();
		return end-start;
	}
	public static long remove1( List<String> list)
	{
		long start = System.currentTimeMillis();
		for(int i= list.size()-1;i>=0;i--) list.remove(i);
		long end =System.currentTimeMillis();
		return end- start;
	}
	public static long remove2( List<String> list)
	{
		long start = System.currentTimeMillis();
		for(int i=0; i<100000;i++) list.remove(i);
		long end =System.currentTimeMillis();
		return end- start;
	}

}
