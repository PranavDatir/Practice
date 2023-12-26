package day8;

import java.io.FileOutputStream;

public class FileWriteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath = "IceCream.txt";
		String iceCream_Data = "\n1. Vanilla \n2. Choco-Chip \n3. Butterscotch, \n4.KesarPista" ;
		try(FileOutputStream fout = new FileOutputStream(filepath, true)){
			byte[] iceCreamData = iceCream_Data.getBytes();
			fout.write(iceCreamData);
			System.out.println("Data Written Successfully");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
