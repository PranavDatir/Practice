package day2;

public class Fruit {
	private String name, color;
	static int fruitCount;
	private static int totalFruitCount;

	public Fruit() {
		name = "Mango";
		color = "Yellow";
		fruitCount++;
		totalFruitCount++;
	}
	
	public Fruit(String name, String color) {
		super();
		this.name = name;
		this.color = color;
		fruitCount++;
		totalFruitCount++;
	}
	
	public String getName() {
		System.out.println(totalFruitCount);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public static int getTotalFruitCount() {
		return totalFruitCount;
	}

}
