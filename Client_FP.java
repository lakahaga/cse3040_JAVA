package cse3040_fp;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2)
		{
			System.out.println("Please give the IP address and port number as arguments.");
			System.exit(0);
		}
		try {
			String serverIP=args[0];
			int portNum=Integer.valueOf(args[1]);
			Socket socket = new Socket(serverIP,portNum);
			String userName="";
			int flag=0;
			while(true) {
				System.out.print("Enter User ID");
				Scanner scanner = new Scanner(System.in);
				userName=scanner.next();
				for(int i=0;i<userName.length();i++) {
					char ch=userName.charAt(i);
					if(ch==' ') { flag=1;break;}
					else if (ch<'a'||ch>'z') {  
						if(Character.isDigit(ch)==true) {continue;}
						flag=1; 
						break;
					}
				}
				if(flag==1) {
					System.out.println("UserID must be a single word with lowercase alphabets and numbers.");
				}
				else {
					System.out.println("Hello "+userName+"!");
					break;
				}
			}
		}catch(ConnectException ce) {
			System.out.println("Connection establishment failed.");
			System.exit(0);
		}catch(IOException ie) {
			ie.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
