package cse3040_Ex21;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex21_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress ip =null;
		try {
			ip=InetAddress.getLocalHost();
			System.out.println("getHostName(): "+ip.getHostName());
			System.out.println("getHostAddress(): "+ip.getHostAddress());
			System.out.println();
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
