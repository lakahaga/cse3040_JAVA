package cse3040_Ex20;

import java.util.HashMap;
import java.util.Scanner;

public class Ex20_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map= new HashMap<>();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		//뒤에서 1234로 바꿔줘서 1111 넣으면  password does not match
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter id and password.");
			System.out.println("id : ");
			String id = s.nextLine().trim();
			System.out.print("password : ");
			String password= s.nextLine().trim();
			System.out.println();
			if(!map.containsKey(id)) {
				System.out.println("id does not exist.");
				continue;
			} else {
				if(!(map.get(id)).equals(password)) {
					System.out.println("password does not match.");
					break;
					}
				}
		}
		s.close();
	}

}
