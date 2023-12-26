package assignment1;

public class AvgFees extends CourseDataCalculator {

	int avgFees = 0;
	public float doCalculation(CMS[] allCourses) {
		for(CMS currentCourse : allCourses) {
			int currentFees = currentCourse.getFees();
			avgFees = avgFees + currentFees;
		}
		avgFees = avgFees/allCourses.length;
		return avgFees;	

	}
}
