package day1;

public class MovieMain {

	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.setTitle("Speed");
		m1.setGenre("Action");
		m1.setYear(1997);
		
		System.out.println("Title: " + m1.getTitle());
		String movieGenre = m1.getGenre();
		System.out.println("Genre: " + movieGenre);

	}

}
