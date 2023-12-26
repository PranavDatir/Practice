package day11;

import java.util.Arrays;
import java.util.List;

public class EnumMain {

	public static void main(String [] args) {
		TrainingProgram program1 = new TrainingProgram();
		TrainingProgram program2 = new TrainingProgram("Stress Management", 2, TrainingMode.HYBRID);
		TrainingProgram program3 = new TrainingProgram("Communication Skills", 2, TrainingMode.HYBRID);
		TrainingProgram program4 = new TrainingProgram("Interview Skills", 2, TrainingMode.OFFLINE);
		TrainingProgram program5 = new TrainingProgram("Share Market", 3, TrainingMode.ONLINE);

		List<TrainingProgram> allTrainingPrograms = Arrays.asList(program1, program2, program3, program4, program5);
		for(TrainingProgram currentProgram : allTrainingPrograms) {
			TrainingMode currentMode = currentProgram.getModeOfTraining();
			if(currentMode.equals(TrainingMode.OFFLINE)) {
				System.out.println(currentProgram.getName());
			}
		}
	}

}
