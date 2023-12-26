package day4;

public abstract class Shape {
	abstract public void draw();//This is method is declared and not defined.
	public final void erase() {
		System.out.println("Erasing the shape using an eraser");
	}
}

/*class MyShape extends Shape {
	public void draw() {}
	@Override
	public void erase() {} This does not compile because 'erase()' from Shape class is declared as 'final'
}*/
