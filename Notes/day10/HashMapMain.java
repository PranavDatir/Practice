package day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> socialMediaDetails = new HashMap<>();
		socialMediaDetails.put("Facebook", 25);
		socialMediaDetails.put("Instagram", 13);
		socialMediaDetails.put("Twitter", 26);
		socialMediaDetails.put("Whatsapp", 45);
		//socialMediaDetails.put("Instagram", 17); This results into overwriting the value
		
		//Fetching all the keys from this Map
		Set<String> allAvailableKeys = socialMediaDetails.keySet();//Returns Set of keys
		//Iterating over the set of keys:	allAvailableKeys
		for(String key : allAvailableKeys) {
			//Obtaining a value based upon the corresponding key
			Integer value = socialMediaDetails.get(key); //Accepting the 'key'  and returning the 'value'
			System.out.println("Key: " + key + " and Value: " + value);
		}
		System.out.println("---------------------------------------------------");
		//Fetching values from the Map directly
		Collection<Integer> allAvailableValues = socialMediaDetails.values();
		for(Integer value : allAvailableValues)
			System.out.println(value);

	}

}









