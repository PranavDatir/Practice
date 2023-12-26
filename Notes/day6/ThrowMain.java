package day6;

public class ThrowMain {
	private static int doDivision(int x, int y) {
		if(y == 0) {
			//Throw an exception: RuntimeException
			RuntimeException rx = new RuntimeException("2nd no. has to be non-zero to perform the division");
			throw rx;//Throwing the exception
		}
		int division = x / y;
		return division;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divResult = doDivision(10, 2);
		System.out.println(divResult);

	}

}
