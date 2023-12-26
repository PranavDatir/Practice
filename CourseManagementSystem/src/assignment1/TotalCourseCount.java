package assignment1;

public class TotalCourseCount implements CourseInfoProcessor {

	@Override
	public float processCourseInfo(CMS[] courses, CMS CourseInfo) {
		int count = 0;
		for (CMS course : courses ) {
			if(course.getDuration() == CourseInfo.getDuration() && course.getProvider() == CourseInfo.getProvider()) {
			count++;
		}
	  }
		return count;
	}

}
