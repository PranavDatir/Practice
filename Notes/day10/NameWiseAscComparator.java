package day10;

import java.util.Comparator;
//This class provides sorting algorithm for Country objects based upon their names in ascending order.
public class NameWiseAscComparator  implements Comparator<Country>{

	@Override
	public int compare(Country country1, Country country2) {
		// TODO Auto-generated method stub
		String name1 = country1.getName();
		String name2 = country2.getName();
		int comparison = name1.compareTo(name2);
		return comparison;
	}

}
