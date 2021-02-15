package cse3040_mp1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



class ItemReader
{
	
	static boolean fileToBox (String fileName, FruitBox<Fruit> box) {
		BufferedReader br;
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
				String line = br.readLine();
				if(line==null) break;
				String[] info=line.split(" ");
				double price;
				price=Double.parseDouble(info[1]);
				box.add(new Fruit(info[0],price));
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
		
}
class Fruit 
{
	private String name;
	private double price;
	public Fruit (String name, double price) { this.name= name; this.price=price;}
	public String getName() { return this.name;}
	public double getPrice() { return this.price;}
	
}
	
class FruitBox<T extends Fruit> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item); 
		System.out.println(item.getName()+" "+item.getPrice());}
	T get(int i) {return list.get(i);}
	int getNumItems() {return list.size();}
	String getName(int i) { T tmp=get(i); return tmp.getName();}
	double getPrice(int i) { T tmp=get(i); return tmp.getPrice();}
	T getMax() {
		int maxIndex=0;
		int tmpIndex=0;
		while(tmpIndex< getNumItems())
		{
			if(getPrice(maxIndex)<=getPrice(tmpIndex))
				maxIndex=tmpIndex;
			tmpIndex++;
		}
		return get(maxIndex);
		
	}
	String getMaxItem()
	{
		T tmp = getMax();
		return tmp.getName();
	}
	double getMaxPrice()
	{
		T tmp = getMax();
		return tmp.getPrice();
	}
	T getMin() {
		int minIndex=0;
		int tmpIndex=0;
		while(tmpIndex< getNumItems())
		{
			if(getPrice(minIndex)>=getPrice(tmpIndex))
				minIndex=tmpIndex;
			tmpIndex++;
		}
		return get(minIndex);
	}
	String getMinItem()
	{
		T tmp = getMin();
		return tmp.getName();
	}
	double getMinPrice()
	{
		T tmp = getMin();
		return tmp.getPrice();
	}
	double getAvgPrice()
	{
		double sum=0;
		for( int f=0;f<getNumItems();f++)
		{
			sum+=getPrice(f);
		}
		double avg=sum/getNumItems();
		return avg;
	}
}


public class Problem14 {
	public static void main(String[] args) {
		FruitBox<Fruit> box = new FruitBox<>();
		boolean rv = ItemReader.fileToBox("input_prob14.txt", box);
		if(rv == false) return;
		box.add(new Fruit("orange", 9.99)); 
		System.out.println("----------------");
		System.out.println("    Summary");
		System.out.println("----------------");
		System.out.println("number of items: " + box.getNumItems()); 
		System.out.println("most expensive item: " + box.getMaxItem() + " (" + box.getMaxPrice() + ")");
		System.out.println("cheapest item: " + box.getMinItem() + " (" + box.getMinPrice() + ")");
		System.out.printf("average price of items: %.2f", box.getAvgPrice());
		}
}
