package DownvotingModel;

import java.util.ArrayList;
import java.util.Collections;

import Strategies.SocietyStrategy;

public class Topic {
	private ArrayList<Answer> answers;
	private SocietyStrategy societyStrategy;
	private long timer;

	public Topic() {
		answers = new ArrayList<Answer>();
		timer = 0L;
		// losowanie strategii
		this.societyStrategy = (SocietyStrategy) ModelBuilder.SOCIETY_STRATEGIES
				.getRandomObject();
	}

	public void run() {
		while ((timer += 1L) < societyStrategy.getTopicTTL()) {
			
			// wrzucanie odpowiedzi spo³ecznoœci
			if (societyStrategy.getAnswersSchedule().contains(timer)) {
				addSocietyAnswer();
			}

			// ocena odpowiedzi przez spo³ecznoœæ
			if (societyStrategy.getVotesSchedule().containsKey(timer)) {
				voteAsSociety();				
			}
			
			
		}
		print("topic results");
	}

	private void voteAsSociety() {
		for (int i : societyStrategy.getVotesSchedule().get(timer)) {
			if (answers.size() >= i )
				answers.get(i - 1).upVote();
		}
		Collections.sort(answers, new AnswerComparator());
	}

	private void addSocietyAnswer() {
		answers.add(new Answer(null, timer));
		Collections.sort(answers, new AnswerComparator());
	}

	
	
	private void print(String string) {
		int i = 0;
		System.out.println("Rank\tPoints\tCreationTime");
		if (answers.size() == 0)
			System.out.println("EmptyList");
		else {
			for (Answer ans : answers) {
				System.out.println(++i + "\t" + ans.getPoints() + "\t"
						+ ans.getTimestamp());
			}
		}

	}
}
