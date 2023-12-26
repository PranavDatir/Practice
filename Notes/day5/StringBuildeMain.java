package day5;

public class StringBuildeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();//Creating an empty builder.
		builder.append("Today is the ");
		builder.append(5);
		builder.append("th day of this training. No one will be allowed to enter after ");
		builder.append(9.15);
		builder.append(" am");
		builder.append(" Is that clear?");
		builder.append(true);
		
		System.out.println(builder);
		String message = builder.toString();
		System.out.println(message);
		
		

	}

}
