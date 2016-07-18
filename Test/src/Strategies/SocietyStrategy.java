package Strategies;

import java.util.ArrayList;
import java.util.HashMap;

public class SocietyStrategy {

	private ArrayList<Long> answers;
	private HashMap<Long, ArrayList<Integer>> votes;
	private Long topicTTL;

	public SocietyStrategy(Long[] a, String[] v, Long d) {
		this.setAnswers(a);
		this.setVotes(v);
		this.setTopicTTL(d);
	}

	public ArrayList<Long> getAnswersSchedule() {
		return answers;
	}

	private void setAnswers(Long[] answers) {
		this.answers = new ArrayList<Long>();
		for (Long a : answers) {
			this.answers.add(a);
		}
	}

	public HashMap<Long, ArrayList<Integer>> getVotesSchedule() {
		return votes;
	}

	private void setVotes(String[] arg) {
		votes = new HashMap<Long, ArrayList<Integer>>();
		try {
			/*
			 * "[Key]:[Val1],[Val2],..."
			 */
			for (String v : arg) {
				String[] arr = v.split(":");
				long key = Long.parseLong(arr[0]);

				String[] listValuesStr = arr[1].split(",");
				ArrayList<Integer> listValues = new ArrayList<Integer>();
				for (String value : listValuesStr) {
					listValues.add(Integer.parseInt(value));
				}
				votes.put(key, listValues);
			}
		} catch (Exception e) {
			System.out.println("Invalid input parameters for society strategy");
		}
	}

	public Long getTopicTTL() {
		return topicTTL;
	}

	private void setTopicTTL(Long topicTTL) {
		this.topicTTL = topicTTL;
	}

}
