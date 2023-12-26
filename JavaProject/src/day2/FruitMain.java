package day2;

public class FruitMain {

	public static void main(String[] args) {
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit("Apple","Red");
		Fruit f3 = new Fruit("Banana","Yellow");
		System.out.println("Fruit Count is " + Fruit.fruitCount);
		System.out.println("TotalFruit Count is " + Fruit.getTotalFruitCount());		
	}
}
