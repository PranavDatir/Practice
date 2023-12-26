package assignment1;

public class CourseProcessor {
	public static void printShortDurationCourseName(CMS [] CourseList) {
		for(CMS currentCourse : CourseList) {
			int currentDuration = currentCourse.getDuration();
			String currentTitle = currentCourse.getTitle();
			if(currentDuration < 40)
				System.out.println("Course with less duration:"+ currentTitle);
		}
	}
}
