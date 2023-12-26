package assignment1;

public class CourseCollection {
	private static CMS[] availableCourses = new CMS[5];
	static {
		availableCourses[0] = new CMS(101, "Core Java", "Udemy", 100, 5500);
		availableCourses[1] = new CMS(102, "Adv Java", "Udemy", 100, 8500);
		availableCourses[2] = new CMS(103, "Angular", "Edureka", 60, 7500);
		availableCourses[3] = new CMS(104, "Angular", "Coursera", 75, 8000);
		availableCourses[4] = new CMS(105, "Spring", "Udemy", 40, 10500);
	}
	
	public static void printCourseNames(String provider) throws ProviderNotFoundException {
		int pos = -1;
		int size = availableCourses.length;
		for(int i = 0; i<size; i++) {
			String ProviderName = availableCourses[i].getProvider();
			if(provider == ProviderName) {
				pos = i;
				System.out.println("Course Provided :" + availableCourses[i].getTitle());
			}
		}
		if(pos == -1) {
			String error = "Provider not found";
			ProviderNotFoundException ex = new ProviderNotFoundException(error, provider);
			throw ex;
		}
	}
}
