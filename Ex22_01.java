package cse3040_Ex22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex22_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url = null;
		BufferedReader input =null;
		String address = "https://icslsogang.github.io/courses/cse3040/hello.html";
		String line ="";
		
		try {
			url=new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while((line = input.readLine())!=null) {
				System.out.println(line);
			}
			input.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
