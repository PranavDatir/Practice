package day1;

public class UserGreetingServices implements GreetingService {
	private String userName;
	private String greetingMessage;
	private int userAge;

	public UserGreetingServices(String userName, String greetingMessage, int userAge) {
		super();
		this.userName = userName;
		this.greetingMessage = greetingMessage;
		this.userAge = userAge;
	}

	public UserGreetingServices() {
		// TODO Auto-generated constructor stub
	}
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGreetingMessage() {
		return greetingMessage;
	}

	public void setGreetingMessage(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String SayGreeting() {
		// TODO Auto-generated method stub
		return greetingMessage + " " + userName + " " + userAge;
	}

}
