package day2;
//This example illustrates the use of static block and gloabal variable
public class MathOperationMain {
	
	//Adding a static block that gets called during class loading
	static {
		System.out.println("Demonstrating static block and global variables.");
	}

	public static void main(String[] args) {
		System.out.println("PI value: " + MathOperation.PI);
		System.out.println(MathOperation.doAdd(5, 10));
		System.out.println(MathOperation.doSubtract(5, 10));

	}

}
