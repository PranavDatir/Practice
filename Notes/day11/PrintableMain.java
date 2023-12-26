package day11;
//This program makes use of Simple Lambda Expression
public class PrintableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p1 = () -> System.out.println("Hello"); //This is Single Expression Lambda
		Printable p2 = () -> System.out.println("Welcome");
		Printable p3 = () -> {//This is a Blocked Lambda
			System.out.println("Hi");
			System.out.println("Bye");
		};
		p1.print();
		p2.print();
		p3.print();

	}

}
