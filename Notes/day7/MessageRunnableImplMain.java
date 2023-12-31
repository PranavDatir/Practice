package day7;

public class MessageRunnableImplMain {

	public static void main(String[] args) {
		 Runnable r1 = new MessageRunnableImpl("Hello", 1000);
		 Runnable r2 = new MessageRunnableImpl("Hi", 500);
		 Thread t1 = new Thread(r1);
		 Thread t2 = new Thread(r2);
		 t1.start();
		 t2.start();
		 
		 try {
			t1.join(); //Causes the parent thread: Main thread to wait until this thread dies 
			t2.join(); //Causes the parent thread: Main thread to wait until this thread dies 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Done, thank you.");
	}

}
