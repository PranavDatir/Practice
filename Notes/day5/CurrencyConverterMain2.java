package day5;

public class CurrencyConverterMain2 {

	public static void main(String[] args) {
		System.out.println("Current Forex Rates: ");
		System.out.println("USD to INR: " + CurrencyConverter.DOLLAR_TO_RUPEE);
		System.out.println("GBP to INR: " + CurrencyConverter.POUND_TO_RUPEE);
		
		//CurrencyConverter.POUND_TO_RUPEE = 100.34f; This does not compile as the variable is by default 'final'

	}

}
