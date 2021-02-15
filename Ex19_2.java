package cse3040_Ex19;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ex19_2 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		for(;set.size()<6;) {
			int num=(int) (Math.random()*45) +1;
			set.add(Integer.valueOf(num));
		}
		List<Integer> list= new LinkedList<> (set);
		
		System.out.println(list);
		treeset("");
	}
	public static void treeset(String string)
	{
		Set<Integer> tset = new TreeSet<>();
		for(;tset.size()<6;) {
			int num=(int)(Math.random()*45) +1;
			tset.add(Integer.valueOf(num));
		}
		System.out.println(tset);
	}
