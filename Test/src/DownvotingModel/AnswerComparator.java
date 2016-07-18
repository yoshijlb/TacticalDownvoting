package DownvotingModel;

import java.util.Comparator;

public class AnswerComparator implements Comparator<Answer> {

	@Override
	public int compare(Answer o1, Answer o2) {
		double diff = o1.getPoints()-o2.getPoints();
		if(diff==0) 
		{
			diff=o2.getTimestamp()-o1.getTimestamp();
		}
		if(diff==0)
			return 0;
		else
			return (diff>0?-1:1);
	}
	

}
