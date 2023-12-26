package day8;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath = "./src/day8/Chocolates.txt";
		try (
			FileInputStream fin = new FileInputStream(filepath);
			BufferedInputStream bin = new BufferedInputStream(fin);
			){
			while(true) {
				int data = bin.read();
				if(data == -1)
					break;
				char ch = (char)data;
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
