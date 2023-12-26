package assignment1;

public class CMS {
	private String title, provider;
	private int courseId, duration, fees;
	static int courseCount;

	public CMS(int courseId, String title, String provider, int duration, int fees) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.provider = provider;
		this.duration = duration;
		this.fees = fees;
		courseCount++;
	}
	
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
	public void Display() {
		System.out.println(courseId);
		System.out.println(title);
		System.out.println(provider);
		System.out.println(duration);
		System.out.println(fees);

	}

}
