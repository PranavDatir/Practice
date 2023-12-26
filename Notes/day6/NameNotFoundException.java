package day6;
//This is a user defined exception class and it is a CHECKED exception
public class NameNotFoundException extends Exception {
	private String invalidName;
	public NameNotFoundException(String errorMessage, String invalidName) {
		super(errorMessage);
		this.invalidName = invalidName;
	}
	@Override
	public String getMessage() {
		String message = super.getMessage();//Invokes getMessage from Exception class
		String finalMessage = message + ": " + invalidName;
		return finalMessage;
	}
	
}
