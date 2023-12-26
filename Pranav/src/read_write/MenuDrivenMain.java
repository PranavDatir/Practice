package read_write;

import java.util.Scanner;

public class MenuDrivenMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1. Tea");
		System.out.println("2. Coffee");
		int ch = in.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Tea Served");
			break;
		case 2:
			System.out.println("Coffee Served");
			break;
		default:
			System.out.println("Enter proper option");
			break;
		}
	}
}
