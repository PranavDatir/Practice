package day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Program to read the contents of some file and display them
public class FileReadMain {

	public static void main(String[] args) {
		String filePath = "toffees.txt";
		//String filePath = "./src/day5/Notes.txt";
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(filePath);		
			//Reading the contents until End of File (EOF) is encountered.
			while(true) {
				int data = fin.read();//Reads one character and returns its value.
				if(data == -1)//Checking for EOF position
					break;
				char ch = (char)data;
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file does not exist.");
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();//Closing FileInputStream
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
