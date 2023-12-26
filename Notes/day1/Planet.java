package day1;
//This example illustrates the use of Abstraction and Encapsulation
public class Planet {
	private String name;
	private int moons;
	//Fields 'name' and 'moons' are declared as 'private'; hence they are not accessible from outside this class.
	
	//Adding methods for assigning and retrieving values
	public void assignValues(String nm, int mn) {
		name = nm;
		moons = mn;
	}
	
	public String retrieveValues() {
		String planetInfo = name + ", " + moons;
		return planetInfo;
	}
}
