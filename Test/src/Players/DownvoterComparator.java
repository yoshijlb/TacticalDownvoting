package Players;

import java.util.Comparator;
public class DownvoterComparator implements Comparator<Downvoter> {

	@Override
	public int compare(Downvoter o1, Downvoter o2) {
		double diff = o1.getReputation()-o2.getReputation();
		if(diff==0) return 0;
		else return (diff>0?-1:1);
	}

}
