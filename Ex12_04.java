package cse3040_Ex12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ex12_04 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		byte[] b =new byte[100];
		FileInputStream input = new FileInputStream ("src/cse3040_Ex12/out.txt");
		//input.read(b);
		//System.out.print(new String(b));
		//input.close();
		//100 byte 넘어가서 읽히다 만다 
		//다 읽으려면?
		//while (input.read(b)!=-1)
		//{
		//	System.out.print(new String(b));
		//}
		//input.close();
		//이러면 이상한 게 나와 
		//why? 남는 공간에 전에 읽었던 100byte 가 남아있음 
		//how to solve?
		while(true)
		{
			int rv= input.read(b);
			//rv = how many bytes read?
			if(rv==-1) break;
			System.out.print(new String(b).substring(0,rv));
			//not using whole byte array, use as many as read
		}
		input.close();
		
		BufferedReader br = new BufferedReader(new FileReader("src/cse3040_Ex12/out.txt"));
		while(true)
		{
			String line =br.readLine();
			if(line==null) break;
			System.out.println(line);
		}
		br.close();
	}

}
