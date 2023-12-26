package assignment1;

public class AverageFees implements CourseInfoProcessor {

	@Override
	public float processCourseInfo(CMS[] courses, CMS CourseInfo) {
		int fees = 0;
		int count = 0;
		for (CMS course : courses ) {
			if(course.getProvider() == CourseInfo.getProvider() && course.getDuration() == CourseInfo.getDuration() ) {
			count ++;
			fees = fees + course.getFees();
		    }
		}
		int avgFees = fees/count;
		return avgFees;
	}
	

}
