package day11;

public class TrainingProgram {
	private String name;
	private int duration;
	private TrainingMode modeOfTraining;
	public TrainingProgram() {
		name = "Art of living";
		duration = 3;
		modeOfTraining = TrainingMode.OFFLINE;
	}
	public TrainingProgram(String name, int duration, TrainingMode modeOfTraining) {
		this.name = name;
		this.duration = duration;
		this.modeOfTraining = modeOfTraining;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public TrainingMode getModeOfTraining() {
		return modeOfTraining;
	}
	public void setModeOfTraining(TrainingMode modeOfTraining) {
		this.modeOfTraining = modeOfTraining;
	}
	@Override
	public String toString() {
		return "TrainingProgram [name=" + name + ", duration=" + duration + ", modeOfTraining=" + modeOfTraining + "]";
	}
	

}
