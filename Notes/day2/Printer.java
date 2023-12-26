package day2;

public class Printer {
	private String content;
	
	public Printer() {//This is a no argument constructor
		//Code for initialization
		content = "Good Morning";
		//this.content = "Good Morning";
	}
	
	public Printer(String content) {//This is a parameterized constructor accepting 1 parameter
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void print() {//Prints the content without any decoration
		System.out.println(content);
	}
	public void print(String decoration) {//Prints the content with some decoration
		System.out.println(decoration + content + decoration);
	}
}
