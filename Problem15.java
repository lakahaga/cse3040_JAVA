package cse3040_mp1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


class Item {
	private String word;
	private int cnt;
	public Item(String word)
	{
		this.word=word;
		this.cnt=0;
	}
	public String getWord() {return this.word;}
	public void CountUp() { this.cnt++;}
	public String toString() {return this.word+" "+Integer.toString(cnt);}
	public boolean equals(Item e)
	{
		if(this.word.equals(e.getWord())) {return true;}
		else {return false;}
	}
}
class MyFileReader
{
	private static BufferedReader br;
	private static String data="";
	static boolean readDataFromFile(String fileName, ArrayList<Item> list)
	{
		
		try {
			br= new BufferedReader(new FileReader(fileName));
		} catch(FileNotFoundException e)
		{
			return false;
		}
		try {
			while(true)
			{
				String line = br.readLine();
				if(line==null) break;
				data+=line.toLowerCase();
			}
			WordCounter(list);
			
		} catch(IOException e)
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
	public static void WordCounter(ArrayList<Item> list)
	{
		String[] wordList = data.split(" ");
		for(int i=0;i<wordList.length;i++)
		{
			if(wordList[i].equals("")) { continue;}
			Item temp = new Item(wordList[i]);
			for(int j=i;j<wordList.length;j++)
			{
				if(wordList[i].equals(wordList[j])) {temp.CountUp();}
			}
			int flag=0;
			for(Item tmp : list) {
				if(tmp.equals(temp)) {flag=1;}
			}
			if(flag==0)
				list.add(temp);
		}
		
	}
	
}

public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Item> list = new ArrayList<>();
		boolean rv = MyFileReader.readDataFromFile("input_prob15.txt", list); 
		if(rv == false) {
			System.out.println("Input file not found.");
			return; 
		}
		for(Item it: list) System.out.println(it);
	}
}
