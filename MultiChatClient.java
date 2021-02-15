package cse3040_Ex24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class MultiChatClient {
	static class ClientSender extends Thread{
		Socket socket;
		DataOutputStream out;
		String name;
		ClientSender(Socket socket, String name){
			this.socket=socket;
			try {
				out=new DataOutputStream(socket.getOutputStream());
				this.name=name;
			}catch(Exception e) {}
		}
		@SuppressWarnings("all")
		public void run() {
			Scanner scanner = new  Scanner(System.in);
			try {
				if(out!=null) {
					out.writeUTF(name);
				}
				while(out!=null) {
					out.writeUTF("["+name+"]"+scanner.nextLine());
				}
			}catch(IOException e) {}
		}
	}
	static class ClientReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		
		ClientReceiver(Socket socket){
			this.socket=socket;
			try {
				in=new DataInputStream(socket.getInputStream());
			}catch(IOException e) {}
		}
		public void run() {
			while(in!=null) {
				try {
					System.out.println(in.readUTF());
				}catch(IOException e) {}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1) {
			System.out.println("usage: java MultichatClient username");
			System.exit(0);
		}
		try {
			String serverIp="127.0.0.1";
			Socket socket = new Socket(serverIp,7777);
			Thread sender = new Thread(new ClientSender(socket,args[0]));
			Thread receiver = new Thread(new ClientReceiver(socket));
			sender.start();
			receiver.start();
		}catch(ConnectException ce) {
			ce.printStackTrace();
		}catch(Exception e) {}
	}

}
