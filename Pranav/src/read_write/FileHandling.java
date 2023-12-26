package read_write;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHandling {
	public static void main(String[] args) {
		String filePath = "Chocolates.txt";
		try(FileInputStream fin = new FileInputStream(filePath)){
			while(true) {
				int data = fin.read();
				if (data == -1)
					break;
				char ch = (char)data;
				System.out.println(ch);
			}
		}
		catch(FileNotFoundException ex) {
			System.out.println("File not found");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
