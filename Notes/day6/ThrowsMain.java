package day6;

public class ThrowsMain {
	
	private static void print() throws Exception {
		//This method tells compiler that it may fire an exception: Exception but not willing to handle it.
		//It enforces its caller to handle it.
	}
	
	private static void display() {
		//This method fulfills compiler's requirement i.e. it handles the exception: Exception
		try {
			print();
		}
		catch(Exception ex) {
			
		}
	}
	
	private static void show() throws Exception{
		//This method further delegates the responsibility of handling the exception: Exception to its caller
		print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		try {
			show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}

}
