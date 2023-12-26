package day3;

public class InheritanceMain {

	public static void main(String[] args) {
		CricketPlayer cp = new CricketPlayer();
		TennisPlayer tp = new TennisPlayer();
		cp.setName("Virat");
		cp.setAge(35);
		cp.setBattingAvg(56.75f);
		
		//Remaining code to get and print values
		System.out.println(cp.getName());
	}

}
