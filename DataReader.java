package cse3040_Ex24;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis= new FileInputStream("sample.dat");
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
