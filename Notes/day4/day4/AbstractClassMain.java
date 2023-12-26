package day4;
//This example illustrates Abstract Class
public class AbstractClassMain {

	 static public void main(String[] args) {
		//Shape sh = new Shape(); This is invalid as Shape class is abstract. Its object creation is not possible.
		Shape sh;
		sh = new Circle();
		sh.draw();
		sh.erase();
		
		sh = new Rectangle();
		sh.draw();
		sh.erase();
	}

}
