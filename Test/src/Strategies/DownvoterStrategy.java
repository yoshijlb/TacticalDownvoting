package Strategies;

public class DownvoterStrategy {
	private int minimumStaminaToAnswer=100;
	private int maxReputationDifferenceToDownVote =1;
	
	public DownvoterStrategy(int i, int j, int k, int l, int m) {
		// TODO Auto-generated constructor stub
	}
	public int getMinimumStaminaToAnswer() {
		return minimumStaminaToAnswer;
	}
	public void setMinimumStaminaToAnswer(int minimumStaminaToAnswer) {
		this.minimumStaminaToAnswer = minimumStaminaToAnswer;
	}
	public int getMaxReputationDifferenceToDownVote() {
		return maxReputationDifferenceToDownVote;
	}
	public void setMaxReputationDifferenceToDownVote(
			int maxReputationDifferenceToDownVote) {
		this.maxReputationDifferenceToDownVote = maxReputationDifferenceToDownVote;
	}
	
}
