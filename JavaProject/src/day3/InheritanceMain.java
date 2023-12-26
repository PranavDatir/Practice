package day3;

public class InheritanceMain {

	public static void main(String[] args) {
		CricketPlayer cp = new CricketPlayer();
		cp.setName("Dhoni");
		cp.setAge(40);
		cp.setBattingAverage(58.56f);
		System.out.println(cp.getName());
		System.out.println(cp.getAge());
		System.out.println(cp.getbattingAverage());
	}

}
