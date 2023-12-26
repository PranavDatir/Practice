package day11;
//Program that makes use of Lambda Expression for method returning a value
public class GreetingMain {

	public static void main(String[] args) {
		Greeting firstGreeting = () -> "Hello";
		Greeting secondGreeting = () -> {
			String message = "Welcome";
			return message;
		};
		
		String greeting1 = firstGreeting.sayGreeting();
		String greeting2 = secondGreeting.sayGreeting();
		
		System.out.println(greeting1);
		System.out.println(greeting2);
		

	}

}
