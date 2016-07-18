package DownvotingModel;

import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.parameter.Parameters;
import Players.Downvoter;;

public class Answer {
	private Downvoter author;
	private int points;
	private long timestamp;

	public Answer(Downvoter author, long timestamp) {
		this.author=author;
		this.timestamp=timestamp;
		this.points=0;
	}

	public int getPoints() {
		return points;
	}
	
	public void upVote()
	{
		this.points+=1;
		if(author !=null)
		{
			Parameters params = RunEnvironment.getInstance().getParameters();
			author.insreaseReputation((Integer) params.getValue("upvote_value"));
		}
	}
	public void downVote()
	{
		this.points-=1;
		if(author !=null)
		{
			Parameters params = RunEnvironment.getInstance().getParameters();
			author.decreaseReputation((Integer) params.getValue("downvote_value"));
		}
	}

	public double getTimestamp() {
		return timestamp;
	}
	
	public Downvoter getAuthor() {
		return author;
	}
	
}
