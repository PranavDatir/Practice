package day6;
//This example illustrates the use of: throws, throw and User Defined Exception
public class UserDefinedExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int position = NameCollection.getPosition("Salman Khan");
			System.out.println(position);
		} catch (NameNotFoundException nameEx) {
			// TODO Auto-generated catch block
			nameEx.printStackTrace();
			//String message = nameEx.getMessage();
			//System.out.println(message);
		}

	}

}
