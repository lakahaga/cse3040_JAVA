package cse3040_Ex19;

import java.util.TreeSet;

public class Ex19_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<>();
		String from ="b";
		String to ="d";
		set.add("abc");set.add("alien");set.add("bat");set.add("car");set.add("Car");
		set.add("disc");set.add("dance");set.add("dZZZZ");set.add("dzzzz");
		set.add("elephant");set.add("elevator");set.add("fan");set.add("flower");
		System.out.println(set);
		System.out.println("range serach : from "+from+" to "+to);
		System.out.println("result1: " +set.subSet(from, to));
		System.out.println("result2: " +set.subSet(from, to+"zzz"));
		
	}

}
