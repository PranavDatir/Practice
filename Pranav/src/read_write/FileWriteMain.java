package read_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteMain {

	public static void main(String[] args) {
		String filePath = "ice-cream.txt";
		String ice_cream_info = "\n3. Kesar Pista\n4. Vanilla";
		try(FileOutputStream fout = new FileOutputStream(filePath)) {
			byte[]ice_cream_data = ice_cream_info.getBytes();
			fout.write(ice_cream_data);
			System.out.println("Data added");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

