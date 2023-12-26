package day10;

import java.util.SortedSet;
import java.util.TreeSet;

//Program to demonstrate the use of sorted collection for user defined objects
public class TreeSetMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country ind = new Country();
		Country us = new Country("us", "USA", 53);
		Country ger = new Country("ger", "Germany", 12);
		
		SortedSet<Country> allCountries = new TreeSet<>();
		allCountries.add(ind);
		allCountries.add(us);
		allCountries.add(ger);
		
		for(Country ctr : allCountries)
			System.out.println(ctr);
		

	}

}
