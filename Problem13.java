package cse3040_mp1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Text{
	public Text() {} 
	private BufferedReader br;
	private String text="";
	public boolean readTextFromFile(String fileName){
		
		try{
			br=new BufferedReader(new FileReader(fileName));
		} catch(FileNotFoundException e)
		{
			System.out.println("Input file not found.");
			return false;
		}
		try {
			while(true)
			{
				text+=br.readLine();
				if(br.readLine()==null) break;
			}
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try{
				br.close();
			}catch(IOException e) { e.printStackTrace();}
		}
		return true;
	}
	public int countChar(char letter)
	{
		int cnt=0;
		char temp;
		for(int i=0;i<text.length();i++)
		{
			temp=Character.toLowerCase(text.charAt(i));
			if(temp==letter) {cnt++;}
		}
		return cnt;
	}
}
public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Text t = new Text(); 
		if(t.readTextFromFile("input_prob13.txt")) {
			for(char c = 'a'; c <= 'z'; c++) {
			System.out.println(c + ": " + t.countChar(c)); 
			}
		}
	}

}
