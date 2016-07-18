package Players;

public abstract class Player {
	private static int static_id = 1;
	protected int id;
	protected int stamina;
	protected int reputation;

	protected Player(int initial_stamina, int initial_reputation) {
		this.setId(static_id++);
		this.stamina = initial_stamina;
		this.reputation = initial_reputation;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

}