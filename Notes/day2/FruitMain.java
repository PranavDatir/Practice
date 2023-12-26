package day2;
//This example illustrates the use of static members
public class FruitMain {

	public static void main(String[] args) {
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit("Apple", "Red");
		Fruit f3 = new Fruit("Guava", "Green");
		
		System.out.println("Fruit Count is " + Fruit.fruitCount);
		System.out.println("Total Fruit Count is " + Fruit.getTotalFruitCount());
		for(int a=1;a<=5;a++) {
			Fruit f = new Fruit();
		}
		System.out.println("Latest Fruit Count is " + f1.fruitCount);
	}

}
