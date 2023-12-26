package day11;
//Program that makes use of Lambda Expression for the method which accepts parameters
public class MathCalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathCalculator adder = (a, b) -> a + b;
		MathCalculator subtractor = (int p, int q) -> {
			return p - q;
		};
		int addition = adder.doCalculate(10, 20);
		int subtraction = subtractor.doCalculate(25,  14);
		System.out.println(addition);
		System.out.println(subtraction);

	}

}
