package Players;

import repast.simphony.context.DefaultContext;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.parameter.Parameters;

public class Players extends DefaultContext<Downvoter> {
	public Players(){
		super("Players");
		
		System.out.println("Players context loaded");
		Parameters params = RunEnvironment.getInstance().getParameters();
		int downvoterPopulationSize = (Integer)params.getValue("downvoter_population_size");
		int initial_stamina = (Integer)params.getValue("initial_stamina");
		int initial_reputation = (Integer)params.getValue("initial_reputation");
		
		for(int i=0; i<downvoterPopulationSize; i++){
			this.add(new Downvoter(initial_stamina,initial_reputation));
		}
	}
}
