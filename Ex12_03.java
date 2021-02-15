package cse3040_Ex12;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Writing to a File 
public class Ex12_03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str = "Hello, my name is Harry Potter.\nI am a student in the Java Languqage class.\n"
				+ "I am trying to write this text to a file.\nThank you.\n";
		System.out.print(str);
		
		FileOutputStream output = new FileOutputStream("src/cse3040_Ex12/myfile1.txt"); 
		byte[] bytes = str.getBytes();
		output.write(bytes);
		output.close();
		
		FileWriter fw = new FileWriter("src/cse3040_Ex12/myfile2.txt"); 
		fw.write(str);
		fw.close(); 
		// no need to change string into byte array 
		
		PrintWriter pw = new PrintWriter("src/cse3040_Ex12/myfile3.txt"); 
		pw.print(str);
		pw.close();
		
	}

}
