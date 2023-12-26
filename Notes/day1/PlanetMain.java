package day1;

public class PlanetMain {

	public static void main(String[] args) {
		Planet ourPlanet = new Planet();
		//ourPlanet.name = "Earth"; This does not compile because 'name' is 'private'
		ourPlanet.assignValues("Earth", 1);
		
		Planet biggestPlanet = new Planet();
		biggestPlanet.assignValues("Jupiter", 16);
		
		String ourPlanetInfo = ourPlanet.retrieveValues();
		System.out.println(ourPlanetInfo);
		
		System.out.println(biggestPlanet.retrieveValues());
		
		

	}

}
