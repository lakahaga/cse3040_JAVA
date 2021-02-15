package cse3040_Ex21;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex21_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress ip = null;
		try {
			ip=InetAddress.getByName("www.sogang.ac.kr");
			System.out.println("getHostName():" +ip.getHostName());
			System.out.println("gethosetAdress(): "+ip.getHostAddress());
			System.out.println("toString(): "+ip.toString());
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
