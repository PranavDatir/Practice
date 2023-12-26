package day3;

public class CricketPlayer extends Player {
	private float battingAverage;

	public CricketPlayer() {
		System.out.println("Cricket Player()");
	}

	public CricketPlayer(String name, int age, float battingAverage) {
		super(name, age);
		this.battingAverage = battingAverage;
	}

	public float getbattingAverage() {
		return battingAverage;
	}

	public void setBattingAverage(float battingAverage) {
		this.battingAverage = battingAverage;
	}
	

}
