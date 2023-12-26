package day9;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain2 {

	public static void main(String[] args) {
		Set<Country> allCountries = new HashSet<>();
		
		Country ind = new Country();
		Country ind2 = new Country();
		Country us = new Country("US", "USA");
		Country us2 = new Country("US", "USA");
		Country eng = new Country("ENG", "England");
		Country nz = new Country("NZ", "New Zealand");
		Country sa = new Country("RSA", "South Africa");
		
		allCountries.add(ind);
		allCountries.add(us);
		allCountries.add(eng);
		allCountries.add(nz);
		allCountries.add(sa);
		allCountries.add(ind2);
		allCountries.add(us2);
		
		for(Country ctr : allCountries)
			System.out.println(ctr);
		
		

	}

}
