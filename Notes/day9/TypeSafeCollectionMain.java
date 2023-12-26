package day9;

import java.util.ArrayList;
import java.util.List;
//Program that makes use of Type Safe Collection
public class TypeSafeCollectionMain {

	public static void main(String[] args) {
		List<String> countryNames = new ArrayList<>();//This collection is Type-Safe. Accepts objects only of type String
		countryNames.add("India");
		countryNames.add("India");
		countryNames.add("India");
		countryNames.add("India");
		countryNames.add("India");
		
		countryNames.add("England");
		countryNames.add("South Africa");
		countryNames.add("New Zealand");
		countryNames.add("Sri Lanka");
		//countryNames.add(100); This does not compile as the collection is type safe for String type.
		
		//Printing the country names in Upper Case
		for(String countryName : countryNames) {
			System.out.println(countryName.toUpperCase());
		}
		

	}

}






