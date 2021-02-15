package cse3040_mp2_18;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;




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
	private static ArrayList<BookInfo> BookList= new ArrayList<>();
	public static ArrayList<BookInfo> readBooksJsoup(String url){
			Document doc=null;
			try {
				doc=Jsoup.connect(url).get();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
			Elements booktitles= doc.select("h3.product-info-title");
			Elements titles=booktitles.select("a[title]");
			Elements bookauthors=doc.select("div[class=\"product-shelf-author contributors\"]");
			Elements authors=bookauthors.select("a[href]:eq(0)");
			
			Elements bookprices= doc.select("span.current");
			Elements prices=bookprices.select("a[href]");
			
			String title="";
			String author="";
			String price="";
			int rank=1;
			
			for(rank=1;rank<=titles.size();rank++)
			{
				title=titles.eq(rank-1).text();
				author=authors.eq(rank-1).text();
				price=prices.eq(rank-1).text();
				BookInfo temp= new BookInfo(title,author,price,rank);
				BookList.add(temp);
			}
			
		return BookList;
	}
}
public class Problem20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BookInfo> books;
		books = BookReader.readBooksJsoup("https://www.barnesandnoble.com/b/books/_/N-1fZ29Z8q8");
		Collections.sort(books);
		for(int i=0; i<books.size(); i++) {
		BookInfo book = books.get(i);
		System.out.println(book);
		}
	}
}