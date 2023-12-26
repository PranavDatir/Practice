package day3;
//This example illustrates Method Overriding
public class MethodOverridingMain {

	public static void main(String[] args) {
		OfflineTraining offTrg = new OfflineTraining("OOP using Java", 10, "YCP, Mumbai");
		OnlineTraining onTrg = new OnlineTraining("Node JS", 5, "http://www.zoom.us/34343");
		
		String offTrgModule = offTrg.getModuleName();
		System.out.println("Module name: " + offTrgModule);
		offTrg.conductTraining();
		System.out.println("----------------");
		String onTrgModule = onTrg.getModuleName();
		System.out.println("Module name: " + onTrgModule);
		onTrg.conductTraining();
		
	
		
				

	}

}
