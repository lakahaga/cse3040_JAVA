package cse3040_Ex13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//THe following code produces a run-time error if the file does not exist.
//Handle the exception so that the program does not crash but terminates normally when the input file is not found
//You have to handle each of them respectively
public class Ex13_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try{
			br = new BufferedReader (new FileReader("src/ces3040_Ex13/myFile1.txt"));
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		try {
			while(true)
			{
				String line = br.readLine();
				if(line==null) break;
				System.out.println(line);
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		try {
			br.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}finally {
			System.out.println("The program exited normally");
		}
		
	}

}
