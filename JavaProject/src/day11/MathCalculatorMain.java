package day11;

public class MathCalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathCalculaor adder = (a,b) -> a+b;    //single expression
		MathCalculaor subtractor = (int p, int q) -> {   //blocked lambda
			return p-q;
		};
		int add = adder.doCalculate(10,20);
		int sub = subtractor.doCalculate(20, 10);
		System.out.println(add);
		System.out.println(sub);

	}

}
