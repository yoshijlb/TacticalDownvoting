package DownvotingModel;

import Players.Downvoter;
import Players.Player;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ScheduleParameters;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.parameter.Parameters;

public class GameController {

	private Parameters params;
	private int topicCounter; // numer w¹tku

	public GameController() {
		params = RunEnvironment.getInstance().getParameters();
		//topicCounter = (Integer) params.getValue("topic_counter");
		topicCounter=0;
	}

	@ScheduledMethod(start = 1.0, interval = 1.0, priority = ScheduleParameters.FIRST_PRIORITY)
	public void step() {
		params.setValue("topic_counter", ++topicCounter);
		System.out.println("watek nr " + topicCounter);

		Downvoter.assignSubsetForTopic();
		Topic t = new Topic();
		t.run();
		
		
		
		Downvoter.dissociateChosenSubset();
		//przeniesienie graczy bez staminy do oddzielnej listy
		Downvoter.moveEliminated();
		
		
		
		//jak wszyscy gracze zu¿yj¹ staminê to koñczymy
		if(ModelBuilder.PLAYERS.getObjects(Downvoter.class).size()==0)
			RunEnvironment.getInstance().endRun();
	}
}
