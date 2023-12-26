package day10;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		SortedSet<String> countryNames = new TreeSet<>();
		countryNames.add("India");
		countryNames.add("England");
		countryNames.add("South Africa");
		countryNames.add("New Zealand");
		countryNames.add("Sri Lanka");
		
		for(String countryName : countryNames)
			System.out.println(countryName);
	}

}
