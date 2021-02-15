package cse3040_Ex19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex19_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new LinkedHashSet<>();
		int [][] board = new int[5][5];
		for(;set.size()<25;) {
			set.add((int)(Math.random()*50)+1+"");
		}
		Iterator<String> it =set.iterator();
		for(int i=0;i<board.length;i++) {
			for(int j=0; j<board[i].length;j++) {
				board[i][j]=Integer.parseInt(it.next());
				System.out.print((board[i][j]<10 ? "  " : " ")+board[i][j]);//alignment 
				
			}
			System.out.println();
		}
		System.out.println("hash set : ");
		hashbrown();
	}
	//For a HashSe,t elements are maintained according to Java's own way.
	//For a LinkedHashSet, elements are maintained in the order of insertion.
	public static void hashbrown() {
		Set <String> hset = new HashSet<>();
		int[][] board = new int[5][5];
		for(;hset.size()<25;) {
			hset.add((int)(Math.random()*50)+1+"");
		}
		Iterator<String> it =hset.iterator();
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j]=Integer.parseInt(it.next());
				System.out.print((board[i][j] <10 ? "  ":" ")+board[i][j]);
			}
			System.out.println();
		}
		
	}

}
