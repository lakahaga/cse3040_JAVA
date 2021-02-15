package cse3040_mp2_18;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class myMap<T,V> extends LinkedHashMap<String, Double> {
	
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
	private static LinkedHashMap<String,Double> map=new myMap<String,Double>();
	private static LinkedHashMap<String,Double> tmpMap=new myMap<String,Double>();
	@SuppressWarnings("unchecked")
	static class ValueComparator<K> implements Comparator <K>{
		public int compare(Object o1, Object o2) {
			if( o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				 Map.Entry<String, Double > e1 =(Map.Entry<String, Double>) o1;
				 Map.Entry<String, Double > e2 =(Map.Entry<String, Double>) o2;
				 double v1 =e1.getValue().doubleValue();
				 double v2= e2.getValue().doubleValue();
				 if(v1==v2)
				 {
					 String k1=e1.getKey().toString();
					 String k2=e2.getKey().toString();
					 if(k1.charAt(0)<k2.charAt(0))
						 return -1;
					 else
						 return 1;
				 }
				return (int)(v1-v2);
			}
			return -1;
		}
			
	}
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
				tmpMap.put(info[0], price);
			}
			Set<Map.Entry<String,Double>> set= tmpMap.entrySet();
			List<Map.Entry<String,Double>> list= new ArrayList<>(set);
			Collections.sort(list,new ValueComparator<Map.Entry<String,Double>>());
			for(Entry<String, Double> tmp:list) {
				map.put(tmp.getKey(),tmp.getValue());
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
public class Problem18 {

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
