package DownvotingModel;

import Players.*;
import Strategies.*;
import repast.simphony.context.Context;
import repast.simphony.context.DefaultContext;
import repast.simphony.dataLoader.ContextBuilder;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.parameter.Parameters;

public class ModelBuilder extends DefaultContext<Object> implements ContextBuilder<Object> {
	public static Context<Object> DOWNVOTING_STRATEGIES;
	public static Context<Object> SOCIETY_STRATEGIES;
	public static Context<Downvoter> PLAYERS;
	public static Context<Downvoter> ELIMINATED_PLAYERS;
	public static Context<Topic> QUESTIONS;
	public static Context<Downvoter> CURRENT_SUBSET;
	
	
	public static int CURRENT_RUN = 0; 
	
	@Override
	public Context<Object> build(Context<Object> context) {
		System.out.println("Context builder loaded");
		
		context.setId("DownvotingSimulation");
		Parameters params = RunEnvironment.getInstance().getParameters();
		System.out.println("Liczba downvoterow: "+params.getValue("downvoter_population_size"));
				
		DOWNVOTING_STRATEGIES = new DownvotingStrategies();
		context.addSubContext(DOWNVOTING_STRATEGIES);
		
		SOCIETY_STRATEGIES = new SocietyStrategies();
		context.addSubContext(SOCIETY_STRATEGIES);
		
		PLAYERS = new Players();
		context.addSubContext(PLAYERS);
		
		ELIMINATED_PLAYERS = new DefaultContext<Downvoter>();
		//context.addSubContext(ELIMINATED_PLAYERS);
		
		QUESTIONS = new  DefaultContext<Topic>();
		context.add(QUESTIONS);
		
		CURRENT_SUBSET=new DefaultContext<Downvoter>();
		context.add(CURRENT_SUBSET);
		
		context.add(new GameController());
		CURRENT_RUN++;
		
		return context;
	}

}