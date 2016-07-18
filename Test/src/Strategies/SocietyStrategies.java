package Strategies;

import repast.simphony.context.DefaultContext;

public class SocietyStrategies extends DefaultContext<Object>{

	public SocietyStrategies(){
		super("SocietyStrategies");
		
		System.out.println("Society strategies context loaded");
		
		Long[] a1 =  {3L,6L,10L,71L};
		String[] v1 =  {"3:1,2","7:3","9:1","11:4","64:3"};		
		SocietyStrategy s1 = new SocietyStrategy(a1,v1,100L);	
		
		this.add(s1);
	}
}