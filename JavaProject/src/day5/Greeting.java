package day5;

public class Greeting {
	private GreetingServices service;

	
	public Greeting() {
		service = new HelloGreeting();
	}

	public Greeting(GreetingServices service) {
		this.service = service;
	}

	public GreetingServices getService() {
		return service;
	}

	public void setService(GreetingServices service) {
		this.service = service;
	}
	
	public void showGreeting() {
		String message = service.sayGreeting();
		System.out.println(message);
	}
}
