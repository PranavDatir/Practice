package assignment1;

public class CMSMain {

	public static void main(String[] args) {
		CMS c1 = new CMS(1, "C++", "Udemy", 35, 3000);
		CMS c2 = new CMS(2, "C", "Coursera", 35, 2000);
		CMS c3 = new CMS(3, "Java", "Udemy", 50, 4000);
		//TODO-1
		c1.Display();
		System.out.println();
		c2.Display();
		System.out.println();
		c3.Display();
		System.out.println();
		
		// TODO-2
		System.out.println("Course Count is "+ CMS.courseCount);
		
		//TODO-3
		CMS CourseList[] = {c1, c2, c3};
		CourseProcessor cp = new CourseProcessor();
		cp.printShortDurationCourseName(CourseList);
		
		//TODO-4
		CourseDataCalculator cdc = new AvgDuration();
		System.out.println("Average Duration is :" + cdc.doCalculation(CourseList));

		CourseDataCalculator avfees = new AvgFees();
		System.out.println("Average Fees is :" + avfees.doCalculation(CourseList));
		
		//TODO-5
		CMS c5= new CMS(101, "Core Java", "Udemy", 100, 5500);
		CMS c6= new CMS(102, "Adv Java", "Udemy", 100, 8500);
		CMS c7= new CMS(103, "Angular", "Edureka", 60, 7500);
		CMS c8= new CMS(104, "Angular", "Coursera", 75, 8000);
		CMS c9= new CMS(105, "Spring", "Udemy", 40, 10500);
		
		CMS CourseInfo [] = {c5, c6, c7, c8, c9};
		TotalCourseCount tc = new TotalCourseCount();
		System.out.println("Course Count:" + tc.processCourseInfo(CourseInfo, c5));
		
		AverageFees af = new AverageFees();
		System.out.println("Average Fees:" + af.processCourseInfo(CourseInfo, c5));
	
		//TODO-6
		try {
			CourseCollection.printCourseNames("Udemy");
		} catch (ProviderNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
