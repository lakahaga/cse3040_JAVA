package cse3040_fp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

@SuppressWarnings("serial")
class bookMap<K,V> extends TreeMap<String,String[]>{
	private K title;
	private String author;
	private String borrower;
	
	
}
class LibraryManager{
	private static BufferedReader br;
	private static TreeMap<String,String[]> map = new bookMap<String,String[]>();
	public static TreeMap<String, String[]> readData(String str){
		try {
			br=new BufferedReader(new FileReader(str));
		}catch(FileNotFoundException e) {
			return null;
		}
		try {
			while(true)
			{
				String line = br.readLine();
				if(line==null) break;
				String[] info=line.split("\t");
				info[0]=info[0].toLowerCase();
				String[] values= {info[1],info[2]};
				map.put(info[0],values);
				//values[0] = author, values[1] = borrower 
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return map;
	}
}

public class Server {
	HashMap<String,DataOutputStream> users;
	Server(){
		users=new HashMap<>();
		Collections.synchronizedMap(users);
	}
	public void start(String IP, int PNum) {
		ServerSocket serverSocket =null;
		Socket socket= null;
		
		try {
			serverSocket =new ServerSocket(PNum);
			while(true) {
				socket=serverSocket.accept();//blocked here 

				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1) {
			System.out.println("Please give the port number as an argument.");
			System.exit(0);
		}
		int portNum=Integer.valueOf(args[0]);
		
		new Server().start(args[0],portNum);
	}

}
