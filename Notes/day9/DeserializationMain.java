package day9;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//Program to de-serialize the object of Movie class.
public class DeserializationMain {

	public static void main(String[] args) {
		String filePath = "./src/day9/movie.txt";
		try(
				FileInputStream fin = new FileInputStream(filePath);
				ObjectInputStream in = new ObjectInputStream(fin);
				){
				//De-serializing the Movie class object.
				Object currentObject = in.readObject();
				System.out.println(currentObject);
				//currentObject.getTitle(); This does not compile because Object class does not have getTitle() method
				Movie currentMovie = (Movie)currentObject;
				String movieTitle = currentMovie.getTitle();
				System.out.println(movieTitle);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
