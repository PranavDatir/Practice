package day10;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

//Program to demonstrate the use of Comparable and Comparator
public class TreeSetMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country ind = new Country();
		Country us = new Country("us", "USA", 53);
		Country ger = new Country("ger", "Germany", 12);
		
		SortedSet<Country> countrySet = new TreeSet<>(); //Using default algorithm
		countrySet.add(ind);
		countrySet.add(us);
		countrySet.add(ger);
		
		for(Country ctr : countrySet)
			System.out.println(ctr);
		
		System.out.println("------------Sorting Customization---------------");
		Comparator<Country> nameAscComp = new NameWiseAscComparator();
		Comparator<Country> nameDescComp = new NameWiseDescComparator();
		
		SortedSet<Country> countrySet2 = new TreeSet<>(nameDescComp);//Using customized algorithm
		countrySet2.add(ind);
		countrySet2.add(us);
		countrySet2.add(ger);
		
		for(Country ctr : countrySet2)
			System.out.println(ctr);

	}

}
