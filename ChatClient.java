package cse3040_Ex24;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;





public class ChatClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String serverIp="127.0.0.1";
			Socket socket = new Socket(serverIp,7779);
			System.out.println("connected to server.");
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			sender.start();
			receiver.start();
			
		}catch(ConnectException ce) {
			ce.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
