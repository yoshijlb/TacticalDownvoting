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
	 * @return the rankObjective (docelowa pozycja odpowiedzi o kt�r� walczy downvoter)
	 */
	public int getRankObjective() {
		return rankObjective;
	}

	/**
	 * @return the minTotalAnswerCount (minimalna liczba odpowiedzi w w�tku do podj�cia akcji przez downvotera)
	 */
	public int getMinTotalAnswerCount() {
		return minTotalAnswerCount;
	}

	/**
	 * @return the lastPositionForNewAnswer (ostatnie miejsce na jakie mo�e
	 *         zosta� wstawiona odpowied� downvotera).
	 */
	public int getLastPositionForNewAnswer() {
		return lastPositionForNewAnswer;
	}

	/**
	 * @return the maxDifferenceForNewAnswer (maksymalna strata punktowa do
	 *         najbli�szej odpowiedzi do kt�rej downvoter wstawia w�asny post).
	 */
	public int getMaxDifferenceForNewAnswer() {
		return maxDifferenceForNewAnswer;
	}

	/**
	 * @return the maxDifferenceToTakeAction (strata punktowa do najbli�szej
	 *         odpowiedzi od kt�rej downvoter nie podejmuje �adnej akcji)
	 */
	public int getmaxDifferenceToTakeAction() {
		return maxDifferenceToTakeAction;
	}

}
