package day5;
//This example illustrates Loose Coupling using Interface
public class GreetingImplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetingImpl grImpl = new GreetingImpl();//Building GreetingImpl object using a default service: HelloGreeting
		grImpl.showGreeting();
		
		GreetingService grService = new WelcomeGreeting();
		grImpl.setService(grService);
		grImpl.showGreeting();

	}

}
