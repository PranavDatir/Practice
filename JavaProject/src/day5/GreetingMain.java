package day5;

public class GreetingMain {

	public static void main(String[] args) {
		Greeting grt = new Greeting();
		grt.showGreeting();
		
		GreetingServices grtService = new WelcomeGreeting();
		grt.setService(grtService);
		grt.showGreeting();
	}

}
