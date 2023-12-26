//This example illustrates: Method Overloading, Constructor and Constructor Overloading
package day2;

public class PrinterMain {

	public static void main(String[] args) {
		Printer prn = new Printer();
		//prn.setContent("Good Afternoon");
		prn.print();
		prn.print("*************");
		prn.print("$$$$$$$$$$");
		
		Printer prn2 = new Printer("Good Night");
		prn2.print();

	}

}
