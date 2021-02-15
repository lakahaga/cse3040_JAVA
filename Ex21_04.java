package cse3040_Ex21;

import java.net.URL;

public class Ex21_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		//URL url = new URL("http://www.google.com");
		//URL url = new URL("http://mickeymouse@www.google.com");
		//URL url = new URL("http://www.youtube.com/results?seach_query=java");
		//URL url = new URL("https://wikitravel.org/en/Main_Page");
		
		URL url = new URL("https://en.wikipedia.org/wiki/Java_(programming_language)#Syntax");
		System.out.println("url.getAuthority() :"+url.getAuthority());
		System.out.println("url.getContent(): "+url.getContent());
		System.out.println("url.getDefaultPort(): "+url.getDefaultPort());
		System.out.println("url.getPort(): "+url.getPort());
		System.out.println("url.getFile(): "+url.getFile());
		System.out.println("url.getHost() :"+url.getHost());
		System.out.println("url.getPath(): "+url.getPath());
		System.out.println("url.geProtocol(): "+url.getProtocol());
		System.out.println("url.getQuery(): "+url.getQuery());
		System.out.println("url.getRef(): "+url.getRef());
		System.out.println("url.getUserInfo(): "+url.getUserInfo());
		System.out.println("url.toExternalForm(): "+url.toExternalForm());
		System.out.println("url.toURI(): "+url.toURI());
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
