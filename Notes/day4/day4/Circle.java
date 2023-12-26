package day4;

public  final class Circle extends Shape {
	public void draw() {
		System.out.println("Drawing a circle using compass");
	}
}

//class AnotherCircle extends Circle {} This does not compile because class Circle is declared as 'final'
