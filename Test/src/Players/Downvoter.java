package Players;

import java.util.ArrayList;

import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.parameter.Parameters;
import DownvotingModel.ModelBuilder;
import Strategies.DownvoterStrategy;

public class Downvoter extends Player {
	private DownvoterStrategy strategy;

	public Downvoter(int initial_stamina, int initial_reputation) {
		super(initial_stamina, initial_reputation);
	}

	public double getReputation() {
		return reputation;
	}

	public void insreaseReputation(int val) {
		this.reputation += val;
	}

	public void decreaseReputation(int val) {
		this.reputation -= val;
	}

	public int getStamina() {
		return stamina;
	}
	public void useStamina(int amount) {
		this.stamina -= amount;
	}
	public DownvoterStrategy getStrategy() {
		return strategy;
	}
	

	public static void assignSubsetForTopic() {
		Parameters params = RunEnvironment.getInstance().getParameters();

		for (Downvoter o : ModelBuilder.PLAYERS.getRandomObjects(
				Downvoter.class,
				(Integer) params.getValue("downvoters_amount_per_topic"))) {
			ModelBuilder.CURRENT_SUBSET.add(o);
		}
	}

	public static void dissociateChosenSubset() {
		ArrayList<Downvoter> temp = new ArrayList<Downvoter>();
		for (Downvoter o : ModelBuilder.CURRENT_SUBSET
				.getObjects(Downvoter.class)) {
			temp.add(o);
			ModelBuilder.PLAYERS.add(o);
		}
		ModelBuilder.CURRENT_SUBSET.removeAll(temp);
	}

	public static void moveEliminated() {
		ArrayList<Downvoter> temp = new ArrayList<Downvoter>();
		for (Downvoter o : ModelBuilder.PLAYERS.getObjects(Downvoter.class)) {
			if (o.getStamina() < 1) {
				temp.add(o);
				ModelBuilder.ELIMINATED_PLAYERS.add(o);
			}
		}
		ModelBuilder.PLAYERS.removeAll(temp);
		
	}
	

}
