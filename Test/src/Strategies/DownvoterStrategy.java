package Strategies;

public class DownvoterStrategy {

	private int rankObjective;
	private int minTotalAnswerCount; 
	private int lastPositionForNewAnswer;
	private int maxDifferenceForNewAnswer;
	private int maxDifferenceToTakeAction;

	public DownvoterStrategy(int rankObjective, int minTotalAnswerCount, int lastPositionForNewAnswer, int maxDifferenceForNewAnswer, int maxDifferenceToTakeAction) {
		setRankObjective(rankObjective);
		setMinTotalAnswerCount(minTotalAnswerCount);
		setLastPositionForNewAnswer(lastPositionForNewAnswer);
		setMaxDifferenceForNewAnswer(maxDifferenceForNewAnswer);
		setMaxDifferenceToTakeAction(maxDifferenceToTakeAction);
	}

	private void setRankObjective(int rankObjective) {
		this.rankObjective = rankObjective;
	}

	private void setMinTotalAnswerCount(int minTotalAnswerCount) {
		this.minTotalAnswerCount = minTotalAnswerCount;
	}

	private void setLastPositionForNewAnswer(int lastPositionForNewAnswer) {
		this.lastPositionForNewAnswer = lastPositionForNewAnswer;
	}

	private void setMaxDifferenceForNewAnswer(int maxDifferenceForNewAnswer) {
		this.maxDifferenceForNewAnswer = maxDifferenceForNewAnswer;
	}

	private void setMaxDifferenceToTakeAction(int maxDifferenceToTakeAction) {
		this.maxDifferenceToTakeAction = maxDifferenceToTakeAction;
	}

	/**
	 * @return the rankObjective (docelowa pozycja odpowiedzi o któr¹ walczy downvoter)
	 */
	public int getRankObjective() {
		return rankObjective;
	}

	/**
	 * @return the minTotalAnswerCount (minimalna liczba odpowiedzi w w¹tku do podjêcia akcji przez downvotera)
	 */
	public int getMinTotalAnswerCount() {
		return minTotalAnswerCount;
	}

	/**
	 * @return the lastPositionForNewAnswer (ostatnie miejsce na jakie mo¿e
	 *         zostaæ wstawiona odpowiedŸ downvotera).
	 */
	public int getLastPositionForNewAnswer() {
		return lastPositionForNewAnswer;
	}

	/**
	 * @return the maxDifferenceForNewAnswer (maksymalna strata punktowa do
	 *         najbli¿szej odpowiedzi do której downvoter wstawia w³asny post).
	 */
	public int getMaxDifferenceForNewAnswer() {
		return maxDifferenceForNewAnswer;
	}

	/**
	 * @return the maxDifferenceToTakeAction (strata punktowa do najbli¿szej
	 *         odpowiedzi od której downvoter nie podejmuje ¿adnej akcji)
	 */
	public int getmaxDifferenceToTakeAction() {
		return maxDifferenceToTakeAction;
	}

}
