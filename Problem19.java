package cse3040_mp2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;


class BookInfo implements Comparable<BookInfo>{
	private String title;
	private String authors;
	private String price;
	private int rank;
	public BookInfo(String title, String authors, String price, int rank) {
		this.title=title;
		this.authors=authors;
		this.price=price;
		this.rank=rank;
	}
	public String getTitle() { return this.title;}
	public String getAuthors() {return this.authors;}
	public String getPrice() {return this.price;}
	public int getRank() {return this.rank;}
	public int compareTo(BookInfo book1) {
		int r1=book1.getRank();
		if(this.rank>r1)
			return -1;
		else 
			return 1;
		
	}
	public String toString() {return "#"+getRank()+" "+getTitle()+", "+getAuthors()+", "+getPrice(); }
	
	
	
}
class BookReader{
	private static ArrayList<String> lines = new ArrayList<>();
	private static ArrayList<BookInfo> BookList= new ArrayList<>();
	public static ArrayList<BookInfo> readBooks(String url)
	{
		URL UUU= null;
		BufferedReader input =null;
		String line;

		
		try {
			UUU= new URL(url);
			input= new BufferedReader(new InputStreamReader(UUU.openStream()));
			while((line=input.readLine())!=null) {
				if(line.trim().length()>0) 
					{
						lines.add(line);
					}
			}
			input.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		int rank=1;
		int status=0;
		String title="";
		String price="";
		String author="";
		
		for(int i=0;i<lines.size();i++) {
			String l =lines.get(i);
			
			if(status==0) {
				if(l.contains("div class=\"col-lg-9 product-info-listView\"")) {
				          status=1;
				}
			}
			else if(status==1) {
				if(l.contains("product-shelf-title pr-m")) {status=2;}
			}
			else if(status==2) {
				if(l.contains("product-shelf-author contributors\"")) { 
					status=3;
					int begin = l.indexOf("by <a href=");
					while(l.charAt(begin)!='>') {
						begin++;}
					begin++;
					int end = l.indexOf("</a>");
					author=l.substring(begin,end);
					
				}
				else if(l.contains(" href=")) {
					int begin = l.indexOf(" href=");
					while(l.charAt(begin)!='>')
						begin++;
					begin++;
					int end = l.indexOf("</a>");
					title=l.substring(begin,end);
					
				}
				
			}
			else if(status==3)
			{
				if(l.contains(">by <a href=\"")) {
					
				}
				else if(l.contains("<span class=\"current\">")) {status=4;}
			}
			else if(status==4) {
				if(l.contains(" href=")) {
					int begin = l.indexOf(" href=");
					while(l.charAt(begin)!='>')
						begin++;
					begin++;
					int end = l.indexOf("</a>");
					price=l.substring(begin,end);
					
					BookInfo tmp= new BookInfo(title,author,price,rank);
					rank++;
					BookList.add(tmp);
					status=0;
				}
				
			}
			
		}
		
		
		return BookList;
	}
}
	
public class Problem19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BookInfo> books;
		books = BookReader.readBooks("https://www.barnesandnoble.com/b/books/_/N-1fZ29Z8q8");
		Collections.sort(books);
		for(int i=0; i<books.size(); i++) {
		BookInfo book = books.get(i);
		System.out.println(book);
		}
	}
}
