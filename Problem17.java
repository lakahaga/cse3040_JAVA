package cse3040_mp2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

class myMap<T ,V> extends TreeMap<String,Double>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private T name;
	private V price;
	public void setName(T str) { this.name=str;}
	public void setPrice(V n) {this.price = n;}
	public T getName() { return this.name;}
	public V getPrice() { return this.price;}
	public String toString() {
		Iterator<Map.Entry<String,Double>> i =  entrySet().iterator();
		
		String sb="";
		if(!i.hasNext()) {return "";}
		for(;;) {
			Entry<String,Double> e= i.next();
			String key= e.getKey();
			Double value= e.getValue();
			sb+=key+ ' '+value+'\n';
			if(!i.hasNext()) {break;}
		}
		
		return sb;
	}
}

class MapManager
{
	private static BufferedReader br;
	private static TreeMap<String,Double> map=new myMap<String, Double>();
	public static Map<String,Double> readData(String str){
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
				map.put(info[0], price);
				
			}
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
			br.close();
		}catch (IOException e)
		{
			e.printStackTrace();
		}}
		return map;
	}
}
public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Double> map = MapManager.readData("input.txt");
		if(map == null) {
			System.out.println("Input file not found.");
			return;
		}
		System.out.println(map);
	}
	
}

