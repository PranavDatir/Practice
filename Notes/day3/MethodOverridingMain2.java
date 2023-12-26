package day3;
//This example illustrates Method Overriding with Dynamic Polymorphism
public class MethodOverridingMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Training trg;
		
		trg = new OfflineTraining("OOP using Java", 10, "YCP, Mumbai");
		//trg.setVenueDetails("Mumbai"); This does not compile as 'setVenueDetails' is absent in class Training
		//To invoke it, explicit cast is required
		OfflineTraining offt = (OfflineTraining)trg;//Type casting from Training to OfflineTraining for the reference: trg
		offt.setVenueDetails("Mumbai");
		
		String trgModule = trg.getModuleName();
		System.out.println("Module name: " + trgModule);
		trg.conductTraining();
		
		
		trg = new OnlineTraining("Node JS", 5, "http://www.zoom.us/34343");
		trgModule = trg.getModuleName();
		System.out.println("Module name: " + trgModule);
		trg.conductTraining();
		
		
		

	}

}
