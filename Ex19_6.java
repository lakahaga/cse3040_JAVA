package cse3040_Ex19;

import java.util.TreeSet;

public class Ex19_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>();
		int[] score= {80,95,50,35,45,65,10,100};
		for(int i=0; i<score.length;i++) set.add(Integer.valueOf(score[i]));
		
		System.out.println("less than 50 : "+set.headSet(Integer.valueOf(50)));
		System.out.println("greater than or equal to 50 : " +set.tailSet(Integer.valueOf(50)));
		
	}

}
