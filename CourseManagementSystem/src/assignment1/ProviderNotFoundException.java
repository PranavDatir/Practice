package assignment1;

public class ProviderNotFoundException extends Exception {
	private String provider;
	public ProviderNotFoundException(String errorMessage, String provider) {
		super(errorMessage);
		this.provider = provider;
	}
	@Override
	public String getMessage() {
		String message = super.getMessage();//Invokes getMessage from Exception class
		String finalMessage = message + ": " + provider;
		return finalMessage;
	}

}
