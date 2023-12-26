package day3;
//This example illustrates the use of 'super' in Method Overriding for Extension
public class MethodOverridingMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Training trg;
		trg = new OfflineTraining("OOP using Java", 10, "YCP, Mumbai");
		String allDetails = trg.getDetails();
		System.out.println(allDetails);
		trg = new OnlineTraining("Node JS", 5, "http://www.zoom.us/34343");
	}

}
