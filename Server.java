package cse3040_Ex24;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;


/*public class Server {
	//return current time as a String 
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		try {
			//create a SErverSocket instance and bind with port 7777.
			serverSocket= new ServerSocket(7777);
			System.out.println(getTime()+"server is ready.");
			
		}catch(IOException e) {e.printStackTrace();}
		
		while(true) {
			try {
				System.out.println(getTime()+"waiting for clients.");
				
				Socket socket = serverSocket.accept();
				System.out.println(getTime()+"connection request from " +socket.getInetAddress());
				
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime()+"sent message.");
				
				dos.close();
				socket.close();
				
				
			}catch(IOException e) {e.printStackTrace();}
		}

	}

}
*/
public class Server implements Runnable{
	ServerSocket serverSocket;
	Thread[] threadArr;
	static String getTime() {
		String name= Thread.currentThread().getName();
		SimpleDateFormat f= new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date())+" " +name+": ";
		
	}
	
	//constructor
	public Server(int num) {
		try {
			serverSocket= new ServerSocket(7777); //create a ServerSocket and bind to port 7777
			System.out.println(getTime() + "server is ready.");
			threadArr=new Thread[num];
	}catch(IOException e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		Server server = new Server(5);
		server.start();
	}
	public void start() {
		for(int i=0;i<threadArr.length;i++) {
			threadArr[i]=new Thread(this);
			threadArr[i].start();
		}
	}
	public void run()
	{
		while(true) {
			try {
				System.out.println(getTime()+"waiting for clients...");
				Socket socket= serverSocket.accept();
				System.out.println(getTime() + "connection request from "+socket.getInetAddress());
				OutputStream out =socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.println(getTime()+"sent message");
				dos.close();
				socket.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}