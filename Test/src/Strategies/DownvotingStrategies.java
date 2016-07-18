package Strategies;

import repast.simphony.context.DefaultContext;

public class DownvotingStrategies extends DefaultContext<Object>{

	public DownvotingStrategies(){
		super("DownvotingStrategies");
		
		System.out.println("Downvoting strategies context loaded");	
		
		 
		
		DownvoterStrategy s1 = new DownvoterStrategy(1,2,2,4,1);			
		this.add(s1);
	}
}
