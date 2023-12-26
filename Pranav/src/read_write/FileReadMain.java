package read_write;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "./src/read_write/Chocolates.txt";
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(filePath);
			while(true) {
				int data = fin.read();
				if(data == -1)
					break;
				char ch = (char)data;
				System.out.print(ch);
			}
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				fin.close();
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}


