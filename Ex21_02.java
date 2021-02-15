package cse3040_Ex21;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex21_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress ip= null;
		
		try {
			ip=InetAddress.getByName("www.naver.com");
			byte[] ipAddr=ip.getAddress();
			System.out.println("getAddress(): "+Arrays.toString(ipAddr));
			
			String result = "";
			for(int i=0;i<ipAddr.length;i++) {
				result+=(ipAddr[i]<0) ? ipAddr[i] + 256 : ipAddr[i];//because ipAddress is unsinged, byte is signed
				result+="."; // decimal dotted form
			}
			System.out.println("getAdress()+256: "+result);
			System.out.println();
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}
}
