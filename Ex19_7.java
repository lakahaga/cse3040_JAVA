package cse3040_Ex19;

import java.util.HashSet;
import java.util.Iterator;

public class Ex19_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> setA= new HashSet<>();
		HashSet<String> setB= new HashSet<>();
		HashSet<String> setHab= new HashSet<>();
		HashSet<String> setKyo= new HashSet<>();
		HashSet<String> setCha= new HashSet<>();
		
		setA.add("1");setA.add("2");setA.add("3");setA.add("4");setA.add("5");
		System.out.println("A = "+setA);
		setB.add("6");setB.add("7");setB.add("8");setB.add("9");setB.add("10");
		System.out.println("B = " +setB);
		
		Iterator<String> it =setB.iterator();
		while(it.hasNext()) {String tmp=it.next(); if(setA.contains(tmp)) setKyo.add(tmp);}
		
		it= setA.iterator();
		while(it.hasNext()) {String tmp=it.next(); if(!setB.contains(tmp)) setCha.add(tmp);}
		
		it=setA.iterator();
		while(it.hasNext()) setHab.add(it.next());
		it=setB.iterator();
		while(it.hasNext()) setHab.add(it.next());
		
		System.out.println( "A n B = "+setKyo);
		System.out.println("A U B = "+setHab);
		System.out.println("A - B = " +setCha);
		
	}
		
		
}


