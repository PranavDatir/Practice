package assignment1;

public class AvgDuration extends CourseDataCalculator {

	int avgDuration = 0;
	public float doCalculation(CMS[] allCourses) {
		for(CMS currentCourse : allCourses) {
			int currentDuration = currentCourse.getDuration();
			avgDuration = avgDuration + currentDuration;
		}
		avgDuration = avgDuration/allCourses.length;
		return avgDuration;		
	}
}
