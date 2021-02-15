package cse3040_mp2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Element implements Comparable<Element>
{
	private String name;
	private double price;
	public Element (String name, double price) {
		this.name=name;
		this.price=price;
	}
	public String getName() {return this.name;}
	public double getPrice() {return this.price;}
	public int compareTo(Element e) {
		if(this.price< e.getPrice())
			return -1;
		else if (this.price== e.getPrice()) {
			if(this.name.charAt(0)<e.getName().charAt(0))
			{
				return -1;
			}
			else {return 1;}
		}
		else return 1;
	}
	public String toString() {return name+" "+price+"";}
}

class ElementReader
{
	private static BufferedReader br;
	private static ArrayList<Element> list = new ArrayList<Element>();
	public static ArrayList<Element> readElements(String str)
	{
		try {
		br=new BufferedReader (new FileReader(str));
		} catch(FileNotFoundException e)
		{
			return null;
		}
		try {
			while(true)
			{
				String line = br.readLine();
				if(line==null) break;
				String[] info=line.split(" ");
				double price;
				price=Double.parseDouble(info[1]);
				Element tmp=new Element(info[0],price);
				list.add(tmp);
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
		return list;
	}
}
public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Element> list = ElementReader.readElements("input.txt");
	if(list==null) {
		System.out.println("Input file not found");
		return;
	}
	Collections.sort(list);
	Iterator<Element> it= list.iterator();
	while(it.hasNext()) System.out.println(it.next());
	}

}
