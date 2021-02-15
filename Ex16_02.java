package cse3040_Ex16;

import java.util.ArrayList;
import java.util.List;

public class Ex16_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LIMIT = 10;
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		
		List<String> list = new ArrayList<String>(length/LIMIT +10);
		
		for(int i=0; i<length ; i+=LIMIT)
		{
			if(i+LIMIT < length) list.add(source.substring(i,i+LIMIT)); //10개보다 더 남았으 그냥 10개씩 자른
			else list.add(source.substring(i));//10보다 적게 남았으면 남은거 다~
		}
		
		for(int i=0; i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
