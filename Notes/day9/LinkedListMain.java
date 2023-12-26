package day9;

import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList dataValues = new LinkedList();
		dataValues.add("Hello");
		dataValues.add("Welcome");
		dataValues.add(35);
		dataValues.add(true);
		dataValues.add(4.56);
		
		for(Object obj : dataValues)
			System.out.println(obj);
		
		dataValues.addFirst("Good Afternoon");
		
		System.out.println("---------------------------");
		for(Object obj : dataValues)
			System.out.println(obj);
		
		

	}

}






