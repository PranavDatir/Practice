package day7;

public class MessageThreadImplMain {

	public static void main(String[] args) {
		Thread t1 = new MessageThreadImpl("Hello",2000);
		Thread t2 = new MessageThreadImpl("Hi", 1000);
		t1.start();
		t2.start();

	}

}
